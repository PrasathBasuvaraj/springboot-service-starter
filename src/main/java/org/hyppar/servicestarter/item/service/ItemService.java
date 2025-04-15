package org.hyppar.servicestarter.item.service;

import org.hyppar.servicestarter.item.dto.ItemDto;

import java.util.List;

public interface ItemService {

    ItemDto create(ItemDto itemDto);

    List<ItemDto> getAll();

    ItemDto getById(Long id);
}
