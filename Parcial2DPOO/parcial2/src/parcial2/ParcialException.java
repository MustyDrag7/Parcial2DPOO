package parcial2;

public class ParcialException extends Exception {
    private int tipoError;
    public final static int EXPONENTE_NEGATIVO = 1;
    public final static int INDETERMINACION = 2;
    public final static int EXCEDE_MAXIMO = 3;
    
    public ParcialException(int tipoError) {
        this.tipoError = tipoError;
    }
    
    @Override
    public String getMessage() {
        switch(this.tipoError) {
            case EXPONENTE_NEGATIVO:
                return "Exponente negativo";
            case INDETERMINACION:
                return "Indeterminación 0^0";
            case EXCEDE_MAXIMO:
                return "Valor máximo superado";
            default:
                return "Datos invalidos";
        }
    }

	public int getTipoError() {
		return tipoError;
	}

	public void setTipoError(int tipoError) {
		this.tipoError = tipoError;
	}

	public static int getExponenteNegativo() {
		return EXPONENTE_NEGATIVO;
	}

	public static int getIndeterminacion() {
		return INDETERMINACION;
	}

	public static int getExcedeMaximo() {
		return EXCEDE_MAXIMO;
	}
}
