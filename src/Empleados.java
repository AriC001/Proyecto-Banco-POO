import java.time.LocalTime;
abstract class Empleados implements Operaciones {
    public LocalTime myObj = LocalTime.now();
    protected String name ;
    protected int cargo;
    protected int sueldo;
    protected String[] cargos;
    //protected int disponibles = 0;
    //protected int nroCajeros = 0;
    //protected int nroGerentes = 0;
    //protected int nroAdministrativos = 0;
    //protected int nroRespOp = 0;

    public Empleados(String n,int c,int s){
        this.cargo = c; //cargos[c] = "Cargo" (gerente...)
        this.name = n;
        this.sueldo = s;
        this.cargos = new String[]{"Cajero", "Responsable Operativo", "Administrativo", "Gerente"};
        /*switch(c){
            case 0 -> this.nroCajeros+=1;
            case 1 -> this.nroRespOp+=1;
            case 2 -> this.nroAdministrativos+=1;
            case 3 -> this.nroGerentes+=1;
        }*/
    }
    protected int getTime(){
        int minuto = myObj.getMinute();
        return minuto;
    }

    public String getCargo() {
        return cargos[this.cargo];
    }

    public void rankUp(){
        if(this.cargo < 3){this.cargo++;}
    }
}

