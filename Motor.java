//Luiz Antonio da Silva Marçon
public class Motor implements Calcular {
	private int potOriginal = 0;
	private int rpmMax = 0;
	private float potGanha = 0;

//getters
	public int getPotOriginal() {
		return potOriginal;
	}

	public int getMaxRpm() {
		return rpmMax;
	}

	public float getPotGanha() {
		return potGanha;
	}


//setters
	public void setRpmMax(int rpmMax) {
		this.rpmMax = rpmMax;
	}

	public void setPotOriginal(int potOriginal) {
		this.potOriginal = potOriginal;
	}


//Calc
	public void calcRemap() {
        	potGanha = (int) (getPotOriginal() * 0.10);
        	float remapeamento = getPotOriginal() + potGanha;
        	System.out.println("A potencia apos remapeamento sera: " + remapeamento);
        	System.out.println("Ganho de potência: " + potGanha + " cv");
	}
}	
