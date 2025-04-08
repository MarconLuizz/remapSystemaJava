//Luiz Antonio da Silva Marçon
public class Moto extends Veiculo {
	private int cc = 0;
	private String tipoMoto = "";
	private Motor motor = new Motor();

//getters
	public int getCc() {
		return cc;
	}		

	public String getTipoMoto() {
		return tipoMoto;
	}

	public Motor getMotor() {
        	return motor;
    	}
	
//setters
	public void setCc(int cc) {
		this.cc = cc;
	}

	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}

	public void setMotor(Motor motor) {
        	this.motor = motor;
	}

}

