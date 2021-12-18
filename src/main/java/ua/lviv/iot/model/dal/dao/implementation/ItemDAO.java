package ua.lviv.iot.model.dal.dao.implementation;

import ua.lviv.iot.model.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.Item;

public class ItemDAO extends GeneralDAO<Item>{
    public ItemDAO(){
        super(Item.class);
    }
}
