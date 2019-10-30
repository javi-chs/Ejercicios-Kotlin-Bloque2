package Ejercicio5
//Plantear un data class llamado Dado con una única propiedad llamada valor.
// Sobreescribir el método toString para que muestre tantos asteriscos como indica la propiedad valor.
data class Dado (val valor: Int){
    override fun toString():String {
        var str ="";
        for (i in 1..valor){
            str+="*"
        }
        return str;
    }
}