import java.time.LocalTime;
abstract class Empleados implements Operaciones {

    protected String name ;
    protected int cargo;
    protected int sueldo;
    protected String[] cargos;
    protected boolean busy;
    protected LocalTime tiempoOcupado;
    protected int tiempoOcupadoSec;
    protected int points = 0;

    public Empleados(String n,int c,int s){
        this.cargo = c; //cargos[c] = "Cargo" (gerente...)
        this.name = n;
        this.sueldo = s;
        this.busy = false;
        this.tiempoOcupadoSec = 0;
        this.cargos = new String[]{"Cajero", "Responsable Operativo", "Administrativo", "Gerente"};
        /*switch(c){
            case 0 -> this.nroCajeros+=1;
            case 1 -> this.nroRespOp+=1;
            case 2 -> this.nroAdministrativos+=1;
            case 3 -> this.nroGerentes+=1;
        }*/
    }
    public Empleados(){}
    protected LocalTime getActualHour(){
        LocalTime myObj = LocalTime.now();
        return myObj;
    }
    public String getCargo() {
        return cargos[this.cargo];
    }

    public abstract boolean atenderCliente(Cliente cl);

    //@Override
    //public boolean atenderCliente(Cliente cl, int monto, char moneda) {
     //   return false;
    //}

   /*public void rankUp(Empleados e){
        if(e.cargo < 2){e.cargo++;}
    }*/
}

