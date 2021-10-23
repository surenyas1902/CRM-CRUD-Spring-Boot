package com.surendiran.crudmvc.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    /* Fields */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int rowId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String emailAddr;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String emailAddr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddr = emailAddr;
    }

    /* Getters and Setters */
    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
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

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rowId=" + rowId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddr='" + emailAddr + '\'' +
                '}';
    }
}
