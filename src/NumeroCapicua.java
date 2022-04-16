import java.util.Scanner;
public class NumeroCapicua {
	public static int darLaVuelta(int numero) {
		String num="" + numero;
		String resultado= "";
		int pos = num.length() - 1;
		do {
			resultado+= num.charAt(pos);
			pos--;
			
		}while (pos >= 0);
		int resu= Integer.parseInt(resultado);
		return resu;
	}
	public static boolean esCapicua(int numero) {
		int numalreves = darLaVuelta(numero);
		if(numero == numalreves) {
			return true;
		}else {
			return false;
		}
	}
	public static String crearCapicua(int numero) {
		int numalreves = darLaVuelta(numero);
		String capicua = "" + numero + numalreves;
		return capicua;
	}
	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		int numero = solicitarValor(tec);
		
		if(esCapicua(numero)) {
			System.out.println("\n El número introducido es capicua.");
		}else {
			System.out.println("\n El número introducido no es capicua.");
			System.out.println("Se puede generar el siguiente con él ");
			String capicua= crearCapicua(numero);
			System.out.println(capicua);
		}
		tec.close();
	}
	public static int solicitarValor(Scanner tec) {
		int numero;
		do {
			System.out.println("---------------------------------------");
			System.out.println("Inserta el úmero a comprobar si es capicua: ");
			numero=tec.nextInt();
		}while(numero<=0);
		return numero;
	}
}
