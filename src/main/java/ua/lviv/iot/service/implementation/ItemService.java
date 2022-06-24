package ua.lviv.iot.service.implementation;


import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Item;
import ua.lviv.iot.repository.ItemRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class ItemService extends AbstractService<Item> {
    private final ItemRepository itemRepository;

    @Override
    public JpaRepository<Item,Integer> getRepository(){return itemRepository;}
}
