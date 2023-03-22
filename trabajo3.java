package PAQUETETRABAJOCALSE3;

public class trabajo3 {

	public static void main(String[] args) {
		String palabra = "Aparentemente";
		char caracter= 'z'; 
		int contador=0,posicion=0;
		palabra= palabra.toLowerCase();
		
		posicion = palabra.indexOf(caracter);
		
		System.out.println(posicion);
		
		
			while (posicion != -1) {
				contador++;
				posicion = palabra.indexOf(caracter,posicion+1);
			}
			if(contador!=0) {
			System.out.println("La cantidad de coincidencia son: "+ contador);
	}
		
			else {
				System.out.println("No hay conincidencia");
			}
			
	
	}

	}


