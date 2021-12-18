package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.model.dal.dao.implementation.CountryDAO;
import ua.lviv.iot.model.entity.Country;


public class CountryController extends GeneralController<Country>{
    public CountryController(){
        super(new CountryDAO());
    }
}
