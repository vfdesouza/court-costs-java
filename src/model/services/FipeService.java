package model.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FipeService {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date date;

    public String validateQuery(Date consultationDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(consultationDate);
        cal.add(Calendar.MONTH, 4);
        date = cal.getTime();
        return sdf.format(date);
    }
}
