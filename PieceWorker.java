public class PieceWorker extends Employee{
       
       private int num_items;
       private double rate;
       
       //constructor
       /*public PieceWorker(int item, double rate)
       {
              setItem(item);
              setRate(rate);
       }*/

       public PieceWorker(int item, double rate)
       {
          setItem(item);
          setRate(rate);
       }
       
       //setters
       public void setItem(int item)
       {
          num_items = item;
       }
       
       public void setRate(double rate)
       {
          this.rate = rate;
       }

       //getters

       public int getItem()
       {
          return num_items;
       }
       
       public double getRate()
       {
          return rate;
       }
        
       @Override
       public double computeSalary()
       {
             return num_items * rate;
       }

}