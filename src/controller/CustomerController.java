package controller;

import model.Customer;

public class CustomerController {

    public void registerCustomer(Customer customer) {

        customer.register();
    }

    public void loginCustomer(Customer customer) {

        customer.login();
    }
}