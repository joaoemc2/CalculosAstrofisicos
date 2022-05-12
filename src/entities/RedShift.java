package entities;

public class RedShift {
	//constantes
	public double caK = 3933.7;
	public double caH = 3968.5;
	public double alphaH = 6562.8;
	
	public double lightSpeed = 299792458;
	public double lightyear = 9.461e+15 ;
	public double constHubblePositive = ((67.8 + 3.1)* Math.pow(10,3)) / 3.0856e+22; //Mpc
	public double constHubbleNegative = ((67.8 - 3.1)* Math.pow(10,3)) / 3.0856e+22; //Mpc
	
	public double varV,varZ,varZk,varZh,varZaH,varaH,varK,varH,varD,varAL,varMpc; //variaveis
	

	public double desvioVermelhoCaK() {
		//Efeito doppler no calcium K
		varZk = (varK - caK)/varK;
		return varZk;
	}
	public double desvioVermelhoCaH() {
		//Efeito doppler no calcium H
		varZh = (varH - caH)/varH;
		return varZh;
	}
	public double desvioVermelhoHalpha() {
		//Efeito doppler no H alpha
			varZaH = (varaH - alphaH)/varaH;
			return varZaH;
	}
	public double velocidade() {
		varZ = (varZk + varZh + varZaH) / 3;
		varV = lightSpeed * varZ;
		return varV;	
	}
	public double distanciaPositive() {
		varD = varV / constHubblePositive;
		return varD;
	}
	public double distanciaNegative() {
		varD = varV / constHubbleNegative;
		return varD;
	}
	public double distanciaALPositive() {
		varAL = distanciaPositive() / lightyear;
		return varAL;
	}
	public double distanciaALNegative() {
		varAL = distanciaNegative() / lightyear;
		return varAL;
	}
	public double distanciaMpcPositive(){
		varMpc = distanciaPositive() / 3.0841981e+22;
		return varMpc;
	}
	public double distanciaMpcNegative(){
		varMpc = distanciaNegative() / 3.0841981e+22;
		return varMpc;
	}
}