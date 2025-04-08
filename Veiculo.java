//Luiz Antonio da Silva Marçon
public abstract class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private String placa;
	private int ano;
	private int peso;
	private int velMax;
	private String agendamento;

	public Veiculo() {
		marca = "";
		modelo = "";
		cor = "";
		placa = "";
		ano = 0;
		peso = 0;
		velMax = 0;
		agendamento = "";
	}

//getters
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
		
	public String getCor() {
		return cor;
	}
		
	public String getPlaca() {
		return placa;
	}

	public int getAno() {
		return ano;
	}

	public int getPeso() {
		return peso;
	}

	public int getVelMax() {
		return velMax;
	}

	public String getAgendamento() {
		return agendamento;
	}

//setters
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setAno(int ano) { 
		this.ano = ano;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public void setAgendamento(String agendamento) {
		this.agendamento = agendamento;
	}	
}