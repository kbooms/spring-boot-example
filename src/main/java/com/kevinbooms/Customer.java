package com.kevinbooms;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Customer {
    @Id                                                 // label this Integer id as an "Id" for table rows
    @SequenceGenerator(                                 // in order to automate this field we establish a sequence generator
            name = "customer_id_sequence",              // we give it a name
            sequenceName = "customer_id_sequence",      // we give the actual sequence the same name
            allocationSize = 1                          // default is 50
    )
    @GeneratedValue(                                    // we're establishing a strategy for this generated value
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"          // we're giving it the name of our sequence
    )
    private Integer id;
    private String name;
    private String email;
    private Integer age;

    public Customer(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(age, customer.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, age);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}