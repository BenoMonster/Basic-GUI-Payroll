//Jethro Kyle Sempio BSIT-2

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Person{
       
       private String lastname;
       private String firstname;
       private Birthday birthdate;
       
       //Constructors
       public Person(String lname, String fname)
       {
             setLname(lname);
             setFname(fname);
       }
       
       public Person()
       {
             this.birthdate = new Birthday();
       }
       
       //Setters
       public void setLname(String lname)
       {
             lastname = lname;
       }
       
       public void setFname(String fname)
       {
             firstname = fname;
       }

       public void setBirthdate(int month, int day, int year)
       {
            birthdate.setMonth(month);
            birthdate.setDay(day,year);
            birthdate.setYear(year);
       }
       
       //Getters
       public String getLname()
       {
             return lastname;
       }
       
       public String getFname()
       {
             return firstname;
       }
       
       public String getBirthdate()
       {
              return birthdate.toString();
       }
       
       public double getAge()
       {    
            //Objects from built-in Java Class Pakage
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date date = new Date();
            Calendar cal = Calendar.getInstance();
            String strDate = dateFormat.format(cal.getTime()) + "";
            String strDateToken [] = strDate.split("/");
            
            //Variables
            double cur_month = Integer.parseInt(strDateToken[0]) * 30;
            double cur_day = Integer.parseInt(strDateToken[1]);
            double cur_year = Integer.parseInt(strDateToken[2]) * 365;
            double cur_date = cur_month + cur_day + cur_year; 
            
            //Computations
            double bdate = birthdate.getDay() + (birthdate.getMonth() * 30) + (birthdate.getYear() * 365);
            double age = (cur_date - bdate) / 365;

            return Math.round(age*100.0) / 100.0;
       }
       
       public String toString()
       {
            return getFname() + " " + getLname();
       }
}