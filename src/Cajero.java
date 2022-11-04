public class Cajero extends Empleados implements OperacionesCajero {


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
                    return deposito(cl,monto,moneda);
            }
            case "Ingresar cheque" -> {
                    return transaccion(cl,monto,moneda);
            }
            case "Transferencia" -> {
                    return transaccion(cl,-monto,moneda);
            }
        }
        return false;
    }

    public boolean deposito(Cliente cl, int monto,char moneda) {
        if(!this.busy){
            System.out.println("Atendiendo " + this.name);
            this.busy = true;
            this.tiempoOcupadoMin = this.getMinutes() + 0;
            this.tiempoOcupadoSec = this.getSeconds() + 1;
            if(moneda == 'p'){
                int saldo = cl.getSaldoPesos();
                saldo += monto;
                cl.setSaldoPesos(saldo);
                //System.out.println(cl.getSaldoPesos());
                return true;
            }else{
                int saldo = cl.getSaldoDolares();
                saldo += monto;
                cl.setSaldoDolares(saldo);
                //System.out.println(cl.getSaldoDolares());
                return true;
            }
        }else{
            if(this.tiempoOcupadoMin < this.getMinutes() || this.tiempoOcupadoMin == this.getMinutes() && this.tiempoOcupadoSec <= this.getSeconds()){
                this.busy = false;
                return deposito(cl,monto,moneda);
            }else{
                System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado." + cl.getName());
                return false;
            }
        }
    }

    public boolean transaccion(Cliente cl, int monto,char moneda) {
        if(!this.busy){
            this.busy = true;
            this.tiempoOcupadoMin = this.getMinutes() + 1;
            this.tiempoOcupadoSec = this.getSeconds() + 30;
            if(moneda == 'p'){
                if(Math.abs(monto) < 100000){
                    int saldo = cl.getSaldoPesos();
                    saldo += monto;
                    cl.setSaldoPesos(saldo);
                    System.out.println(cl.getSaldoPesos());
                    return true;
                }else {
                    //gerente
                }
            }else{
                if(Math.abs(monto) < 10000){
                    int saldo = cl.getSaldoDolares();
                    saldo += monto;
                    cl.setSaldoDolares(saldo);
                    System.out.println(cl.getSaldoDolares());
                    return true;
                }else {
                    //gerente
                }
            }
        }else{
            if(this.tiempoOcupadoMin < this.getMinutes() || this.tiempoOcupadoMin == this.getMinutes() && this.tiempoOcupadoSec <= this.getSeconds()){
                this.busy = false;
                return transaccion(cl,monto,moneda);
            }else {
                System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado.");
                return false;
            }
        }
        return false;
    }



}
