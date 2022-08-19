package estructuras;

public class aaaa {
	public static void main(String[] args) {

		int numeroIf = -3;
		System.out.println("consigna 1");
		if (numeroIf > 0) {
			System.out.println("el numero es positivo");
		} else {
			System.out.println("el numero es negativo");
		}
		System.out.println("consigna 2");
		int numeroWhile = 0;
		while (numeroWhile < 3) {
			System.out.println(numeroWhile);
			numeroWhile++;
		}
		System.out.println("consigna 3");
		do {
			System.out.println(numeroWhile);
			numeroWhile++;
		} while (numeroWhile <= 3);
		System.out.println("consigna 4");
		int numeroFor;
		for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println(numeroFor);
			numeroFor++;
		}
		System.out.println("consigna 5");
		/*
		 * hipoteticamente el usuario ingreso una opcion 
		 * mostrada en pantalla 
		 * 1. verano
		 * 2. otoño 
		 * 3. invierno 
		 * 4. primavera
		 */
		int estacion = 1;
		switch (estacion) {
		case 1:
			System.out.println("estamos en verano");
			break;
		case 2:
			System.out.println("estamos en otoño");
			break;
		case 3:
			System.out.println("estamos en invierno");
			break;
		case 4:
			System.out.println("estamos en primavera");
			break;
		default:
			System.out.println("id no valida para estacion");
		}
	}

}
