class StudentManagementSystem{

public final String name;
private Short dob;
private Long mobileNumber;
private String address;
public String dept;

public String regNo;
public Byte age;

static int itCount=0,cseCount=0,extcCount=0;

StudentManagementSystem(String name,int dob,Long mobileNumber,String address,String dept)
{
	this.name = name;
	this.dob = (short)dob;
	this.mobileNumber = mobileNumber;
	this.address = address;
	this.dept = dept;
	
	age = setAge(this.dob);
	regNo = generateRegNo(dept);
}

private String generateRegNo(String dept)
{
	String result="";
	dept = dept.toLowerCase();
	switch(dept)
	{
	
	case "it" :itCount+=1;
	result =  "2025b"+dept.toLowerCase()+"0"+itCount;
	break;
	
	case "cse" :cseCount+=1;
	result = "2025b"+dept.toLowerCase()+"0"+cseCount;
	break;
	
	case "extc" :extcCount+=1;
	result = "2025b"+dept.toLowerCase()+"0"+extcCount;
	break;
	}
	
	return result;
}

private byte setAge(Short dob)
{
	Integer age = 2025-dob;
	return age.byteValue();
}

public void display()
{
	System.out.println("Student Details");
	System.out.println("Name : "+this.name);
	System.out.println("Age : "+this.age);
	System.out.println("Department : "+this.dept);
	System.out.println("Reg No : "+this.regNo);
	System.out.println("DOB : "+this.dob);
	System.out.println("Address : "+this.address);
	System.out.println("Mobile No : "+this.mobileNumber);
}


public static void main(String[] sggs)
{
	StudentManagementSystem student1 = new StudentManagementSystem("Aamer",2005,123456789l,"Nanded-431 604","it");
	StudentManagementSystem student2 = new StudentManagementSystem("abcd",1980,9876543221l,"Mumbai-431 604","extc");
	
	student1.display();
	student2.display();
}
}
