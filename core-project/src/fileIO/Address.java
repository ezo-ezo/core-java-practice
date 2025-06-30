package fileIO;

import java.io.Serializable;

public class Address implements Serializable {
    static final long serialVersionUID = 46L;
    String street;
    String country;

    public Address(String street, String country){
        this.street = street;
        this.country = country;
    }

    public String toString(){
        return "Street: " + street + " Country: " + country;
    }
}
