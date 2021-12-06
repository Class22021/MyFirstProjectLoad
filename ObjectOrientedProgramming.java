
public class ObjectOrientedProgramming {

	//property
	// i am using this class to take information to another class
	// we are then required to get input from another class and 
	// process that input in this class
	
	//in order to get data from my MainClass,
	// i will need to use a get and set
	
	//get - will retrieve the input 
	//set - add the output to the end result
	private String name;
	//getter
	public String getName()
	{
		return name;
	}
	
	//setter
	public void setName(String NewName)
	{
		name = NewName;
	}
	
	private int age;
	public int getAge()
	{
		return age;
	}
	
	//setter
	public void setAge(int NewAge)
	{
		age = NewAge;
	}
	
	public String InformationProcess()
	{
		return name +" "+ age;
		//Brandon 20
	}
	
	
	
	
}
