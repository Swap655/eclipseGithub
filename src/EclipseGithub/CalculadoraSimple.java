/**@author Fernandito

@version 1.0
@param numero1 El primer número a sumar.
@param numero2 El segundo número a sumar.*/
//Agregado desde el branch feature
//editado desde github
//de nuevo modificando despues del pull
package EclipseGithub;

import java.util.Scanner;
/**
 *Este metodo hace la operacion de suma recibiendo los argumentos double a,b
 */
public class CalculadoraSimple {
	public static double sumar(double a, double b) {
		/**@return El resultado de la suma*/
		return a + b;
	}
	/**
	 *Este metodo hace la operacion de resta recibiendo los argumentos double a,b
	 */
	
	public static double restar(double a, double b) {
		/**@return El resultado de la resta*/
		return a - b;
	}
	/**@return El resultado de la suma y resta mostrando en pantalla*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//inicia la clase scanner para que el usuario ingrese los valores
		System.out.println("Calculadora Simple:");//impresion en pantalla
		System.out.print("Introduce el primer número: ");//impresion en pantalla
		double numero1 = scanner.nextDouble();//indroducir numero
		System.out.print("Introduce el segundo número: ");//impresion en pantalla
		double numero2 = scanner.nextDouble();//indroducir numero2
		double resultadoSuma = sumar(numero1, numero2);//llama al metodo sumar y le pasa el scanner(asignando la variable resultadoSuma)
		double resultadoResta = restar(numero1, numero2);//llama al metodo restar y le pasa el scanner(asignando la variable resultadoResta)
		System.out.println("Resultado de la suma: " + resultadoSuma);//imprime el resultado del metodo
		System.out.println("Resultado de la resta: " + resultadoResta);//imprime el resultado del metodo
		scanner.close();//cierra el scanner
	}
}
