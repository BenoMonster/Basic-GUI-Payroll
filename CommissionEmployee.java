public class CommissionEmployee extends Employee{

   private double baseSalary;
   private int num_items;
   private double item_price;
   private double commission_rate;
   
   //Constructors
   public CommissionEmployee(double base, double itemp, int item, double rate)
   {
      setBase(base);
      setItemP(itemp);
      setItem(item);
      setRate(rate);    
   }
   
   //Setters
   
   public void setBase(double base)
   {
      baseSalary = base;
   }
   
   public void setItemP(double itemp)
   {
      item_price = itemp;
   }
   
   public void setItem(int item)
   {
      num_items = item;
   }
   
   public void setRate(double rate)
   {
      commission_rate = rate;
   }
   
   //Getters
   public double getBase()
   {
      return baseSalary;
   }
   
   public double getItemP()
   {
      return  item_price;
   }
   
   public int getItem()
   {
      return  num_items;
   }
   
   public double getRate()
   {
      return commission_rate;
   }

   @Override
   public double computeSalary()
   {
      return baseSalary + ( num_items * ( item_price * ( commission_rate * .01 ) ) ) ;
   }

}