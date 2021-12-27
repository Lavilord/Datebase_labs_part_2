package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.dao.implementation.ItemDAO;
import ua.lviv.iot.model.entity.Item;

public class ItemController extends GeneralController<Item, Integer> {
    public ItemController() {
        super(new ItemDAO());
    }
}