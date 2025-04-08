//Luiz Antonio da Silva Marçon
public class Carro extends Veiculo {
	private int cilindros = 0;
	private String fluxoAr = "";
	private Motor motor = new Motor();

//getters
	public int getCilindros() {
		return cilindros;
	}
	
	public String getFluxoAr() {
		return fluxoAr;
	}

	public Motor getMotor() {
        	return motor;
    	}

//setters
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public void setFluxoAr(String fluxoAr) {
		this.fluxoAr = fluxoAr;
	}
	
	public void setMotor(Motor motor) {
        	this.motor = motor;
	}
}