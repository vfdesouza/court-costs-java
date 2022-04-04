package model.services;

public class SP_Costs implements FinalCosts {

    private static double taxAttorney = 480;
    private static double dispatch = 250;

    @Override
    public String viabilityContract(double valueVehicle, double debts) {
        double viability = debts * 100 / valueVehicle;
        if (viability > 15) {
            return "INVIÁVEL!";
        } else {
            return "VIÁVEL!";
        }
    }

    @Override
    public double valueTotalCosts() {
        return taxAttorney + dispatch;
    }
}
