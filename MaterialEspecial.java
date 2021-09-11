package projetoreciclagem;

public class MaterialEspecial extends MaterialReciclavel implements Reciclagem {
	
	private String pilha;
	private String bateria;
	private String celular;
	
	
	
	public MaterialEspecial(int tipo, String caracteristica){
		super(tipo,caracteristica);
		}
	
	
	
	public String getPilha() {
		return pilha;
	}



	public void setPilha(String pilha) {
		this.pilha = pilha;
	}



	public String getBateria() {
		return bateria;
	}



	public void setBateria(String bateria) {
		this.bateria = bateria;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	@Override
	public void descartar() {
		System.out.println("QUAL TIPO DE CONPONENTE DESEJA DESCARTAR: ");
		System.out.println("[1]Pilha\n[2]Bateria\n[3]Celular\n[4]Sair");
		setTipo(leia.nextInt());
		while(getTipo()<1||getTipo()>4) {
			System.out.println("Op��o Inv�lida! tente novamente.\n");
			System.out.println("QUAL TIPO DE CONPONENTE DESEJA DESCARTAR: ");
			System.out.println("[1]Pilha\n[2]Bateria\n[3]Celular\n[4]Sair");
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
		
		case 4:System.out.println("\nSaindo!");
		break;	
		}
		
		
	}
	
	@Override
	public void danoAmbiente() {
		while (getTipo () <=  1  || getTipo () > 4 )
	{System.out.println("\nParab�ns!! voc� protegeu a sa�de de todos os seres vivos..."
			+ "evitando agentes cancer�genos,diminuindo volume de lixo t�xico, contamina��es da �gua e solo,");}
	}
	
	
	@Override
	public void reutilizar() 
	{
		switch (getTipo())
		{
		case 1:
			System.out.println("\nPilhas de l�tio recarreg�veis, �on l�tio e zinco-ar, alcalinas e comuns ser�o separadas para reciclagem.");
		break;
		case 2:
			System.out.println("\nMetais e componentes qu�micos s�o reaproveitados. Demais res�duos s�o devidamente tratados.");
		break;
		case 3: 
			System.out.println("\n80% dos componentes de celulares s�o reutiliz�veis");
		break;
		default:
			System.out.println("\n____");
		
		}	
	}
	
	}


		



	