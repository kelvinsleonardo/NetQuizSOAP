package br.com.netquiz.servidor.negocio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="Pergunta.BuscarTodasPerguntas", 
				query="SELECT perg FROM Pergunta perg")
})

@Table(name = "tb_pergunta")
@Entity
public class Pergunta implements Serializable{

	private static final long serialVersionUID = -8685098553900582019L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_pergunta;
	
	private String titulo_pergunta;
	
	@OneToMany(mappedBy = "pergunta")
	private List<Resposta> respostas;

	public String getTitulo_pergunta() {
		return titulo_pergunta;
	}

	public void setTitulo_pergunta(String titulo_pergunta) {
		this.titulo_pergunta = titulo_pergunta;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}	
}