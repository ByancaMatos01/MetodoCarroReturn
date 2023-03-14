package CarroRetorno;

public class Carro1 {
	
	String marca;
	 String modelo;
	 int numPassageiros;
	 double capCombustivel;
	 double consumoCombustivel;
	 
	 
	 void exibirAutonomia() {
		 System.out.println("Autonomia do carro é: "+ capCombustivel* consumoCombustivel+"km");
	 }
	 double obterautonomia() {
		 System.out.println("Metodo obter autonomia foi chamado");
		return capCombustivel*consumoCombustivel;
		 
	 }

}
