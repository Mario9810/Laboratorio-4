
public class Soldado extends Militar{
	
	public int getHoras() {
		return super.getHoras()*2;
	}
	public double getSalario() {
		return super.getSalario()-10000;
	}
	public int getDiasVacaciones() {
		return super.getDiasVacaciones()/2;
	}
	public void recibeOrden() {
		System.out.println("Ordene mi general");
	}
	@Override
	public String toString() {
		return " Horas=" + getHoras() +"\n"+ " Salario=" + getSalario() +"\n"+ " Dias Vacaciones="
				+ getDiasVacaciones();
	}
	
}
