package Ejercicio7

class Television:Electrodomestico{
    private var resolucion:Int = 20;
    private var TDT:Boolean=false;
    constructor():super()
    constructor(precio:Double, peso:Double): super(precio, peso )
    constructor(
        precioBase: Double,
        color:String,
        consumo:Char,
        peso:Double,
        reso:Int,
        tdt:Boolean):super(precioBase,color,consumo,peso){
        this.resolucion = reso;
        this.TDT = tdt;
    }

    fun getResolucion():Int{return this.resolucion}
    fun getTDT():Boolean{return this.TDT}
    override fun precioFinal() {
       // super.precioFinal()
        if(this.resolucion>40){super.setPrecioBase(super.getPrecioBase()*130/100)}
        if(this.TDT){
            super.setPrecioBase(super.getPrecioBase()+50)
        }
    }
}