package com.mycompany.mywebapp.User;


//import jakarta.persistence.*; //
import javax.persistence.*;
import javax.persistence.Column;




@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 45 )
    private String email;
    @Column(length = 15, nullable = false)
    private String password;
    @Column(length = 45, nullable = false, name = "first_name")
    private String firstname;
    @Column(length = 45, nullable = false, name = "last_name")
    private String lastname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
