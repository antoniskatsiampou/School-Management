import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		School school1 = new School("1st Highschool Polygyros", "Papadopoulos");
		School school2 = new School("17th Highschool Thessaloniki", "Nikolaou");
		School school3 = new School("3rd Highschool Patras", "Iosifidou");
		
		ArrayList<School> schools = new ArrayList<School>();
		schools.add(school1);
		schools.add(school2);
		schools.add(school3);
		
		InputForm form = new InputForm(schools);
		
		PermanentTeacher teacher1 = new PermanentTeacher("Alexiou", "748305572", 1700, 0.24, 2);
		PermanentTeacher teacher2 = new PermanentTeacher("Lambrou", "943772809", 1600, 0.24, 0);

		SubstituteTeacher teacher3 = new SubstituteTeacher("Dimitriou", "827459921", 10, 90);
		SubstituteTeacher teacher4 = new SubstituteTeacher("Papapetrou", "993457483", 8, 60);
		
		school1.addTeacher(teacher1);
		school1.addTeacher(teacher3);
		
		school2.addTeacher(teacher2);
		school2.addTeacher(teacher4);
	}

}
