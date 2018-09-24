import java.util.*;

class Student {
    
    int id;
    String name;
    double cgpa;
    
    Student(String name, double cgpa, int id) {
        
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    int getId() {
        
        return id;
    }
    
    String getName() {
        
        return name;
    }
    
    double getCGPA() {
        
        return cgpa;
    }   
}

class Priorities {
    
    List<Student> getStudents(List<String> events) {
     
        PriorityQueue<Student> queue = new PriorityQueue<Student>(10, new Checker());
        
        ArrayList<Student> students = new ArrayList<Student>();
        
        for(int i = 0; i < events.size(); i++) {
            
            if(events.get(i).contains("ENTER")) {
                
                String[] studentFields = events.get(i).split(" ");
                
                queue.add(new Student(studentFields[1], Double.parseDouble(studentFields[2]), 
                                         Integer.parseInt(studentFields[3])));
            }
            
            else if(events.get(i).equals("SERVED")) {
                
                queue.poll();
            }
        }
        
        while (!queue.isEmpty()) {
            
            students.add(queue.poll());
        }
        
        return students;
    }
}

class Checker implements Comparator<Student> {
    
    @Override
    public int compare(Student first, Student second) {
        
        if(Double.compare(first.getCGPA(), second.getCGPA()) == 0) {
            
            if(first.getName().compareTo(second.getName()) == 0) {
                
                return Integer.compare(first.getId(), second.getId());
            }
            
            else {
                
                return first.getName().compareTo(second.getName());
            }
        }
           
        else {
            
            return Double.compare(second.getCGPA(), first.getCGPA());
        }
    }
}
