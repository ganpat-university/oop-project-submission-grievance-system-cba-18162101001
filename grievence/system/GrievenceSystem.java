/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grievence.system;

import java.io.*;

/**
 *
 * @author Admin
 */
public class GrievenceSystem {

    /**1
     *1
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    
    public static void main(String[] args) throws IOException {
        Methods ob = new Methods();
   
        ketan ke;
        ke = new ketan();
    
        int temp;
      String temp1;
 
      System.out.println("---------------------------------------------------------");
      System.out.println("----------------- Grievence System ----------------------");
      System.out.println("---------------------------------------------------------");
    
        // TODO code application logic here
       
     /* FileWriter fw = new FileWriter("Details.txt",true);*/
  do  
  {
     
      System.out.println("\n\nPress 1 for Login \nPress 2 for Registering Complain \nPress 3 for Exit");
      temp = ob.getinput();
      
      if(temp==1)
      {
          do
          {       
          System.out.println("\nUsername :-");
          ob.setusername();
          System.out.println("\nPassword :-");
          ob.setpassword();
            if(ob.valid()!=1 && ob.valid()!=2)
            {
                System.out.println("\nTry Again!!!!!!!!!!");
            }
          }while(ob.valid()!=1 && ob.valid()!=2);
         
         //ob.seedetails();
          if(ob.valid()==1)
          {
              System.out.println("\n Welcome Admin \n");
              ob.seedetails();
          }
          else if(ob.valid()==2)
          {
              System.out.println("Your Problem is reached to Admin");
          }
          
          
          
      }
      
      else if(temp==2)
      {
      
          temp1 = ke.faq();
        
        if(temp1.equals("No"))
        {
                //New Complain
            System.out.println("Do u have any other complain ? ");
            temp1 = ob.getin();
            if(temp1.equals("Yes")||temp1.equals("yes"))
            {
               ob.getemail();
            }
            do
            {   
                          if(temp1.equals("Yes")||temp1.equals("yes"))
                          {
                              ob.feedetails();
                             System.out.println("Do you want to enter complain again");
                            temp1 = ob.getin();
                          }
                          
             }while(temp1.equals("Yes")||temp1.equals("yes"));
        }
             
        else
            {
                System.out.println("\nPress number of your problem :- \n");
                temp = ob.getinput();
                ke.answer(temp);
            }
     
      }
      
      else if(temp==3)
      {
          
      }
      
      else
      {
          System.out.println("Invalid Input");
      }
      
      
    }while(temp!=3);
  }
    
}
