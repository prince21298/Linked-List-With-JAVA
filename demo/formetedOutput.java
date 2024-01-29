package demo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class formetedOutput {
    public void modulsDSyntax(String arg) {
        int a = 10000;
        System.out.printf("%,d%n", a);
    }

    public void doubleIntSyntax(String arg) {
        double a = 3.14159265359;
        System.out.printf("%f\n", a);
        System.out.printf("%5.3f\n", a);
        System.out.printf("%5.2f\n", a);
    }

    public void BooleanCheck(String arg) {
        int a = 10;
        Boolean b = true, c = false;
        Integer d = null;
        System.out.printf("%b\n", a);
        System.out.printf("%B\n", b);
        System.out.printf("%b\n", c);
        System.out.printf("%B\n", d);
    }

    public void CharCheck(String arg) {
        char c = 'g';
        System.out.printf("%c\n", c);
        System.out.printf("%C\n", c);
    }

    public void StringFormatCheck(String arg) {
        String str = "geeksforgeeks";
        System.out.printf("%s \n", str);
        System.out.printf("%S \n", str);
        str = "GFG";
        System.out.printf("%S \n", str);
        System.out.printf("%s \n", str);
    }

    public void DateFormatCheck(String arg) {
        Date time = new Date();
        System.out.printf("Current Time: %tT\n", time);
        System.out.printf("Hours: %tH  Minutes: %tM Seconds: %tS\n", time, time, time);
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", time);
    }

    public void DecimalFormatCheck(String arg) {
        double num = 123.4567;
        DecimalFormat ft = new DecimalFormat("####");
        System.out.println("Without fraction part: num = " + ft.format(num));
        ft = new DecimalFormat("#.##");
        System.out.println("Formatted to Give precision: num = " + ft.format(num));
        ft = new DecimalFormat("#.000000");
        System.out.println("appended zeroes to right: num = " + ft.format(num));
        ft = new DecimalFormat("00000.00");
        System.out.println("formatting Numeric part : num = " + ft.format(num));
        double income = 23456.789;
        ft = new DecimalFormat("$###,###.##");
        System.out.println("your Formatted Dream Income : " + ft.format(income));
    }

    // public void SimpleDateFormatCheck(String arg) {
    //     SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
    //     String str = ft.format(new Date());
    //     System.out.println("Formatted Date : " + str);
    //     str = "02/18/1995";
    //     ft = new SimpleDateFormat("MM/dd/yyyy");
    //     Date date = ft.parse(str);
    //     System.out.println("Parsed Date : " + date);
    // }

    public void SimpleDateFormatCheck1(String arg) {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());
        System.out.println("Formatted Date: " + str);
        str = "02/18/1995";
        ft = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date = ft.parse(str);
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        formetedOutput formetedOutputObject = new formetedOutput();
        formetedOutputObject.modulsDSyntax(null);
        formetedOutputObject.doubleIntSyntax(null);
        formetedOutputObject.BooleanCheck(null);
        formetedOutputObject.CharCheck(null);
        formetedOutputObject.StringFormatCheck(null);
        formetedOutputObject.DateFormatCheck(null);
        formetedOutputObject.DecimalFormatCheck(null);
        formetedOutputObject.SimpleDateFormatCheck1(null);
    }

}
