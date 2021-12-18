package ua.lviv.iot.controller.implementation;


import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.model.dal.dao.implementation.CityDAO;
import ua.lviv.iot.model.entity.City;

public class CityController extends GeneralController<City> {
    public CityController() {
        super(new CityDAO());
    }
}