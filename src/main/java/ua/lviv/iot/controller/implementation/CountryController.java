package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.dao.implementation.CountryDAO;
import ua.lviv.iot.model.entity.Country;


public class CountryController extends GeneralController<Country, Integer>{
    public CountryController(){
        super(new CountryDAO());
    }
}
