
public class PermanentTeacher extends Teacher{
	
	private double salaryPerMonth;
	private double withholdingTaxRate;
	private int protectedMembers;
	
	public PermanentTeacher(String name, String afm, double salaryPerMonth, double withholdingTaxRate, int protectedMembers) {
		super(name, afm);
		this.salaryPerMonth = salaryPerMonth;
		this.withholdingTaxRate = withholdingTaxRate;
		this.protectedMembers = protectedMembers;
	}
	
	@Override
	public double calculateNetSalary() {
		return salaryPerMonth * (1 - withholdingTaxRate) + protectedMembers * 100;
	}
}
