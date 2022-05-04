package entities;

public class VelocidadeDeEscape {
	//constantes
	public double g = 6.67 * (Math.pow(10,-11)); //constante gravitacional de Newton
	
	public double rObjeto,rObjetoBase,rObjetoExp;
	public double mObjeto,mObjetoBase,mObjetoExp;
	
	public double vEscape() {
		rObjeto = rObjetoBase * Math.pow(10, rObjetoExp);
		mObjeto = mObjetoBase * Math.pow(10, mObjetoExp);
		double step1 = (2* g * mObjeto) / rObjeto;
		return Math.sqrt(step1);
	}
}