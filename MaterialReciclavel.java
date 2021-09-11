package projetoreciclagem;
import java.util.Scanner;
public abstract class MaterialReciclavel {
	Scanner leia  = new Scanner(System.in);
	private int tipo;
	private int reutilizacao;
	private int quantidade;
	
	
	public MaterialReciclavel(int tipo2, String caracteristica) 
	{

	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getReutilizacao() {
		return reutilizacao;
	}

	public void setReutilizacao(int reutilizacao) {
		this.reutilizacao = reutilizacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}