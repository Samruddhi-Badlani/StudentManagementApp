
import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome To Student Management App");
		
		
		while(true) {
			
			System.out.println("Press 1 to ADD Student Detail");
			System.out.println("Press 2 to DELETE Student Detail");
			System.out.println("Press 3 to DISPLAY Student Detail");
		
			System.out.println("Press 4 to Exit");
			
			int choice  = 0 ;
			
			
			Scanner scanner = new Scanner(System.in);
			
			choice = scanner.nextInt();
			
			
			switch (choice) {
			
			case 1:
				
				System.out.print("Enter Name: ");
			    String name = scanner.next();
			    
			    System.out.print("Enter phone no: ");
			    String phone = scanner.next();
			    
			    System.out.print("Enter city: ");
			    String city= scanner.next();
			    
			    System.out.print("Enter age: ");
			    int age = scanner.nextInt();
			    
			    Student student = new Student(name,phone,city,age);
			    
			    System.out.println(student.toString());
			    
			    boolean answer = StudentDao.insertStudentToDB(student);
			    
			    if(answer) {
			    	System.out.println("Student added successfully!!");
			    }
			    else {
			    	System.out.println("Error occurred  ! Please try again");
			    }
				
				break;
			
			case 2:
				
				System.out.print("Enter student id to delete ");
				int id ;
				id = scanner.nextInt() ;
				answer = StudentDao.deleteStudent(id);
			    
			    if(answer) {
			    	System.out.println("Student deleted successfully!!");
			    }
			    else {
			    	System.out.println("Error occurred  ! Please try again");
			    }
				
				break;
				
				
			
			case 3:
				
				StudentDao.showAllStudents();
				
				break;
			
			
			
			

			default:
				break;
			}
			
			if(choice == 4) {
				break;
			}
		}
		
		System.out.println("Thank You For using Application!!4");

	}
	
	
}
