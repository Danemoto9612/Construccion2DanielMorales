package app.domain.model;

public class Invoice {

    private Patient patient;
    private User user;
    private HealthInsurance healthinsurance;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public HealthInsurance getHealthinsurance() {
        return healthinsurance;
    }

    public void setHealthinsurance(HealthInsurance healthinsurance) {
        this.healthinsurance = healthinsurance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
