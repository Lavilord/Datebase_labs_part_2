package ua.lviv.iot.dal.dao.implementation;

import ua.lviv.iot.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.City;

public class CityDAO extends GeneralDAO<City, Integer>  {
    public CityDAO(){
        super(City.class);
    }
}
