package se.lexicon;

public class Customer {

    private String name;
    private String email;
    private int phoneNumaber;

    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumaber = phoneNumaber;
    }

    public String getCustomerInformation(){
        return "Customer Information >> " + ", name : " + name + ", Email :" + email + " , Phone Number :" + phoneNumaber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumaber() {
        return phoneNumaber;
    }

    public void setPhoneNumaber(int phoneNumaber) {
        this.phoneNumaber = phoneNumaber;
    }
}
