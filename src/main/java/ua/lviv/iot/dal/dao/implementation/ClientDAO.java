package ua.lviv.iot.dal.dao.implementation;

import ua.lviv.iot.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.Client;

public class ClientDAO extends GeneralDAO<Client, Integer>{
    public ClientDAO(){
        super(Client.class);
    }
}

