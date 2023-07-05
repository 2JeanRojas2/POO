
public class PrincipalMain {

	public static void main(String[] args) {

		Cuenta cuenta = new CuentaComitente();

		((CuentaComitente) cuenta).setClave("BBBGGG");

		cuenta.setSaldo(1000);

		//Extraigo valor aceptable (menor al %50) sin clave
		cuenta.extraer(300);

		System.out.println("----------------");

		//Extraigo con clave erronea
		((CuentaComitente)cuenta).extraer(700,"AAABBB");

		System.out.println("----------------");

		//Extraigo con clave correcta y un monton mayor al %50
		((CuentaComitente)cuenta).extraer(700,"BBBGGG");

		System.out.println("----------------");

		//Deposito 100 (solo 99 se agregarian a la cuenta)
		((CuentaComitente)cuenta).depositar(100);

	}

}
