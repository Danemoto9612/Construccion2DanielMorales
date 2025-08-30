//Pacientes
package app.domain.model;

import app.domain.model.enums.Genre;
import java.time.LocalDate;

public class Patient {
    
    private final String ccPatient;
    private String fullName;
    private final LocalDate birthday;
    private final Genre genre;
    private String address;
    private String phone;
    private String email;
    
    public Patient(String _fullName, String _ccPatient, LocalDate _birthday, Genre _genre) {
        
        this.fullName = _fullName;
        this.ccPatient = _ccPatient;
        this.birthday = _birthday;
        this.genre = _genre;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
