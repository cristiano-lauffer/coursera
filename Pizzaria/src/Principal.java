import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		Pizza pizza1 = new Pizza("pizza1");
		Pizza pizza2 = new Pizza("pizza2");
		Pizza pizza3 = new Pizza("pizza3");

		pizza1.adicionaIngrediente("queijo");
		pizza1.adicionaIngrediente("pimentão");

		pizza2.adicionaIngrediente("cebola");
		pizza2.adicionaIngrediente("alface");
		pizza2.adicionaIngrediente("rucula");

		pizza3.adicionaIngrediente("azeitona");
		pizza3.adicionaIngrediente("coração");
		pizza3.adicionaIngrediente("coração");
		pizza3.adicionaIngrediente("strogonoff");
		pizza3.adicionaIngrediente("peperone");
		pizza3.adicionaIngrediente("ovo");
		pizza3.adicionaIngrediente("frango");

		adicionarPizzaCarrinho(carrinho, pizza1);
		adicionarPizzaCarrinho(carrinho, pizza2);
		adicionarPizzaCarrinho(carrinho, pizza3);
		adicionarPizzaCarrinho(carrinho, new Pizza("pizza4"));

		System.out.println("Total do carrinho de compra [" + String.format("%.2f", carrinho.valorTotalCompra()) + "]");
		
		imprimeIngredientesUtilizados();

	}

	private static void adicionarPizzaCarrinho(CarrinhoDeCompras c, Pizza p) {
		if (c.adicionarPizza(p)) {
			System.out.println("Pizza [" + p.getNome() + "] adicionada no carrinho (" + String.format("%.2f", p.getPreco()) + ")");
		} else {
			System.out.println("Não foi possível adicionar a pizza [" + p.getNome() + "] no carrinho");
		}

	}
	
	private static void imprimeIngredientesUtilizados() {
		System.out.println("(Ingrediente: quantidade)");
		for (Map.Entry<String, Integer> ingrediente : Pizza.getIngredientesPizzas().entrySet()) {
			System.out.println("["+ ingrediente.getKey() +"]: " + ingrediente.getValue());
		}
	}

}
