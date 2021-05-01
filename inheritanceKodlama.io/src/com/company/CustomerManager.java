package com.company;

public class CustomerManager {

    public void add(Customer customer) {
        System.out.println(customer.firstName + " sisteme eklendi.");
    }

    public void Remove(Customer customer) {
        System.out.println(customer.firstName + " sistemden silindi.");
    }

    public void Update(Customer customer) {
        System.out.println(customer.firstName + " profili guncelledi.");
    }

    public void addMultiple(Customer[] customers) {
        for (Customer customer : customers) {
            add(customer);
        }
    }

}
