package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fersa
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    

    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /* Constructor sin argumentos */
    
    public CCuenta ()
    {
    }
    /**Constructor con parámetro para iniciar todas las propiedades de la clase
     * 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
   // Método para asignar el nombre del titular de la cuenta
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    // Método que me devuelve el nombre del titular
    public String obtenerNombre()
    {
        return getNombre();
    }

    // Método que me devuelve el saldo disponible en cada momento
     public double estado ()
    {
        return getSaldo();
    }

    /** * Método para ingresar cantidades en la cuenta.Modifica el saldo.Este método va a ser probado con Junit
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }



    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    private final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";

    /**
     * Get the value of ERRORCANTIDADNEGATIVA
     *
     * @return the value of ERRORCANTIDADNEGATIVA
     */
    public String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }


    // Método que me devuelve el número de cuenta
    public String obtenerCuenta ()
    {
        return getCuenta();
    }
    
    
    public static void probarIngresar (CCuenta c, int cantidad, int cantidadEsperada){
        try {
            c.ingresar(cantidad);
        } catch (Exception ex) {
            Logger.getLogger(CCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void probrarRetirar (CCuenta c, int cantidad, int cantidadEsperada){
        try {
            c.retirar(cantidad);
        } catch (Exception ex) {
            Logger.getLogger(CCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
