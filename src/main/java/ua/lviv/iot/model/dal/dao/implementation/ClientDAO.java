package ua.lviv.iot.model.dal.dao.implementation;

import ua.lviv.iot.model.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.Client;

public class ClientDAO extends GeneralDAO<Client>{
    public ClientDAO(){
        super(Client.class);
    }
}

