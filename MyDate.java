//Jethro Kyle Sempio

public class MyDate
{

   private int month;
   private int day;
   private int year;
   private boolean ifLeap = true;
   
   public MyDate(int month, int day, int year)
   {
             setMonth(month);
             setDay(day,year);
             setYear(year);
   }
   
   public MyDate()
   {
       this(0,0,0);
   }
   
   //setters
   public void setMonth(int month)
   {
       if(month > 0 && month <= 12)
       {
            this.month = month;
       }
       
   }
   
   public void setYear(int year)
   {
        if(year >= 1950 && year <= 2016)
        {
            this.year = year;
        }
        
   }
  public void setDay(int day, int year)
   {                  
        switch(month)
        {    
             // for 31 day months
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                      if(day >= 1 && day <= 31)
                      {
                          this.day = day;
                      }
                      break;
             
             // for 30 day months         
             case 4:
             case 6:
             case 9:
             case 11:
                      if(day >= 1 && day <= 30)
                      {
                          this.day = day;
                      }
                      break;
             
             // febuary         
             case 2:  
                                           
                      if(year % 4 == 0)
                      {
                           if( day >= 1 && day <= 29 )
                           {
                            this.day = day;
                           }
                      
                      }
                      
                      else if(year % 4 != 0)
                      {
                           if( day >= 1 && day <= 28 )
                           {
                            this.day = day;
                           }
                      }
                      break;
        }
    }
    
         //getters
         public int getMonth()
         {
             return month;
         }
 
         public int getDay()
         {
             return day;
         }
 
         public int getYear()
         
         {
             return year;
         }
         
         public boolean getLeap()
         {             
            if( year % 4  != 0 )
            {
                  ifLeap = false;
            }
            
            return ifLeap;
         }
         
         public String toString()
         {
             if(getDay() == 0 || getMonth() == 0 || getYear() == 0)
             {
                 return "ERROR!";
             }
            
             else
             {
                return getMonth() + "/" + getDay() + "/" + getYear();
             }
         }     
   }