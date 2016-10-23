public class HourlyEmployee extends Employee{

   private double hour;
   private double rate;
   
   //Constructor
   public HourlyEmployee(double x, double y)
   {
      setHour(x);
      setRate(y);
   }
   
   //Setter

   public void setHour(double x)
   {
      hour = x;
   }
   
   public void setRate(double y)
   {
      rate = y;
   }
   
   //Getter
   public double getHour()
   {
      return hour;
   }
   
   public double getRate()
   {
      return rate;
   }
   
   @Override
   public double computeSalary()
   {
      return hour * rate;
   }

}