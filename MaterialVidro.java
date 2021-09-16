package projetoreciclagem;

public class MaterialVidro extends MaterialReciclavel implements Reciclagem {
	
	private int garrafas;
	private double cacos;
	private int recipientes;
	
	public MaterialVidro() 
	{
	
	}
	
	public int getGarrafas() {
		return garrafas;
	}
	public void setGarrafas(int garrafas) {
		this.garrafas = garrafas;
	}
	public double getCacos() {
		return cacos;
	}
	public void setCacos(double cacos) {
		this.cacos = cacos;
	}
	public int getRecipientes() {
		return recipientes;
	}
	public void setRecipientes(int recipientes) {
		this.recipientes = recipientes;
	}
	@Override
	public void descartar() {
		
		System.out.println("\n\t-- Escolha o tipo de vidro que deseja descartar --");
		System.out.println("1-Garrafa\n2-Cacos \n3-Recipiente\n4-Voltar ao menu principal");
		setTipo(leia.nextInt());
		while(getTipo() < 1 || getTipo() > 4) 
		{
			System.out.println("Op��o Inv�lida! tente novamente.\n");
			System.out.println("\n\t-- Escolha o tipo de vidro que deseja descartar --");
			System.out.println("1-Garrafa\n2-Cacos \n3-Recipiente \n4-Voltar ao menu principal");
			setTipo(leia.nextInt());
		}
		switch(getTipo()) 
		{
		case 1:
			System.out.println("\nColoque as garrafas em uma caixa ou agrupe-as em jornais.\nProcure cooperativas de reciclagem ou pontos de entregas volunt�rias!");
			break;
		case 2:
			System.out.println("\nCuidadosamente embrulhe os cacos em jornais ou pap�is.\nProcure cooperativas de reciclagem ou pontos de entregas volunt�rias!");
			break;
		case 3:
			System.out.println("\nColoque os recipientes em uma caixa ou agrupe-os em jornais.\nProcure cooperativas de reciclagem ou pontos de entregas volunt�rias!");
			break;
		case 4:
			System.out.println("\nVoltando ao Menu Principal...");
		}
		
		
	}
	
	
	@Override
	public void calcularReciclaveis() 
	{
    
		boolean validaVidro = false;
		leia.nextLine();
		System.out.println("Digite o tipo de vidro a ser descartado:\n[Garrafa] \n[Cacos] \n[Recipiente]");
		setEscolha(leia.nextLine());
		do {
			if (getEscolha().equalsIgnoreCase("Garrafa") || getEscolha().equalsIgnoreCase("Cacos") || getEscolha().equalsIgnoreCase("Recipiente")) {
				validaVidro = true;
			} else {
				validaVidro = false;
				System.out.println("Op��o n�o encontrada! escolha uma das op��es abaixo para descarte:\n[Garrafa] \n[Cacos] \n[Recipiente] ");
				setEscolha(leia.nextLine());
		    }	
		} while (!validaVidro); //nega��o de true, condi��o falsa e sa�da do la�o
		
		if(getEscolha().equalsIgnoreCase("Garrafa")) 
		{
			System.out.println("Qual a quantidade de garrafas a serem descartadas?");
			setGarrafas(leia.nextInt());
		}
		if(getEscolha().equalsIgnoreCase("Cacos")) 
		{
			System.out.println("Qual a quantidade de cacos (em gramas) a serem descartados?");
			setCacos(leia.nextDouble());
		}
		if(getEscolha().equalsIgnoreCase("Recipiente")) 
		{
			System.out.println("Qual a quantidade de recipientes de vidro a serem descartados?");
			setRecipientes(leia.nextInt());
		}
		this.danoAmbiente();
			
	}
	
	@Override
	public void danoAmbiente() 
	{
		if(getEscolha().equalsIgnoreCase("Garrafa")) 
		{
			System.out.println("Voc� deixar� de descartar " +garrafas+ " garrafas de vidro no meio ambiente! Parab�ns!");
		}
		if(getEscolha().equalsIgnoreCase("Cacos")) 
		{
			System.out.println("Voc� deixar� de descartar " +cacos+ " gramas de cacos vidros no meio ambiente!\nIsso evita que animais e seres humanos se machuquem! Parab�ns!");
		}
		if(getEscolha().equalsIgnoreCase("Recipiente")) 
		{
			System.out.println("Voc� deixar� de descartar " +recipientes+ " recipientes de vidro no meio ambiente! Parab�ns!");
		}
		
		System.out.println("\n========== Impacto ambiental  ===========\n\n"
				+ "- Ao reciclar ou reutilizar, evitamos a gera��o de res�duos de vidro. \n"
                + "- Reduzimos o consumo de �gua.\n"
                + "- O descarte equivocado do vidro � respons�vel por gerar consequ�ncias como o ferimentos de animais e humanos.\n"
		        + "- O vidro demora mais de mil anos para se decompor no meio ambiente.");
	}
	
	

    @Override
    public void reutilizar() 
    {
    	
    	System.out.println("\\n\\t-- Escolha o tipo de vidro que deseja reutilizar --: \n1-Garrafas\n2-Cacos\n3-Recipientes");
		setTipo(leia.nextInt());
		while(getTipo() < 1 || getTipo() > 3) 
		{
			System.out.println("Op��o Inv�lida! tente novamente.\n");
			System.out.println("\n\t-- Escolha o tipo de pl�stico que deseja reutilizar --");
			System.out.println("\n1-Garrafas\n2-Cacos\n3-Recipientes");
			setTipo(leia.nextInt());
		}
    	if(getTipo() == 1) 
		{
			System.out.println("Reutilize as suas garrafas para armazenar coisas de seu interesse! Ou leve para um centro de coleta de materiais recicl�veis");
		}
		if(getTipo() == 2) 
		{
			System.out.println("Peda�os de vidros n�o podem ser reutilizados! Embrulhe com cuidado e leve para um centro de coleta de materiais recicl�veis");
		}
		if(getTipo() == 3) 
		{
			System.out.println("Reutilize os seus recipientes para armazenar coisas de seu interesse! Ou leve para um centro de coleta de materiais recicl�veis");
			
		}
    }
	
	
}