package app.domain.model;

import app.domain.model.enums.Role;
import java.time.LocalDate;

public class User {

    private String FullName;
    private final String ccUser;
    private String email;
    private String phone;
    private final LocalDate birthday;
    private String address;
    private Role role;
    private String userName;
    private String password;

    public User(String _fullName, String _ccUser, LocalDate _birthday) {
        
        this.FullName = _fullName;
        this.ccUser = _ccUser;
        this.birthday = _birthday;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
