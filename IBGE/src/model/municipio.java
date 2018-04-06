package model;

public class municipio {
	private String separador = ";";
	public String id;
	public String nome;
	public microrregiao microrregiao;

	@Override
	public String toString() {
		return this.id + this.separador + this.nome + this.separador + this.microrregiao.mesorregiao.UF.nome + this.separador + this.microrregiao.mesorregiao.UF.sigla;
	}
}
