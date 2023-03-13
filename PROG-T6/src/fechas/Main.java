package fechas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(formatearcalendar(c));
        c.add(Calendar.MONTH,-5);
        System.out.println("-5 meses: " + formatearcalendar(c));

        Calendar mifecha=new GregorianCalendar(2023,2,21);
        System.out.println("Mi fecha= " + formatearcalendar(mifecha));
    }

    public static String formatearcalendar(Calendar c){
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
        return df.format(c.getTime());
    }

}
