package java_programs;

class StudentDetails {

	  int roll_no;

	  String name, cl;

	 //creating a function to take student details  

	  void input(int roll, String nam, String cl_name) {

	roll_no = roll; 

	name   = nam; 

	cl     = cl_name; 

	  }

	}

	class Student extends StudentDetails {

	  //method to display student details 

	  void display() {

	System.out.println("\n/******* Student details printed ********/");

	System.out.println("Roll Number is: "+roll_no);

	System.out.println("Your name is: "+name);

	System.out.println("Your class is: "+cl);

	  }

	  public static void main(String args[]) {

	Student std1 = new Student();

	std1.input(20, "pankaj", "12th");

	std1.display();

	 

	Student std2 = new Student();

	std2.input(10, "Anmol", "10th");

	std2.display();

	  }

	}