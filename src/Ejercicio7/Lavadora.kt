package Ejercicio7

class Lavadora:Electrodomestico {
 private var carga :Double = 5.0;
    constructor():super()
    constructor(precio:Double, peso:Double): super(precio, peso )
    constructor(precioBase: Double,color:String,consumo:Char,peso:Double, carga:Double):super(precioBase,color,consumo,peso){
        this.carga = carga;
    }

fun getCarga():Double{
    return this.carga;
}
     override fun precioFinal(){
        //super.precioFinal()
         if(this.carga>30){super.setPrecioBase(super.getPrecioBase()+50)}

    }
}
