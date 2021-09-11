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
			System.out.println("Opção Inválida! tente novamente.\n");
			System.out.println("QUAL TIPO DE CONPONENTE DESEJA DESCARTAR: ");
			System.out.println("[1]Pilha\n[2]Bateria\n[3]Celular\n[4]Sair");
			setTipo(leia.nextInt());
		}
		switch(getTipo())
		{
		case 1:System.out.println("\nArmazene as pilhas sem misturá-las com outros materiais."
				+ "\nembale-as em plástico resistente para evitar umidade e vazamentos");
		break;	
		
		case 2:System.out.println("\nEntregue-as em um ponto de venda de baterias, que dará o destino correto."
				+ "\nEmbale-as em plástico resistente para evitar umidade e vazamentos");
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
	{System.out.println("\nParabéns!! você protegeu a saúde de todos os seres vivos..."
			+ "evitando agentes cancerígenos,diminuindo volume de lixo tóxico, contaminações da água e solo,");}
	}
	
	
	@Override
	public void reutilizar() 
	{
		switch (getTipo())
		{
		case 1:
			System.out.println("\nPilhas de lítio recarregáveis, íon lítio e zinco-ar, alcalinas e comuns serão separadas para reciclagem.");
		break;
		case 2:
			System.out.println("\nMetais e componentes químicos são reaproveitados. Demais resíduos são devidamente tratados.");
		break;
		case 3: 
			System.out.println("\n80% dos componentes de celulares são reutilizáveis");
		break;
		default:
			System.out.println("\n____");
		
		}	
	}
	
	}


		



	