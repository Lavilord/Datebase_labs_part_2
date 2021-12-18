package ua.lviv.iot.model.dal.dao.implementation;

import ua.lviv.iot.model.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.Country;

public class CountryDAO extends GeneralDAO<Country> {
    public CountryDAO(){
        super(Country.class);
    }
}