package mikku;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//public Main(String name,String address,String contactNumber,String email,String proofType,String proofID)
	
	public static void main(String[] args) throws IOException {
	
	 String name;
	 String address;
	 String contactNumber;
	 String email;
	 String proofType;
	 String proofID;
	 String a;
	 String ac;
	 String cot;
	 String cable;
	 String wifi;
	 String laundry;
	
	 
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 
	 do
	 {
     name=br.readLine();
     address=br.readLine();
	 contactNumber=br.readLine();
	 email=br.readLine();
	 proofType=br.readLine();
	 proofID=br.readLine();
	 Customer obj=new Customer();
	 
	 //Customer obj=new Customer(name,address,contactNumber, email,proofType, proofID);
	 
	 obj.setName(name);
	 obj.setAddress(address);
	 obj.setContactNumber(contactNumber);
	 obj.setEmail(email);
	 obj.setProofID(proofType);
	 obj.setProofType(proofID);
	 obj.register();
		
	 System.out.println("Booking");
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
	 
	 a=br.readLine();
	 }while(a.equals("y"));
	 
	/* ac=br.readLine();
     cot=br.readLine();
     cable=br.readLine();
	 wifi=br.readLine();
	 laundry=br.readLine();
	 
	 
	 
	 
	 
	 */
	 
	 
	 
	 
	 //Main mn=new Main(name,address,contactNumber,email,proofType,proofID);
	 
	}

}
