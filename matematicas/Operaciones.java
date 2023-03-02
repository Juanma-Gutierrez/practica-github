package matematicas;

public class Operaciones {

    /**
     * suma
     * Devuelve la suma de dos números.
     * 
     * @param a Sumando primero
     * @param b Sumando segundo
     * @return La suma de a y b
     */
    public static long suma(long a, long b) {
        return (a + b);
    }

    /**
     * suma
     * Devuelve la suma de dos números.
     * 
     * @param a Sumando primero
     * @param b Sumando segundo
     * @return La suma de a y b
     */
    public static int suma(int a, int b) {
        return ((int) suma((long) a, (long) b));
    }

    /**
     * inc
     * Incrementa en uno el valor recibido y lo devuelve
     * 
     * @param a Valor a incrementar
     * @return El valor recibido incrementado en uno
     */
    public static long inc(long a) {
        return (suma(a, 1));
    }

    /**
     * inc
     * Incrementa en uno el valor recibido y lo devuelve
     * 
     * @param a Valor a incrementar
     * @return El valor recibido incrementado en uno
     */
    public static int inc(int a) {
        return ((int) inc((long) a));
    }

	
    /**
     * resta
     * Devuelve la resta de dos números
     * 
     * @param a Minuendo
     * @param b Sustraendo
     * @return La resta de los dos números
     */
    public static long resta(long a, long b) {
        return (suma(a, -b));
    }

    /**
     * resta
     * Devuelve la resta de dos números
     * 
     * @param a Minuendo
     * @param b Sustraendo
     * @return La resta de los dos números
     */
    public static int resta(int a, int b) {
        return ((int) resta((long) a, (long) b));
    }

    /**
     * dec
     * Decrementa en uno el valor recibido y lo devuelve
     * 
     * @param a Valor a decrementar
     * @return El valor recibido decrementado en uno
     */
    public static long dec(long a) {
        return (resta(a, 1));
    }

    /**
     * dec
     * Decrementa en uno el valor recibido y lo devuelve
     * 
     * @param a Valor a decrementar
     * @return El valor recibido decrementado en uno
     */
    public static int dec(int a) {
        return ((int) dec((long) a));
    }

}
