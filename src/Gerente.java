public class Gerente extends Empleados{
    //private
    public Gerente(String n, int c, int s) {
        super(n, c, s);
    }

    public void rankUp(){
        //if(this.c < 3){this.c++;}
    }
    public void transaccion(){

    }
    public void deposito(){}
    public void prestamo(){}
    public void mantenerCaja(){}
    public void darAsesoramiento(){}
    public void otros(){}

    @Override
    public void atenderCliente(Cliente cl, String op, int monto) {

    }
}
