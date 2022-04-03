package model.services;

import java.util.Calendar;
import java.util.Date;

public class FipeService {

    public void viabilityContract(double valueVehicle, double debts) {
        double viability =  debts * 100 / valueVehicle;
    }

    public Date validateQuery(Date consultationDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(consultationDate);
        cal.add(Calendar.MONTH, 4);
        return cal.getTime();
    }
}
