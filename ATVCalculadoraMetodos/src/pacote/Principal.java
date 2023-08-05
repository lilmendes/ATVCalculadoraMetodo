package pacote;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Problema: elabore uma calculadora (4 operações) com 
		 * os seguintes critérios:
		 * 1. cada operação deverá ser realizada em um método 
		 * específico (somar, subtrair, multiplicar e dividir)
		 * 2. o resultado deverá ser impresso em um método 
		 * específico (criar um método imprimir)
		 * 3. O usuário deverá informar apenas dois valores do 
		 * tipo double (em um método específico)
		 * 4. Os valores devem estar no intervalo fechado de 50 
		 * a 100 (validar em um método específico). Caso o valor 
		 * informado esteja fora do intervalo, repetir até o valor 
		 * correto.
		 * 5. o usuário deverá escolher a operação que deseja 
		 * realizar na calculadora (criar um método específico 
		 * para a escolha) */
double valor1, valor2, resultado;
int operacaoescolhida;
valor1 = obterValor();
imprimir(valor1);
valor2 = obterValor();
imprimir(valor2);
operacaoescolhida = obterEscolha();
imprimir(operacaoescolhida); 
resultado = executarOperacao(valor1, valor2, operacaoescolhida);
imprimir(resultado);

	}	                              
	//1cada operação deverá ser realizada em um método específico (somar, subtrair, multiplicar e dividir)
	//método de soma
	public static double somar(double valor1, double valor2) {
		return valor1 + valor2;

	}
	//metodo de subtrair
	public static double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	//metodo de multiplicar 
	public static double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}
	//metodo de dividir
	public static double dividir(double valor1, double valor2) {
		return valor1 / valor2;
	}

	//2.resultado deverá ser impresso em um método específico (criar um método imprimir)

	//método para imprimir dados do tipo string(misturados)

	public static void imprimir(String str) {
		System.out.println(str);   
	
	}
	public static void imprimir(double str) {
		System.out.println(str);   
	
	}
	public static void imprimir(int str) {
		System.out.println(str);   
	
	}
	//3. O usuário deverá informar apenas dois valores do tipo double (em um método específico)
	public static double obterValor() {
		Scanner sc = new Scanner(System.in);
		double valor;
		do {
			System.out.print("Informe um valor ");
			valor = sc.nextDouble();
		} while(validarValor(valor)  == false);
		
		return valor;}
	/*4 Método para validar o valor recebido do tipo double em 
	 * um intervalo fechado de 50 a 100. */
	public static boolean validarValor(double valor) {
		boolean validar = false;
		if(valor >= 50 && valor <= 100) {
			validar = true;
		}
		return validar;}
		// 5. o usuário deverá escolher a operação que deseja realizar na calculadora 
		//     criar um método específico para a escolha
		public static double executarOperacao(double valor1, double valor2, int operacaoescolhida) {
			double resultado;
			boolean status = true;
			switch (operacaoescolhida) {
			case 1:
				resultado = somar(valor1, valor2);
				break;
			case 2:
				resultado = subtrair(valor1, valor2);
				break;
			case 3:
				resultado = multiplicar(valor1, valor2);
				break;			
			case 4:
				resultado = dividir(valor1, valor2);
				break;			
				default:
				resultado = 0;
				status = false;
				break;
			}return resultado;
			}
			
		/* Método para obter a operação escolhida pelo usuario */
		public static int obterEscolha() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Usuario, escolha uma operação:"
					+ "\n(1)Somar"
					+ "\n(2)Subtrair"
					+ "\n(3)Multiplicar"
					+ "\n(4)Dividir");
			return sc.nextInt();
		}
	}


