
public class Principal {

	public static void main(String[] args) {

		Paciente paciente1 = new Paciente(68, 1.65);
		Paciente paciente2 = new Paciente(79, 1.80);
		Paciente paciente3 = new Paciente(90, 1.70);
		Paciente paciente4 = new Paciente(18.49, 1.00);
		Paciente paciente5 = new Paciente(24.99, 1.00);

		paciente1.diagnostico("Paciente1");

		paciente2.diagnostico("Paciente2");

		paciente3.diagnostico("Paciente3");

		paciente4.diagnostico("Paciente4");
		
		paciente5.diagnostico("Paciente5");
	}

}
