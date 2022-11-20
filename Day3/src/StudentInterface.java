import java.util.List;

public interface StudentInterface {
	
	public void addStudent(Student student);
    public void deleteStudents(int id);
    public void findStudent(int id);
    public List<Student> findStudentWithPincode(String pin);
    public void sortWithName();
    public void setOfMarks();
    public void addAllStudents(List<Student> stud);
}
