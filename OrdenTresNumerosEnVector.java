package PAQUETETRABAJOCALSE3;

public class OrdenTresNumerosEnVector {

	public static void main(String[] args) {
		int vector [] = new int [] {500000,10000,7000075};
		int aux= vector [0], aux1=vector[1], aux2=vector[2];
		//Mostramos array por consola
		System.out.println("El vector es: ");
		for( int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+"-");
		}
		
			System.out.println();
		//Mayor numero del array
			if (aux>aux1 && aux>aux2) {
				System.out.println("el mayor de los numeros es: " + aux);
			}
			 if  (aux1>aux && aux1>aux2) {
				 System.out.println("el mayor de los numeros es: " + aux1);
					}
			  if  (aux2>aux && aux2>aux1) {
				 System.out.println("el mayor de los numeros es: " + aux2);
					} 
			
			
		//Array ordenado  mayor a menor
			  
			if (aux>aux1 && aux>aux2 && aux1>aux2) {
				System.out.println(aux+"-"+aux1+"-"+aux2);
			} 
			if (aux1>aux && aux1>aux2) {
				System.out.println(aux1+"-"+aux+"-"+aux2);
			}
			if (aux2>aux && aux2>aux1 && aux>aux1) {
				System.out.println(aux2+"-"+aux+"-"+aux1);
			}
			
			//Muestra el vector en un ciclo ordenado como arriba
			for (int i = 0;i<vector.length;i++) {
				if (aux>aux1 && aux>aux2 && aux1>aux2) {
		         vector[0]=aux;
		         vector[1]= aux1;
		         vector[2]=aux2;
		         System.out.print("-"+vector[i]);
				}
				 else if (aux1>aux && aux1>aux2) {
					 vector[0]=aux1;
			         vector[1]= aux;
			         vector[2]=aux2;
					System.out.print("-"+vector[i]);
				}
				else if (aux2>aux && aux2>aux1 && aux>aux1) {
					 vector[0]=aux2;
			         vector[1]= aux;
			         vector[2]=aux1;
					System.out.print("-"+vector[i]);
				}
			  }
			
		
		
		

	}

}
