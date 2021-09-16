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
		System.out.println("Descarte da maneira correta. \nComo est� a situa��o do seu papel?  \n1 - Limpo \n2 - Sujo \n3 - Contaminado biologicamente e/ou"
				+ " quimicamente \n4 - Voltar ao menu principal");
		System.out.println("\nDigite sua op��o: ");
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
			System.out.println("\nVerifique se a sujeira n�o est� contaminada biologicamente ou quimicamente, se n�o estiver, descarte no lixo org�nico\n");
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
		System.out.println("Digite o tipo de papel a ser descartado:\n[Jornal] \n[revista] \n[livro] \n[papel�o]");
		setEscolha(leia.nextLine());
		
		do {
			if (getEscolha().equalsIgnoreCase("Jornal") || getEscolha().equalsIgnoreCase("Revista") || getEscolha().equalsIgnoreCase("Livro") || getEscolha().equalsIgnoreCase("Papel�o")) {
				validapapel = true;
			} else {
				validapapel = false;
				System.out.println("Op��o n�o encontrada! escolha uma das op��es abaixo para descarte:\n[Jornal] \n[revista] \n[livro] \n[papel�o] ");
				setEscolha(leia.nextLine());
		    }	
		} while (!validapapel); //nega��o de true, condi��o falsa e sa�da do la�o
		
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
		if(getEscolha().equalsIgnoreCase("papel�o")) 
		{
			System.out.println("Qual a quantidade de papel�es (em gramas) a serem descartados?");
			setPapelao(leia.nextInt());
		}
		this.danoAmbiente();
			
	}
	
	
	@Override
	public void danoAmbiente() 
	{
		if(getEscolha().equalsIgnoreCase("Jornal")) 
		{
			System.out.println("Voc� deixar� de descartar " +jornal+ " jornais no meio ambiente e eles poder�o ser reutilizados! Parab�ns!");
		}
		if(getEscolha().equalsIgnoreCase("Revista")) 
		{
			System.out.println("Voc� deixar� de descartar " +revista+ " revistas no meio ambiente e elas poder�o ser reutilizadas! Parab�ns!");
		}
		if(getEscolha().equalsIgnoreCase("Livro")) 
		{
			System.out.println("Voc� deixar� de descartar " +livro+ " livros no meio ambiente e eles poder�o ser reutilizados! Parab�ns!");
		}
		if(getEscolha().equalsIgnoreCase("papel�o")) 
		{
			System.out.println("Voc� deixar� de descartar " +papelao+ " gramas de papel�o no meio ambiente e eles poder�o ser reutilizados! Parab�ns!");
		}
		
		System.out.println("\n========== Impacto ambiental  ===========\n\n"
				+ "- Ao reciclar ou reutilizar, evitamos a gera��o de res�duos de papel. \n"
                + "- Reduzimos o consumo de �gua.\n"
                + "- O descarte equivocado do papel � respons�vel por gerar consequ�ncias como alagamentos e enchentes, sobretudo nas grandes cidades.");
		
	}

	@Override
	public void reutilizar() 
	{
		System.out.println("Selecione a condi��o do papel: \n1-Limpo\n2-Sujo\n3-Contaminado");
		setTipo(leia.nextInt());
		while(getTipo() < 1 || getTipo() > 3) 
		{
			System.out.println("\nOp��o inv�lida! Selecione a condi��o do papel: \n1-Limpo\n2-Sujo\n3-Contaminado");
			setTipo(leia.nextInt());
		}
		if(getTipo() == 2 || getTipo() == 3) {
			System.out.println("\nDevido as condi��es do papel, ele n�o poder� ser reutiliz�vel. Siga as instru��es para um descarte correto.");
		}else {
			System.out.println("O papel pode ser reutilizado ap�s a reciclagem! Ir� gerar novos materiais (revistas, folhas de caderno, cart�es....)");
		}
		
	}

	
	
	
}