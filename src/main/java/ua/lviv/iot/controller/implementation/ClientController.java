package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.dao.implementation.ClientDAO;
import ua.lviv.iot.model.entity.Client;

public class ClientController extends GeneralController<Client, Integer> {
    public ClientController() {
        super(new ClientDAO());
    }
}
