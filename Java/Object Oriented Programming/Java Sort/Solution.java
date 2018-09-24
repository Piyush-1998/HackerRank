import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class Checker implements Comparator<Student> {
    
    @Override
    public int compare(Student student1, Student student2) {
        
        if(student1.getCgpa() < student2.getCgpa()) {
            
            return 1;
        }
        
        else if(student1.getCgpa() > student2.getCgpa()) {
            
            return -1;
        }
        
        else {
            
            if(student1.getFname().compareTo(student2.getFname()) == 0) {
                
                return Integer.compare(student1.getId(), student1.getId());   
            }
            
            return student1.getFname().compareTo(student2.getFname());
        }
    }
}

public class Solution
{
	public static void main(String[] args){
		
		// for double input
		Scanner in = new Scanner(System.in).useLocale(Locale.US);
		int testCases = Integer.parseInt(in.nextLine());
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		while(testCases > 0){
			
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
        @SuppressWarnings("unchecked")
		ArrayList<Student> printStudents = (ArrayList<Student>) studentList.clone();
        
        Collections.sort(printStudents, new Checker());
        
      	for(Student st : printStudents){
			
      		System.out.println(st.getFname());
		}
      	
      	in.close();
	}
}