package model.services;

public interface CostService {

    double getTaxAttorney();
    double getDispatch();

    default double taxFederal() {
        return getTaxAttorney() * 1.12;
    }

    default double sumTax() {
        return getTaxAttorney() + getDispatch();
    }

    default String viabilityContract(double valueFipeVehicle, double debts) {
        double viability = debts * 100 / valueFipeVehicle;
        if (viability > 15) {
            return "INVIÁVEL!";
        } else {
            return "VIÁVEL!";
        }
    }
}
