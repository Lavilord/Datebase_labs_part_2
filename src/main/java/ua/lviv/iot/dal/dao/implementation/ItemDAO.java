package ua.lviv.iot.dal.dao.implementation;

import ua.lviv.iot.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.Item;

public class ItemDAO extends GeneralDAO<Item, Integer>{
    public ItemDAO(){
        super(Item.class);
    }
}
