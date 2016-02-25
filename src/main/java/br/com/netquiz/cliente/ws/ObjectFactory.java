
package br.com.netquiz.cliente.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.netquiz.cliente.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IsPerguntaValidaResponse_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "isPerguntaValidaResponse");
    private final static QName _RegistrarResponse_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "registrarResponse");
    private final static QName _FimDoJogo_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "fimDoJogo");
    private final static QName _GetRankingResponse_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "getRankingResponse");
    private final static QName _GetIdDaRodadaResponse_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "getIdDaRodadaResponse");
    private final static QName _Registrar_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "registrar");
    private final static QName _GetIdDaRodada_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "getIdDaRodada");
    private final static QName _GetRanking_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "getRanking");
    private final static QName _IsAcertoPerguntaResponse_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "isAcertoPerguntaResponse");
    private final static QName _GetCountConectado_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "getCountConectado");
    private final static QName _GetCountConectadoResponse_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "getCountConectadoResponse");
    private final static QName _IsAcertoPergunta_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "isAcertoPergunta");
    private final static QName _GetPergunta_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "getPergunta");
    private final static QName _GetMenuPerguntasResponse_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "getMenuPerguntasResponse");
    private final static QName _GetMenuPerguntas_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "getMenuPerguntas");
    private final static QName _IsPerguntaValida_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "isPerguntaValida");
    private final static QName _SetProximoJogadorResponse_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "setProximoJogadorResponse");
    private final static QName _FimDoJogoResponse_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "fimDoJogoResponse");
    private final static QName _GetPerguntaResponse_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "getPerguntaResponse");
    private final static QName _SetProximoJogador_QNAME = new QName("http://webservice.servidor.netquiz.com.br/", "setProximoJogador");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.netquiz.cliente.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRankingResponse }
     * 
     */
    public GetRankingResponse createGetRankingResponse() {
        return new GetRankingResponse();
    }

    /**
     * Create an instance of {@link GetIdDaRodadaResponse }
     * 
     */
    public GetIdDaRodadaResponse createGetIdDaRodadaResponse() {
        return new GetIdDaRodadaResponse();
    }

    /**
     * Create an instance of {@link Registrar }
     * 
     */
    public Registrar createRegistrar() {
        return new Registrar();
    }

    /**
     * Create an instance of {@link GetIdDaRodada }
     * 
     */
    public GetIdDaRodada createGetIdDaRodada() {
        return new GetIdDaRodada();
    }

    /**
     * Create an instance of {@link IsPerguntaValidaResponse }
     * 
     */
    public IsPerguntaValidaResponse createIsPerguntaValidaResponse() {
        return new IsPerguntaValidaResponse();
    }

    /**
     * Create an instance of {@link RegistrarResponse }
     * 
     */
    public RegistrarResponse createRegistrarResponse() {
        return new RegistrarResponse();
    }

    /**
     * Create an instance of {@link FimDoJogo }
     * 
     */
    public FimDoJogo createFimDoJogo() {
        return new FimDoJogo();
    }

    /**
     * Create an instance of {@link SetProximoJogadorResponse }
     * 
     */
    public SetProximoJogadorResponse createSetProximoJogadorResponse() {
        return new SetProximoJogadorResponse();
    }

    /**
     * Create an instance of {@link GetMenuPerguntas }
     * 
     */
    public GetMenuPerguntas createGetMenuPerguntas() {
        return new GetMenuPerguntas();
    }

    /**
     * Create an instance of {@link IsPerguntaValida }
     * 
     */
    public IsPerguntaValida createIsPerguntaValida() {
        return new IsPerguntaValida();
    }

    /**
     * Create an instance of {@link SetProximoJogador }
     * 
     */
    public SetProximoJogador createSetProximoJogador() {
        return new SetProximoJogador();
    }

    /**
     * Create an instance of {@link FimDoJogoResponse }
     * 
     */
    public FimDoJogoResponse createFimDoJogoResponse() {
        return new FimDoJogoResponse();
    }

    /**
     * Create an instance of {@link GetPerguntaResponse }
     * 
     */
    public GetPerguntaResponse createGetPerguntaResponse() {
        return new GetPerguntaResponse();
    }

    /**
     * Create an instance of {@link GetPergunta }
     * 
     */
    public GetPergunta createGetPergunta() {
        return new GetPergunta();
    }

    /**
     * Create an instance of {@link GetMenuPerguntasResponse }
     * 
     */
    public GetMenuPerguntasResponse createGetMenuPerguntasResponse() {
        return new GetMenuPerguntasResponse();
    }

    /**
     * Create an instance of {@link GetRanking }
     * 
     */
    public GetRanking createGetRanking() {
        return new GetRanking();
    }

    /**
     * Create an instance of {@link IsAcertoPerguntaResponse }
     * 
     */
    public IsAcertoPerguntaResponse createIsAcertoPerguntaResponse() {
        return new IsAcertoPerguntaResponse();
    }

    /**
     * Create an instance of {@link GetCountConectado }
     * 
     */
    public GetCountConectado createGetCountConectado() {
        return new GetCountConectado();
    }

    /**
     * Create an instance of {@link GetCountConectadoResponse }
     * 
     */
    public GetCountConectadoResponse createGetCountConectadoResponse() {
        return new GetCountConectadoResponse();
    }

    /**
     * Create an instance of {@link IsAcertoPergunta }
     * 
     */
    public IsAcertoPergunta createIsAcertoPergunta() {
        return new IsAcertoPergunta();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPerguntaValidaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "isPerguntaValidaResponse")
    public JAXBElement<IsPerguntaValidaResponse> createIsPerguntaValidaResponse(IsPerguntaValidaResponse value) {
        return new JAXBElement<IsPerguntaValidaResponse>(_IsPerguntaValidaResponse_QNAME, IsPerguntaValidaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "registrarResponse")
    public JAXBElement<RegistrarResponse> createRegistrarResponse(RegistrarResponse value) {
        return new JAXBElement<RegistrarResponse>(_RegistrarResponse_QNAME, RegistrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FimDoJogo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "fimDoJogo")
    public JAXBElement<FimDoJogo> createFimDoJogo(FimDoJogo value) {
        return new JAXBElement<FimDoJogo>(_FimDoJogo_QNAME, FimDoJogo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRankingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "getRankingResponse")
    public JAXBElement<GetRankingResponse> createGetRankingResponse(GetRankingResponse value) {
        return new JAXBElement<GetRankingResponse>(_GetRankingResponse_QNAME, GetRankingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdDaRodadaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "getIdDaRodadaResponse")
    public JAXBElement<GetIdDaRodadaResponse> createGetIdDaRodadaResponse(GetIdDaRodadaResponse value) {
        return new JAXBElement<GetIdDaRodadaResponse>(_GetIdDaRodadaResponse_QNAME, GetIdDaRodadaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "registrar")
    public JAXBElement<Registrar> createRegistrar(Registrar value) {
        return new JAXBElement<Registrar>(_Registrar_QNAME, Registrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdDaRodada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "getIdDaRodada")
    public JAXBElement<GetIdDaRodada> createGetIdDaRodada(GetIdDaRodada value) {
        return new JAXBElement<GetIdDaRodada>(_GetIdDaRodada_QNAME, GetIdDaRodada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRanking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "getRanking")
    public JAXBElement<GetRanking> createGetRanking(GetRanking value) {
        return new JAXBElement<GetRanking>(_GetRanking_QNAME, GetRanking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAcertoPerguntaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "isAcertoPerguntaResponse")
    public JAXBElement<IsAcertoPerguntaResponse> createIsAcertoPerguntaResponse(IsAcertoPerguntaResponse value) {
        return new JAXBElement<IsAcertoPerguntaResponse>(_IsAcertoPerguntaResponse_QNAME, IsAcertoPerguntaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountConectado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "getCountConectado")
    public JAXBElement<GetCountConectado> createGetCountConectado(GetCountConectado value) {
        return new JAXBElement<GetCountConectado>(_GetCountConectado_QNAME, GetCountConectado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountConectadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "getCountConectadoResponse")
    public JAXBElement<GetCountConectadoResponse> createGetCountConectadoResponse(GetCountConectadoResponse value) {
        return new JAXBElement<GetCountConectadoResponse>(_GetCountConectadoResponse_QNAME, GetCountConectadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAcertoPergunta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "isAcertoPergunta")
    public JAXBElement<IsAcertoPergunta> createIsAcertoPergunta(IsAcertoPergunta value) {
        return new JAXBElement<IsAcertoPergunta>(_IsAcertoPergunta_QNAME, IsAcertoPergunta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPergunta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "getPergunta")
    public JAXBElement<GetPergunta> createGetPergunta(GetPergunta value) {
        return new JAXBElement<GetPergunta>(_GetPergunta_QNAME, GetPergunta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuPerguntasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "getMenuPerguntasResponse")
    public JAXBElement<GetMenuPerguntasResponse> createGetMenuPerguntasResponse(GetMenuPerguntasResponse value) {
        return new JAXBElement<GetMenuPerguntasResponse>(_GetMenuPerguntasResponse_QNAME, GetMenuPerguntasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuPerguntas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "getMenuPerguntas")
    public JAXBElement<GetMenuPerguntas> createGetMenuPerguntas(GetMenuPerguntas value) {
        return new JAXBElement<GetMenuPerguntas>(_GetMenuPerguntas_QNAME, GetMenuPerguntas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPerguntaValida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "isPerguntaValida")
    public JAXBElement<IsPerguntaValida> createIsPerguntaValida(IsPerguntaValida value) {
        return new JAXBElement<IsPerguntaValida>(_IsPerguntaValida_QNAME, IsPerguntaValida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProximoJogadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "setProximoJogadorResponse")
    public JAXBElement<SetProximoJogadorResponse> createSetProximoJogadorResponse(SetProximoJogadorResponse value) {
        return new JAXBElement<SetProximoJogadorResponse>(_SetProximoJogadorResponse_QNAME, SetProximoJogadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FimDoJogoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "fimDoJogoResponse")
    public JAXBElement<FimDoJogoResponse> createFimDoJogoResponse(FimDoJogoResponse value) {
        return new JAXBElement<FimDoJogoResponse>(_FimDoJogoResponse_QNAME, FimDoJogoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerguntaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "getPerguntaResponse")
    public JAXBElement<GetPerguntaResponse> createGetPerguntaResponse(GetPerguntaResponse value) {
        return new JAXBElement<GetPerguntaResponse>(_GetPerguntaResponse_QNAME, GetPerguntaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProximoJogador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.servidor.netquiz.com.br/", name = "setProximoJogador")
    public JAXBElement<SetProximoJogador> createSetProximoJogador(SetProximoJogador value) {
        return new JAXBElement<SetProximoJogador>(_SetProximoJogador_QNAME, SetProximoJogador.class, null, value);
    }

}
