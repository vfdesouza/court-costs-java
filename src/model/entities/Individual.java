package model.entities;

import java.util.Date;

public class Individual extends Client {

    private String CPF;
    private Date birthDate;

    public Individual(String name, String email, String telephone, String CPF, Date birthDate) {
        super(name, email, telephone);
        this.CPF = CPF;
        this.birthDate = birthDate;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
