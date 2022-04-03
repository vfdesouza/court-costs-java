package model.entities;

import java.util.Date;

public class Company extends Client {
    private String CNPJ;
    private Date foundationDate;

    public Company(String name, String email, String telephone, String CNPJ, Date foundationDate) {
        super(name, email, telephone);
        this.CNPJ = CNPJ;
        this.foundationDate = foundationDate;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }
}
