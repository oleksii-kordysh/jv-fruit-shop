package servise.transaction.impl;

import model.Transaction;
import servise.transaction.TransactionHandler;

public class PurchaseTransactionHandler implements TransactionHandler {
    @Override
    public Transaction getTransaction(String item, int quantity) {
        return new Transaction(Transaction.Operation.PURCHASE, item, (quantity * -1));
    }
}
