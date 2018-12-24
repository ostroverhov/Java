package by.ostroverhov.lesson15.domain;

import by.ostroverhov.lesson15.queue.CustomerQueue;

public class MultithreadedCashBox {
    private CashBox cashBox;

    public MultithreadedCashBox(CustomerQueue queue) {
        this.cashBox = new CashBox(queue);
    }

    public void service(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    cashBox.service();
                }
            }
        });
        thread.start();
    }
}
