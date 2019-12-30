package logic;


public class  EmpRecord
{
	public int id;
	public  String name;
	public   float sal;

	public EmpRecord(int id,  String name,float sal)
	{
	this.id=id;
	this.name=name;
	this.sal=sal;
	}

	void display()
	{
	System.out.println(id+" "+name);
	}
}

