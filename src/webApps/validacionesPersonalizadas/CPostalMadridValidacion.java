package webApps.validacionesPersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String> {

	@Override
    public void initialize(CPostalMadrid elCodigo) {
	
		prefijoCodigoMadrid = elCodigo.value();
    }
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private String prefijoCodigoMadrid;
}



















/*

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String> 

La clase est� implementando la interfaz ConstraintValidator, que trae dos parametros.
Se est�n sobreescribiendo dos m�todos, initializa e isValid.

*/

