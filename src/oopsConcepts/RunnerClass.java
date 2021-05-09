package oopsConcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ClassA Emp1 = new ClassA(1000,"Ashwini","lg");
		
		
		/*Emp1.Name = "Ashwini";
		Emp1.OrgName = "LG Soft India";
		Emp1.Salary = 10000;
	    Emp1.age = 34;*/
		
		Emp1.Display();
		
		
		ClassB Obj1 = new ClassB();
		
        Obj1.Name = "Ashwini";
		Obj1.OrgName = "LG Soft India";
		Obj1.Salary = 10000;
	    Obj1.age = 34;
	    
	    Obj1.Display();
	    Obj1.show();
	    
	    ClassC xyz1 = new ClassC();
	    
	    xyz1.Display();
	    xyz1.show();
	    xyz1.run();
			
		
	}

}
