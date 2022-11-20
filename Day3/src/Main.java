import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		StudentInterface stud = new StudentInterfaceImpl();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
//			
			System.out.println("choose any number");
			System.out.println("1- add students detail");
			System.out.println("2- delete student by id");
			System.out.println("3 - find student by id");
			System.out.println("4 - find students with pincode");
			System.out.println("5 - sort students with name");
			System.out.println("6 - get all students marks list");
			System.out.println("7 - add new students");
			System.out.println("8 - Exit");
			int ch = sc.nextInt();
//			System.out.println("Enter student detail");
//			int id = (int) Math.random();
//			System.out.println("Enter student name");
//			String name = sc.next();
//			System.out.println("enter student marks");
//			int marks = sc.nextInt();
//			System.out.println("enter student section");
//			String sec = sc.next();
//			System.out.println("Enter student address details");
//			System.out.println("enter student city");
//			String city = sc.next();
//			System.out.println("enter student state");
//			String state = sc.next();
//			System.out.println("enter student pincode");
//			String pin = sc.next();
//			
//			Student student = new Student(id, name, marks, sec, new Address(city, state, pin));
//			stud.addStudent(student);
//		}
			if(ch==1) {
				System.out.println("Enter student detail");
				int id = (int) Math.random();
				System.out.println("Enter student name");
				String name = sc.next();
				System.out.println("enter student marks");
				int marks = sc.nextInt();
				System.out.println("enter student section");
				String sec = sc.next();
				System.out.println("Enter student address details");
				System.out.println("enter student city");
				String city = sc.next();
				System.out.println("enter student state");
				String state = sc.next();
				System.out.println("enter student pincode");
				String pin = sc.next();
				
				Student student = new Student(id, name, marks, sec, new Address(city, state, pin));
				stud.addStudent(student);
			}
			else if(ch==2) {
				System.out.println("which student you want to delete enter id");
				int id = sc.nextInt();
				 stud.deleteStudents(id);
			}
			
			else if(ch==3) {
			  System.out.println("Enter student id to find student");
			  int id = sc.nextInt();
			  stud.findStudent(id);
		  }
		
			else if(ch==4) {
			  System.out.println("Enter student pincode to find student");
			  String str = sc.next();
				List<Student> s =  stud.findStudentWithPincode(str);
				if(s.size()==0) {
					System.out.println("No student found with this pincode");
				}
				else {
					System.out.println(s);
				}
		  }
			else if(ch==5) {
				stud.sortWithName();
			}
			else if(ch==6) {
				stud.setOfMarks();	
			}
			else if(ch==7) {
				System.out.println("Enter student detail");
				int id = (int) Math.random();
				System.out.println("Enter student name");
				String name = sc.next();
				System.out.println("enter student marks");
				int marks = sc.nextInt();
				System.out.println("enter student section");
				String sec = sc.next();
				System.out.println("Enter student address details");
				System.out.println("enter student city");
				String city = sc.next();
				System.out.println("enter student state");
				String state = sc.next();
				System.out.println("enter student pincode");
				String pin = sc.next();
				
				Student student = new Student(id, name, marks, sec, new Address(city, state, pin));
				List<Student> su = new ArrayList<>();
				stud.addAllStudents(su);
			}
			else if(ch==8) {
				break;
			}
	
		}
	}

}
