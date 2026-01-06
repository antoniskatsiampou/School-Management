import java.util.ArrayList;

public class School {

    private String name;
    private String principal;
    
    private ArrayList<Teacher> teachers; 
    
    public School(String text1, String text2) {
        name = text1;
        principal = text2;
        
        this.teachers = new ArrayList<>(); 
    }
    
    public String getName() {
        return name;
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

}