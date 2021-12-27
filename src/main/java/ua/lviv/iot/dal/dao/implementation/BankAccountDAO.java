package ua.lviv.iot.dal.dao.implementation;

import ua.lviv.iot.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.BankAccount;

public class BankAccountDAO extends GeneralDAO<BankAccount, Integer>{
    public BankAccountDAO(){
        super(BankAccount.class);
    }
}
