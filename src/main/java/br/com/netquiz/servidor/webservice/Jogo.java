package br.com.netquiz.servidor.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.netquiz.servidor.negocio.Cliente;

@WebService
public interface Jogo {
	
	@WebMethod
	public void registrar(Cliente cliente);
	
	@WebMethod
	public int getCountConectado();
	
	@WebMethod
	public String getIdDaRodada();
	
	@WebMethod
	public void setProximoJogador();
	
	@WebMethod
	public String getMenuPerguntas();
	
	@WebMethod
	public String getPergunta(int numeroDaPergunta);
	
	@WebMethod
	public Boolean isAcertoPergunta(int numeroDaPergunta, int resposta, String idJogador);
	
	@WebMethod
	public Boolean isPerguntaValida(int numeroDaPergunta);
	
	@WebMethod
	public String getRanking();
	
	@WebMethod
	public Boolean fimDoJogo();
	
}

