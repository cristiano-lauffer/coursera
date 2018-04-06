

public class Paciente {
	
	double peso;
	double altura;
	double imc;
	
	Paciente(double quilos, double metros) {
		this.peso = quilos;
		this.altura = metros;
	}
	
	void cálculo() {
		this.imc = peso / (altura * altura);
	}
	
	public void diagnostico(String Paciente) {
		
		this.cálculo();
		if(this.imc < 16) {
			System.out.println(Paciente + ": Baixo peso muito grave. IMC: "+ this.imc + " kg/m²");
		} 
		else if(this.imc >= 16 && this.imc < 16.99) {
			System.out.println(Paciente + ": Baixo peso grave. IMC: "+ this.imc + " kg/m²");
		}
		else if(this.imc >= 17 && this.imc < 18.49) {
			System.out.println(Paciente + ": Baixo peso. IMC: "+ this.imc + " kg/m²");
		}
		else if(this.imc >= 18.50 && this.imc < 24.99) {
			System.out.println(Paciente + ": Peso normal. IMC: "+ this.imc + " kg/m²");
		}
		else if(this.imc >= 25 && this.imc < 29.99) {
			System.out.println(Paciente + ": Sobrepeso. IMC: "+ this.imc + " kg/m²");
		}
		else if(this.imc >= 30 && this.imc < 34.99) {
			System.out.println(Paciente + ": Obesidade grau I. IMC: "+ this.imc + " kg/m²");
		}
		else if(this.imc >= 35 && this.imc < 39.99) {
			System.out.println(Paciente + ": Obesidade grau II. IMC: "+ this.imc + " kg/m²");
		}
		else if(this.imc >= 40) {
			System.out.println(Paciente + ": Obesidade grau III (obesidade mórbida). IMC: "+ this.imc + " kg/m²");
		}
		
	}
	

	
}
