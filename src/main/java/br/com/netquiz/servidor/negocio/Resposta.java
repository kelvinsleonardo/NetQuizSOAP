package br.com.netquiz.servidor.negocio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="Resposta.PesquisarPeloCodigoDaPergunta", 
				query="SELECT resp FROM Resposta resp JOIN resp.pergunta perg WHERE perg.id_pergunta = :id_pergunta")
})

@Entity
@Table(name = "tb_resposta")
public class Resposta implements Serializable{

	private static final long serialVersionUID = 2417300561702939708L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_resposta;
	
	private String titulo_resposta;
	
	@ManyToOne
	@JoinColumn(name= "id_pergunta",referencedColumnName = "id_pergunta")
	private Pergunta pergunta;
	
	private Boolean isvalido;
	
	public String getTitulo_resposta() {
		return titulo_resposta;
	}

	public void setTitulo_resposta(String titulo_resposta) {
		this.titulo_resposta = titulo_resposta;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public Boolean getIsvalido() {
		return isvalido;
	}

	public void setIsvalido(Boolean isvalido) {
		this.isvalido = isvalido;
	}
	
}