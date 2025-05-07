package parcial2;

public class Parcial {
    public static int potencia(int b, int e) throws ParcialException {
        if (e < 0) {
            throw new ParcialException(ParcialException.EXPONENTE_NEGATIVO);
        }
        
        if (b == 0 && e == 0) {
            throw new ParcialException(ParcialException.INDETERMINACION);
        }
        
        if (e == 0) {
            return 1;
        }
        
        int resultado = 1;
        
        try {
            for (int i = 0; i < e; i++) {
                resultado = Math.multiplyExact(resultado, b);
            }
            return resultado;
        } catch (ArithmeticException e1) {
            throw new ParcialException(ParcialException.EXCEDE_MAXIMO);
        }
    }
}