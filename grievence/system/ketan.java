/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grievence.system;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ketan {

    /**
     * @param args the command line arguments
     */
     Scanner sc = new Scanner(System.in); 

    /**
     *
     * @return
     */
    public String faq()
           {
         
          System.out.println("1. What is the postal address of the Department of Administrative Reforms and Public Grievances?");
	  System.out.println("2.What is the organization structure of grievance redress in Government of India?");
	  System.out.println("3.What is the mandate of the DAR&PG with regard to grievances?");
	  System.out.println("4.What are the requirements for sending of grievances by post?");
	  System.out.println("5.After redress, can the grievance be re-opened for further correspondence about it having been closed without details etc.?");
	  System.out.println("6.What is the common framework for grievance redress in all Central Ministries / Departments/ Organizations?");
	  System.out.println("7.What are the contact details of the Nodal Officers of Public Grievances in |Ministries/Department?");
	  System.out.println("8.When was pg portal started?");
	  System.out.println("9.What is the purpose and objectives of pgportal?");
	  System.out.println("10.What type of Public Grievances are heard by the Department?");
	  System.out.println("11.What is the system of granting personal hearing on grievances.");
	  System.out.println("12.What are the type of grievances which are not taken up for redress by the department?");
	  System.out.println("13.What is the role of Department of Administrative Reforms and Public Grievances (DARPG) with reference to the grievances concerning Central Ministries/Departments/ Organizations?");
	  System.out.println("14.What is the role of Department of Administrative Reforms and Public Grievances (DARPG) with reference to the grievances concerning State Government?");
	  System.out.println("15.What procedures are used by DARPG to inform the aggrieved citizen?");
	  System.out.println("16.What is the time limit for redress of grievance?");
	  System.out.println("17.What action can be taken by the citizen in case of non-redress of his grievance within the prescribed time?");
	  System.out.println("18.In case of non-redress of a grievance within the stipulated time of 60 days, what action can be taken against the officer concerned?");
          
          System.out.println("\nYou found your problem ?");
          String temp1;
          temp1 = sc.next();
          return temp1;
          }
    
           public void answer(int answer)
          {
              	   
	 if(answer==1)
	 {
		 System.out.println("Department of Administrative Reforms and Public Grievances, 5th floor, Sardar Patel Bhavan, Sansad Marg");
         System.out.println("New Delhi – 110001");
         System.out.println("Website: www.darpg.gov.inTele fax – 23741006");
	 }
	 
	 else if(answer==2)
	 {
		 System.out.println("The organization structure comprises of the following nodal agencies for receiving grievances from the citizens :");
		 System.out.println("(a) The Department of Administrative Reforms and Public Grievances.(DAR&PG) (http://pgportal.gov.in)");
		 System.out.println("(b) The Public Wing in Rashtrapati Bhawan Secretariat. (http://helpline.rb.nic.in)");
		 System.out.println("(c) The Public Wing in the Prime Minister’s Office. d) The Directorate of Public Grievances in Cabinet Secretariat. (DPG) (http://dpg.gov.in) e) The Department of Pensions and Pensioners’ Welfare.(DP&PW) (http://pgportal.gov.in/pension/)");
		 System.out.println("All the above nodal agencies receive grievances online through http://pgportal.gov.in as well as by post or by hand in person, from the public.");
		 System.out.println("The grievances received online in the Public Wing of Rashtrapati Bhawan, the Prime Minister’s Office and the DP&PW, also get converged in the http://pgportal.gov.in (For details please refer to Chapter 1 of the bilingual ‘Compilation of Guidelines for Redress of Public Grievances, August 2010’, accessible on Public Grievance portal as above and under ‘Rules and Manuals’ on www.darpg.gov.in)");
	 }
	 else if(answer==3)
	 {
		 System.out.println("As per ‘Allocation of Business Rules 1961’, the following work on grievances is allocated to DAR&PG:-");
		 System.out.println("1. Policy, coordination and monitoring of issues relating to –");
		 System.out.println("(a) Redress of public grievances in general; and");
		 System.out.println("(b) Grievances pertaining to Central Government agencies");
	 }
	 else if(answer==4)
	 {
		 System.out.println("In cases where internet facility is not available or even otherwise, the citizen is free to send his grievance by Post. For this, no form is prescribed. The grievance may be written on any plain sheet of paper or on a Postcard / Inland letter and addressed to the Department.");
	 }
	 else if(answer==5)
	 {
		 System.out.println("No. In such situations, the citizen will have to lodge a fresh grievance drawing reference to the closed grievance, and call for details. Sometimes,the details are sent by post and mentioned in the final report. The postal delivery may be awaited before lodging a fresh grievance.");
	 }
	 else if(answer==6)
	 {
		 System.out.println("Framework for redress of grievances in all Central Ministries / Departments / Organizations: Every Central Ministry / Department has designated a Joint Secretary or a Director / Deputy Secretary, as its ‘Director of Grievances’.");
	     System.out.println("He / She is the nodal officer for redress of grievances on work areas allocated to that particular Ministry / Department."); 
	 }
	 else if(answer==7)
	 {
		 System.out.println("This list is accessible through- out the year on the Department’s website at www.darpg.nic.in and at www.pgportal.gov.in");
	 }
	 else if(answer==8)
	 {
		 System.out.println("Centralized Public Grievance Redress and Monitoring System (CPGRAMS) is operational since 1/6/2007.");
	 }
	 else if(answer==9)
	 {
		 System.out.println("Pgportal is an online system for facilitating citizen for lodging of grievances from anywhere, anytime 24×7. The system enables Ministries/Departments close monitoring of the grievances received for expeditious disposal and upload Action Taken Report.");
		 System.out.println("The citizens can view the status of action taken. There is also a feedback mechanism for satisfaction rating by the complainant of the action taken which may lead to further improvements.");
	 }
	 else if(answer==10)
	 {
		 System.out.println("The citizens can view the status of action taken. There is also a feedback mechanism for satisfaction rating by the complainant of the action taken which may lead to further improvements.");
	 }
	 else if(answer==11)
	 {
		 System.out.println("Forenoon of every Wednesday of the week has been earmarked for receiving and hearing of grievances by the Director of Public Grievances in person.");
	 }
	 else if(answer==12)
	 {
		 System.out.println("(a). Subjudice cases or any matter concerning judgment given by any court.");
		 System.out.println("(b). Personal and family disputes.");
		 System.out.println("(c). RTI matters.");
	 }
	 else if(answer==13)
	 {
		 System.out.println("The Department of Administrative Reforms & Public Grievances is the chief policy making, monitoring and coordinating Department for public grievances arising from the work of Ministries/Departments/Organizations of the Government of India. The grievances received in the department are forwarded to the Ministries/Departments concerned.");
		 System.out.println("Redressal of grievances is done by respective Ministries/Departments in a decentralized manner. The Department periodically reviews the status of redressal of public grievances under CPGRAMS of Ministries/Departments for speedy disposal of grievances / complaints.");
	 }
	 else if(answer==14)
	 {
		 System.out.println("All grievances relating to State Governments / Union Territory Administrations and Government of NCT Region of Delhi, are to be redressed by the State/ UT/ NCT Government concerned. Citizens are advised to take up matter regarding pendency of their grievances directly with the State Government concerned. In view of federal principle of governance enshrined in the Constitution of India no monitoring is done by the DARPG.");
	 }
	 else if(answer==15)
	 {
		 System.out.println("On successful lodging of a grievance an acknowledgment is auto generated on the online system. A grievance received by post is acknowledged within three days of the receipt.");
		 System.out.println("A grievance received by hand is acknowledged at the same time After careful scrutiny, the grievances received in the Department of Administrative Reforms and Public Grievances are forwarded to the Ministries/ Departments/Organizations/State Governments/ UTs concerned for appropriate action.");
		 System.out.println("The complainant is also informed about the name and address of the officer and the organization to whom the complaint has been forwarded for action.");
	 }
	 else if(answer==16)
	 {
		 System.out.println("60 days as per Guidelines. In case of delay an interim reply with reasons for delay is required to be given.");
		 System.out.println("However, this time limit is not mandatory as the grievance redress mechanism is voluntary in nature.");
	 }
	 else if(answer==17)
	 {
		 System.out.println("He may take up the matter with the Director of Public Grievances of the Ministry/Department concerned whose details are available on the pgportal.");
	 }
	 else if(answer==18)
	 {
		 System.out.println("No penal provisions have been prescribed in the Guidelines relating to redress of public grievances.");
		 System.out.println("However, in case of any dereliction of duty it is the responsibility of the Ministry/Department concerned, to take disciplinary action against the erring official.");
	 }
	 else
	 {
		 System.out.println("Wrong input");
	//	 break label121;
	 }
          }
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
