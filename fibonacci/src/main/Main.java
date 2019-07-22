package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Espere Cargando...");
		for (long i = 1; i <= 47; i++) {
				System.out.println("posicion "+i+": " + fibo(i+1));
		}
	}

	static long fibo(long n) {
		if (n <= 1) {
			return n;
		}else {
			return fibo(n-1)+fibo(n-2);
	}
	}
}
