abstract class Employee extends Person{
             
      private int id_num;
      private String position;
      
      //constructors
      public Employee(int id, String pos)
      {
      	setId(id);
      	setPos(pos);
      }

      public Employee()
      {

      }

   
      public void setId(int id)
      {
      	id_num = id;
      }

      public void setPos(String pos)
      {
      	position = pos;
      }

      //getters
      public int getId()
      {
      	return id_num;
      }

      public String getPos()
      {
      	return position;
      }

      abstract double computeSalary();

      // PieceWorker
      //abstract void setItem(int x);
      //abstract void setRate(double x);
      
      //abstract int getItem();
      //abstract double getRate();

      // HourlyEmployee

      //abstract void setHour(double x);
      //abstract void setBase(double x);  
      //abstract void setItemP(int x);
      // abstract getters
      
      //abstract double getHour();
      //abstract double getBase();
      //abstract double getItemP();
      
            
     
     

}