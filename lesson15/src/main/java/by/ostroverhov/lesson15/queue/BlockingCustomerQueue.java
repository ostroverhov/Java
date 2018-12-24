package by.ostroverhov.lesson15.queue;

import by.ostroverhov.lesson15.domain.Customer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingCustomerQueue implements CustomerQueue {
    private final BlockingQueue<Customer> customers = new LinkedBlockingQueue<>();

    @Override
    public void insert(Customer customer) {
        try{
            customers.put(customer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer select() {
        try {
            return customers.take();
        } catch (InterruptedException e) {
            throw new IllegalThreadStateException(e.getMessage());
        }
    }
}
