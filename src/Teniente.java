// CC2006, Lab 4
// Una clase para representar a los Tenientes.

public class Teniente extends Militar {
    public void tomaOrdenCoronel(String texto) {
        System.out.println("Tomando orden del Coronel: " + texto);
    }

	@Override
	public String toString() {
		return "Teniente [getHoras()=" + getHoras() + ", getSalario()=" + getSalario() + ", getDiasVacaciones()="
				+ getDiasVacaciones() + ", getFormularioVacaciones()=" + getFormularioVacaciones() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
    
}