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
}
