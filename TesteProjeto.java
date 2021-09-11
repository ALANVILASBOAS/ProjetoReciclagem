package projetoreciclagem;

public class TesteProjeto {

	public static void main(String[] args) {
	
		MaterialEspecial especial = new MaterialEspecial(0,"___");
		especial.descartar();
		especial.danoAmbiente();
		especial.reutilizar(); 
	}

}