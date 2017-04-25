
import java.util.List;


public class Resultado {
	
	private Quiniela quiniela;

	private String currect_round;
	private String total_round;

	
	public Resultado(){
		
	}

	public Quiniela getQuiniela() {
		return quiniela;
	}

	public void setQuiniela(Quiniela quiniela) {
		this.quiniela = quiniela;
	}

	public String getCurrect_round() {
		return currect_round;
	}

	public void setCurrect_round(String currect_round) {
		this.currect_round = currect_round;
	}

	public String getTotal_round() {
		return total_round;
	}

	public void setTotal_round(String total_round) {
		this.total_round = total_round;
	}
	
	/*
	 * Hago asi el toString aunque lo mejor seria hacer individualemte los tostring
	 * de los objetos quiniela y lines con los atributos quiero mostrar de cada uno
	 * y llamar aqui a os toString de esos objetos 
	 * 
	 */
	@Override
	public String toString(){
		String cadena="\n";
		
		List<Lines> listaLines=this.quiniela.getLines();
		cadena+="---- Lista de lineas con algunas de sus propiedades ----";
		cadena+="\n";
		for(Lines line:listaLines){
			cadena+=line.toString();
			cadena+="\n";
		}
		
		cadena+="\n";
		cadena+="----- Alunas propiedades de quiniela ----";
		cadena+="\n Date: "+quiniela.getDate()+"- Round: "+quiniela.getRound()+"- Revenue: "+quiniela.getRevenue();
		cadena+="\n";
		cadena+="---- Propiedades resultado ----- ";
		cadena+="\n "+this.currect_round+"-"+this.total_round;
		cadena+="\n";
		
		
		return cadena;
	}
	
}
