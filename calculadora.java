package Tema2.Tarea;

/**
 * Esta función calcula el factorial de un número entero positivo.
 * El factorial de un número num es el producto de todos los números enteros
 * desde 1 hasta num.
 * Por ejemplo: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120.
 * 
 * @param num el número entero positivo del cual se calcula el factorial
 * @return el resultado de calcular el factorial de num
 * @trhow IllegalArgumentException si el número es negativo.
 */
public class calculadora {

    public int calcularFactorial(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("El número debe ser positivo");
        }

        int result = 0;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}
