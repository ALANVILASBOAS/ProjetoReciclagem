package projetoreciclagem;

public class MaterialPlastico extends MaterialReciclavel  implements Reciclagem{

	private int garrafaPet;
	private int embalagens;
	private double outrosPlasticos;
	
	public int getGarrafaPet() {
		return garrafaPet;
	}

	public void setGarrafaPet(int garrafaPet) {
		this.garrafaPet = garrafaPet;
	}

	public int getEmbalagens() {
		return embalagens;
	}

	public void setEmbalagens(int embalagens) {
		this.embalagens = embalagens;
	}

	public double getOutrosPlasticos() {
		return outrosPlasticos;
	}

	public void setOutrosPlasticos(double outrosPlasticos) {
		this.outrosPlasticos = outrosPlasticos;
	}

	@Override
	public void descartar() 
	{
		System.out.println("\n\t-- Escolha o tipo de pl�stico que deseja descartar --");
		System.out.println("\n1-Garrafa pet\n2-Embalagem pl�stica \n3-Outro tipo de pl�stico\n4-Voltar ao Menu Pricipal");
		setTipo(leia.nextInt());
		
		while(getTipo() < 1 || getTipo() > 4)
		{
			System.out.println("Op��o Inv�lida! tente novamente.\n");
			System.out.println("\n\t-- Escolha o tipo de pl�stico que deseja descartar --");
			System.out.println("\n1-Garrafa pet\n2-Embalagem pl�stica \n3-Outro tipo de pl�stico\n4-Voltar ao Menu Principal");
			setTipo(leia.nextInt());
		}
		
		switch(getTipo())
		{
		case 1:
			System.out.println("\nRetire todo o conte�do da garrafa, e tamb�m o r�tulo (se possivel, lave).\nCom a garrafa aberta, amasse-a, e depois, coloque a tampa.\nDescarte-a no cesto destinado ao pl�stico ou separado do lixo org�nico.");
			break;
		case 2:
			System.out.println("\nRetire quaisquer partes n�o pl�sticas do conte�do (se possivel, lave).\nDescarte-a no cesto destinado ao pl�stico ou separado do lixo org�nico.");
			break;
		case 3:
			System.out.println("\nRetire quaisquer partes n�o pl�sticas do conte�do (se possivel, lave).\nDescarte-a no cesto destinado ao pl�stico ou separado do lixo org�nico.");
		    break;	
		case 4:
		    	System.out.println("\nVoltando ao Menu Principal....");
		}
	}

	@Override
	public void calcularReciclaveis() 
	{
    boolean validaPlastico = false;
		leia.nextLine();
		System.out.println("Digite o tipo de pl�stico a ser descartado:\n[Garrafa pet] \n[Embalagem] \n[Outros]");
		setEscolha(leia.nextLine());
		
		do {
			if (getEscolha().equalsIgnoreCase("Garrafa pet") || getEscolha().equalsIgnoreCase("Embalagem") || getEscolha().equalsIgnoreCase("Outros")) {
				validaPlastico = true;
			} else {
				validaPlastico = false;
				System.out.println("Op��o n�o encontrada! escolha uma das op��es abaixo para descarte:\n[Garrafa pet] \n[Embalagem] \n[Outros]");
				setEscolha(leia.nextLine());
		    }	
		} while (!validaPlastico); //nega��o de true, condi��o falsa e sa�da do la�o
		
		if(getEscolha().equalsIgnoreCase("Garrafa pet")) 
		{
			System.out.println("Qual a quantidade de Garrafas pet a serem descartadas?");
			setGarrafaPet(leia.nextInt());
		}
		if(getEscolha().equalsIgnoreCase("Embalagem")) 
		{
			System.out.println("Qual a quantidade de embalagens a serem descartadas?");
			setEmbalagens(leia.nextInt());
		}
		if(getEscolha().equalsIgnoreCase("Outros")) 
		{
			System.out.println("Qual a quantidade de outros materiais pl�sticos a serem descartados(em gramas)?");
			setOutrosPlasticos(leia.nextDouble());
		}
		this.danoAmbiente();
			
	}

	@Override
	public void danoAmbiente() 
	{
		if(getEscolha().equalsIgnoreCase("Garrafa pet")) 
		{
			System.out.println("Voc� deixar� de descartar " +garrafaPet+ " garrafas pet no meio ambiente e elas poder�o ser reutilizadas! Parab�ns!");
		}
		if(getEscolha().equalsIgnoreCase("Embalagem")) 
		{
			System.out.println("Voc� deixar� de descartar " +embalagens+ " embalagens no meio ambiente e elas poder�o ser reutilizadas! Parab�ns!");
		}
		if(getEscolha().equalsIgnoreCase("Outros")) 
		{
			System.out.println("Voc� deixar� de descartar " +outrosPlasticos+ " gramas de outros pl�sticos no meio ambiente e eles poder�o ser reutilizados! Parab�ns!");
		}
		
		System.out.println("\n========== Impacto ambiental  ===========\n\n"
				+ "- Ao reciclar ou reutilizar, evitamos a gera��o de res�duos de pl�stico. \n"
                + "- Reduzimos o consumo de �gua.\n"
                + "- O pl�stico leva em m�dia 400 anos para se decompor e ainda libera gases t�xicos que podem afetar o solo,"
				+ " a �gua e o ar, prejudicando alimentos, animais causando doen�as nas pessoas.");
	}

	@Override
	public void reutilizar() 
	{
		System.out.println("\n\t-- Escolha o tipo de pl�stico que deseja reutilizar --");
		System.out.println("\n1-Garrafa pet\n2-Embalagem pl�stica \n3-Outro tipo de pl�stico");
		setTipo(leia.nextInt());
		
		while(getTipo() < 1 || getTipo() > 4)
		{
			System.out.println("Op��o Inv�lida! tente novamente.\n");
			System.out.println("\n\t-- Escolha o tipo de pl�stico que deseja reutilizar --");
			System.out.println("\n\t1-Garrafa pet\n2-Embalagem pl�stica \n3-Outro tipo de pl�stico");
			setTipo(leia.nextInt());
		}
		
		switch(getTipo())
		{
		case 1:
			System.out.println("\nVoc� pode cortar a garrafa ao meio, e fazer um vaso para plantas.\n� poss�vel fazer um estojo ao cortar a parte lateral da garrafa."
					+ "\nAo cortar o fundo da garrafa, podemos transforma-la em um pote de �gua para animais.");
			break;
		case 2:
			System.out.println("\nO pl�stico reciclado pode virar qualquer coisa, desde novos itens de pl�stico, como garrafas, novas embalagens, at� asfalto.");
			break;
		case 3:
			System.out.println("\nO pl�stico reciclado pode virar qualquer coisa, desde novos itens de pl�stico, como garrafas, novas embalagens, at� asfalto.");
			break;
			default:
				System.out.println("Obrigado por utilizar nosso sistema. Saindo ...");
		}
		
	}

}