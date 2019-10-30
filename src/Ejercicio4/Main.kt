package Ejercicio4
fun String.imprimir(){
    var array :CharArray = this.toCharArray();
    for(i in array){
        print( i+ " ");
    }
    println();
}
fun Int.hasta(fin: Int) {
    for (i in this..fin){
            print( " " + i);
    }
    println();
}
fun main(){
    var palabra= "Supercalifrajilisticoespialidoso";
    var numero = 5;
    palabra.imprimir();
    numero.hasta(15)
}