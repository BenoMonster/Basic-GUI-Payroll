public class Birthday extends MyDate{
    
    private String zodiac;
    
    //constructors
    public Birthday( int month, int day, int year)
    {
      super(month,day,year);
    }
    
    public  Birthday()
    {
     
    }
    
    //getter
    public String getZodiac()
    {
       
       if( ( getMonth() == 1 && getDay() >= 20 ) || ( getMonth() == 2 && getDay() <= 18 ) )
       {
             zodiac = "aquarius";
       }
       
       else if( ( getMonth() == 2 && getDay() >= 19 ) || ( getMonth() == 3 && getDay() <= 20 ) )
       {
             zodiac = "pisces";
       }
       
       else if( ( getMonth() == 3 && getDay() >= 21 ) || ( getMonth() == 4 && getDay() <= 19 ) )
       {
             zodiac = "aries";
       }
       
       else if( ( getMonth() == 4 && getDay() >= 20 ) || ( getMonth() == 5 && getDay() <= 20 ) )
       {
             zodiac = "taurus";
       }
       
       else if( ( getMonth() == 5 && getDay() >= 21 ) || ( getMonth() == 6 && getDay() <= 20 ) )
       {
             zodiac = "gemini";
       }
       
       else if( ( getMonth() == 6 && getDay() >= 21 ) || ( getMonth() == 7 && getDay() <= 22 ) )
       {
             zodiac = "cancer";
       }
       
       else if( ( getMonth() == 7 && getDay() >= 23 ) || ( getMonth() == 8 && getDay() <= 22 ) )
       {
             zodiac = "leo";
       }
       
       else if( ( getMonth() == 8 && getDay() >= 23 ) || ( getMonth() == 9 && getDay() <= 22 ) )
       {
             zodiac = "virgo";
       }
       
       else if( ( getMonth() == 9 && getDay() >= 23 ) || ( getMonth() == 10 && getDay() <= 22 ) )
       {
             zodiac = "libra";
       }
       
       else if( ( getMonth() == 10 && getDay() >= 23 ) || ( getMonth() == 11 && getDay() <= 21 ) )
       {
             zodiac = "scorpio";
       }
       
       else if( ( getMonth() == 11 && getDay() >= 22 ) || ( getMonth() == 12 && getDay() <= 21 ) )
       {
             zodiac = "sagittarius";
       }
       
       else if( ( getMonth() == 11 && getDay() >= 22 ) || ( getMonth() == 1 && getDay() <= 19 ) )
       {
             zodiac = "capricorn";
       }
       
       return zodiac;
    }
    
    public String toString()
    {
    return super.toString();
    }
    
    public boolean equals(Object obj)
    { 
        boolean flag = false;
        if(obj instanceof Birthday)
        {
              Birthday temp = (Birthday) obj;
                  if( getMonth() == temp.getMonth() && getDay() == temp.getDay() && getYear() == temp.getYear() )
                  {
                        flag = true;      
                  }
        }
        return flag;
    }
    
        
    public static void main ( String [] args )
    {
    //Class Testing
    
    //Sample Object
    Birthday mybday = new Birthday(2,28,1998);
    Birthday elsebday = new Birthday(2,28,1998);
    Birthday danbday = new Birthday(8,2,1999);
    Birthday fapbday = new Birthday(10,12,1997);
    
    System.out.println( "Set A" );
    System.out.println( "Obj 1: " +mybday.toString()   + " " + mybday.getZodiac()  );
    System.out.println( "Obj 2: " +elsebday.toString() + " " + elsebday.getZodiac()  );
    System.out.println( "Match Status:" +mybday.equals(elsebday) );
    System.out.println();
    System.out.println( "Set B" );
    System.out.println( "Obj 1: " +danbday.toString() + " " + danbday.getZodiac()  );
    System.out.println( "Obj 2: " +fapbday.toString() + " " + fapbday.getZodiac()  );
    System.out.println( "Match Status:" +danbday.equals(fapbday) );
    
    }
}


/* 
    implemented in the future
    public void display()
    {
          if(ifEqual)
          {
                 Birthday other = (Birthday) obj;
                 System.out.println( "Object a:" + toString() );
                 System.out.println( "Object b:" + other.toString() );
                 System.out.println( "Match Status:" +ifEqual );
          }
    }
    */
