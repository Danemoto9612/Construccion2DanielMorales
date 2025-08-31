//Pacientes
package app.domain.model;

import app.domain.model.enums.Genre;
import java.time.LocalDate;

public class Patient {

    private String ccPatient;
    private String fullName;
    private LocalDate birthday;
    private Genre genre;
    private String address;
    private String phone;
    private String email;
    private VitalData vitalData;
    private ClinicalHistory clinicalHistory;

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

    public String getCcPatient() {
        return ccPatient;
    }

    public void setCcPatient(String ccPatient) {
        this.ccPatient = ccPatient;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public VitalData getVitalData() {
        return vitalData;
    }

    public void setVitalData(VitalData vitalData) {
        this.vitalData = vitalData;
    }

    public ClinicalHistory getClinicalHistory() {
        return clinicalHistory;
    }

    public void setClinicalHistory(ClinicalHistory clinicalHistory) {
        this.clinicalHistory = clinicalHistory;
    }
    
}
