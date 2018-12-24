package by.ostroverhov.lesson15.queue;

import by.ostroverhov.lesson15.domain.Customer;

public interface CustomerQueue {
    void insert(Customer customer);
    Customer select();
}
