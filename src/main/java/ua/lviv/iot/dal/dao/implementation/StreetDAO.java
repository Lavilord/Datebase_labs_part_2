package ua.lviv.iot.dal.dao.implementation;

import ua.lviv.iot.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.Street;

public class StreetDAO extends GeneralDAO<Street, Integer>  {
    public StreetDAO(){
        super(Street.class);
    }
}
