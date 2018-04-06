
public class Paciente {
	
	private double dblPeso;
	private double dblAltura;

	public Paciente(double peso, double altura) {
		this.dblPeso = peso;
		this.dblAltura = altura;		
	}
	
	public double calcularIMC() {
		return this.dblPeso/(dblAltura * dblAltura);
	}
	
	public String diagnostico() {
		String strDiagnostico = "";
		
		double dblIMC = this.calcularIMC();
		
		strDiagnostico = String.format("[IMC = %.2f] - ", dblIMC);
		
		//Faz o diagnóstico
		if(dblIMC < 16) {
			strDiagnostico += "[Baixo peso muito grave = IMC abaixo de 16 kg/m²]";
		} else if (dblIMC >= 16 && dblIMC < 17) {
			strDiagnostico += "[Baixo peso grave = IMC entre 16 e 16,99 kg/m²]";
		} else if (dblIMC >= 17 && dblIMC < 18.5) {
			strDiagnostico += "[Baixo peso = IMC entre 17 e 18,49 kg/m²]";
		} else if (dblIMC >= 18.5 && dblIMC < 25) {
			strDiagnostico += "[Peso normal = IMC entre 18,50 e 24,99 kg/m²]";
		} else if (dblIMC >= 25 && dblIMC < 30) {
			strDiagnostico += "[Sobrepeso = IMC entre 25 e 29,99 kg/m²]";
		} else if (dblIMC >= 30 && dblIMC < 35) {
			strDiagnostico += "[Obesidade grau I = IMC entre 30 e 34,99 kg/m²]";
		} else if (dblIMC >= 35 && dblIMC < 40) {
			strDiagnostico += "[Obesidade grau II = IMC entre 35 e 39,99 kg/m²]";
		} else {
			strDiagnostico += "[Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²]";
		}

		return strDiagnostico;
	}

}
