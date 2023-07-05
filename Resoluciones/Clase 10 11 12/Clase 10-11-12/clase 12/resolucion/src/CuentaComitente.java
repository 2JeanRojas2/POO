public class CuentaComitente extends Cuenta{
    private String clave;

    public void extraer(double monto) {
        //veo si el monto es menor o igual al %50 de mi saldo para ver si puedo hacer la extraccion
        if(monto <= (this.getSaldo() / 2)) {
            this.setSaldo(this.getSaldo() - monto);
            System.out.println("Su saldo actual luego de la extraccion es: $" + this.getSaldo());
        }
        else {
            System.out.println("El monto ingresado solo puede ser de hasta el %50 de su saldo total si hace un extraccion sin clave");
        }
    }

    public void extraer(double monto, String clave) {
        //puedo hacer un extraccion por el total del monto siempre y cuando la clave sea la correcta
        if(this.clave.equals(clave)) {
            this.setSaldo(this.getSaldo() - monto);
            System.out.println("Su saldo acual luego de la extraccion es: $" + this.getSaldo());
        }
        else {
            System.out.println("La clave ingresada no es correcta");
        }
    }

    public void depositar(double monto) {
        //se deposita a la cuenta solo el %99 del monto ingresado
        this.setSaldo(this.getSaldo() + monto * 0.99);
        System.out.println("El saldo actual luego de depositar es de: $" + this.getSaldo());
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
