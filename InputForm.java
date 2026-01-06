import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InputForm extends JFrame {

	private ArrayList<School> schools;
	private JTextField schoolField;
	private JPanel panel;
	private JButton ektypwsi;

	public InputForm(ArrayList<School> schools) {

		this.schools = schools;

		panel = new JPanel();

		schoolField = new JTextField("Eisagete to onoma ths sxolikhs monadas");

		ektypwsi = new JButton("Ektypwsi");

		ektypwsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String userInputName = schoolField.getText();

				System.out.println("********** Αποτελέσματα Αναζήτησης *********");

				boolean isFound = false;

				for (School s : schools) {
					if (s.getName().equals(userInputName)) {
						isFound = true;

						ArrayList<Teacher> teachersOfSchool = s.getTeachers();

						for (Teacher t : teachersOfSchool) {
							System.out.println("Εκπαιδευτικός: " + t.getName() +
									" | Καθαρός Μισθός: " + t.calculateNetSalary() + " Euro");
						}
					}
				}

				if (!isFound) {
					System.out.println("Δεν βρέθηκε σχολείο με το όνομα: " + userInputName);
				}
			}
		});
		// -----------------------------------------------------------

		panel.add(schoolField);
		panel.add(ektypwsi);

		this.setContentPane(panel);

		this.setSize(500, 250);
		this.setVisible(true);
		this.setTitle("Input Form");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}