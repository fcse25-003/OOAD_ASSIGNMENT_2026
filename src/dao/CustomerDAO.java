package dao;

import model.Customer;

public class CustomerDAO {

    public void save(Customer customer) {

        System.out.println(
                "Customer saved"
        );
    }

    public void update(Customer customer) {

        System.out.println(
                "Customer updated"
        );
    }

    public void delete(Customer customer) {

        System.out.println(
                "Customer deleted"
        );
    }

    public void findBySurname(
            String surname) {

        System.out.println(
                "Searching customer: "
                + surname
        );
    }
}