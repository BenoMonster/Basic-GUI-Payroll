import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI{

//Event Handlers
actHandler1 handler1 = new actHandler1();
radEvents radListener = new radEvents();
radEvents2 radListener2 = new radEvents2();

// Core Declarations
static Employee eList[] = new Employee[100];
String Database[][] = new String[100][3];
// Filter Arrays
String pw_filter[][] = new String [100][3];
String he_filter[][] = new String [100][3];
String ce_filter[][] = new String [100][3];
//table counts
int x1=0;
int x2=0;
int x3=0;
int count = 0;
// Filter CardLayout
JPanel sub1 = new JPanel( new CardLayout() ); 
//Filter Radios
JRadioButton all = new JRadioButton("All", true);
JRadioButton piece = new JRadioButton("Piece Worker", false);
JRadioButton hour = new JRadioButton("Hourly Employee", false);
JRadioButton com = new JRadioButton("Commission Employee", false);

// etc
int type_set = 1;
boolean close_search = false;

// JFRAMES
JFrame window1 = new JFrame("Payroll v0.99 BETA");

// GLOBALLY Declared Components

//MAIN WINDOW
// Buttons
JButton exitB = new JButton("EXIT");
JButton searchBtn = new JButton("SEARCH");
JButton addBtn = new JButton("ADD EMPLOYEE");
// Search Text Field
JTextField search_box = new JTextField(15);

//ADD WINDOW
// Buttons
//JButton add_btn = new JButton("ADD");
//JButton cancel_btn = new JButton("CANCEL");
// TextFields
JTextField fname_box = new JTextField();
JTextField lname_box = new JTextField();
JTextField id_box = new JTextField();
JTextField pos_box = new JTextField();
// for bdate comboboxes
//JTextField bdate_m = new JTextField("MM");
JTextField bdate_d = new JTextField("DD");
JTextField bdate_y = new JTextField("YYYY");
String month[] = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "DECEMBER"};

//String day30[] = new String[30];
//String day31[] = new String[31];
//String day29[] = new String[29];
//String day28[] = new String[28];
//String year[] = new String[66];
JComboBox bdate_m = new JComboBox(month);
//JComboBox bdate_d = new JComboBox(day31);
//JComboBox bdate_y = new JComboBox(year);*

// RadioButtons
JRadioButton pw = new JRadioButton("Piece Worker", true);
JRadioButton he = new JRadioButton("Hourly Employee", false);
JRadioButton ce = new JRadioButton("Commission Employee", false);
ButtonGroup rad_type = new ButtonGroup();
// For Salary
JPanel p4 = new JPanel( new CardLayout() );

// Salary Text Fields
//mode1
JTextField item_box = new JTextField();
JTextField rate_box = new JTextField();
//mode2
JTextField hr_box = new JTextField(4);
JTextField rate_box2 = new JTextField(4);
//mode3
JTextField base_box = new JTextField(4);
JTextField item_box2 = new JTextField(4);
JTextField itemP_box = new JTextField(4);
JTextField comRate_box = new JTextField(4);

           
      public void Main_Window()
      {
          //JFrame window1 = new JFrame("Payroll v.01 Pre-Alpha");
          window1.setLayout( new BorderLayout() );
                   
                   //Table
                   JPanel p1 = new JPanel();
                   p1.setLayout( new FlowLayout() );
                                                    
                        //JPanel sub1 = new JPanel( new CardLayout() ); 
                            
                            String header[] = {"First Name", "Last Name","Salary"};   
                            
                            JPanel mode_a = new JPanel();
                                
                                JTable table1 = new JTable(Database,header);
                                JScrollPane scroll1 = new JScrollPane(table1);
                                mode_a.add(scroll1);
                            
                            JPanel mode_b = new JPanel();
                                JTable table2 = new JTable(pw_filter,header);
                                JScrollPane scroll2 = new JScrollPane(table2);
                                mode_b.add(scroll2);
                            
                            JPanel mode_c = new JPanel();
                                JTable table3 = new JTable(he_filter,header);
                                JScrollPane scroll3 = new JScrollPane(table3);
                                mode_c.add(scroll3);

                            JPanel mode_d = new JPanel(); 
                                JTable table4 = new JTable(ce_filter,header);
                                JScrollPane scroll4 = new JScrollPane(table4);
                                mode_d.add(scroll4);                            
	                          
                            sub1.add("w",mode_a);
                            sub1.add("x",mode_b);
                            sub1.add("y",mode_c);
                            sub1.add("z",mode_d);

                        JPanel sub2 = new JPanel();
                        sub2.setLayout( new GridLayout(3,1) );
                        
                           JPanel in_sub2 = new JPanel();
                           in_sub2.setLayout( new GridLayout(5,1) );
                              in_sub2.add( new JLabel("FILTER"));
                              //JRadioButton all = new JRadioButton("All");
                              //JRadioButton piece = new JRadioButton("Piece Worker");
			                        //JRadioButton hour = new JRadioButton("Hourly Employee");
                              //JRadioButton com = new JRadioButton("Commission Employee");
			                        ButtonGroup rad_group = new ButtonGroup();
					                       rad_group.add(all);
                                 rad_group.add(piece);
					                       rad_group.add(hour);
                                 rad_group.add(com);
					
			                           in_sub2.add(all);
                                 in_sub2.add(piece);
                                 in_sub2.add(hour);
                                 in_sub2.add(com);	
					              sub2.add(in_sub2);

                   p1.add(sub1);
                   p1.add(sub2);   
                       
                   JPanel p2 = new JPanel();

                   //p2.setLayout( new GridLayout(2,1) );
                   //p2.setLayout( new BoxLayout(p2,BoxLayout.Y_AXIS) );
                   p2.setLayout( new BorderLayout() );
                           
                           JPanel p2_sub1 = new JPanel();
                              p2_sub1.setLayout( new FlowLayout(FlowLayout.LEFT) );
                              p2_sub1.add( new JLabel("Search by ID#:") );
                              //JTextField search_box = new JTextField(15);
                              //JButton searchB = new JButton("SEARCH");
                              p2_sub1.add(search_box);
                              p2_sub1.add(searchBtn);
                           
                           JPanel p2_sub2 = new JPanel();
                              p2_sub2.setLayout( new FlowLayout(FlowLayout.LEFT) );                                 
                              //JButton addBtn = new JButton("ADD EMPLOYEE");
                              //JButton exitB = new JButton("EXIT");
                              p2_sub2.add(addBtn);
                              p2_sub2.add(exitB);
                    p2.add(p2_sub1, BorderLayout.NORTH);
                    p2.add(p2_sub2, BorderLayout.CENTER);   
                    
          window1.add(p1, BorderLayout.NORTH);        
          window1.add(p2, BorderLayout.CENTER);
          //window.add(p3, BorderLayout.SOUTH);                     
		      window1.setSize(700,550);
	        window1.setVisible(true);  
          window1.setResizable(false);
		      window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          // ActionListeners
          exitB.addActionListener(handler1);
          searchBtn.addActionListener(handler1);
          addBtn.addActionListener(handler1);

          all.addActionListener(radListener2);
          piece.addActionListener(radListener2);
          hour.addActionListener(radListener2);
          com.addActionListener(radListener2);
          
      }

      public void addWindow()
      {

          JFrame window2 = new JFrame("Add Employee");
          window2.setLayout( new GridLayout(5,1) );
          //window.setLayout( new BorderLayout() );
      
          JPanel p1 = new JPanel();
          //p1.setLayout( new FlowLayout(FlowLayout.LEFT) );
          p1.setLayout( new BoxLayout(p1,BoxLayout.Y_AXIS) );
              JLabel fname_label = new JLabel("Firstname:");
              //JTextField fname_box = new JTextField(10);
              JLabel lname_label = new JLabel("Lastname:");
              //JTextField lname_box = new JTextField(10);
                                  
              p1.add(fname_label);
              p1.add(fname_box);
              p1.add(lname_label);
              p1.add(lname_box);
               
          JPanel p2 = new JPanel();
          p2.setLayout( new BoxLayout(p2,BoxLayout.Y_AXIS) );          
              JLabel id_label = new JLabel("ID#:");
              JPanel bdate_fields = new JPanel();
              bdate_fields.setLayout( new BoxLayout(bdate_fields,BoxLayout.X_AXIS) );
                  JLabel bdate_label = new JLabel("Birthdate:");
                  //JTextField bdate_m = new JTextField("MONTH");
                  //JTextField bdate_d = new JTextField("DAY");
                  //JTextField bdate_y = new JTextField("YEAR");

                  bdate_fields.add(bdate_label);
                  bdate_fields.add(bdate_m);
                  bdate_fields.add(bdate_d);
                  bdate_fields.add(bdate_y);
                  
              JLabel pos_label = new JLabel("Position:");
              //JTextField pos_box = new JTextField(10);
              
              p2.add(bdate_fields);
              p2.add(id_label);
              p2.add(id_box);
              p2.add(pos_label);
              p2.add(pos_box);
              
          JPanel p3 = new JPanel();
          p3.setLayout( new GridLayout(1,2) );

              JPanel p3_sub1 = new JPanel();
              //p3_sub1.setLayout( new FlowLayout() );
              p3_sub1.setLayout( new GridLayout(4,1) );
                  JLabel label = new JLabel("Employee Type");
                  //JRadioButton pw = new JRadioButton("Piece Worker");
                  //JRadioButton he = new JRadioButton("Hourly Employee");
                  //JRadioButton ce = new JRadioButton("Commission Employee");
                  //ButtonGroup rad_type = new ButtonGroup();
                      rad_type.add(pw);
                      rad_type.add(he);
                      rad_type.add(ce);
                      pw.setSelected(true);


                  p3_sub1.add(label);
                  p3_sub1.add(pw);
                  p3_sub1.add(he);
                  p3_sub1.add(ce);

              p3.add(p3_sub1);
              
              // Panel p4 Contents
              JPanel mode1 = new JPanel();
              mode1.setLayout( new BoxLayout(mode1,BoxLayout.Y_AXIS) );
                  //JTextField item_box = new JTextField();
                  //JTextField rate_box = new JTextField();
                  
                  mode1.add( new JLabel("No. of Items:") );
                  mode1.add(item_box);
                  mode1.add( new JLabel("Rate:") );
                  mode1.add(rate_box);
                  
              JPanel mode2 = new JPanel();
              mode2.setLayout( new BoxLayout(mode2,BoxLayout.Y_AXIS) );    
                  
                //JTextField hr_box = new JTextField(4);
                //JTextField rate_box2 = new JTextField(4);
                                   
                  mode2.add( new JLabel("Hours:") );
                  mode2.add(hr_box);
                  mode2.add( new JLabel("Rate:") );
                  mode2.add(rate_box2);
          
              JPanel mode3 = new JPanel();
              mode3.setLayout( new GridLayout(4,2) );
               
                  //JTextField base_box = new JTextField(4);
                  //JTextField item_box2 = new JTextField(4);
                  //JTextField itemP_box = new JTextField(4);
                  //JTextField comRate_box = new JTextField(4);
                  
                  mode3.add( new JLabel("Base Salary:") );
                  mode3.add(base_box);
                  mode3.add( new JLabel("No. of Items:") );
                  mode3.add(item_box2);
                  mode3.add( new JLabel("Item Price:") );
                  mode3.add(itemP_box);
                  mode3.add( new JLabel("Commission Rate:") );
                  mode3.add(comRate_box);
          
              p4.add("a",mode1);
              p4.add("b",mode2);
              p4.add("c",mode3);


          JPanel p5 = new JPanel();
          p5.setLayout( new FlowLayout(FlowLayout.CENTER) );
              JButton add_btn = new JButton("ADD");
              JButton cancel_btn = new JButton("CANCEL");
              p5.add(add_btn);
              p5.add(cancel_btn);

   
          window2.add(p1);
          window2.add(p2);
          window2.add(p3);
          window2.add(p4);
          window2.add(p5);
         
          window2.setSize(260,600);
          window2.setVisible(true);
          window2.setResizable(false);
          
          add_btn.addActionListener(
            new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) 
                {
                    saveData(type_set);
                    window2.dispose();
                }      
            });
         
          cancel_btn.addActionListener(
            new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) 
                {
                    window2.dispose();
                }          
            });

          //ActionListeners
          pw.addActionListener(radListener);
          he.addActionListener(radListener);
          ce.addActionListener(radListener);
          
          window2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      }

      private void saveData(int type_set)
      {        
        // gettext tp employee setters
        String a,b,d;
        int c;
        int bday_a=0, bday_b, bday_c;
        //pw computesalary
        int pw_1; 
        double pw_2;
        //he computesalary
        double he_1;
        double he_2;
        //ce computesalary
        double ce_1;
        double ce_2;
        int ce_3;
        double ce_4;
        
        // extract string data from textfields & etc
        a = fname_box.getText();
        b = lname_box.getText();
        c =  Integer.parseInt( id_box.getText() );
        d = pos_box.getText();

        String m = (String)bdate_m.getSelectedItem();
        switch( m )
        {
            case "APRIL":bday_a=4;break;
            case "JUNE":bday_a=6;break;
            case "SEPTEMBER":bday_a=9;break;
            case "NOVEMBER":bday_a=11;break;
            case "JANUARY":bday_a=1;break;
            case "MARCH":bday_a=3;break;
            case "MAY":bday_a=5;break;
            case "JULY":bday_a=7;break;
            case "AUGUST":bday_a=8;break;
            case "OCTOBER":bday_a=10;break;
            case "DECEMBER":  bday_a=12;break;
            case "FEBRUARY":bday_a=2;break;                                  
        }
        bday_b = Integer.parseInt( bdate_d.getText() );
        bday_c = Integer.parseInt( bdate_y.getText() );
        
        // Prevents 2 Employees having the same ID numbers
        int temp_count = count;
        boolean id_exist = false;
        for(int x = 1; x <= temp_count; x++)
        {                 
            if( eList[x-1].getId() == c )
            {
              error_box("ID Number Exists");
              id_exist = true;
              temp_count = 0;
            }

            else if( eList[x-1].getId() != c )
            {
              id_exist = false;
            }       
        }

        // Where all inputed data are set to the object class setters
        if(!id_exist)
        {
              try
              {   
                  if(type_set == 1)
                  {
                      pw_1 = Integer.parseInt( item_box.getText() );
                      pw_2 = Double.parseDouble( rate_box.getText() );
                      eList[count] = new PieceWorker(pw_1,pw_2);
                  }

                  else if(type_set == 2)
                  {
                      he_1 = Double.parseDouble( hr_box.getText() );
                      he_2 = Double.parseDouble( rate_box2.getText() );
                      eList[count] = new HourlyEmployee(he_1,he_2);
                  }  

                  else if(type_set == 3)
                  {
                      ce_1 = Double.parseDouble( base_box.getText() );
                      ce_2 = Double.parseDouble( itemP_box.getText() );
                      ce_3 = Integer.parseInt( item_box2.getText() );
                      ce_4 = Double.parseDouble( comRate_box.getText() );
                      eList[count] = new CommissionEmployee(ce_1, ce_2, ce_3, ce_4);
                  }
              } 
        
              catch(ArrayIndexOutOfBoundsException e)
              {   
                  
                  error_box("Data Full - Exceed 100");
              }
/*
              catch(java.lang.NumberFormatException x)
              {
                  error_box("Complete the form!");
              }
*/

              eList[count].setFname(a);
              eList[count].setLname(b);
              eList[count].setId(c);
              eList[count].setPos(d);
              eList[count].setBirthdate(bday_a, bday_b, bday_c);
                   
              Database[count][0] = eList[count].getFname();
              Database[count][1] = eList[count].getLname();
              Database[count][2] = "PHP " + Double.toString( eList[count].computeSalary() );
           
              if (eList[count] instanceof PieceWorker)
              {                   
                  pw_filter[x1][0] = eList[count].getFname();
                  pw_filter[x1][1] = eList[count].getLname();
                  pw_filter[x1][2] = "PHP " + Double.toString( eList[count].computeSalary() );
                  x1++;
              }
            

              else if (eList[count] instanceof HourlyEmployee)
              {   
                  he_filter[x2][0] = eList[count].getFname();
                  he_filter[x2][1] = eList[count].getLname();
                  he_filter[x2][2] = "PHP " + Double.toString( eList[count].computeSalary() );
                  x2++;
              }


              else if (eList[count] instanceof CommissionEmployee)
              {              
                  ce_filter[x3][0] = eList[count].getFname();
                  ce_filter[x3][1] = eList[count].getLname();
                  ce_filter[x3][2] = "PHP " + Double.toString( eList[count].computeSalary() );
                  x3++;
              }

              ++count;
              window1.repaint();

            // Clear TextField Inputs            
              lname_box.setText("");
              fname_box.setText("");
              bdate_d.setText("DD");
              bdate_y.setText("YYYY");
              pos_box.setText("");
              id_box.setText("");
            
              item_box.setText("");
              rate_box.setText("");
            
              hr_box.setText("");
              rate_box2.setText("");

              base_box.setText("");
              itemP_box.setText("");
              item_box2.setText("");
              comRate_box.setText("");
          }
          
        
    }

    public void search(int z)
    {
      int x = z;

      JFrame window3 = new JFrame("Search Result");
      window3.setLayout( new GridLayout(6,1) );      
      
      JPanel p1 = new JPanel();
      p1.setLayout( new FlowLayout(FlowLayout.LEFT) );
        JLabel id = new JLabel( "ID#: " + Integer.toString( eList[x].getId() ) );
        p1.add(id);


      JPanel p2 = new JPanel();
      p2.setLayout( new FlowLayout(FlowLayout.LEFT) );
        JLabel fname = new JLabel( eList[x].getFname() );
        JLabel lname = new JLabel( eList[x].getLname() );
        
        p2.add( new JLabel("Name:") );
        p2.add(fname);
        p2.add(lname);

      JPanel p3 = new JPanel();
      p3.setLayout( new FlowLayout(FlowLayout.LEFT) );
        JLabel bdate = new JLabel( eList[x].getBirthdate() );
        JLabel age = new JLabel( Double.toString( eList[x].getAge() ) + " years old" );

        p3.add(new JLabel("Birthdate:"));
        p3.add(bdate);
        p3.add(new JLabel(" Age:"));
        p3.add(age);

      JPanel p4 = new JPanel();
      p4.setLayout( new FlowLayout(FlowLayout.LEFT) );
        JLabel pos = new JLabel( eList[x].getPos() );
        p4.add( new JLabel("Postion: ") );
        p4.add(pos);

      JPanel p5 = new JPanel();
      p5.setLayout( new FlowLayout(FlowLayout.LEFT) );
        JLabel salary_label = new JLabel("Salary: PHP " + Double.toString( eList[x].computeSalary() ) );
        p5.add(salary_label);

      JPanel p6 = new JPanel();
        JButton okB = new JButton("OK");
        p6.add(okB);
        okB.addActionListener(
            new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) 
                {
                    window3.dispose();
                }          
            });

      window3.add(p1);
      window3.add(p2);
      window3.add(p3);
      window3.add(p4);
      window3.add(p5);
      window3.add(p6);
      window3.setVisible(true);
      window3.setResizable(false);
      window3.setSize(300,260);
    }

    public void error_box(String text)
    {
        JFrame window_error = new JFrame("Error");
                      JOptionPane.showMessageDialog(window_error,text, "Error", JOptionPane.ERROR_MESSAGE);
    }

           
      public static void main (String [] args)
      {
          GUI run = new GUI();
          run.Main_Window();
      }

          // ActionListener Classes
          private class actHandler1 implements ActionListener
          {
              public void actionPerformed(ActionEvent event)
              {
                  if ( exitB.equals( event.getSource() ) )
                  {
                      System.exit(0);
                  }

                  else if ( addBtn.equals( event.getSource() ) )
                  {                      
                      addWindow();
                      pw.doClick();
                  }

                  else if ( searchBtn.equals( event.getSource() ) )
                  {
                      if(count == 0)
                      {
                          error_box("Database Empty!");
                      }
                      else
                      {
                          int id=0;
                        try
                        {
                          id = Integer.parseInt( search_box.getText() );
                        }

                        catch(java.lang.NumberFormatException e)
                        {
                          error_box("Search Box Empty");
                        }
                          boolean no_find = true;
                          int temp_count = count;
                      
                          for(int x=0; x <= temp_count-1; x++)
                          {

                              if( id == eList[x].getId() )
                              {   
                                  search(x);
                                  no_find = false;
                                  temp_count = -1;
                              }
                          }
                          
                          if(no_find)
                          {
                              error_box("ID# No Positive Match");
                          }

                          
                      }

                  }

              }

          }         

          private class radEvents implements ActionListener
          {
              public void actionPerformed(ActionEvent e)
              {                
                  CardLayout card  = (CardLayout)( p4.getLayout() );
                  if( e.getSource() == pw )
                  {
                      card.show(p4,"a");
                      type_set = 1;
                  }

                  else if( e.getSource() == he )
                  {
                      card.show(p4,"b");
                      type_set = 2;
                  }

                  else if( e.getSource() == ce )
                  {
                      card.show(p4,"c");
                      type_set = 3;
                  }
              }
          }

          private class radEvents2 implements ActionListener
          {
              public void actionPerformed(ActionEvent e)
              {
                  CardLayout card  = (CardLayout)( sub1.getLayout() );
                  if( e.getSource() == all )
                  {
                      card.show(sub1,"w");
                  }

                  else if( e.getSource() == piece )
                  {
                      card.show(sub1,"x");
                  }

                  else if( e.getSource() == hour )
                  {
                      card.show(sub1,"y");
                  }

                  else if( e.getSource() == com)
                  {
                      card.show(sub1,"z");
                  }
              }
          }
/*
          private class comboxEvents implements ActionListener
          {
              public void actionPerformed(ActionEvent e)
              {
                //String m = (String)bdate_m.getSelectedItem();
                //int y = (int)bdate_y.getSelectedItem();

                  switch( m )
                  {
                      case "APRIL":
                      case "JUNE":
                      case "SEPTEMBER":
                      case "NOVEMBER":
                                        //bdate_d.removeAllItems();
                                        for(int x=0; x <= 29; x++)
                                        {
                                            bdate_d.addItem(day30[x]);
                                        }
                                        break;
                      case "JANUARY":
                      case "MARCH":
                      case "MAY":
                      case "JULY":
                      case "AUGUST":
                      case "OCTOBER":
                      case "DECEMBER":  
                                        //bdate_d.removeAllItems();
                                        for(int x=0; x <= 30; x++)
                                        {
                                            bdate_d.addItem(day31[x]);
                                        }
                                        //bdate_d.setModel(day31);
                                        break;

                      case "FEBRUARY":
                                        if( y % 4 == 0)
                                        {
                                            //bdate_d.removeAllItems();
                                            for(int x=0; x <= 28; x++)
                                            {
                                                bdate_d.addItem(day29[x]);
                                            }  
                                            //bdate_d.setModel(day29);
                                        }

                                        else if( y % 4 != 0)
                                        {   
                                            //bdate_d.removeAllItems();
                                            for(int x=0; x <= 29; x++)
                                            {
                                                bdate_d.addItem(day28[x]);
                                            }
                                            //bdate_d.setModel(day28);
                                        }
                                        break;*                                       
                  }
              }
          } 
*/     
}