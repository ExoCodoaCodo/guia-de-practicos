
public class FechaSimple implements Fecha {

	final int aaaammdd;
	
	public FechaSimple(int dia, int mes, int a�o) {
			aaaammdd = a�o * 10000 
					 + mes *   100
					 + dia *     1
			;
	}

	@Override
	public int getdia() {
		
		return (aaaammdd - geta�o()*10000-  getmes()*100);
	}

	@Override
	public int getmes() {
		return (aaaammdd - (geta�o() * 10000))/100;
	}

	@Override
	public int geta�o() {
		return aaaammdd / 10000;
	}

}
