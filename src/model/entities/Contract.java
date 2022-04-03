package model.entities;

import java.util.Date;

public class Contract {

    private int number;
    private Date dateContract;

    private Client client;
    private Vehicle vehicle;

    public Contract() {
    }

    public Contract(int number, Date dateContract, Client client, Vehicle vehicle) {
        this.number = number;
        this.dateContract = dateContract;
        this.client = client;
        this.vehicle = vehicle;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateContract() {
        return dateContract;
    }

    public void setDateContract(Date dateContract) {
        this.dateContract = dateContract;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
