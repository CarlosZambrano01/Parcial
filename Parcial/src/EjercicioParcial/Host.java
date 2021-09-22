/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioParcial;

/**
 *
 * @author carlo
 */
public class Host {

    private String nombre, nomSO;
    private String IP;
    private InterfazRed interfaz;

    public Host(String nombre, String nomSO, String IP) {
        this.nombre = nombre;
        this.nomSO = nomSO;
        this.IP = IP;
    }

    

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
     * @return the nomSO
     */
    public String getNomSO() {
        return nomSO;
    }

    /**
     * @param nomSO the nomSO to set
     */
    public void setNomSO(String nomSO) {
        this.nomSO = nomSO;
    }

    /**
     * @return the IP
     */
    public String getIP() {
        return IP;
    }

    /**
     * @param IP the IP to set
     */
    public void setIP(String IP) {
        this.IP = IP;
    }
    

    public void configurar(int A, int B, int C, int D){
        
        IP = A+"."+B+"."+C+"."+D;
    }
    
    
    
}
