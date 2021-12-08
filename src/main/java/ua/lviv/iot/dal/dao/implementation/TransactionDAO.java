package ua.lviv.iot.dal.dao.implementation;

import ua.lviv.iot.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.Transaction;

public class TransactionDAO extends GeneralDAO<Transaction, Integer>{
    public TransactionDAO(){
        super(Transaction.class);
    }
}
