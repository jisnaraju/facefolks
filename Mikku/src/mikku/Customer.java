package mikku;

	class Customer
	{
		/*private String name;
		String address;
		 String contactNumber;
		 String email;
		 String proofType;
		 String proofID;
		  static int regNo=0;
		 public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		 public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		 public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getProofType() {
			return proofType;
		}
		public void setProofType(String proofType) {
			this.proofType = proofType;
		}
		public String getProofID() {
			return proofID;
		}
		public void setProofID(String proofID) {
			this.proofID = proofID;
		}*/
		String ac;
		 public String getAc() {
			return ac;
		}
		public void setAc(String ac) {
			this.ac = ac;
		}
		public String getCot() {
			return cot;
		}
		public void setCot(String cot) {
			this.cot = cot;
		}
		public String getCable() {
			return cable;
		}
		public void setCable(String cable) {
			this.cable = cable;
		}
		public String getWifi() {
			return wifi;
		}
		public void setWifi(String wifi) {
			this.wifi = wifi;
		}
		public String getLaundry() {
			return laundry;
		}
		public void setLaundry(String laundry) {
			this.laundry = laundry;
		}
		String cot;
		 String cable;
		 String wifi;
		 String laundry;
		 int total=0;
		
	/*Customer(String name,String address,String contactNumber,String email,String proofType,String proofID)
		 {
			 this.name=name;
			 this.address=address;
			 this.contactNumber=contactNumber;
			 this.email=email;
			 this.proofType=proofType;
			 this.proofID=proofID;
		 }
		
		 void register()
		  {
			 regNo++;
			  System.out.println(getName() +"\n" + getAddress() +"\n" +getContactNumber() +"\n"+getEmail()  + "\n" +getProofID() +"\n"+getProofType());
			  System.out.println("Your register Number is "+regNo);
		  }
		*/
		void book()
		{
			if(getAc().equals("AC"))
				total=total+1000;
			
			else if(getAc().equals("nAC"))
				total=total+750;
			 if(getCot().equals("Double"))
				total=total+350;
			else if(getCot().equals("Single"))
				total=total+0;
			 if(getCable().equals("C"))
				total=total+50;
			else if(getCable().equals("nC"))
				total=total+0;
			 if(getWifi().equals("W"))
				total=total+200;
			else if(getWifi().equals("nW"))
				total=total+0;
			if(getLaundry().equals("L"))
				total=total+100;
			else if(getLaundry().equals("nL"))
				total=total+0;
			 System.out.println("The total charge is Rs."+total);
			 System.out.println("The services chosen are");
			// System.out.println(getAc()+"\n"+getCot()+" cot"+"\n"+getCable()+"\n"+getWifi()+"\n"+getLaundry());
			if(getAc().equals("AC") && getCot().equals("Double") ) 
				System.out.println("Double cot AC room");
			else if(getAc().equals("AC") && getCot().equals("Single") )
				System.out.println("Single cot AC room");
			else if(getAc().equals("nAC") && getCot().equals("Double") ) 
				System.out.println("Double cot nAC room");
			else if(getAc().equals("nAC") && getCot().equals("Single") )
				System.out.println("Single cot nAC room");
			 if(getCable().equals("C"))
				System.out.println("Cable connection enabled");
			else if(getCable().equals("nC"))
				System.out.println("Cable connection not enabled");
			 if(getWifi().equals("W"))
				System.out.println("Wi-Fi enabled");
			 else if(getWifi().equals("nW"))
				System.out.println("Wi-Fi not enabled");
			 if(getLaundry().equals("L"))
				System.out.println("with laundry service");
			else if(getLaundry().equals("nL"))
				System.out.println("without laundry service");
			
			
			
			
		}
	}