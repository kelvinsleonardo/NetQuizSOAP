package br.com.netquiz.cliente.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.netquiz.cliente.ws.Cliente;

public class Print {

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public void bemVindo() {
		System.out.println(PrintColor.CYAN.getAnsiColor());
		System.out.println("            _              _    ");
		System.out.println(" _ __   ___| |_ __ _ _   _(_)____");
		System.out.println("| '_ \\ / _ \\ __/ _` | | | | |_  /");
		System.out.println("| | | |  __/ || (_| | |_| | |/ / ");
		System.out.println("|_| |_|\\___|\\__\\__, |\\__,_|_/___|");
		System.out.println("									 ");
		System.out.println(PrintColor.RESET.getAnsiColor());
		System.out.println("Olá bem vindo ao jogo NetQuiz...");
		System.out.print("O sistema está sendo inicializado");
			for(int i = 0;i < 5; i++){
				try {
					System.out.print(".");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		System.out.println();
	}

	/**
	 * Deve possuir no Máximo 12 Caracteres.
	 * 
	 */
	public String solicitarNome() {
		System.out.print("Vamos começar, por favor insira seu nome: ");

		String nome = "Anônimo";
		try {
			nome = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Se o nome for maior que 12 caracteres ele reduz a 12.
		if(nome.length() > 12){
			nome = nome.substring(0,12);
		}
		
		if(!nome.equals("") && nome != null){
			// Convertendo primeiro caractere para uppperCase e o resto para lowerCase.
			nome = capitalize(nome);
		}else{
			nome = "Anônimo";
		}

		
		System.out.println("Pronto "+PrintColor.GREEN.getAnsiColor()
						  +nome+PrintColor.RESET.getAnsiColor()+" estamos pronto para iniciar...");
		return nome;
	}

	public int solicitarPergunta() {

		System.out.print("Escolha uma pergunta de acordo com o menu: ");

		return getApenasNumeros();
	};

	public int solicitarResposta() {

		System.out.print("Escolha a alternativa correta: ");

		int numeroDaResposta = getApenasNumeros();

		while (numeroDaResposta < 1 || numeroDaResposta > 4) {
			System.out.println(PrintColor.RED.getAnsiColor()+"Escolha uma alternativa válida"+PrintColor.RESET.getAnsiColor());
			System.out.print("Tente novamente:");
			numeroDaResposta = getApenasNumeros();
		}
		return numeroDaResposta;
	}

	public void aguardarConexaoJogadorDois() {
		System.out.println("Por favor, aguarde o segundo jogador conectar...");
	}

	public void jogoInicializando() {
		System.out.println("O jogo está sendo iniciado. Aguarde por favor!");
	}

	public void aguardarJogadaOponente() {
		System.out.println("Por favor, aguarde a jogada do oponente.");
	}

	public void isAcertouPergunta(Boolean isAcertou) {
		if (isAcertou) {
			System.out.println("-----------------------------");
			System.out.println("|"+
								PrintColor.GREEN.getAnsiColor()+
							   "   Parabéns, você acertou! "+
							    PrintColor.RESET.getAnsiColor()+
							   "|");
			System.out.println("-----------------------------");
		} else {
			System.out.println("---------------------------");
			System.out.println("|"+
								PrintColor.RED.getAnsiColor()+
							   "  Que pena, você errou!  "+
							    PrintColor.RESET.getAnsiColor()+
							   "|");
			System.out.println("---------------------------");
		}
	}

	public void menu(String menu) {
		int quebraDeLinha = 1;
				
		String numeroQuestoes[] = menu.split(";");

		System.out.print(" ============================ \r\n" 
						+"|      "+PrintColor.CYAN.getAnsiColor()+
								 "MENU DE PERGUNTAS"
								+PrintColor.RESET.getAnsiColor()+
								"     |\r\n"
						+"|----------------------------|\r\n\t");
		System.out.println(PrintColor.CYAN.getAnsiColor());
		
		for (String string : numeroQuestoes) {
			if(quebraDeLinha <= 4){
				System.out.print("  "+string +"\t");
				quebraDeLinha++;
			}else{
				System.out.print("\r\n  "+string+"\t");
				quebraDeLinha = 2;
			}
			
		}
		System.out.println(PrintColor.RESET.getAnsiColor());
		System.out.println("\n\r|----------------------------|\r\n" 
		         		 + "|*Perguntas ja selecionadas  |\r\n"
		         		 + "| por qualquer um dos dois   |\r\n" 
		         		 + "| jogadores nao podem mais   |\r\n" 
		         		 + "| ser escolhidas.            |\r\n" 
		         		 + " ============================\r\n"
				+ "Digite o numero da pergunta escolhida: ");
		
		
	}

	public void pergunta(String pergunta) {
		
		String dadosPergunta[] = pergunta.split(";");
		String line = "";
		
		for(int i = 0; i <= dadosPergunta[0].length(); i++){
			line += "-";
		}
		
		System.out.println(line);
		System.out.println(PrintColor.CYAN.getAnsiColor()+dadosPergunta[0]+PrintColor.RESET.getAnsiColor());
		System.out.println("[1]. "+PrintColor.CYAN.getAnsiColor()+dadosPergunta[1]+PrintColor.RESET.getAnsiColor());
		System.out.println("[2]. "+PrintColor.CYAN.getAnsiColor()+dadosPergunta[2]+PrintColor.RESET.getAnsiColor());
		System.out.println("[3]. "+PrintColor.CYAN.getAnsiColor()+dadosPergunta[3]+PrintColor.RESET.getAnsiColor());
		System.out.println("[4]. "+PrintColor.CYAN.getAnsiColor()+dadosPergunta[4]+PrintColor.RESET.getAnsiColor());
		System.out.println(line);
		
	}

	public void ranking(String ranking) {
		String dadosRanking[] = ranking.split(";");
		int pos = 0;
		String idTop = "";
		
		if(Integer.parseInt(dadosRanking[2]) > Integer.parseInt(dadosRanking[5])){
			idTop = dadosRanking[0];
		}
		else if(Integer.parseInt(dadosRanking[5]) > Integer.parseInt(dadosRanking[2])){
			idTop = dadosRanking[3];
		}else{
			idTop = "empate";
		}
		
		System.out.println(" --------------------------------------\r\n"
						  +"|                "
						    +PrintColor.CYAN.getAnsiColor()+
						    "RANKING"
						  	+PrintColor.RESET.getAnsiColor()+"                |\r\n"
						  +"|---------------------------------------|\r\n" 
						  +"| "+PrintColor.CYAN.getAnsiColor()+
						  	  "ID     "
						  	  +PrintColor.RESET.getAnsiColor()
						  	  +"| "
						  	  +PrintColor.CYAN.getAnsiColor()+"NOME           "
						  	  +PrintColor.RESET.getAnsiColor()
						  	  +"| "
						  	  +PrintColor.CYAN.getAnsiColor()+
						  	  "PONTUAÇÃO   "
						  	  +PrintColor.RESET.getAnsiColor()
						  	  +"|\r\n"
						  +"|---------------------------------------|");
		
		for(int i = 0; i < 2; i++){
			
			// Se encontrar tiver algum jogador vencendo ele seta uma cor, se for empate outra para os dois.
			System.out.print(
						dadosRanking[pos].equals(idTop) ? 
								"| "+PrintColor.GREEN.getAnsiColor()+dadosRanking[pos] :
						idTop.equals("empate") ? "| "+PrintColor.CYAN.getAnsiColor()+dadosRanking[pos] :			
								"| "+PrintColor.RED.getAnsiColor()+dadosRanking[pos]);
			System.out.print("    "+dadosRanking[pos+1]);
			System.out.print("\t    "+dadosRanking[pos+2]);
			System.out.print("           "+PrintColor.RESET.getAnsiColor()+"|");
			System.out.println();
			pos = 3;
			
		}
		System.out.println("|---------------------------------------|");
		System.out.println("Legenda de cores: \r\n"+PrintColor.GREEN.getAnsiColor()
						  +"Verde,"+PrintColor.RESET.getAnsiColor()+" jogador com maior número de pontos.");
		System.out.println(PrintColor.RED.getAnsiColor()
						  +"Vermelho, "+PrintColor.RESET.getAnsiColor()+"jogador com menos número de pontos."+PrintColor.RESET.getAnsiColor());
		System.out.println(PrintColor.CYAN.getAnsiColor()
					      +"Cyan,"+PrintColor.RESET.getAnsiColor()+" jogares com o mesmo número de pontos."+PrintColor.RESET.getAnsiColor());
	}

	public void dadoFinalDoJogo(String ranking, Cliente cliente) {
		
		String dadosRanking[] = ranking.split(";");
		String idVencedor = "";
		String nomeVencedor = "";
		String nomePerdedor = "";
		
		if(Integer.parseInt(dadosRanking[2]) > Integer.parseInt(dadosRanking[5])){
			idVencedor = dadosRanking[0];
			nomeVencedor = dadosRanking[1];
			nomePerdedor = dadosRanking[4];
		}
		else if(Integer.parseInt(dadosRanking[5]) > Integer.parseInt(dadosRanking[2])){
			idVencedor = dadosRanking[3];
			nomeVencedor = dadosRanking[4];
			nomePerdedor = dadosRanking[1];
		}else{
			idVencedor = "empate";
		}
		
		System.out.println(PrintColor.CYAN.getAnsiColor());
		System.out.println("            _              _    ");
		System.out.println(" _ __   ___| |_ __ _ _   _(_)____");
		System.out.println("| '_ \\ / _ \\ __/ _` | | | | |_  /");
		System.out.println("| | | |  __/ || (_| | |_| | |/ / ");
		System.out.println("|_| |_|\\___|\\__\\__, |\\__,_|_/___|");
		System.out.println("									 ");
		System.out.println("Sistema desenvolvido em JavaEE, utilizando o protocolo SOAP com Jax-WS");
		System.out.println("UFG - Aplicações Distribuídas");
		System.out.println("Data: 01/02/2015");
		System.out.println(PrintColor.RESET.getAnsiColor());
		System.out.println("-------------------------------------");
		System.out.println(idVencedor.equals(cliente.getId()) ? 
							PrintColor.GREEN.getAnsiColor()+
							"    Parabéns "+nomeVencedor+", você ganhou!"+ 
							PrintColor.RESET.getAnsiColor():
							idVencedor.equals("empate")?
							PrintColor.GREEN.getAnsiColor()+
							"    O jogo ficou empatado!"+ 
							PrintColor.RESET.getAnsiColor():
							PrintColor.RED.getAnsiColor()+	
							"    Poxa "+nomePerdedor+", você perdeu!"+
							PrintColor.RESET.getAnsiColor()
							);
		System.out.println("-------------------------------------");
	}

	public void erroPerguntaInvalida() {
		System.out.println(PrintColor.RED.getAnsiColor()+"Pergunta invalida! Escolha uma pergunta válida de acordo com o menu!"+PrintColor.RESET.getAnsiColor());
	}

	public int getApenasNumeros() {
		Boolean erro = true;
		int number = 0;
		do {
			try {
				number = Integer.parseInt(reader.readLine());
				erro = false;
			} catch (Exception e) {
				System.out.println(PrintColor.RED.getAnsiColor()+"Por favor insira apenas números inteiros!"+PrintColor.RESET.getAnsiColor());
				System.out.print("Insira novamente:");
			}
		} while (erro);
		return number;
	}

	public void erroLimiteDeJogadores(){
		System.out.println(PrintColor.PURPLE.getAnsiColor()
						   +"O jogo já está em execução.\r\n"
						   +"O limite de jogadores por partida está esgotado.\r\n"
						   + "A sua conexão está sendo encerrada, pressione qualquer tecla..."
						   +PrintColor.RESET.getAnsiColor());
		try {
			reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String capitalize(String nome){
		
		String listaNome[] = nome.split(" ");
		
		return listaNome[0].substring(0,1).toUpperCase().concat(listaNome[0].substring(1).toLowerCase());

	}
	
}
