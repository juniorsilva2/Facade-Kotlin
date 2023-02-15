import Deposito
import MaquinaCafe
import Delivery

class Facade {
    fun pedirCafe() {
        val deposito: Deposito = Deposito()
        val maquinaCafe: MaquinaCafe = MaquinaCafe()
        val delivery: Delivery = Delivery()

        deposito.pegarCafe()
        maquinaCafe.ligar()
        maquinaCafe.preparar()
        delivery.enviar()
    }
}