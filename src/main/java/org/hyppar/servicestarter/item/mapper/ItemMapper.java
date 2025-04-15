package org.hyppar.servicestarter.item.mapper;

import org.hyppar.servicestarter.item.dto.ItemDto;
import org.hyppar.servicestarter.item.model.Item;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemDto toDto(Item item);

    Item toEntity(ItemDto dto);

    List<ItemDto> toDtoList(List<Item> items);
}
