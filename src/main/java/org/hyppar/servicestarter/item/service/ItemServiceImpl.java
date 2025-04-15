package org.hyppar.servicestarter.item.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hyppar.servicestarter.item.dto.ItemDto;
import org.hyppar.servicestarter.item.mapper.ItemMapper;
import org.hyppar.servicestarter.item.model.Item;
import org.hyppar.servicestarter.item.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public ItemDto create(ItemDto itemDto) {
        log.info("Creating item: {}", itemDto.getName());
        Item saved = itemRepository.save(itemMapper.toEntity(itemDto));
        return itemMapper.toDto(saved);
    }

    @Override
    public List<ItemDto> getAll() {
        log.info("Fetching all items");
        return itemMapper.toDtoList(itemRepository.findAll());
    }

    @Override
    public ItemDto getById(Long id) {
        log.info("Fetching item with id: {}", id);
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        return itemMapper.toDto(item);
    }
}
