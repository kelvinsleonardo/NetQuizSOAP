package br.com.netquiz.servidor.core;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

import br.com.netquiz.servidor.persistencia.PerguntaDao;
import br.com.netquiz.servidor.webservice.JogoImpl;


public class ServidorRun{

	/**
	 * Tutorial utilizando para o desenvolvimento do servidor
	 * Link: http://www.java2blog.com/2013/03/jaxws-web-service-eclipse-tutorial.html
	 */
	
	public static String HOST = getIpHost();
	public static String PORTA = "7070";
	
	public static void main(String[] args) {
		
		escolherHostServicoWS();
		
		PerguntaDao perguntaDao = new PerguntaDao();
		Endpoint.publish("http://"+HOST+":"+PORTA+"/NetQuiz/Jogo",new JogoImpl());
		System.out.println("Servidor Iniciado com Sucesso.");
		System.out.println("Dados para conexão cliente: Host:"+HOST+" Porta:"+PORTA);
		System.out.println("Localização WSDL: http://"+HOST+":"+PORTA+"/NetQuiz/Jogo?wsdl");
		System.out.println("Quantidade de perguntas cadastradas: "+perguntaDao.count());
	}
	
	public static String getIpHost(){
		 try {
             for (Enumeration<?> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
                 NetworkInterface intf = (NetworkInterface) en.nextElement();
                 for (Enumeration<?> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
                     InetAddress inetAddress = (InetAddress) enumIpAddr.nextElement();
                     if (!inetAddress.isLoopbackAddress()&&inetAddress instanceof Inet4Address) {
                         String ipAddress=inetAddress.getHostAddress().toString();
                         
                         return ipAddress;
                     }
                 }
             }
         } catch (SocketException ex) {
            System.err.println(ex);
         }
         return "localhost";
	}
	
	public static void escolherHostServicoWS(){
		if(!getIpHost().equals("localhost")){
			JDialog.setDefaultLookAndFeelDecorated(true);
		    Object[] network = { "Localhost",getIpHost()};
		    String initialSelection = "Localhost";
		    Object selection = "Cancelar";
		    selection = JOptionPane.showInputDialog(null, "Qual ip irá utilizar para publicar o serviço?\n\n"
		    		+ "Aviso: Se você selecionar ["+getIpHost()+"] será necessário efetuar o import WS para o cliente\n"
		    		+ "e criar o build(.jar) da aplicação cliente novamente.",
		        "Selecionar IP NetQuiz", JOptionPane.WARNING_MESSAGE, null, network, initialSelection);
		    
		    // Se o usuário clicar em cancelar
		    if(selection == null){
		    	JOptionPane.showMessageDialog(null,
	    		        "Você cancelou a inicialização do servidor NetQuiz, o servidor não foi iniciado!",
	    		        "Erro Inicialização do Servidor NetQuiz",
	    		        JOptionPane.ERROR_MESSAGE);
		    }
		    
		    if(selection.equals("Localhost")){
		    	HOST = "localhost";
		    }else{
		    	   JOptionPane.showMessageDialog(null,
		    		        "Você selecionou inicializar com o IP: "+getIpHost()
		    		        +" agora é necessário importar as classes para o cliente com WSImport\r\n\r\n"
		    		        +"1. Faça o clone do projeto.\r\n"
		    		        +"2. Navegue ao diretório /java do projeto.\r\n"
		    		        +"3. Com o servidor Online importe as classes substituindo o pacote br.com.netquiz.cliente.ws com o comando:\r\n"
		    		        +"      wsimport -keep -p br.com.netquiz.cliente.ws http://"+getIpHost()+":7070/NetQuiz/Jogo?wsdl\r\n"
		    		        +"4. Faça o build do jar pelo maven acessando:\r\n"
		    		        +"      RunAs > Maven Build... \r\n"
		    		        +"5. Em goals insira:\r\n"
		    		        +"      package\r\n"
		    		        +"6  Clique em Run. Após gerar os jars, no terminal navegue até o pasta Documentação/Executaveis/ e execute o ClienteNetQuiz.jar",
		    		        "Tutorial build jar cliente para host "+getIpHost(),
		    		        JOptionPane.INFORMATION_MESSAGE);
		    }
	    }
	}
}
