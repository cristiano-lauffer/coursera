
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente p1 = new Paciente(76.5, 1.69);
		Paciente p2 = new Paciente(100, 1.75);
		Paciente p3 = new Paciente(76.5, 1.8);
		
		System.out.println("Diagnóstico do paciente 1: " + p1.diagnostico());
		System.out.println("Diagnóstico do paciente 2: " + p2.diagnostico());
		System.out.println("Diagnóstico do paciente 3: " + p3.diagnostico());
		
		
	}

}
