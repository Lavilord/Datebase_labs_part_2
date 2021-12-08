package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.dao.implementation.BankAccountDAO;
import ua.lviv.iot.model.entity.BankAccount;

public class BankAccountController extends GeneralController<BankAccount, Integer> {
    public BankAccountController() {
        super(new BankAccountDAO());
    }
}
