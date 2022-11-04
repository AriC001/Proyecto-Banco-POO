public class Administrativo extends Empleados implements OperacionesAdministrativos{//implements ATM{


    public Administrativo(String n, int c, int s) {
        super(n,c,s);
    }


    @Override
    public boolean atenderCliente(Cliente cl, int monto,char moneda) {
        String tipo[] = cl.getOperacion().split(" ");
        switch (tipo[0]){
            case "Prestamo" -> {
                return prestamo(cl,tipo);
            }
            case "CambiodeMoneda" -> {
                return cambioMoneda(cl,monto,moneda);
            }
        }
        return false;
    }

    public boolean prestamo(Cliente cl,String[] tipo){
        if(!this.busy){
            this.busy = true;
            this.tiempoOcupadoMin = this.getMinutes() + 2;
            this.tiempoOcupadoSec = this.getSeconds() + 10;
            switch (tipo[1]) {
                case "PYME" -> {
                    int monto = Integer.parseInt(tipo[2]);
                    float interes = 0.02f;
                    //RETORNAR TRUE pero que hacemos con estos datos? atributos del cliente?
                }
                case "Hipotecario" -> {
                    int monto = Integer.parseInt(tipo[2]);
                    float interes = 0.125f;
                }
                default -> {
                    int monto = Integer.parseInt(tipo[2]);
                    float interes = 0.05f;

                }
            }
        }else{
            if(this.tiempoOcupadoMin < this.getMinutes() || this.tiempoOcupadoMin == this.getMinutes() && this.tiempoOcupadoSec <= this.getSeconds()){
                this.busy = false;
                return prestamo(cl,tipo);
            }else{
                System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado.");
                return false;
            }
        }
        return false;
    }

    public boolean cambioMoneda(Cliente cl,int monto,char moneda){
        if(!this.busy){
            this.busy = true;
            this.tiempoOcupadoMin = this.getMinutes() + 0;
            this.tiempoOcupadoSec = this.getSeconds() + 30;
            if(moneda == 'p'){ //moneda q quiere
                if(monto <= cl.getSaldoDolares()){
                   int saldoP = cl.getSaldoPesos() + (monto * 156);
                   int saldoD = cl.getSaldoDolares() - monto;
                   cl.setSaldoPesos(saldoP);
                   cl.setSaldoDolares(saldoD);
                   return true;
                }
            }else{
                if(monto <= cl.getSaldoPesos()){
                    int saldoP = cl.getSaldoDolares() + (monto / 165);
                    int saldoD = cl.getSaldoPesos() - monto;
                    cl.setSaldoPesos(saldoP);
                    cl.setSaldoDolares(saldoD);
                    return true;
                }
            }

        }else{
            if(this.tiempoOcupadoMin < this.getMinutes() || this.tiempoOcupadoMin == this.getMinutes() && this.tiempoOcupadoSec <= this.getSeconds()){
                this.busy = false;
                return cambioMoneda(cl,monto,moneda);
            }else{
                System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado.");
                return false;
            }
        }
        return false;
    }
}
