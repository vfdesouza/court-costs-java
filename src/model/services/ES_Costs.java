package model.services;

public class ES_Costs implements CostService {

    private static double taxAttorney = 600;
    private static double dispatch = 300;

    @Override
    public double getTaxAttorney() {
        return taxAttorney;
    }

    @Override
    public double getDispatch() {
        return dispatch;
    }

    public double sumTax() {
        return taxAttorney + dispatch;
    }
}


