// CC2006, Lab 4
// Una clase para representar a los Coroneles.

public class Coronel extends Teniente {
    public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }

	@Override
	public String toString() {
		return " Salario= " + getSalario()+"\n"+ super.toString()+"\n"+"Vacaciones= "+ super.getDiasVacaciones()+"\n"+ "FormVacaciones= " +super.getFormularioVacaciones();
	}

	
    
}