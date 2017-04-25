

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.google.gson.Gson;

@ManagedBean
@RequestScoped
public class beanLlamdaWS implements Serializable{
	
	
	private static final long serialVersionUID = 5296140361193250598L;
	private Resultado resultado;
	
	private String salidaWSPropia;
	private String salida;

	public beanLlamdaWS(){

	}

	@PostConstruct
	public void init(){
		System.out.println("Se entra por el postcontruct");
	}
	
	//lo que hace este metodo es llamar al web service para mostrar datos en su ficheor inicio.xhtml
	public void llamadaWS(){
		try {

			URL url = new URL(
					"http://apiclient.resultados-futbol.com/scripts/api/api.php?key=64317272316299b30599e0707239fbd0&tz=Europe/Madrid&format=json&req=quiniela&completed=no");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			/*
			 * Retorna 404 ,es decir que la request se completo con exito pero que no hay entity para devolver
			 * pero que se metio en la request una (el objeto usuario en xml):
			 * 
			 * http://stackoverflow.com/questions/14102797/how-to-throw-http-204-status-code-using-jersey-framework-in-restful-web-service
			*/
			
			System.out.println("El response code despues de llamar al metodo consumeXMLRequest del WS es "+conn.getResponseCode());

			if (conn.getResponseCode() != 200) {

				throw new RuntimeException("Failed : HTTP error code : "

				+ conn.getResponseCode());

			}

			/* Si se pudieron obtener bien los datos del web service rest de la api de resultados futbol
			 * entonces pues ya se trata la respuesta que en este caos es un JSON*/
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output="";
			String outputCopia="";
			System.out.println("Output from Server .... \n");
			//Como no se devuelve nada en el metodo invocado del ws entonces aqui no imprimira nada
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				outputCopia=output;
				
			}
					
			/*
			 * A partir de aqui es donde se va a realizar la conversion del json que es 
			 * la variable ou
			 */
			Gson gson = new Gson();
			Resultado resultado = gson.fromJson(outputCopia, Resultado.class);
			System.out.println(resultado);
			this.resultado=resultado;
			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
	}
	
	public void llamadaWSPropio(){
		System.out.println("Init llamadaWSPropio()....");

		try {

			URL url = new URL("http://localhost:8080/servicioweb/rest/usuarios");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String salida;
			String salidaCopia="";
			System.out.println("Output from Server .... \n");

			while ((salida = br.readLine()) != null) {
				System.out.println(salida);
				salidaCopia=salida;
			}
			
			this.salidaWSPropia=salidaCopia;

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		
		
	}

	
	public void llamadaWSCabecera(){
		System.out.println("Init llamadaWSCabecera()....");

		try {

			URL url = new URL("http://localhost:8080/servicioweb/rest/requestHeader");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "text/html");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String salida;
			String salidaCopia="";
			System.out.println("Output from Server .... \n");

			while ((salida = br.readLine()) != null) {
				System.out.println(salida);
				salidaCopia=salida;
			}
			
			this.salida=salidaCopia;

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		
		
		
		
		
		
	}
	

	public Resultado getResultado() {
		return resultado;
	}


	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}


	public String getSalida() {
		return salida;
	}


	public void setSalida(String salida) {
		this.salida = salida;
	}

	public String getSalidaWSPropia() {
		return salidaWSPropia;
	}

	public void setSalidaWSPropia(String salidaWSPropia) {
		this.salidaWSPropia = salidaWSPropia;
	}
	

}