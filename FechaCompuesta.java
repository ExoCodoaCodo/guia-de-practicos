public class FechaCompuesta implements Fecha {
	
	final int a�o;
	final int mes;
	final int dia;
	
	public FechaCompuesta(int dia, int mes, int a�o) {
		this.a�o=a�o;
		this.mes=mes;
		this.dia=dia;
	}

	@Override
	public int getdia() {
		// TODO Auto-generated method stub

		return dia;
	}

	@Override
	public int getmes() {
		// TODO Auto-generated method stub
		return mes;
	}

	@Override
	public int geta�o() {
		// TODO Auto-generated method stub
		return a�o;
	}

}
