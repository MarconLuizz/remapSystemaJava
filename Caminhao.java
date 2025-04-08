//Luiz Antonio da Silva Marçon
public class Caminhao extends Veiculo{
	private int cargaMax = 0;
	private int qtdEixo = 0;
	private Motor motor = new Motor();

//getters
	public int getCargaMax() {
		return cargaMax;
	}

	public int getQtdEixo() {
		return qtdEixo;
	}

	public Motor getMotor() {
        	return motor;
    	}

//setters
	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public void setQtdEixo(int qtdEixo) {
		this.qtdEixo = qtdEixo;
	}

	public void setMotor(Motor motor) {
        	this.motor = motor;
	}
}	
