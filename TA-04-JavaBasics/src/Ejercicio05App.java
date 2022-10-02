
public class Ejercicio05App {

	public static void main(String[] args) {
		
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		System.out.println("Valores iniciales: A = "+A+", B = "+B+", C = "+C+", D = "+D);
		
		int varAux;
		varAux = B;
		B = C;
		C = D;
		D = varAux;
		varAux = C;
		C = A;
		A = varAux;
		System.out.println("Valores finales: A = "+A+", B = "+B+", C = "+C+", D = "+D);
		

	}

}
