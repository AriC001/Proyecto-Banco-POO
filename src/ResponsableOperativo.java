import java.time.Duration;

public class ResponsableOperativo extends Empleados{
    private final Banco publicEnemy;
    Gerente gerente;

    public ResponsableOperativo(String n, int c, int s,Banco banco) {
        super(n,c,s);
        publicEnemy = banco;
        gerente = new Gerente(publicEnemy);
    }


    @Override
    public boolean atenderCliente(Cliente cl) {
        String[] tipo = cl.getOperacion().split(" ");
        String[] info = cl.getInfoOperacion().split(" ");
        int monto = Integer.parseInt(info[0]);
        char moneda = info[1].charAt(0);
        switch (tipo[0]){
            case "Prestamo" -> {
                if(prestamo(cl,tipo,info) == true){
                    subirDeRango();
                    return true;
                }
            }
            case "CambiodeMoneda" -> {
                if(cambioMoneda(cl,monto,moneda) == true){
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

    public boolean prestamo(Cliente cl,String[] tipo,String[] info){
        if(this.busy == false){
            this.busy = true;
            this.tiempoOcupado = this.getActualHour().plus(Duration.ofSeconds(12));
            switch (tipo[1]) {
                case "PYME" -> {
                    int monto = Integer.parseInt(info[0]);
                    float interes = 0.02f;
                    cl.setPrestamo(monto);
                    publicEnemy.prestamo(monto);
                    cl.setInteres(interes);
                    cl.setAtendido();
                    //RETORNAR TRUE pero que hacemos con estos datos? atributos del cliente?
                    return true;
                }
                case "Hipotecario" -> {
                    int monto = Integer.parseInt(info[0]);
                    float interes = 0.125f;
                    cl.setPrestamo(monto);
                    publicEnemy.prestamo(monto);
                    cl.setInteres(interes);
                    cl.setAtendido();
                    return true;
                }
                default -> {
                    int monto = Integer.parseInt(info[0]);
                    float interes = 0.05f;
                    cl.setPrestamo(monto);
                    publicEnemy.prestamo(monto);
                    cl.setInteres(interes);
                    cl.setAtendido();
                    return true;
                }
            }
        }else{
            if(this.getActualHour().compareTo(tiempoOcupado) >= 0){
                this.busy = false;
                return prestamo(cl,tipo,info);
            }else{
                //System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado. " + cl.getName());
                return false;
            }
        }
    }

    public boolean cambioMoneda(Cliente cl,int monto,char moneda){
        if(this.busy == false){
            this.busy = true;
            this.tiempoOcupado = this.getActualHour().plus(Duration.ofSeconds(10));
            if(moneda == 'p'){ //moneda q quiere
                if(monto <= (cl.getSaldoDolares() * 156)){
                    int saldoP = cl.getSaldoPesos() + (monto * 156);
                    int saldoD = cl.getSaldoDolares() - monto;
                    cl.setSaldoPesos(saldoP);
                    cl.setSaldoDolares(saldoD);
                    cl.setAtendido();
                    return true;
                }else{
                    return false;
                }
            }else{
                if(monto <= ( cl.getSaldoPesos() / 165)){
                    int saldoP = cl.getSaldoDolares() + (monto / 165);
                    int saldoD = cl.getSaldoPesos() - monto;
                    cl.setSaldoPesos(saldoP);
                    cl.setSaldoDolares(saldoD);
                    cl.setAtendido();
                    return true;
                }else{
                }
            }

        }else{
            if(this.getActualHour().compareTo(tiempoOcupado) >= 0){
                this.busy = false;
                return cambioMoneda(cl,monto,moneda);
            }else{
                //System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado. " + cl.getName());
                return false;
            }
        }
        return false;
    }
}
