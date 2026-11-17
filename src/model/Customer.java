public class Customer{
    private String firstName;
    private String surname;
    private String address;
    private String phoneNumber;

    public Customer(String firstName, String surname,String address,String address,String phoneNumber){

        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this phoneNumber = phoneNumber;
    }
public String getFirstName(){
    return firstName;
}
public String getAdress(){
    return address;
}
public String getPhoneNumber (){
    return phoneNumber;
}
 public void register() {
        System.out.println("Customer registered successfully");
    }

    public void login() {
        System.out.println("Customer logged in successfully");
    }
}
}
