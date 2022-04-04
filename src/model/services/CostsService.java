package model.services;

public class CostsService {

    private FinalCosts finalCosts;

    public CostsService(FinalCosts finalCosts) {
        this.finalCosts = finalCosts;
    }

    public double federalTax(SP_Costs sp_costs) {
        return sp_costs.valueTotalCosts() * 0.02;
    }
}

