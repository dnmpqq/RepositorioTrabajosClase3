package PAQUETETRABAJOCALSE3;

public class Vector {

	
		public static void main(String[] args) {
			int Vector1 [] = new int [4];
			int []Vector2 = new int [5];
			Vector1 [0] = 23;
			Vector1 [1] = 3 ;
			Vector1 [2] = 135;
			Vector1 [3] = 58;
			int acumulador =0, acumulador2=0;
			System.out.println("El primer array");
			for (int indice1=0;indice1<Vector1.length;indice1++) {
				System.out.print(Vector1[indice1]+" - ");
				acumulador = acumulador + Vector1[indice1];
				if (Vector1[indice1]>=50) {
					acumulador2 = acumulador2 + Vector1[indice1];
				}
				
			}
			System.out.println();
			System.out.println("La suma de los valores del primer array es: "+ acumulador);
			System.out.println("La suma de los valores del los indice del array mayores a 50 son: "+ acumulador2);
			int Vector3 [] = {4,76,89,10,6};
			System.out.println();
			System.out.println("El vector 3");		
			for (int indice3=0;indice3<Vector3.length;indice3++) {
				System.out.print(Vector3[indice3]+" - ");
			}
			Vector3[2] = 45;
			System.out.println();
			System.out.println("Array 3 modificado");
			for (int indice3=0;indice3<Vector3.length;indice3++) {
				System.out.print(Vector3[indice3]+" - ");
			}
			
		}

	

	}


