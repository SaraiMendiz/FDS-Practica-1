
package fds1;

import vectores.Complejidad;

public class FDS1 {

    public static void main(String[] args) {
       Complejidad complejidad = new Complejidad(1000);
       complejidad.ejecutarAlgoritmos();
       complejidad.imprimirTiempos();
       complejidad.guardarDatos("tiempos.csv");
    }
    
}
