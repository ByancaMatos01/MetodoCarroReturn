package CarroRetorno;


public class retornoCarro {

	public static void main(String[] args) {
		Carro1 van=new Carro1();
		
		
		van.marca="Fiat";
		van.modelo="Ducanto";
		van.numPassageiros=10;
		van.capCombustivel=100;
		van.consumoCombustivel=0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);

		//chamar o metodo 
		van.exibirAutonomia();
		
	double autonomia= van.obterautonomia();
	System.out.println("Autonomia do carro é: "+ autonomia);
	System.out.println("Autonomia do carro é:  "+van.obterautonomia()  );

	}

}
