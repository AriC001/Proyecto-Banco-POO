import java.time.Duration;
import java.util.Random;

public class Cajero extends Empleados implements OperacionesCajero {
    Gerente gerente = new Gerente();

    //if pendDepo >0 esntonces opera, esta como lo hacemos

    public Cajero(String nombre, int carco, int sueldo) {
        super(nombre,carco,sueldo);
    }
    @Override
    public boolean atenderCliente(Cliente cl) {
        String[] info = cl.getInfoOperacion().split(" ");
        int monto = Integer.parseInt(info[0]);
        char moneda = info[1].charAt(0);
        switch (cl.getOperacion()){
            case "Deposito" -> {
                if(deposito(cl,monto,moneda) == true){
                    subirDeRango();
                    return true;
                }
            }
            case "Ingresar cheque" -> {
                if(transaccion(cl,monto,moneda) == true){
                    subirDeRango();
                    return true;
                }
            }
            case "Transaccion" -> {
                if(transaccion(cl,-monto,moneda) == true){
                    subirDeRango();
                    return true;
                }
            }
        }
        return false;
    }

    public void subirDeRango(){
        if ((int) ((Math.random() * (3 - 1)) + 1) == 1) {
            this.points ++;
            if(points == 5){
                gerente.rankUp(this);
            }
        }
    }


    public boolean deposito(Cliente cl, int monto,char moneda) {
        if(this.busy == false){
            this.busy = true;
            this.tiempoOcupado = this.getActualHour().plus(Duration.ofSeconds(0));
            if(moneda == 'p'){
                int saldo = cl.getSaldoPesos();
                saldo += monto;
                cl.setSaldoPesos(saldo);
                cl.setAtendido();
                //System.out.println(cl.getSaldoPesos());
                return true;
            }else{
                int saldo = cl.getSaldoDolares();
                saldo += monto;
                cl.setSaldoDolares(saldo);
                //System.out.println(cl.getSaldoDolares());
                cl.setAtendido();
                return true;
            }
        }else{
            if(this.getActualHour().compareTo(tiempoOcupado) >= 0){
                this.busy = false;
                return this.deposito(cl,monto,moneda);
            }else{
                //System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado." + cl.getName());
                return false;
            }
        }
    }

    public boolean transaccion(Cliente cl, int monto,char moneda) {
        if(this.busy == false){
            this.busy = true;
            this.tiempoOcupado = this.getActualHour().plus(Duration.ofSeconds(0));
            if(moneda == 'p'){
                int saldo = cl.getSaldoPesos();
                saldo += monto;
                cl.setSaldoPesos(saldo);
                cl.setAtendido();
                return true;
            }else{
                int saldo = cl.getSaldoDolares();
                saldo += monto;
                cl.setSaldoDolares(saldo);
                cl.setAtendido();
                return true;
            }
        }else{
            if(this.getActualHour().compareTo(tiempoOcupado) >= 0){
                this.busy = false;
                return transaccion(cl,monto,moneda);
            }else {
                //System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado.");
                return false;
            }
        }
    }



}
