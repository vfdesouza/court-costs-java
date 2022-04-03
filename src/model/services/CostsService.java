package model.services;

import model.entities.Contract;

public class CostsService implements FinalCosts {

    Contract contract;
    FipeService fipeService;

    public static final double taxAttorney  = 600;
    public static final double dispatch = 250;

    @Override
    public String viabilityContract(double valueVehicle, double debts) {
        return fipeService.viabilityContract(contract.getDebtsVehicle(), contract.getValueVehicle());
    }

    public double finalCosts() {
        return contract.getValueVehicle() + contract.getDebtsVehicle() + taxAttorney + dispatch;
    }
}

