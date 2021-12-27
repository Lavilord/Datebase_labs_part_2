package ua.lviv.iot.dal.dao.implementation;

import ua.lviv.iot.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.Country;

public class CountryDAO extends GeneralDAO<Country, Integer> {
    public CountryDAO(){
        super(Country.class);
    }
}