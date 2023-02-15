
package vectores;

public class VectorOrdenable {
    private int numeroDeElementos;
    private  int[] vector;
    
    public VectorOrdenable (int numElementos){
        numeroDeElementos = numElementos;
        vector = new int[numeroDeElementos];
    }
    
    public void rellenaVectorEnOrden(){
        for(int i = 0; i < numeroDeElementos; i++){
            vector[i] = i+1;
        }
    }
    public void rellenaVectorEnOrdenInverso(){
        int x = numeroDeElementos;
        for(int i = 0; i < numeroDeElementos; i++){
            vector[i] = x;
            x--;
        }
    }
    public void rellenaVectorAleatoriamente(){
        for(int i = 0; i < numeroDeElementos; i++){
            vector[i] = (int) (Math.random() * numeroDeElementos);
        }
    }
    public void imprimeVector(){
        for(int i = 0; i < vector.length; i++){
            System.out.println(vector[i]+"\n");
        }
    }
    public long ordenaPorBurbuja(){
        long tiempo;
        long inicio = System.nanoTime();
        for(int i = 0; i < numeroDeElementos - 1; i++){
            for(int j = numeroDeElementos - 1; j > i; j--){
                if(vector[j-1] > vector[j]){
                    int temp = vector[j-1];
                    vector[j-1] = vector[j];
                    vector[j] = temp;
                }
            }
        }
        tiempo = System.nanoTime() - inicio;
        return tiempo;
    }
    public long ordenaPorSeleccionDirecta(){
        long tiempo;
        long inicio = System.nanoTime();
        int m;
        for(int i = 0; i < numeroDeElementos - 1; i++){
            m = i;
            for(int j = i+1; j < numeroDeElementos; j++){
                if(vector[j] < vector[m]){
                    m = j;
                }
                int aux = vector[i];
                vector[i] = vector[m];
                vector[m] = aux;
            }
        }
        tiempo = System.nanoTime() - inicio;
        return inicio;
    }
    public long ordenaPorMezcla(){
        long tiempo;
        long inicio = System.nanoTime();
        sort(vector,0,vector.length-1);
        tiempo = System.nanoTime() - inicio;
        return tiempo;
    }
    
    public void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for(int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        
        int i = 0, j = 0;
        
        int k = l; 
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    public void sort(int arr[], int l, int r){
        if(l < r){
            int m =l+ (r-l)/2;
 
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }
    
}
