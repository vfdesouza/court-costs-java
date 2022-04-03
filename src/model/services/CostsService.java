package model.services;

public class CostsService implements FinalCosts {

    public static final double taxAttorney  = 600;
    public static final double dispatch = 250;

    @Override
    public String viabilityContract(double valueVehicle, double debts) {
        double viability = debts * 100 / valueVehicle;
        if (viability > 15) {
            return "INVIÁVEL!";
        } else {
            return "VIÁVEL!";
        }
    }

    public double finalCosts(double valueVehicle, double debtsVehicle) {
        return valueVehicle + debtsVehicle + taxAttorney + dispatch;
    }
}

