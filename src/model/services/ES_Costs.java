package model.services;

public class ES_Costs {

    private static double taxAttorney = 600;
    private static double dispatch = 300;

    public static double getTaxAttorney() {
        return taxAttorney;
    }

    public static double getDispatch() {
        return dispatch;
    }

    public double valueTotalCosts(double amount) {
        return taxAttorney + dispatch;
    }
}
