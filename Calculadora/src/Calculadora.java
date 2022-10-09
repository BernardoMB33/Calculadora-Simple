// Bernardo Marco Borgaro
// 7 de octubre

public class Calculadora {
	// no tiene atributos
	// entonces tampoco tiene constructor
	// ni tiene get
	// ni tiene set
	// ni funcionalidad mínima
	
	// 1. multiplica dos números sin usar *
	public static int multiplica(int num1, int num2) {
		int mult, i;
		
		mult = 0;
		for (i= 1; i<=num2; i++)
			mult += num1;
		return mult;
	}
	
	// 2. saca la potencia usando * (no la función pow)
	public static int potencia(int num, int pot) {
		int elevado, i;
		
		elevado = 1;
		for (i=1; i<=pot; i++)
			elevado *= num;
		return elevado;
	}
	
	// 26. calcula la serie de Ullman
	public static String calculaUllman(int num) {
		StringBuilder cadena;
		
		cadena = new StringBuilder();
		cadena.append(num);
		while (num > 1) {
			if (num%2 == 0) {
				num = num / 2;
			}
			else 
				num = num * 3 + 1;
			cadena.append(" " + num);
		}
		return cadena.toString();
	}

	
	public static String generaSerieFibonacci(int n) {
		int num1= 0;
		int num2= 1;
		StringBuilder sb = new StringBuilder();
		
		if (n>1) {

			if (n>=2) {
				for (int i=2; i<=n; i+=2) {
					sb.append(num1);
					sb.append(" "+num2+" ");
					num1+=num2;
					num2+= num1;
				}
				if (n%2!=0) {
					
					sb.append(num1);
				}	
			}
			
		}
			else 
				if (n==1){
					sb.append(num1);
				}
				else
			{
				sb.append("N debe ser positivo, mayor a 0");
			}
		
		return sb.toString();
	}
	
	
	public static int calculaSerie1(int n) {
		double num1, suma;
		suma=0;
		
		for (double i=1; i<=n; i++) {
			num1= Math.pow(i, i);
			suma+=num1;
			
		}
		return (int) suma;
	}
	
	public static String calculaFactorial(int n) {
		int num= 1;
		StringBuilder sb= new StringBuilder();
		if (n>=0) {
			
			for (int i =1; n>=i; i++) {
				num*=i;
			}
			 sb.append(num);
		}
		else if (n<0) {
			sb.append("Indefinido");
		}
		
		
		return sb.toString();
	}
	
	public static String calculaSerie2(int n) {
		double resp;
		resp=0; 
		StringBuilder sb = new StringBuilder();
		
		if (n>=0) {
			for (int i=1; n>=i; i++) {
				switch ((i+3)%3) {
				case 1:
					resp+=(n/3.0);
					break;
				case 2:
					resp+=(n/5.0);
					break;
				default:
					resp+=(n/7.0);	
				}
			}
			sb.append(resp);
		}
		else if (n<0) {
			sb.append("La serie toma en cuenta sólo enteros positivos");
		}
		
		return sb.toString();
	}
}


