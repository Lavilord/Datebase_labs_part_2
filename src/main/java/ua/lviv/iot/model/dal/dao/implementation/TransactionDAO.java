package ua.lviv.iot.model.dal.dao.implementation;

import ua.lviv.iot.model.dal.dao.GeneralDAO;
import ua.lviv.iot.model.entity.Transaction;

public class TransactionDAO extends GeneralDAO<Transaction>{
    public TransactionDAO(){
        super(Transaction.class);
    }
}
