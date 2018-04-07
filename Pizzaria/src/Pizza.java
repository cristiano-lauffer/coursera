import java.util.HashMap;

public class Pizza {
	private static HashMap<String, Integer> ingredientesPizzas;
	private HashMap<String, Integer> ingredientes;
	private String nome;
	
	public Pizza() {
		this.inicializarVariaveis("");
	}

	public Pizza(String nome) {
		this.inicializarVariaveis(nome);
	}
	
	private void inicializarVariaveis(String nome) {
		this.nome = nome;
		// inicializa a variável dos ingredientes de todas as pizzas
		if (ingredientesPizzas == null) {
			ingredientesPizzas = new HashMap<>();
		}

		// inicializa a variavel da pizza atual
		this.ingredientes = new HashMap<>();
	}

	public void adicionaIngrediente(String ingrediente) {
		contabilizaIngrediente(ingrediente);
		this.ingredientes.put(ingrediente, 1);
	}

	private static void contabilizaIngrediente(String ingrediente) {
		if (ingredientesPizzas.containsKey(ingrediente)) {
			ingredientesPizzas.put(ingrediente, ingredientesPizzas.get(ingrediente) + 1);
		} else {
			ingredientesPizzas.put(ingrediente, 1);
		}
	}

	public Boolean semIngredientes() {
		return this.ingredientes.isEmpty();
	}

	public double getPreco() {
		if (this.semIngredientes()) {
			return 0;
		} else if (this.ingredientes.size() <= 2) {
			return 15;
		} else if (this.ingredientes.size() <= 5) {
			return 20;
		} else {
			return 23;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public static HashMap<String, Integer> getIngredientesPizzas(){
		return ingredientesPizzas;
	}
}
