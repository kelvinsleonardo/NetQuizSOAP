package br.com.netquiz.servidor.webservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import javax.jws.WebService;

import br.com.netquiz.servidor.negocio.Cliente;
import br.com.netquiz.servidor.negocio.Pergunta;
import br.com.netquiz.servidor.persistencia.PerguntaDao;

@WebService(endpointInterface="br.com.netquiz.servidor.webservice.Jogo")  
public class JogoImpl implements Jogo{

	public List<Cliente> clientes = new ArrayList<Cliente>();
	
	public final int QUANTIDADE_DE_PERGUNTAS = 16;
	
	public int vezJogador = 0;
	
	public int countRodada = 0;
	 
	public PerguntaDao perguntaDao;
	
	public List<Pergunta> listaPerguntas;
	
	public List<Boolean> listaPerguntasAtivas;
	
	public JogoImpl() {
		listaPerguntas = new ArrayList<Pergunta>();
		perguntaDao = new PerguntaDao();
		listaPerguntasAtivas = new ArrayList<Boolean>
									(Arrays.asList(new Boolean[QUANTIDADE_DE_PERGUNTAS]));
		Collections.fill(listaPerguntasAtivas, Boolean.TRUE);
		listaPerguntas = perguntaDao.buscarPerguntasAleatorias(QUANTIDADE_DE_PERGUNTAS);
	}
	
	public void registrar(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("Cliente id:"+cliente.getId()+" nome:"+cliente.getNome() +" registrado.");
	}

	public int getCountConectado() {
		return clientes.size();
	}

	public String getIdDaRodada() {
		return clientes.get(vezJogador).getId();
	}
	
	public void setProximoJogador(){
		if (vezJogador > 0) {
			vezJogador = 0;
		} else {
			vezJogador = 1;
		}
	}

	public String getMenuPerguntas() {
		StringJoiner stringJoin = new StringJoiner(";");
		
		for(int i = 0; i < listaPerguntasAtivas.size(); i++){
			
			if(listaPerguntasAtivas.get(i)){
				stringJoin.add(""+ (i + 1));
			}
		}
		
		return stringJoin.toString();
	}

	public String getPergunta(int numeroDaPergunta) {
		countRodada++;
		numeroDaPergunta--;
		
		// Removendo questão já usada do menu
		listaPerguntasAtivas.set(numeroDaPergunta, false);
		
		StringJoiner stringJoin = new StringJoiner(";");
		
		stringJoin.add(listaPerguntas.get(numeroDaPergunta).getTitulo_pergunta());
		
		for(int i = 0; i < listaPerguntas.get(numeroDaPergunta).getRespostas().size(); i++){
			stringJoin.add(listaPerguntas.get(numeroDaPergunta).getRespostas().get(i).getTitulo_resposta());
		}
	
		return stringJoin.toString();
	}

	public Boolean isAcertoPergunta(int numeroDaPergunta, int numeroDaResposta, String idJogador) {
		numeroDaPergunta--;
		numeroDaResposta--;
		
		Boolean isRespostaCorreta = listaPerguntas.get(numeroDaPergunta).getRespostas().get(numeroDaResposta).getIsvalido();
		
		// Se a resposta for correta, ele procura o cliente com o ID e incrementa a pontuação.
		if(isRespostaCorreta){
			for (Cliente cliente : clientes) {
				if(idJogador.equals(cliente.getId())){
					cliente.setIncrementarPontuacao();
					}
			}
		}
		
		return isRespostaCorreta;
	}

	public String getRanking() {
		StringJoiner stringJoiner = new StringJoiner(";");
		
		for(int i = 0; i < clientes.size(); i++){
			stringJoiner.add(clientes.get(i).getId());
			stringJoiner.add(clientes.get(i).getNome());
			stringJoiner.add(""+clientes.get(i).getPontuacao());
		}		
		
		return stringJoiner.toString();
	}

	public Boolean fimDoJogo(){
		return countRodada == QUANTIDADE_DE_PERGUNTAS ? true : false;
	}

	public Boolean isPerguntaValida(int numeroDaPergunta) {
		if(numeroDaPergunta < 1 || numeroDaPergunta > QUANTIDADE_DE_PERGUNTAS){
			return false;
		}
		else if(!listaPerguntasAtivas.get(numeroDaPergunta - 1)){
			return false;
		}else{
			return true;
		}
	}

}
