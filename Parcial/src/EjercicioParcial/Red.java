
package EjercicioParcial;

/**
 *
 * @author carlo
 */
public class Red {
    
    private String nombre;
    private int NoMaxHost;
    private int NoHostConectados;
    private Host host;
    
    public Red(String nombre, int NoMaxHost, int NoHostConectados){
        this.nombre = nombre;
        this.NoMaxHost = NoMaxHost;
        this.NoHostConectados = NoHostConectados;
    }
    
    public Red(){
        
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
     * @return the NoMaxHost
     */
    public int getNoMaxHost() {
        return NoMaxHost;
    }

    /**
     * @param NoMaxHost the NoMaxHost to set
     */
    public void setNoMaxHost(int NoMaxHost) {
        this.NoMaxHost = NoMaxHost;
    }

    /**
     * @return the NoHostConectados
     */
    public int getNoHostConectados() {
        return NoHostConectados;
    }

    /**
     * @param NoHostConectados the NoHostConectados to set
     */
    public void setNoHostConectados(int NoHostConectados) {
        this.NoHostConectados = NoHostConectados;
    }
 
    
    public void details(){
        System.out.println("Host en la Red: "+this.nombre);
        System.out.println("Host: " + host.getNombre() + ", Ip:  " + host.getIP());
    }
    
    
    
}
