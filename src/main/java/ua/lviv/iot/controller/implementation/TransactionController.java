package ua.lviv.iot.controller.implementation;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.model.dal.dao.implementation.TransactionDAO;
import ua.lviv.iot.model.entity.Transaction;

public class TransactionController extends GeneralController<Transaction> {
    public TransactionController(){
        super(new TransactionDAO());
    }
}
