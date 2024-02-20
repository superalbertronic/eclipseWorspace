package ejemplo;

@Remote
public interface CalculadoraNegocio { 
	float suma(float x, float y);
	float resta(float x, float y);
	float multiplicacion(float x, float y);
	float division(float x, float y);
}