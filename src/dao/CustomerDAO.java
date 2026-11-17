package dao;

import model.Customer;

public class CustomerDAO {

    public void save(Customer customer) {

        System.out.println(
                "Customer saved to database"
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
}
