import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * Created by user on 24/05/2014.
 */
public class Espectaculo {
    List<Entrada> entradas;
    List<Zona> zonas;
    List<Entrada> entradasVendidas;
    HashMap<Zona, Asiento[][]> asientos;
    String nombre;
    Date[] fecha;
    String localidad;
    int cantidadEntradas;

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public HashMap<Zona, Asiento[][]> getAsientos() {
        return asientos;
    }

    public void setAsientos(HashMap<Zona, Asiento[][]> asientos) {
        this.asientos = asientos;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public List<Entrada> getEntradasVendidas() {
        return entradasVendidas;
    }

    public void setEntradasVendidas(List<Entrada> entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public Date[] getFecha() {
        return fecha;
    }

    public String getLocalidad() {
        return localidad;
    }

    public int getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }


    public Espectaculo(String localidad, int cantidadEntradas, String nombre,
                       Date[] fecha, List<Zona> zonas) {

        this.localidad = localidad;
        this.cantidadEntradas = cantidadEntradas;
        this.nombre = nombre;
        this.fecha = fecha;
        this.zonas = zonas;
        this.entradas = new ArrayList<Entrada>(cantidadEntradas);
        for (int i = 0; i < cantidadEntradas; i++) {
            Entrada entrada = new Entrada(i);
            entradas.add(entrada);
        }

        this.asientos = new HashMap<Zona, Asiento[][]>();
        for (Zona zona:zonas){
            Asiento[][] listaAsientos = new Asiento[zona.getCantFilas()][zona.getLargoFila()];
            int numeroAsiento = 1;
            for (int i = 0; i < zona.getCantFilas(); i++) {
                for (int j = 0; j < zona.getLargoFila(); j++) {
                    listaAsientos[i][j] = new Asiento(numeroAsiento);
                    numeroAsiento++;
                }
            }
            asientos.put(zona, listaAsientos);
        }
    }
}
