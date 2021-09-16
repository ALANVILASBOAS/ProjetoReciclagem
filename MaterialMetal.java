package projetoreciclagem;

public class MaterialMetal extends MaterialReciclavel implements Reciclagem {
	
	private double ferro;
	private double aluminio;
	private double cobre;
	
	public double getFerro() {
		return ferro;
	}
	public void setFerro(double ferro) {
		this.ferro = ferro;
	}
	public double getAluminio() {
		return aluminio;
	}
	public void setAluminio(double aluminio) {
		this.aluminio = aluminio;
	}
	public double getCobre() {
		return cobre;
	}
	public void setCobre(double cobre) {
		this.cobre = cobre;
	}
	
	@Override
	public void descartar() 
	{
		System.out.println("\n\t-- Escolha o tipo de metal que deseja descartar --");
		System.out.println("1-Ferro\n2-Aluminio\n3-Cobre\n4-Voltar ao menu principal");
		setTipo(leia.nextInt());
		
		while(getTipo() < 1 || getTipo() > 4) 
		{
			System.out.println("Opção Inválida! tente novamente.\n");
			System.out.println("\n\t-- Escolha o tipo de metal que deseja descartar --");
			System.out.println("1-Ferro\n2-Aluminio\n3-Cobre\n4-Voltar ao menu principal");
			setTipo(leia.nextInt());
		}
	
		switch(getTipo())
		{
		
		case 1:System.out.println("\n\"Amarre a ferragens de modo a restringir a movimentação e cubra as pontas para maior segurança no transporte."
				+ "\nBusque por pontos de reciclagem ou coleta seletiva.");
		break;	
		
		case 2:System.out.println("\nAluminios como latas e panelas devem ser separadas do lixo comum ainda em casa e então, encaminhadas para a coleta."
				+ "\nBusque por pontos de reciclagem ou coleta seletiva.");
		break;	

		case 3:System.out.println("\nCobres ,como fios, devem ser separados do lixo comum ainda em casa e então, encaminhadas para a coleta."
				+ "\nBusque por pontos de reciclagem ou coleta seletiva.");
		break;
		
		case 4:
			System.out.println("\nVoltando ao Menu Principal....");
		}
	}
	@Override
	public void calcularReciclaveis() 
	{
		 
		boolean validaMetal = false;
		leia.nextLine();
			System.out.println("Digite o tipo de metal a ser descartado:\n[Ferro] \n[Aluminio] \n[Cobre]");
			setEscolha(leia.next());
			
			do {
				leia.nextLine();
				if (getEscolha().equalsIgnoreCase("Ferro") || getEscolha().equalsIgnoreCase("Aluminio") || getEscolha().equalsIgnoreCase("Cobre")) {
					validaMetal = true;
				} else {
					validaMetal = false;
					System.out.println("Opção não encontrada! escolha uma das opções abaixo para descarte:\n[Ferro] \n[Aluminio] \n[Cobre]");
					setEscolha(leia.nextLine());
			    }	
			} while (!validaMetal); //negação de true, condição falsa e saída do laço
			
			if(getEscolha().equalsIgnoreCase("Ferro")) 
			{
				System.out.println("Qual a quantidade de ferragens (em gramas) a serem descartados?");
				setFerro(leia.nextDouble());
			}
			if(getEscolha().equalsIgnoreCase("Aluminio")) 
			{
				System.out.println("Qual a quantidade de aluminios (em gramas) a serem descartados?");
				setAluminio(leia.nextDouble());
			}
			if(getEscolha().equalsIgnoreCase("Cobre")) 
			{
				System.out.println("Qual a quantidade de cobre (em gramas) a serem descartados?");
				setCobre(leia.nextDouble());
			}
			this.danoAmbiente();
			
	}
	@Override
	public void danoAmbiente() 
	{
		if(getEscolha().equalsIgnoreCase("Ferro")) 
		{
			System.out.println("Você deixará de descartar " +ferro+ " gramas de ferro no meio ambiente e eles poderão ser reutilizados! Parabéns!");
		}
		if(getEscolha().equalsIgnoreCase("Aluminio")) 
		{
			System.out.println("Você deixará de descartar " +aluminio+ " gramas de aluminios (latas,panelas,etc.) no meio ambiente e eles poderão ser reutilizados! Parabéns!");
		}
		if(getEscolha().equalsIgnoreCase("Cobre")) 
		{
			System.out.println("Você deixará de descartar " +cobre+ " gramas de cobre no meio ambiente e eles poderão ser reutilizados! Parabéns!");
		}
				
		System.out.println("\n========== Impacto ambiental  ===========\n\n"
				+ "- Ao reciclar ou reutilizar, evitamos a geração de resíduos de metais. \n"
                + "- Os impactos ambientais ao meio ambiente decorrentes da mineração e refinação de metais são diminuídos\n"
                + "- Não reciclar ou reutilizar promove a destruição da florestas e contaminação da água com resíduos de alumínio.");
	}
	@Override
	public void reutilizar() 
	{
		System.out.println("\\n\\t-- Escolha o tipo de metal que deseja reutilizar --");
		System.out.println("1-Ferro\n2-Aluminio\n3-Cobre");
		setTipo(leia.nextInt());
		while(getTipo() < 1||getTipo () > 3) 
		{
			System.out.println("Opção Inválida! tente novamente.\n");
			System.out.println("\n\t-- Escolha o tipo de metal que deseja reutilizar --");
			System.out.println("1-Ferro\n2-Aluminio\n3-Cobre");
			setTipo(leia.nextInt()); 
		}
		
		switch (getTipo())
		{
		case 1:
			System.out.println("Materiais de ferro costumam oxidar facilmente e pode causar tetano, evite reutilizar."
					+ "\nPara reciclar busque por pontos de reciclagem ou coleta seletiva.");
		break;
		case 2:
			System.out.println("Materiais de aluminios costumam demorar mais para oxidar.\nReutilize para colocar itens não próprios para consumo."
					+ "\nPara reciclar busque por pontos de reciclagem ou coleta seletiva.");
		break;
		case 3: 
			System.out.println("Materiais de cobre podem ser reutilizados em amarrações de construções."
					+ "\nPara reciclar busque por pontos de reciclagem ou coleta seletiva.");
		break;	
		}	
	}
	
	
}