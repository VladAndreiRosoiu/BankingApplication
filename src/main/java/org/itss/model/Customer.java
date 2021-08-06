package org.itss.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clients")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "cic")
    private long cic;

    public Customer(){}

    public Customer(String firstName, String lastName, long cic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cic = cic;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getCic() {
        return cic;
    }

    public void setCic(long cic) {
        this.cic = cic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && cic == customer.cic && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, cic);
    }
}
