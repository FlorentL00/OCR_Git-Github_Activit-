// Voici la methode TemperatureConversion

public class TempératureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConvertisseurTempératures maTempérature = new ConvertisseurTempératures();
		
		maTempérature.convertirTempérature(10, 'C');
		maTempérature.convertirTempérature(50, 'F');
		maTempérature.convertirTempérature(283.15, 'K');

	}

}
