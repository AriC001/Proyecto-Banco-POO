abstract class Empleados extends Banco {
    protected String name;
    protected int cargo;
    protected int sueldo;
    protected String[] cargos;

    public Empleados(String n,int c,int s){
        super(0,1);
        this.cargo = c; //cargos[c] = "Cargo" (gerente...)
        this.name = n;
        this.sueldo = s;
        this.cargos = new String[]{"Cajero", "Responsable Operativo", "Administrativo", "Gerente"};
    }
    public void rankUp(){
        if(this.cargo < 3){this.cargo++;}
    }
    //public Empleados listAll(){    }

}

