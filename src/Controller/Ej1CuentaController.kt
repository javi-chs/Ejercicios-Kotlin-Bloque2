package Controller
import Model.Cuenta
import Views.Ej1CuentaView
class CuentaController {
    var cuenta:Cuenta  = Cuenta(0);
    var vista = Ej1CuentaView()

    fun getBalance():Int{return cuenta.saldo;}


    fun deposit(){
        vista.deposito();
        var amount = readLine()!!.toInt();
        cuenta.saldo += amount}

    fun withdraw():Boolean{
        vista.extracto()
        var amount = readLine()!!.toInt();
        if(cuenta.saldo > amount){ cuenta.saldo -= amount; return true;}
        else{return false;}
    }

    override fun toString():String{
      return  vista.consultarSaldo(this.getBalance());
    }

    fun showMenu(){
        var fin =false;
        var op=0;
        var puedoRealizarExtracto=true;
        while(!fin){
           op= vista.imprimeMenu()

            when(op){
                1->{ vista.Respuesta(op,this.getBalance(), puedoRealizarExtracto) }
                2->{
                    this.deposit()
                    vista.Respuesta(op,this.getBalance(), puedoRealizarExtracto)
                }
                3->{
                    puedoRealizarExtracto = this.withdraw()
                    vista.Respuesta(op, this.getBalance(), puedoRealizarExtracto)
                }
                4->{
                    vista.Respuesta(op, this.getBalance(),puedoRealizarExtracto);
                    fin=true;
                }

            }
        }
    }
}

