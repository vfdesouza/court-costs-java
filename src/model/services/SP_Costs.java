package model.services;

public class SP_Costs implements CostService{

    private static double taxAttorney = 480;
    private static double dispatch = 250;

    @Override
    public double getTaxAttorney() {
        return taxAttorney;
    }

    @Override
    public double getDispatch() {
        return dispatch;
    }
}
