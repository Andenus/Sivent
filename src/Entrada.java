/**
 * Created by user on 24/05/2014.
 */
public class Entrada {
    private String tipo;
    private int numAsiento;
    private String zona;
    private int idEntrada;
    private int precio;

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Entrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getIdEntrada() {
        return idEntrada;
    }
}
