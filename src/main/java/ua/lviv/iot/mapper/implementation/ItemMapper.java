package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.ItemDTO;
import ua.lviv.iot.domain.Item;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class ItemMapper implements AbstractMapper<Item, ItemDTO> {
    @Override
    public ItemDTO map(Item item){
        return ItemDTO.builder()
                .id(item.getId())
                .name(item.getName())
                .countryId(item.getCountry().getId())
                .price(item.getPrice())
                .weight(item.getWeight())
                .build();
    }
}
