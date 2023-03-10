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

    /**
     * esMayor
     * Comprueba si un número es mayor que otro
     * 
     * @param a Valor a comparar si es mayor
     * @param b Valor a comparar si es menor
     * @return true si a es mayor que b y
     *         false si es igual o menor
     */
    public static boolean esMayor(long a, long b) {
        return (!(0 > resta(a, b)) && (0 > resta(b, a)));
    }

    public static boolean esMayor(int a, int b) {
        return esMayor((long) a, (long) b);
    }

    /**
     * esMenor
     * Comprueba si un número es menor que otro
     * 
     * @param a Valor a comparar si es menor
     * @param b Valor a comparar si es mayor
     * @return true si a es menor que b y
     *         false si es igual o mayor
     */
    public static boolean esMenor(long a, long b) {
        return (esMayor(b, a));
    }

    public static boolean esMenor(int a, int b) {
        return esMenor((long) a, (long) b);
    }

    /**
     * esIgual
     * Comprueba si un número es igual que otro
     * 
     * @param a Primer valor a comparar
     * @param b Segundo valor a comparar
     * @return true si son iguales y false si son distintos
     */
    public static boolean esIgual(long a, long b) {
        return (!(esMayor(a, b) || esMenor(a, b)));
    }

    public static boolean esIgual(int a, int b) {
        return (esIgual((long) a, (long) b));
    }
    
    /**
     * multiplica
     * Devuelve la multiplicación de dos números usando sumas
     * 
     * @param a Multiplicando
     * @param b Multiplicador
     * @return El resultado de sumar b veces a
     */

     public static long multiplica(long a, long b) {
        boolean neg = false;
        if (esIgual(a, 0) || esIgual(b, 0))
            return 0;
        if (esMenor(a, 0) && esMenor(b, 0)) {
            a = -a;
            b = -b;
        } else if (esMenor(a, 0)) {
            neg = true;
            a = -a;
        } else if (esMenor(b, 0)) {
            neg = true;
            b = -b;
        }
        long multiplicacion = a;
        while (esMayor(b, 1)) {
            multiplicacion = suma(multiplicacion, a);
            b = dec(b);
        }
        if (neg)
            return -multiplicacion;
        else
            return multiplicacion;
    }

    public static long multiplica(int a, int b) {
        return multiplica((long) a, (long) b);
    }

	
    /**
     * divide
     * Devuelve el cociente de la división entera de dos números usando restas
     * 
     * @param a Dividendo
     * @param b Divisor
     * @return Devuelve el cociente de la división entera de a entre b
     *         realizando restas
     */
    public static long divide(long a, long b) {
        long res = 0;
        while (esMayor(a, b) || esIgual(a, b)) {
            res = inc(res);
            a = resta(a, b);
        }
        return (res);
    }

    /**
     * divide
     * Devuelve el cociente de la división entera de dos números usando restas
     * 
     * @param a Dividendo
     * @param b Divisor
     * @return Devuelve el cociente de la división entera de a entre b
     *         realizando restas
     */
    public static int divide(int a, int b) {
        return ((int) divide((long) a, (long) b));
    }

    /**
     * resto
     * Devuelve el resto de la división entera
     * 
     * @param a Dividendo
     * @param b Divisor
     * @return Devuelve el resto de la división entera de a entre b
     */

     public static long resto(long a, long b) {
        if (b != 0) {
            return (a - (multiplica(b, divide(a, b))));
        }
        return 0;
    }

    public static long resto(int a, int b) {
        return resto((long) a, (long) b);
    }
    
    /**
     * potencia
     * Devuelve la potencia de un número elevado a otro
     * 
     * @param base      base
     * @param exponente exponente
     * @return Devuelve la potencia de un número elevado a otro usando
     *         multiplicaciones
     */
    public static long potencia(long base, int exponente) {
        long potencia = 1;
        if (esIgual(exponente, 0))
            return 1;
        if (esMenor(exponente, 0))
            return 0;
        while (esMayor(exponente, 0)) {
            potencia = multiplica(potencia, base);
            exponente = dec(exponente);
        }
        return potencia;
    }

    public static long potencia(int base, int exponente) {
        return potencia((long) base, exponente);
    }

	
    /**
     * cuadrado
     * Devuelve la potencia de un número elevado a 2
     * 
     * @param a número a calcular su cuadrado
     * @return Devuelve la potencia de un número elevado a 2
     */
    public static long cuadrado(long a) {
        return (potencia(a, 2));
    }

    /**
     * cuadrado
     * Devuelve la potencia de un número elevado a 2
     * 
     * @param a número a calcular su cuadrado
     * @return Devuelve la potencia de un número elevado a 2
     */
    public static int cuadrado(int a) {
        return ((int) cuadrado((long) a));
    }

	
    /**
     * cubo
     * Devuelve la potencia de un número elevado a 3
     * 
     * @param a número a calcular su cubo
     * @return Devuelve la potencia de un número elevado a 3
     */
    public static long cubo(long a) {
        return (potencia(a, 3));
    }

    /**
     * cubo
     * Devuelve la potencia de un número elevado a 3
     * 
     * @param a número a calcular su cubo
     * @return Devuelve la potencia de un número elevado a 3
     */
    public static int cubo(int a) {
        return ((int) cubo((long) a));
    }

    /**
     * esMultiplo
     * Indica si un número es múltiplo de otro dado
     * 
     * @param a valor a comprobar si es múltiplo
     * @param b valor con el que comprobar si a es múltiplo de él
     * @return true si a es múltiplo y false en caso contrario
     */

     public static boolean esMultiplo(long a, long b) {
        if (b > 0)
            return (esIgual(resto(a, b), 0));
        return false;
    }

    public static boolean esMultiplo(int a, int b) {
        return esMultiplo((long) a, (long) b);
    }
    
    /**
     * esDivisor
     * Indica si un número es divisor de otro dado
     * 
     * @param a valor a comprobar si es divisor
     * @param b valor con el que comprobar si a es divisor de él
     * @return true si a es divisor y false en caso contrario
     */

     public static boolean esDivisor(long a, long b) {
        return (esMultiplo(b, a));
    }

    public static boolean esDivisor(int a, int b) {
        return esDivisor((long) a, (long) b);
    }
	
    /**
     * esPrimo
     * Indica si un número es primo
     * 
     * @param a número a comprobar si es primo
     * @return true si a es primo y false en caso contrario
     */
    public static boolean esPrimo(long a) {
        if (esMenor(a, 2))
            return false;
        boolean primo = true;
        long cont = a;
        cont = dec(cont);
        while (esMayor(cont, 1) && primo) {
            if (esIgual(resto(a, cont), 0)) {
                primo = false;
            }
            cont = dec(cont);
        }
        return (primo);
    }

    /**
     * esPrimo
     * Indica si un número es primo
     * 
     * @param a número a comprobar si es primo
     * @return true si a es primo y false en caso contrario
     */
    public static boolean esPrimo(int a) {
        return (esPrimo((long) a));
    }

	
    /**
     * esCuadradoPerfecto
     * Indica si un número es cuadrado perfecto
     * Un número es cuadrado perfecto si es el resultado del cuadrado de otro número
     * 
     * @param a número a comprobar si cuadrado perfecto
     * @return true si a es cuadrado perfecto y false en caso contrario
     */
    public static boolean esCuadradoPerfecto(long a) {
        if (esMenor(a, 0))
            return false;
        boolean cuadradoPerfecto = false;
        long cont = a;
        cont = dec(cont);
        while (esMayor(cont, 0) && !cuadradoPerfecto) {
            if (esIgual(cuadrado(cont), a)) {
                cuadradoPerfecto = true;
            }
            cont = dec(cont);
        }
        return (cuadradoPerfecto);
    }

    /**
     * esCuadradoPerfecto
     * Indica si un número es cuadrado perfecto
     * Un número es cuadrado perfecto si es el resultado del cuadrado de otro número
     * 
     * @param a número a comprobar si cuadrado perfecto
     * @return true si a es cuadrado perfecto y false en caso contrario
     */
    public static boolean esCuadradoPerfecto(int a) {
        return (esCuadradoPerfecto((long) a));
    }

}
