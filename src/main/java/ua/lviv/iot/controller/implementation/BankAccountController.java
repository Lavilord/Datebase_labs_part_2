package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.model.dal.dao.implementation.BankAccountDAO;
import ua.lviv.iot.model.entity.BankAccount;

public class BankAccountController extends GeneralController<BankAccount> {
    public BankAccountController() {
        super(new BankAccountDAO());
    }
}
