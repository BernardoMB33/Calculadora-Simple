// Bernardo Marco Borgaro
// 7 octubre
// clase para probar la funcionalidad de la calculadora

import java.util.Scanner;
public class CalculadoraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura;
		int opcion, numero1, numero2, resp1, resp2;
		double resp3;
		String resp26;
		
		lectura = new Scanner(System.in);
		
		do {
			System.out.println("\t\tCalculadora ");
			System.out.println("1. Multiplicacion");
			System.out.println("2. Potencia");
			System.out.println("3. Ullman");
			System.out.println("4. Fibonacci");
			System.out.println("5. Serie Sumatoria");
			System.out.println("6. Factorial");
			System.out.println("7. Serie 2 (3, 5, 7)");
			System.out.println("10. Salir");
			System.out.print("                  opcion ---> ");
			opcion = lectura.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Dame los 2 numeros");
				numero1 = lectura.nextInt();
				numero2 = lectura.nextInt();
				resp1 = Calculadora.multiplica(numero1, numero2);
				System.out.println(numero1 + " * "+ numero2 + " = "+ resp1);
				break;
				
			case 2:
				System.out.print("Numero: ");
				numero1 = lectura.nextInt();
				System.out.println("Potencia: ");
				numero2 = lectura.nextInt();
				resp2 = Calculadora.potencia(numero1, numero2);
				System.out.println(numero1 + " ^ " + numero2 + " = "+ resp2);
				break;
				
			case 3:
				System.out.println("Dame el número de Ullman");
				numero1 = lectura.nextInt();
				resp26 = Calculadora.calculaUllman(numero1);
				System.out.println(resp26);
				break;
				
			case 4:
				System.out.print("Introduce el número de enteros que quieres ver de la Fibonacci: ");
				numero1= lectura.nextInt();
				resp26=Calculadora.generaSerieFibonacci(numero1);
				System.out.println(resp26);
				break;
				
			case 5:
				System.out.print("Introduce el número de enteros para la sumatoria: ");
				numero1= lectura.nextInt();
				resp2=Calculadora.calculaSerie1(numero1);
				System.out.println(resp2);
				break;
				
			case 6:
				System.out.print("Introduce el entero positivo" + " del factorial: ");
				numero1= lectura.nextInt();
				resp26=Calculadora.calculaFactorial(numero1);
				System.out.println(resp26);
				break;
				
			case 7:
				System.out.print("Introduce el entero para la sumatoria: ");
				numero1= lectura.nextInt();
				resp26=Calculadora.calculaSerie2(numero1);
				System.out.println(resp26);
				break;
				
				
			default:
				System.out.println("Adios!!!");
				break;
			}
		
		} while (opcion != 10);
		
	}

}
