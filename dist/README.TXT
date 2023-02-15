========================
BUILD OUTPUT DESCRIPTION
========================

Si dejamos el programa por defecto sin tocar nada nos ejecutará el vector sin el volátil.
Si queremos el volátil tendremos que introducir volatile en la linea 6 del VectorOrdenable,
es decir, private volatile int[] vector;
Y si luego se requiere el vector normal, pues se vuelve a eliminar el volatile de la línea