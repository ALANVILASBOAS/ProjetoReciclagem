package projetoreciclagem;

public class MaterialEspecial extends MaterialReciclavel implements Reciclagem {
	
	private int pilha;
	private int bateria;
	private int celular;
	
	public int getPilha() {
		return pilha;
	}
	public void setPilha(int pilha) {
		this.pilha = pilha;
	}
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	
	@Override
	public void descartar() 
	{
		System.out.println("\n\t-- Escolha o tipo de material especial que deseja descartar --");
		System.out.println("1-Pilha\n2-Bateria\n3-Celular\n4-Voltar ao menu principal");
		setTipo(leia.nextInt());
		while(getTipo() < 1||getTipo () > 4) 
		{
			System.out.println("Op��o Inv�lida! tente novamente.\n");
			System.out.println("\n\t-- Escolha o tipo de material especial que deseja descartar --");
			System.out.println("1-Pilha\n2-Bateria\n3-Celular\n4-Voltar ao menu principal");
			setTipo(leia.nextInt()); 
		}
		
		switch(getTipo())
		{
		case 1:System.out.println("\nArmazene as pilhas sem mistur�-las com outros materiais."
				+ "\nembale-as em pl�stico resistente para evitar umidade e vazamentos");
		break;	
		
		case 2:System.out.println("\nEntregue-as em um ponto de venda de baterias, que dar� o destino correto."
				+ "\nEmbale-as em pl�stico resistente para evitar umidade e vazamentos");
		break;	

		case 3:System.out.println("\nLeve o celular, carregadores e cabos para lojas de operadoras. Eles possuem um coletor para este tipo de equipamento.");
		break;	
		
		case 4:System.out.println("\nVoltando ao Menu Principal...");
		break;	
		}
	}
	@Override
	public void calcularReciclaveis() 
	{
		 
		boolean validaEspecial = false;
		leia.nextLine();	
			System.out.println("Digite o tipo de material especial a ser descartado:\n[Pilha] \n[Bateria] \n[Celular]");
			setEscolha(leia.next());
			
			do {
				if (getEscolha().equalsIgnoreCase("Pilha") || getEscolha().equalsIgnoreCase("Bateria") || getEscolha().equalsIgnoreCase("Celular")) {
					validaEspecial = true;
				} else {
					validaEspecial = false;
					System.out.println("Op��o n�o encontrada! escolha uma das op��es abaixo para descarte:\n[Pilha] \n[Bateria] \n[Celular]");
					setEscolha(leia.nextLine());
					setEscolha(leia.nextLine());
			    }	
			} while (!validaEspecial); //nega��o de true, condi��o falsa e sa�da do la�o
			
			if(getEscolha().equalsIgnoreCase("Pilha")) 
			{
				System.out.println("Qual a quantidade de pilhas a serem descartadas?");
				setPilha(leia.nextInt());
			}
			if(getEscolha().equalsIgnoreCase("Bateria")) 
			{
				System.out.println("Qual a quantidade de baterias a serem descartadas?");
				setBateria(leia.nextInt());
			}
			if(getEscolha().equalsIgnoreCase("Celular")) 
			{
				System.out.println("Qual a quantidade de celulares a serem descartados?");
				setCelular(leia.nextInt());
			}
			this.danoAmbiente();
				
		
	}
	@Override
	public void danoAmbiente() 
	{
		if(getEscolha().equalsIgnoreCase("Pilha")) 
		{
			System.out.println("Voc� deixar� de descartar " +pilha+ " pilhas no meio ambiente e elas ser�o descartadas de maneira adequada!");
		}
		if(getEscolha().equalsIgnoreCase("Bateria")) 
		{
			System.out.println("Voc� deixar� de descartar " +bateria+ " baterias no meio ambiente e elas ser�o descartadas de maneira adequada!");
		}
		if(getEscolha().equalsIgnoreCase("Celular")) 
		{
			System.out.println("Voc� deixar� de descartar " +celular+ " celulares no meio ambiente e eles ser�o descartados de maneira adequada!");
		}
		
		System.out.println("\n========== Impacto ambiental  ===========\n"
				+ "Parab�ns!! voc� protegeu a sa�de de todos os seres vivos..."
				+ "evitando agentes cancer�genos,diminuindo volume de lixo t�xico, contamina��es da �gua e solo.");
            	
	}
	@Override
	public void reutilizar() 
	{
		System.out.println("\n\t-- Escolha o tipo de material especial que deseja reutilizar --");
		System.out.println("1-Pilha\n2-Bateria\n3-Celular");
		setTipo(leia.nextInt());
		while(getTipo() < 1||getTipo () > 3) 
		{
			System.out.println("Op��o Inv�lida! tente novamente.\n");
			System.out.println("\n\t-- Escolha o tipo de material especial que deseja reutilizar --");
			System.out.println("1-Pilha\n2-Bateria\n3-Celular");
			setTipo(leia.nextInt()); 
		}
		
		switch (getTipo())
		{
		case 1:
			System.out.println("\nPilhas de l�tio recarreg�veis, �on l�tio e zinco-ar, alcalinas e comuns ser�o separadas para reciclagem.");
		break;
		case 2:
			System.out.println("\nMetais e componentes qu�micos s�o reaproveitados. Demais res�duos s�o devidamente tratados.");
		break;
		case 3: 
			System.out.println("\n80% dos componentes de celulares s�o reutiliz�veis.");
		break;	
		}	
	}
	
}