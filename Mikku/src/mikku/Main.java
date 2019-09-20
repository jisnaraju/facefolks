package mikku;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	//public Main(String name,String address,String contactNumber,String email,String proofType,String proofID)
	
	public static void main(String[] args) throws IOException {
	
	/* String name;
	 String address;
	 String contactNumber;
	 String email;
	 String proofType;
	 String proofID;
	String a;*/
		int a=1;
	 String ac;
	 String cot;
	 String cable;
	 String wifi;
	 String laundry;
	 int option;
	 int roomnumber=0;
	 int numberverify;
	 int k=0;
	 int flag=0;
	 String proceed = null;
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int[] arr = new int[25];
	 
	 
     /*name=br.readLine();
     address=br.readLine();
	 contactNumber=br.readLine();
	 email=br.readLine();
	 proofType=br.readLine();
	 proofID=br.readLine();*/
	 Customer obj=new Customer();
	 do
	 { 
	 System.out.println("Menu");
	 System.out.println("1. Book");
	 System.out.println("2. Check Status");
	 System.out.println("3. Exit");
	 System.out.println("Enter your choice");
	 option=Integer.parseInt(br.readLine());
	
	 switch(option)
	 {
	   case 1:
	   {  
		   System.out.println("Booking");
		   do
		   {
			   
			 System.out.println("Please choose the service required");
			 System.out.println("AC/non-AC(AC/nAC)");
			 
			 ac=br.readLine();
			 obj.setAc(ac);
			 System.out.println("Cot(Single/Double)");
			 cot=br.readLine();
			 obj.setCot(cot);
			 System.out.println("With cable connection/without cable connection(C/nC)");
			 cable=br.readLine();
			 obj.setCable(cable);
			 System.out.println("Wi-Fi needed or not(W/nW)");
			 wifi=br.readLine();
			 obj.setWifi(wifi);
			 System.out.println("Laundry service needed or not(L/nL)");
			 laundry=br.readLine();
			 obj.setLaundry(laundry);
			 obj.book();  
			 System.out.println("Do you want to proceed?");
			 proceed=br.readLine();
		   }while(proceed.equals("no"));
			 if(proceed.equals("yes"))
			 {
				 roomnumber++;
				 System.out.println("Thank you for booking. Your room number is"+roomnumber);
			     arr[k]=roomnumber;
			     k++;
			 }
			 break;
	   }
	   case 2:
	   {
		   System.out.println("Enter room number");
		   numberverify=Integer.parseInt(br.readLine());   
			   for(int i=0;i<25;i++)
			   {
				   if(arr[i]==numberverify)
				   {
					   flag=1;
					   break;
				   }
				   
			   }
			   System.out.println();
			   if(flag==1) {
				   
				   System.out.println("Room number "+numberverify+"is booked"); 
			   }
			   else if(flag==0) {
				   System.out.println("Room number "+numberverify+" is not booked");  
	   }
			   break;
	   }
	   case 3:
	   {
		  a=0; 
	   }
	 }
	 
	 //if(proceed.equals("yes"))
	// {
	//	 roomnumber++;
	//	 System.out.println("Thank you for booking. Your room number is"+roomnumber);
	 //    arr[k]=roomnumber;
	   //  k++;
	 //}
	 }while(a==1);
	 //while(proceed=="Yes");
	 
	 //Customer obj=new Customer(name,address,contactNumber, email,proofType, proofID);
	 
	/* obj.setName(name);
	 obj.setAddress(address);
	 obj.setContactNumber(contactNumber);
	 obj.setEmail(email);
	 obj.setProofID(proofType);
	 obj.setProofType(proofID);
	 obj.register();*/
	 
		
	/* System.out.println("Booking");
	 System.out.println("Please choose the service required");
	 System.out.println("AC/non-AC(AC/nAC)");
	 
	 ac=br.readLine();
	 obj.setAc(ac);
	 System.out.println("Cot(Single/Double)");
	 cot=br.readLine();
	 obj.setCot(cot);
	 System.out.println("With cable connection/without cable connection(C/nC)");
	 cable=br.readLine();
	 obj.setCable(cable);
	 System.out.println("Wi-Fi needed or not(W/nW)");
	 wifi=br.readLine();
	 obj.setWifi(wifi);
	 System.out.println("Laundry service needed or not(L/nL)");
	 laundry=br.readLine();
	 obj.setLaundry(laundry);
	 obj.book();
	 System.out.println("Do you want to continue? Then Press y");
	 
	 //a=br.readLine();
	 }
	 
	/* ac=br.readLine();
     cot=br.readLine();
     cable=br.readLine();
	 wifi=br.readLine();
	 laundry=br.readLine();
	 */
	//Main mn=new Main(name,address,contactNumber,email,proofType,proofID);
	 
	

	}}

	
