public class Fatorial{
	// Versao iterativa do calculo do fatorial
	public int calculaFatorial(int n)throws IllegalArgumentException{
		if(n < 0)
			throw new IllegalArgumentException("não existe fatorial para numeros negativos");
		int resultado = 1;
		
		for(int i=2; i <= n; i++)
			resultado*=i;
		return resultado;
	}
}