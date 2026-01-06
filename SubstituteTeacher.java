
public class SubstituteTeacher extends Teacher{
	
	private double salaryPerHour;
	private double workHoursPerMonth;
	
	public SubstituteTeacher(String name, String afm, double salaryPerHour, double workHoursPerMonth) {
		super(name, afm);
		this.salaryPerHour = salaryPerHour;
		this.workHoursPerMonth = workHoursPerMonth;
	}
	
	@Override
	public double calculateNetSalary() {
		return salaryPerHour * workHoursPerMonth;
	}
}
