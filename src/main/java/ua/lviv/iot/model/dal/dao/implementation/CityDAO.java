package ua.lviv.iot.model.dal.dao.implementation;

import ua.lviv.iot.model.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.City;

public class CityDAO extends GeneralDAO<City>  {
    public CityDAO(){
        super(City.class);
    }
}
