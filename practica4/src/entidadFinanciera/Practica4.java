package entidadFinanciera;

/**
 *
 * @author fersa
 */
public class Practica4 {

    public static void main(String[] args) {
       CCuenta objetoCuenta;
        double saldoActual;

        objetoCuenta = new CCuenta("Marta Ruiz", "1000-2365-85-123456789", 4000, 0);
        try {
            objetoCuenta.retirar(3600);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            objetoCuenta.ingresar(995);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);
    }
   
}
