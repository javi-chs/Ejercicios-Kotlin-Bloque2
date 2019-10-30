package Ejercicio2

class EmpresaView {
    fun info(empresa:EmpresaModel){
        println("Nombre: "+ empresa.nombre+"\n"+
                "Año de fundacion: "+ empresa.anyoFundacion + "\n"+
                "Número de empleados: " + empresa.empleados.size)
    }
    fun listarEmpresas(empresas :Array<EmpresaModel>){
        println("             Lista de empresas");
        println("---------------------------------------------")
        var cont =1
        for (i in empresas){
            println("$cont---> " + i.nombre);
        cont++;
        }
    }
}