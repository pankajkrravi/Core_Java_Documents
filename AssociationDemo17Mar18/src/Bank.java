
// Java program to illustrate the 
// concept of Association

// class bank
class Bank 
{
	private String name;

	// bank name
	Bank(String name)
	{
		this.name = name;
	}

	public String getBankName()
	{
		return this.name;
	}
} 

// employee class 
class Employee
{
	private String name;

	// employee name 
	Employee(String name) 
	{
		this.name = name;
	}

	public String getEmployeeName()
	{
		return this.name;
	} 
}


