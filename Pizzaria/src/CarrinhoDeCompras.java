import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Pizza> pizzas;

	public CarrinhoDeCompras() {
		//inicializa a lista de pizzas do carrinho de compras
		this.pizzas = new ArrayList<>();
	}

	public Boolean adicionarPizza(Pizza pizza) {

		if (pizza.semIngredientes()) {
			return false;
		}

		return this.pizzas.add(pizza);
	}

	public double valorTotalCompra() {
		double valorTotal = 0;

		for (Pizza pizza : pizzas) {
			valorTotal += pizza.getPreco();
		}

		return valorTotal;
	}
}
