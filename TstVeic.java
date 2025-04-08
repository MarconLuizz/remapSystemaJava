//Luiz Antonio da Silva Marçon
public class TstVeic {
	public static void main(String arg[]) {
		Leitura l = new Leitura();
		Carro c1 = new Carro();
		Moto m1 = new Moto();
		Caminhao c2 = new Caminhao();
		int agendar;

	System.out.println("1.Carro\n2.Moto\n3.Caminhao");
	String opcao = l.entDados("Escolha o tipo de veiculo: ");

	switch(opcao) {
		case "1":
			l.entDados("\nVeiculo: Carro (press enter to start)");
        		c1.setMarca(l.entDados("Marca: "));
			c1.setModelo(l.entDados("Modelo: "));
			c1.setCor(l.entDados("Cor: "));
			c1.setPlaca(l.entDados("Placa: "));
			c1.setAno(Integer.parseInt(l.entDados("Ano:")));
			c1.setPeso(Integer.parseInt(l.entDados("Peso:")));
			c1.setVelMax(Integer.parseInt(l.entDados("Velocidade Maxima: ")));
                	c1.getMotor().setPotOriginal(Integer.parseInt(l.entDados("Potencia do Motor: ")));
                	c1.getMotor().setRpmMax(Integer.parseInt(l.entDados("RPM Maximo: ")));
			c1.setFluxoAr(l.entDados("Aspirado ou Turbo: "));
			c1.setCilindros(Integer.parseInt(l.entDados("Quantidade de cilindros: ")));
		
			System.out.println("\n\n");

        		System.out.println("Marca: " + c1.getMarca());
        		System.out.println("Modelo: " + c1.getModelo());
        		System.out.println("Cor: " + c1.getCor());
        		System.out.println("Placa: " + c1.getPlaca());
        		System.out.println("Ano: " + c1.getAno());
        		System.out.println("Peso: " + c1.getPeso());
        		System.out.println("Velocidade Maxima: " + c1.getVelMax());
        		System.out.println("Fluxo de ar: " + c1.getFluxoAr());
        		System.out.println("Cilindros: " + c1.getVelMax());
			c1.getMotor().calcRemap();

			System.out.println("\nDeseja agendar o remapeamento? 1 - Sim | 2 - Nao");

			agendar = Integer.parseInt(l.entDados("Escolha uma opção: "));
			if (agendar == 1) {
				c1.setAgendamento(l.entDados("Insira a data para o agendamento: "));
        			System.out.println("Data de agendamento: " + c1.getAgendamento());
			} else {
				System.out.println("Agendamento nao realizado.");
			}
		break;	

		case "2":
			l.entDados("\nVeiculo: Moto (press enter to start)");
			m1.setMarca(l.entDados("Marca: "));
			m1.setModelo(l.entDados("Modelo: "));
			m1.setCor(l.entDados("Cor: "));
			m1.setPlaca(l.entDados("Placa: "));
			m1.setAno(Integer.parseInt(l.entDados("Ano: ")));
			m1.setPeso(Integer.parseInt(l.entDados("Peso: ")));
			m1.setVelMax(Integer.parseInt(l.entDados("Velocidade Maxima: ")));
                	m1.getMotor().setPotOriginal(Integer.parseInt(l.entDados("Potencia do Motor: ")));
                	m1.getMotor().setRpmMax(Integer.parseInt(l.entDados("RPM Maximo: ")));
			m1.setCc(Integer.parseInt(l.entDados("Cilindrada: ")));
			m1.setTipoMoto(l.entDados("Categoria Moto: "));

			System.out.println("\n\n");

        		System.out.println("Marca: " + m1.getMarca());
        		System.out.println("Modelo: " + m1.getModelo());
        		System.out.println("Cor: " + m1.getCor());
        		System.out.println("Placa: " + m1.getPlaca());
        		System.out.println("Ano: " + m1.getAno());
        		System.out.println("Peso: " + m1.getPeso());
        		System.out.println("Velocidade Maxima: " + m1.getVelMax());
			System.out.println("Cilindrada: " + m1.getCc());
			System.out.println("Categoria: " + m1.getTipoMoto()); 
			m1.getMotor().calcRemap();

			System.out.println("\nDeseja agendar o remapeamento? 1 - Sim | 2 - Nao");

			agendar = Integer.parseInt(l.entDados("Escolha uma opção: "));
			if (agendar == 1) {
				m1.setAgendamento(l.entDados("Insira a data para o agendamento: "));
        			System.out.println("Data de agendamento: " + m1.getAgendamento());
			} else {
				System.out.println("Agendamento nao realizado.");
			}
		break;

		case "3":
			l.entDados("\nVeiculo: Caminhao (press enter to start)");
			c2.setMarca(l.entDados("Marca: "));
			c2.setModelo(l.entDados("Modelo: "));
			c2.setCor(l.entDados("Cor: "));
			c2.setPlaca(l.entDados("Placa: "));
			c2.setAno(Integer.parseInt(l.entDados("Ano: ")));
			c2.setPeso(Integer.parseInt(l.entDados("Peso: ")));
			c2.setVelMax(Integer.parseInt(l.entDados("Velocidade Maxima: ")));
                	c2 .getMotor().setPotOriginal(Integer.parseInt(l.entDados("Potencia do Motor: ")));
                	c2.getMotor().setRpmMax(Integer.parseInt(l.entDados("RPM Maximo: ")));
			c2.setCargaMax(Integer.parseInt(l.entDados("Carga Maxima: ")));
			c2.setQtdEixo(Integer.parseInt(l.entDados("Quantidade de eixos: ")));

			System.out.println("\n\n");

        		System.out.println("Marca: " + c2.getMarca());
        		System.out.println("Modelo: " + c2.getModelo());
        		System.out.println("Cor: " + c2.getCor());
        		System.out.println("Placa: " + c2.getPlaca());
        		System.out.println("Ano: " + c2.getAno());
        		System.out.println("Peso: " + c2.getPeso());
        		System.out.println("Velocidade Maxima: " + c2.getVelMax());
        		System.out.println("Carga Maxima: " + c2.getCargaMax());
        		System.out.println("Quantidade de eixos: " + c2.getQtdEixo());
			c2.getMotor().calcRemap();

			System.out.println("\nDeseja agendar o remapeamento? 1 - Sim | 2 - Nao");

			agendar = Integer.parseInt(l.entDados("Escolha uma opção: "));
			if (agendar == 1) {
				c2.setAgendamento(l.entDados("Insira a data para o agendamento: "));
        			System.out.println("Data de agendamento: " + c2.getAgendamento());
			} else {
				System.out.println("Agendamento nao realizado.");
			}
		break;

	default:
		System.out.println("Opcao Invalida.");
		}

		
	}
}