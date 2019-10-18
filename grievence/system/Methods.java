/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grievence.system;
import java.util.*;
import java.io.*; 



/**
 *
 * @author Admin
 */
public class Methods  {

          
            Scanner sc = new Scanner(System.in); 
            Scanner sc1 = new Scanner(System.in); 
            FileWriter fw = null; 
            FileReader fr;
            
            private int temp;
            private String email;
            private String username;
            private String password;

    public Methods() {
        this.fr = null;
        this.fr = null;
    }
              
            public int valid()
            {
                temp = 0;
                 
                   if(username.equals("Hello")&& password.equals("1234"))
                   {
                       
                       temp = 1;
                   } 
                   else if(username.equals("User")&& password.equals("1234"))
                   {
                       temp = 2;
                   }
                       
                   return temp;
            }
            
            public void setusername()
            {
                username = sc.next();
            }
          
            public void setpassword()
            {
                password = sc.next();
            }
            public int getinput()
            {
                temp = sc.nextInt();
                return temp;
            }
            
              public String getin()
            {
               String temp1;
                temp1 = sc.next();
                return temp1;
            }
           public void seedetails()
           {
               try
               {
                    fr = new FileReader("Details.txt");
                       int i;    
                    while((i=fr.read())!=-1)    
                    System.out.print((char)i);    
                    fr.close();    
               } catch (IOException ex) {
                   
                }
              
               
           }
            
          
           public void getemail()
           {
               System.out.println("Enter your Email :- ");
                email = sc1.nextLine();
                
                
                try {
                            fw = new  FileWriter("Details.txt", true);
                            fw.append(email); 
                            fw.append("\n"); 
                            fw.close();
                        } catch (IOException ex) {
                        
                    }
           }
           @SuppressWarnings("empty-statement")
            public void feedetails ()
            {
              
                System.out.println("Define Your Problem :- ");
                String str;
                str = sc1.nextLine();
                
                    try {
                            fw = new  FileWriter("Details.txt", true);
                            fw.append("\t"+str+"\n"); 
                           
                            fw.close();
                        } catch (IOException ex) {
                        
                    }
                            
            }
            public static void main(String[] args) throws IOException {
                
              
    }
}
