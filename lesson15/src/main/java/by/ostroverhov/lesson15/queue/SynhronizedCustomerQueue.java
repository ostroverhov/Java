package by.ostroverhov.lesson15.queue;

import by.ostroverhov.lesson15.domain.Customer;

import java.util.LinkedList;
import java.util.Queue;

public class SynhronizedCustomerQueue implements CustomerQueue {
    private final Queue<Customer> customers = new LinkedList<>();

    @Override
    public synchronized void insert(Customer customer) {
        customers.add(customer);
        notify();
    }

    @Override
    public Customer select() {
        while (customers.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return customers.poll();
    }
}
