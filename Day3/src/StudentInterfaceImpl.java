import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentInterfaceImpl implements StudentInterface {
	
	List<Student> list = new ArrayList<>();

	@Override
	public void addStudent(Student student) {
	 
		list.add(student);
		 

	  System.out.println(list);
	}

	@Override
	public void deleteStudents(int id) {
		
	for(int i =0;i<list.size();i++) {
		
		if(list.get(i).getId()!=id) {
			System.out.println("Student not found with this id");
			break;
		}
		
		if(list.get(i).getId()== id) {
			list.remove(i);
		}
	}
	System.out.println(list);
	}

	@Override
	public void findStudent(int id) {
		 
		for(int i =0;i<list.size();i++) {
			
//			System.out.println(list.get(i).getId());
			
			if(list.get(i).getId()==id) {
				System.out.println(list.get(i));
				return;
			}

		}
		System.out.println("Student not found with this id");
		
	}

	@Override
	public List<Student> findStudentWithPincode(String pin) {
      List<Student> s = new ArrayList<>();
      
      for(int i =0; i<list.size();i++) {
    	  if(list.get(i).getAddress().getPincode().equals(pin)) {
    		  s.add(list.get(i));
    	  }
      } 
      
      return s;
	}

	@Override
	public void sortWithName() {
	
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println(list);
	}

	@Override
	public void setOfMarks() {
		Set<Integer> set = new HashSet<>();
		
		for(int i =0;i<list.size();i++) {
			set.add(list.get(i).getMarks());
		}
		
		System.out.println(set);
	}

	@Override
	public void addAllStudents(List<Student> stud) {
		
		for(int i =0;i<stud.size();i++) {
			list.add(stud.get(i));
		}
		
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getMarks() - o2.getMarks();
			}
		});
		
		System.out.println(list);
	}

}
