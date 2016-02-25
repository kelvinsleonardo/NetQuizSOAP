package br.com.netquiz.cliente.core;

import java.util.Random;

import br.com.netquiz.cliente.util.Print;
import br.com.netquiz.cliente.ws.Cliente;
import br.com.netquiz.cliente.ws.Jogo;
import br.com.netquiz.cliente.ws.JogoImplService;

/**
 * 1.Antes de executar o Cliente é necessário a importação do WSDL.
 * 2.Com o servidor SOAP online, navegue no projeto até o diretório /java da aplicação.
 * 3.Execute o seguinte comando: 
 * 		wsimport -keep -p br.com.netquiz.cliente.ws http://localhost:7070/NetQuiz/Jogo?wsdl
 */

public class ClienteRun {

	public static void main(String[] args) {
		
		// Conectando ao servidor
		JogoImplService jogoService = new JogoImplService();
		Jogo jogo = jogoService.getPort(Jogo.class);
		
		// Inicialização de objetos
		Print print = new Print();
		Cliente cliente = new Cliente();
		
		// Inicializando variaveis
		int numeroPergunta = 0;
		int numeroResposta = 0;
		Boolean isRespostaCorreta = false;
		
		// Mensagem de boas vindas
		print.bemVindo();
		
		// Configurando usuario
		cliente.setId(gerarId());
		cliente.setNome(print.solicitarNome());
		
		// Registrando usuário no servidor
		jogo.registrar(cliente);
		
		// Verificando limite de jogadores
		if(jogo.getCountConectado() > 2){
			print.erroLimiteDeJogadores();
			return;
		}
		
		// Verifica quantidade de jogadores
		print.aguardarConexaoJogadorDois();
		while(jogo.getCountConectado() == 1){}
	
		
		// Inicializando jogo
		print.jogoInicializando();
		
		// Enquanto não terminar o jogo
		while(!jogo.fimDoJogo()){
			
			if(jogo.getIdDaRodada().equals(cliente.getId())){
				
				// Imprime menu de perguntas
				print.menu(jogo.getMenuPerguntas());
				
				// Solicita o numero da pergunta
				numeroPergunta = print.solicitarPergunta();
				
				// Repete até escolher uma pergunta válida de acordo com o menu.
				while(!jogo.isPerguntaValida(numeroPergunta)){
					print.erroPerguntaInvalida();
					numeroPergunta = print.solicitarPergunta();
				}
				
				// Imprime pergunta	
				print.pergunta(jogo.getPergunta(numeroPergunta));	
				
				// Solicita alternativa da questão
				numeroResposta = print.solicitarResposta();
				
				// Verifica se a resposta está correta, se estiver já incrementa a pontuação
				isRespostaCorreta = jogo.isAcertoPergunta(numeroPergunta, numeroResposta, cliente.getId());
				
				// Imprime mensagem de acerto ou erro.
				print.isAcertouPergunta(isRespostaCorreta);
				
				// Adiciona pontuação caso tenha acertado a questão.
				if(isRespostaCorreta){
					print.ranking(jogo.getRanking());
				}
				
				// Seta o id do proximo jogador
				jogo.setProximoJogador();
				
			}else{
				// Enquanto o jogador da rodada estiver jogando o segundo fica esperando.
				print.aguardarJogadaOponente();
				while((!jogo.getIdDaRodada().equals(cliente.getId()))){}
			}
		}
		
		// Imprime dados do final do jogo.
		print.dadoFinalDoJogo(jogo.getRanking(), cliente);
	}
	
	public static String gerarId(){
		StringBuilder codigo = new StringBuilder();
        Random random = new Random();

        for(int contador = 0; contador < 5; contador++){
            codigo.append(random.nextInt(10));
        }
        
        return codigo.toString();
	}
	
}
