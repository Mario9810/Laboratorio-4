import java.util.*;
public class Armada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Soldado soldado =  new Soldado();
		Teniente teniente = new Teniente();
		Coronel coronel = new Coronel();
		General general =  new General();
		
		System.out.println("Soldados!");
		System.out.println(soldado.toString());
		System.out.println(soldado.getFormularioVacaciones());
		soldado.recibeOrden();
		System.out.println("\n");
		
		System.out.println("General");
		System.out.println(general.toString());
		general.planificaEstrategia();
		System.out.println("\n");
	
		
		System.out.println("Teniente");
		System.out.println(teniente.toString());
		System.out.println("\n");
		
		System.out.println("Coronel");
		System.out.println(coronel.toString());
		coronel.ejecutaOrdenManiobra();
	}

}
