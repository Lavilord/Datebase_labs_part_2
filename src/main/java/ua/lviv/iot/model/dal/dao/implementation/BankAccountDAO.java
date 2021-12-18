package ua.lviv.iot.model.dal.dao.implementation;

import ua.lviv.iot.model.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.BankAccount;

public class BankAccountDAO extends GeneralDAO<BankAccount>{
    public BankAccountDAO(){
        super(BankAccount.class);
    }
}
