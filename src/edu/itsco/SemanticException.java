package edu.itsco;

public class SemanticException extends Exception{
	public static final int VARIABLE_NO_DEFINIDA = 10;
	public static final int VARIABLE_DUPLICADA = 20;
	public static final int VARIABLE_NO_INICIALIZADA = 30;
	public static final int TIPOS_NO_COINCIDEN = 40;
	
	//Atrapa los errores de las variables
	public SemanticException(int tipoExcepcion, 
			String nombreVariable) {
		super(getMessageVariable(tipoExcepcion,nombreVariable));
	}
	
	public static String getMessageVariable(int tipoExcepcion,
			String nombreVariable) {
		String msg = "";
		switch(tipoExcepcion) {
		case VARIABLE_NO_DEFINIDA: 
			msg ="La variable " + nombreVariable + " no se declaro";
			break;
		case VARIABLE_DUPLICADA:
			msg ="La variable "+ nombreVariable+" ya fue definida";
			break;
		case VARIABLE_NO_INICIALIZADA:
			msg = "La variable "+nombreVariable+" no ha sido inicializada";
			break;
		}
		return msg;
	}
}
