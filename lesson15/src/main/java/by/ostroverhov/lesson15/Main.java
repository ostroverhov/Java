package by.ostroverhov.lesson15;

import by.ostroverhov.lesson15.domain.CustomerGenerator;
import by.ostroverhov.lesson15.domain.MultithreadedCashBox;
import by.ostroverhov.lesson15.queue.BlockingCustomerQueue;
import by.ostroverhov.lesson15.queue.CustomerQueue;

public class Main {
    public static void main(String[] args) {
        CustomerQueue queue = new BlockingCustomerQueue();
        new MultithreadedCashBox(queue).service();
        new MultithreadedCashBox(queue).service();
        new CustomerGenerator(queue).execute();
    }
}
