package projetoreciclagem;

public class MaterialPapel extends MaterialReciclavel implements Reciclagem {
	private int jornal;
	private int revista;
	private int livro;
	private double papelao;
	
	public MaterialPapel()
	{
		
	}

	public int getJornal() {
		return jornal;
	}

	public void setJornal(int jornal) {
		this.jornal = jornal;
	}

	public int getRevista() {
		return revista;
	}

	public void setRevista(int revista) {
		this.revista = revista;
	}

	public int getLivro() {
		return livro;
	}

	public void setLivro(int livro) {
		this.livro = livro;
	}

	public double getPapelao() {
		return papelao;
	}

	public void setPapelao(double papelao) {
		this.papelao = papelao;
	}
	
	@Override
	public void descartar() 
	{
		System.out.println("Descarte da maneira correta. \nComo está a situação do seu papel?  \n1 - Limpo \n2 - Sujo \n3 - Contaminado biologicamente e/ou"
				+ " quimicamente \n4 - Voltar ao menu principal");
		System.out.println("\nDigite sua opção: ");
		setTipo(leia.nextInt());
		
		while(getTipo() < 1 || getTipo() >4)
		{
			leia.nextLine();
			System.out.println("Qual o estado do papel que deseja descartar? \n1 - Limpo \n2 - Sujo \n3 - Contaminado biologicamente e/ou"
					+ " quimicamente? \n4 - Voltar ao menu principal");
			setTipo(leia.nextInt());
		}
		switch (getTipo())
		{
			case 1:
			System.out.println("\nDescarte em uma sacola separada e leve-o para um centro de reciclagem\n");
		     break;
		case 2:
			System.out.println("\nVerifique se a sujeira não está contaminada biologicamente ou quimicamente, se não estiver, descarte no lixo orgânico\n");
		     break;
		case 3: 
			System.out.println("\nSepare-o em uma embalagem somente para esse tipo de papel e descarte-o no lixo\n");
		     break;
		case 4:
			System.out.println("\nVoltando ao Menu Principal...");
		
		}
		
	}

	@Override
	public void calcularReciclaveis() 
	{
		leia.nextLine();
		boolean validapapel = false;
		leia.nextLine();
		System.out.println("Digite o tipo de papel a ser descartado:\n[Jornal] \n[revista] \n[livro] \n[papelão]");
		setEscolha(leia.nextLine());
		
		do {
			if (getEscolha().equalsIgnoreCase("Jornal") || getEscolha().equalsIgnoreCase("Revista") || getEscolha().equalsIgnoreCase("Livro") || getEscolha().equalsIgnoreCase("Papelão")) {
				validapapel = true;
			} else {
				validapapel = false;
				System.out.println("Opção não encontrada! escolha uma das opções abaixo para descarte:\n[Jornal] \n[revista] \n[livro] \n[papelão] ");
				setEscolha(leia.nextLine());
		    }	
		} while (!validapapel); //negação de true, condição falsa e saída do laço
		
		if(getEscolha().equalsIgnoreCase("Jornal")) 
		{
			System.out.println("Qual a quantidade de jornais a serem descartados?");
			setJornal(leia.nextInt());
		}
		if(getEscolha().equalsIgnoreCase("revista")) 
		{
			System.out.println("Qual a quantidade de revistas a serem descartadas?");
			setRevista(leia.nextInt());
		}
		if(getEscolha().equalsIgnoreCase("livro")) 
		{
			System.out.println("Qual a quantidade de livros a serem descartados?");
			setLivro(leia.nextInt());
		}
		if(getEscolha().equalsIgnoreCase("papelão")) 
		{
			System.out.println("Qual a quantidade de papelões (em gramas) a serem descartados?");
			setPapelao(leia.nextInt());
		}
		this.danoAmbiente();
			
	}
	
	
	@Override
	public void danoAmbiente() 
	{
		if(getEscolha().equalsIgnoreCase("Jornal")) 
		{
			System.out.println("Você deixará de descartar " +jornal+ " jornais no meio ambiente e eles poderão ser reutilizados! Parabéns!");
		}
		if(getEscolha().equalsIgnoreCase("Revista")) 
		{
			System.out.println("Você deixará de descartar " +revista+ " revistas no meio ambiente e elas poderão ser reutilizadas! Parabéns!");
		}
		if(getEscolha().equalsIgnoreCase("Livro")) 
		{
			System.out.println("Você deixará de descartar " +livro+ " livros no meio ambiente e eles poderão ser reutilizados! Parabéns!");
		}
		if(getEscolha().equalsIgnoreCase("papelão")) 
		{
			System.out.println("Você deixará de descartar " +papelao+ " gramas de papelão no meio ambiente e eles poderão ser reutilizados! Parabéns!");
		}
		
		System.out.println("\n========== Impacto ambiental  ===========\n\n"
				+ "- Ao reciclar ou reutilizar, evitamos a geração de resíduos de papel. \n"
                + "- Reduzimos o consumo de água.\n"
                + "- O descarte equivocado do papel é responsável por gerar consequências como alagamentos e enchentes, sobretudo nas grandes cidades.");
		
	}

	@Override
	public void reutilizar() 
	{
		System.out.println("Selecione a condição do papel: \n1-Limpo\n2-Sujo\n3-Contaminado");
		setTipo(leia.nextInt());
		while(getTipo() < 1 || getTipo() > 3) 
		{
			System.out.println("\nOpção inválida! Selecione a condição do papel: \n1-Limpo\n2-Sujo\n3-Contaminado");
			setTipo(leia.nextInt());
		}
		if(getTipo() == 2 || getTipo() == 3) {
			System.out.println("\nDevido as condições do papel, ele não poderá ser reutilizável. Siga as instruções para um descarte correto.");
		}else {
			System.out.println("O papel pode ser reutilizado após a reciclagem! Irá gerar novos materiais (revistas, folhas de caderno, cartões....)");
		}
		
	}

	
	
	
}