package com.theironyard.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
//import com.theironyard.utilities.PasswordStorage;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User implements HasId{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    String id;

    @Column
    @JsonProperty("first-name")
    private String firstName;

    @Column
    @JsonProperty("last-name")
    private String lastName;

    @Column
    private String password;

    @Column
    private String email;


    @Column
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private String birthday;

    @Column
    private String phone;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //    @Column
//    public File photo;

    public String getId() {
        return this.id;
    }

    public void setId(String val) {
        this.id = val;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public User(String firstName, String lastName, String password, String email, String birthday, String phone)
            {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
        this.phone = phone;
    }

    public User() {
    }

//    private String getPasswordHash() {
//        return password;
//    }
//
//    public void setPassword(String password) throws PasswordStorage.CannotPerformOperationException {
//        this.password = PasswordStorage.createHash(password);
//    }
//
//    public boolean verifyPassword(String password) throws PasswordStorage.InvalidHashException, PasswordStorage.CannotPerformOperationException {
//        return PasswordStorage.verifyPassword(password, getPasswordHash());
//    }
}