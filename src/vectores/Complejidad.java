
package vectores;

public class Complejidad {
    
    private int iteraciones;
    private VectorOrdenable vectorParaBurbujaMejorCaso;
    private VectorOrdenable vectorParaBurbujaPeorCaso;
    private VectorOrdenable vectorParaBurbujaValoresAleatorios;
    private VectorOrdenable vectorParaSeleccionMejorCaso;
    private VectorOrdenable vectorParaSeleccionPeorCaso;
    private VectorOrdenable vectorParaSeleccionValoresAleatorios;
    private VectorOrdenable vectorParaMezclaMejorCaso;
    private VectorOrdenable vectorParaMezclaPeorCaso;
    private VectorOrdenable vectorParaMezclaValoresAleatorios;
    
    private String[] titulos = {"Burbuja Mejor Caso","Burbuja Peor Caso"," Burbuja Valores Aleatorios",
    "Selección Mejor Caso","Selección Peor Caso","Selección Valores Aleatorios","Mezcla Mejor Caso",
    "Mezcla Peor Caso","Mezcla Valores Aleatorios"};
    
    private MatrizDeTiempos m;
    
    public Complejidad(int N){
        iteraciones = N;
    }
    
    public void ejecutarAlgoritmos(){
        m = new MatrizDeTiempos(titulos.length, iteraciones,titulos);
        
        for(int j = 0; j < titulos.length; j++){
            int ini = 1;
            for(int i = 0; i < iteraciones; i++){
                switch(j){
                    case 0:
                        vectorParaBurbujaMejorCaso = new VectorOrdenable(ini);
                        vectorParaBurbujaMejorCaso.rellenaVectorEnOrden();
                        m.asignaValor(j, i, vectorParaBurbujaMejorCaso.ordenaPorBurbuja());
                        break;
                    case 1:
                        vectorParaBurbujaPeorCaso = new VectorOrdenable(ini);
                        vectorParaBurbujaPeorCaso.rellenaVectorEnOrdenInverso();
                        m.asignaValor(j, i, vectorParaBurbujaPeorCaso.ordenaPorBurbuja());
                        break;
                    case 2:
                        vectorParaBurbujaValoresAleatorios = new VectorOrdenable(ini);
                        vectorParaBurbujaValoresAleatorios.rellenaVectorAleatoriamente();
                        m.asignaValor(j, i,vectorParaBurbujaValoresAleatorios.ordenaPorBurbuja());
                        break;
                    case 3:
                        vectorParaSeleccionMejorCaso = new VectorOrdenable(ini);
                        vectorParaSeleccionMejorCaso.rellenaVectorEnOrden();
                        m.asignaValor(j, i, vectorParaSeleccionMejorCaso.ordenaPorSeleccionDirecta());
                        break;
                    case 4:
                        vectorParaSeleccionPeorCaso = new VectorOrdenable(ini);
                        vectorParaSeleccionPeorCaso.rellenaVectorEnOrdenInverso();
                        m.asignaValor(j, i, vectorParaSeleccionPeorCaso.ordenaPorSeleccionDirecta());
                        break;
                    case 5: 
                        vectorParaSeleccionValoresAleatorios = new VectorOrdenable(ini);
                        vectorParaSeleccionValoresAleatorios.rellenaVectorAleatoriamente();
                        m.asignaValor(j,i, vectorParaSeleccionValoresAleatorios.ordenaPorSeleccionDirecta());
                        break;
                    case 6:
                        vectorParaMezclaMejorCaso = new VectorOrdenable(ini);
                        vectorParaMezclaMejorCaso.rellenaVectorEnOrden();
                        m.asignaValor(j, i, vectorParaMezclaMejorCaso.ordenaPorMezcla());
                        break;
                    case 7:
                        vectorParaMezclaPeorCaso = new VectorOrdenable(ini);
                        vectorParaMezclaPeorCaso.rellenaVectorEnOrdenInverso();
                        m.asignaValor(j, i, vectorParaMezclaPeorCaso.ordenaPorMezcla());
                        break;
                    case 8:
                        vectorParaMezclaValoresAleatorios = new VectorOrdenable(ini);
                        vectorParaMezclaValoresAleatorios.rellenaVectorAleatoriamente();
                        m.asignaValor(j, i, vectorParaMezclaValoresAleatorios.ordenaPorMezcla());
                        break;
                }
                ini += 1;
            }
        }
    }
    public void guardarDatos(String t){
        m.guardaTiempos(t);
    }
    public void imprimirTiempos(){
        m.imprimeTiempos();
    }
}
