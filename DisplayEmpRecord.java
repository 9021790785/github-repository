
import java.util.*;

class  EmpRecord
{
	int id;
	String name;
	float sal;

	EmpRecord(int id,  String name,float sal)
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


class DisplayEmpRecord {
public static void main(String args[])
{


List<EmpRecord> listone=new ArrayList<EmpRecord>();

listone.add(new EmpRecord(1,"nikita",24000));
listone.add(new EmpRecord(2,"pratik",80000));
listone.add(new EmpRecord(3,"komal",10000));
listone.add(new EmpRecord(4,"megha",20000));
listone.add(new EmpRecord(5,"supriya",30000));



List<EmpRecord> list=new ArrayList<EmpRecord>();

System.out.println("display Employee record");

list.add(new EmpRecord(1,"n",3444));
list.add(new EmpRecord(2,"pr",80));
list.add(new EmpRecord(3,"ko",1000));
list.add(new EmpRecord(4,"me",2020));
list.add(new EmpRecord(5,"su",300));


Collections.copy(list,listone);
System.out.println(" id name and salary of employee is:");
for(EmpRecord e : list){

System.out.println(+ e.id +"   " +e.name+ "  "  +e.sal);	
}
}
}