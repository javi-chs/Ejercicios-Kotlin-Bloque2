package Ejercicio7
//Crearemos una superclase llamada Electrodomestico con las siguientes características:
//
//Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
// Indica que se podran heredar.
// Por defecto, el color sera blanco, el consumo energético sera B, el precio Base es de 200€ y el peso de 5 kg.
// Los colores disponibles son blanco, metal, rojo, verde y azúl.
// Los constructores que se implementarán serán: Un constructor por defecto.
// Un construcor con el precio y peso. El resto por defecto.
// Un constructor con todos los atributos.
// Los métodos que se implemntarán serán Los metodos getter/setter de todos los atributos.
// comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usará la letra por defcto.
// Se inocará al crear el objeto y no será visible.
// comprobarColor(String color): comprueba que el color es correcto sino lo es usa el color por defecto.
// Se invocará al crar el objeto y no será visible.
// precioFinal()
// Según el consumo energetico, aumentará su prcio y según su tamaño también.
// Esta son la lista de precios LETRA A -> 100 € B -> 85 € C -> 60 € D -> 50 € E -> 30 € F -> 10 €
// TAMAÑO ENTRE 0 Y 19 KG -> 10 € ENTRE 20 Y 49 KG -> 50 € ENTRE 50 Y 79 KG -> 80 € MAYOR QUE 80 KG -> 100€
// Crearemos una subclase llamada Lavadora con las siguientes características:
//
//Su atributo es carga, además de los atributos heredados.
// Por defecto, la carga es de 5 kg.
// Los constructors que se implementarán serán:
// Un constructor por defecto.
// Un constructor con el precio y el peso. El resto por defecto.
// Un constructor con la carga y el resto de atributos heredados.
// Recurda que debes llamar al constructor de la clase de padre.
// Los métodos que implementarán serán: Método get de carga.
// precioFinal() : Si tiene una arga mayor de 30 kg, aumentará el precio 50 €, sino es así no se incrementará el precio.
// Llama al método padre y añade el código necesario.
// Recuerda que las condiciones que hemms visto en la clase Electrodoméstico también deben afectar al precio.
// Crearmos una subclase llamada Televisión con las siguientes características:
//
//Sus atributos son resolución en pulgadas y sintonizador TDT(booleano), además de los atributos heredados.
// Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
// Los constructores que se implemntarán serán Un constructor por defecto.
// Un constructor con el precio y peso. El resto por defecto.
// Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
// Recuerda que debes llamar al constructor de la clase padre.
// Los métodos que se implemntará serán: Método get de resolución y sintonizador TDT.
// precioFinal() si tiene una resoloución mayor de 40 pulgadas, se incrementará el precio un 30 % y si tiene un sintoniador TDT incorporado, aumentará 50 €.
// Recuerda que las condiciones que hemos visto en la clase Electrdomestico también deben afectar al precio.
// Ahora la clase ejecutable que
// Cree un array de Electrodomésticos de 10 posiciones.
// Asigna a cada posición un objto de las clases anteriores con los valores qu desees.
// Ahora recorre este array y ejecuta el método precioFinal()
// Deberás mostrar el precio de cada clase, es decir,
// el precio de todas las operaciones de todas las televisiones por un lado, el de las lavadoras por otro y
// la suma de los Electrodomesticos(puedes crear objetos Electrodomestico, pero recuerda que Televisión y Lavadora también son electrodomésticos).
// Recuerda el uso operador instanceof.
// Crea la clase prueba donde lanzemos test de cada clase y método creado.
// Fucinomanento: Por ejmplo, si tenemos un Electrodoméstico on un precio final de 300,
// una lavadora de 200 y una televisión de 500,
// el resultado final será 1000 (300+200+500) 300 para electrodomésticos,
// 200 para lavadoras y 500 para televisión.
open class Electrodomestico (){
    private var precioBase:Double=200.0
    private var color:String = "Blanco"
    private var consumo:Char='B'
    private var peso:Double=5.0
    //El bloque init se ejecuta para todos los constructores.
    init{
            comprobarConsumoEnergetico(consumo);
            comprobarColor(color);

}
     constructor(precioBase: Double, peso: Double):this(){
        this.precioBase = precioBase;
        this.peso = peso;
    }
    constructor(precioBase: Double,color:String,consumo:Char,peso:Double):this(){
        this.precioBase=precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;

    }
    ///GETERS/////
    fun getPrecioBase():Double{
        return this.precioBase;
    }
    fun getColor():String{
        return this.color;
    }
    fun getConsumo():Char{
        return this.consumo;
    }
    fun getPeso():Double{
        return this.peso;
    }
    ///SETERS/////

    fun setPrecioBase(precio:Double){
        this.precioBase= precio;
    }
    fun setColor(color:String){
        this.color= color;
    }
    fun setConsumo(consumo:Char){
        this.consumo= consumo;
    }
    fun setPeso(peso:Double){
        this.peso= peso;
    }







   private fun comprobarConsumoEnergetico(letra:Char){
       var valoresValidos = arrayOf('A','B','C','D','E','F')
        var esta = valoresValidos.contains(letra)
       if(!esta){this.consumo = 'B'}
   }
    private fun comprobarColor(color:String){
        var valoresValidos = arrayOf("Blanco","Metal","Rojo","Verde","Azul")
        var esta = valoresValidos.contains(color)
        if(!esta){this.color = "Blanco"}
    }
//Según el consumo energetico, aumentará su precio y según su tamaño también.
// Esta son la lista de precios
// LETRA A -> 100 €
// B -> 85 €
// C -> 60 €
// D -> 50 €
// E -> 30 €
// F -> 10 €
// TAMAÑO
// ENTRE 0 Y 19 KG -> 10 €
// ENTRE 20 Y 49 KG -> 50 €
// ENTRE 50 Y 79 KG -> 80 €
// MAYOR QUE 80 KG -> 100€
  open  fun precioFinal(){
        when{
            this.peso<20-> this.precioBase += 10;
            this.peso>=20 && this.peso<50-> this.precioBase += 50;
            this.peso>=50 && this.peso<80-> this.precioBase += 80;
            else -> this.precioBase += 100
        }
    when(this.consumo){
            'A'->this.precioBase+=100;
            'B'->this.precioBase+=85;
            'C'->this.precioBase+=60;
            'D'->this.precioBase+=50;
            'E'->this.precioBase+=30;
            'F'->this.precioBase+=10;
    }

    }


}