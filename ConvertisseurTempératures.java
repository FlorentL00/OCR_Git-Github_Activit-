// voici la class convertisseurTemperatures

public class ConvertisseurTempératures {
	
	char Celsius = 'C';
	char Fahrenheit = 'F';
	char Kelvin = 'K';
	
	public void convertirTempérature (double température, char convertirEn) {
		if (convertirEn == 'C') {
			//Celsius vers Fahrenheit
			température = (température * 1.8) + 32;
			System.out.println("La température en Fahrenheit est de " + température);
			//Celsius vers Kelvin
			
			température = ((température - 32) / 1.8) + 273.15;
			System.out.println("La température en Kelvin est de " + température);
		}
		else if (convertirEn == 'F') {
			//Fahrenheit vers Celsius
			température = (température - 32) / 1.8;
			System.out.println("La température en Celsius est de " + température);
			//Fahrenheit vers Kelvin
			température = ((température * 1.8 + 32) + 459.67) / 1.8;
			System.out.println("La température en Kelvin est de " + température);
		}
		else if (convertirEn == 'K') { 
			//Kelvin vers Celsius
			température = température - 273.15;
			System.out.println("La température en Celsius est de " + température);
			//Kelvin vers Fahrenheit
			température = ((température + 273.15) * 1.8) - 459.67;
			System.out.println("La température en Fahrenheit est de " + température);
		}
	}
	
}
