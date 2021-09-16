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
		System.out.println("\n\t-- Escolha o tipo de plástico que deseja descartar --");
		System.out.println("\n1-Garrafa pet\n2-Embalagem plástica \n3-Outro tipo de plástico\n4-Voltar ao Menu Pricipal");
		setTipo(leia.nextInt());
		
		while(getTipo() < 1 || getTipo() > 4)
		{
			System.out.println("Opção Inválida! tente novamente.\n");
			System.out.println("\n\t-- Escolha o tipo de plástico que deseja descartar --");
			System.out.println("\n1-Garrafa pet\n2-Embalagem plástica \n3-Outro tipo de plástico\n4-Voltar ao Menu Principal");
			setTipo(leia.nextInt());
		}
		
		switch(getTipo())
		{
		case 1:
			System.out.println("\nRetire todo o conteúdo da garrafa, e também o rótulo (se possivel, lave).\nCom a garrafa aberta, amasse-a, e depois, coloque a tampa.\nDescarte-a no cesto destinado ao plástico ou separado do lixo orgânico.");
			break;
		case 2:
			System.out.println("\nRetire quaisquer partes não plásticas do conteúdo (se possivel, lave).\nDescarte-a no cesto destinado ao plástico ou separado do lixo orgânico.");
			break;
		case 3:
			System.out.println("\nRetire quaisquer partes não plásticas do conteúdo (se possivel, lave).\nDescarte-a no cesto destinado ao plástico ou separado do lixo orgânico.");
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
		System.out.println("Digite o tipo de plástico a ser descartado:\n[Garrafa pet] \n[Embalagem] \n[Outros]");
		setEscolha(leia.nextLine());
		
		do {
			if (getEscolha().equalsIgnoreCase("Garrafa pet") || getEscolha().equalsIgnoreCase("Embalagem") || getEscolha().equalsIgnoreCase("Outros")) {
				validaPlastico = true;
			} else {
				validaPlastico = false;
				System.out.println("Opção não encontrada! escolha uma das opções abaixo para descarte:\n[Garrafa pet] \n[Embalagem] \n[Outros]");
				setEscolha(leia.nextLine());
		    }	
		} while (!validaPlastico); //negação de true, condição falsa e saída do laço
		
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
			System.out.println("Qual a quantidade de outros materiais plásticos a serem descartados(em gramas)?");
			setOutrosPlasticos(leia.nextDouble());
		}
		this.danoAmbiente();
			
	}

	@Override
	public void danoAmbiente() 
	{
		if(getEscolha().equalsIgnoreCase("Garrafa pet")) 
		{
			System.out.println("Você deixará de descartar " +garrafaPet+ " garrafas pet no meio ambiente e elas poderão ser reutilizadas! Parabéns!");
		}
		if(getEscolha().equalsIgnoreCase("Embalagem")) 
		{
			System.out.println("Você deixará de descartar " +embalagens+ " embalagens no meio ambiente e elas poderão ser reutilizadas! Parabéns!");
		}
		if(getEscolha().equalsIgnoreCase("Outros")) 
		{
			System.out.println("Você deixará de descartar " +outrosPlasticos+ " gramas de outros plásticos no meio ambiente e eles poderão ser reutilizados! Parabéns!");
		}
		
		System.out.println("\n========== Impacto ambiental  ===========\n\n"
				+ "- Ao reciclar ou reutilizar, evitamos a geração de resíduos de plástico. \n"
                + "- Reduzimos o consumo de água.\n"
                + "- O plástico leva em média 400 anos para se decompor e ainda libera gases tóxicos que podem afetar o solo,"
				+ " a água e o ar, prejudicando alimentos, animais causando doenças nas pessoas.");
	}

	@Override
	public void reutilizar() 
	{
		System.out.println("\n\t-- Escolha o tipo de plástico que deseja reutilizar --");
		System.out.println("\n1-Garrafa pet\n2-Embalagem plástica \n3-Outro tipo de plástico");
		setTipo(leia.nextInt());
		
		while(getTipo() < 1 || getTipo() > 4)
		{
			System.out.println("Opção Inválida! tente novamente.\n");
			System.out.println("\n\t-- Escolha o tipo de plástico que deseja reutilizar --");
			System.out.println("\n\t1-Garrafa pet\n2-Embalagem plástica \n3-Outro tipo de plástico");
			setTipo(leia.nextInt());
		}
		
		switch(getTipo())
		{
		case 1:
			System.out.println("\nVocê pode cortar a garrafa ao meio, e fazer um vaso para plantas.\nÉ possível fazer um estojo ao cortar a parte lateral da garrafa."
					+ "\nAo cortar o fundo da garrafa, podemos transforma-la em um pote de água para animais.");
			break;
		case 2:
			System.out.println("\nO plástico reciclado pode virar qualquer coisa, desde novos itens de plástico, como garrafas, novas embalagens, até asfalto.");
			break;
		case 3:
			System.out.println("\nO plástico reciclado pode virar qualquer coisa, desde novos itens de plástico, como garrafas, novas embalagens, até asfalto.");
			break;
			default:
				System.out.println("Obrigado por utilizar nosso sistema. Saindo ...");
		}
		
	}

}