import java.time.Duration;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);

        List<Cliente> clientes = new LinkedList<>();
        Cliente cl1 = new Cliente("Fernanda Borja",37168938,337302,0,0,"Deposito",10000,'p',0,1);
        Cliente cl2 = new Cliente("Nadia Trigo",37970626,611868,0,0,"Deposito",5000,'d',0,1);
        Cliente cl3 = new Cliente("Luis Fernando",19592905,274989,0,0,"Prestamo PYME", 100000,'p',0,1);
        Cliente cl4 = new Cliente("Antonio Conde",38262510,1710,0,0,"IngresarCheque",6000,'p',1,0);
        Cliente cl5 = new Cliente("Rayan Macia",31238297,4730142,0,0,"CambioMoneda",6000,'d',0,1);
        Cliente cl6 = new Cliente("Margarita Pedrosa",38049952,440884,0,0,"Deposito",6000,'p',0,1);
        Cliente cl7 = new Cliente("Martha Ledesma",24574949,303128,0,0,"Deposito",6000,'p',0,1);
        Cliente cl8 = new Cliente("María Matos", 15830012, 172853,0,0,"Deposito",6000,'p',0,1);
        Cliente cl9 = new Cliente("Ignacio Sierra", 22387207, 135085,0,0,"Transaccion",4000,'p',0,1);
        Cliente cl10 = new Cliente("César Pinilla", 28381842, 325286,0,0,"Prestamo Hypotecario",700000,'p',0,1);
        Cliente cl11 = new Cliente("Ricardo Sosa", 12827379, 225490,0,0,"Transaccion",3000,'p',0,1);
        Cliente cl12 = new Cliente("Isabella Conesa", 15739570, 124062,0,0,"Deposito",500,'d',0,1);
        Cliente cl13 = new Cliente("Paola Herrero", 27876472, 13798,0,0,"Prestamo Consumo",150000,'p',0,1);
        Cliente cl14 = new Cliente("Juan Carlos Vegas", 28914915, 420297,0,0,"CambioMoneda",2500,'d',0,1);
        Cliente cl15 = new Cliente("Victorina Gimeno ",  21888908, 58828,0,0,"IngresarCheque",10000,'p',1,0);
        Cliente cl16 = new Cliente("Dolores Cruz", 34859032 , 10459,0,0,"Deposito",25000,'p',0,1);
        Cliente cl17 = new Cliente("Christian Ramos", 20291201, 148483,0,0,"Deposito",30000,'p',0,1);
        Cliente cl18 = new Cliente("Angela Montiel", 36467784, 61012,0,0,"Transaccion",61012,'p',0,1);
        Cliente cl19 = new Cliente("Miguel Olmos ", 43609988 , 403406,0,0,"Deposito",1000,'d',0,1);
        Cliente cl20 = new Cliente("Casimiro Soriano", 37032858 , 439464,0,0,"Deposito",8000,'p',0,1);
        Cliente cl21 = new Cliente("Armando Cobos",  36618195, 329031,0,0,"IngresarCheque",10000,'p',1,0);
        Cliente cl22 = new Cliente("Nicolas Moya", 30679961 , 248449,0,0,"Deposito",5500,'d',0,1);
        Cliente cl23 = new Cliente("Salvador Parejo", 16998463, 2600982,0,0,"CambioMoneda",6000,'d',0,1);
        Cliente cl24 = new Cliente("Mayra Rios", 22189494 , 191225,0,0,"Deposito",16000,'p',0,1);
        Cliente cl25 = new Cliente("Raquel Alcala", 26121831, 151008,0,0,"Transaccion",85000,'p',0,1);
        Cliente cl26 = new Cliente("Elizabeth Arnaiz", 40107190 , 434449,0,0,"Deposito",76000,'p',0,1);
        Cliente cl27 = new Cliente("Angela Diaz", 19533650, 16383,0,0,"Deposito",200,'d',0,1);
        Cliente cl28 = new Cliente("Jordi Mansill", 42541852, 282099,0,0,"Prestamo PYME",2700000,'p',0,1);
        Cliente cl29 = new Cliente("José Cabeza", 20302488, 353566,0,0,"Deposito",1000,'d',0,1);
        Cliente cl30 = new Cliente("German Rodenas", 40791965, 31370,0,0,"Deposito",53000,'p',0,1);
        Cliente cl31 = new Cliente("Martin Cuellar", 33953936, 850093,0,0,"CambioMoneda",750,'d',0,1);
        Cliente cl32 = new Cliente("Igor Morcillo", 19786885, 2426,0,0,"Deposito",34000,'p',0,1);
        Cliente cl33 = new Cliente("Lara Valenzuela", 32669960, 35351,0,0,"Prestamo Hypotecario",560000,'p',0,1);
        Cliente cl34 = new Cliente("Claudia Berrocal", 38227620, 41417,0,0,"Deposito",86500,'p',0,1);
        Cliente cl35 = new Cliente("Jose Miguel Navarro", 28448970, 61203,0,0,"Prestamo Consumo",700000,'p',0,1);
        Cliente cl36 = new Cliente("Luca Campillo", 20346137, 27960,0,0,"Deposito",58000,'p',0,1);
        Cliente cl37 = new Cliente("Victor Figueroa", 44606461, 32433,0,0,"Deposito",19000,'p',0,1);
        Cliente cl38 = new Cliente("Teodora Silva", 19011620, 190202,35000,0,"CambioMoneda",35000,'p',0,1);
        Cliente cl39 = new Cliente("Myriam Caro", 37793529, 161556,0,0,"Transaccion",3800,'p',0,1);
        Cliente cl40 = new Cliente("Rocio Sacristan", 34566719, 193389,0,0,"Deposito",2000,'d',0,1);
        clientes.add(cl1);clientes.add(cl2);clientes.add(cl3);clientes.add(cl4);clientes.add(cl5);clientes.add(cl6);clientes.add(cl7);clientes.add(cl8);clientes.add(cl9);clientes.add(cl10);clientes.add(cl11);clientes.add(cl12);clientes.add(cl13);clientes.add(cl14);clientes.add(cl15);clientes.add(cl16);clientes.add(cl17);clientes.add(cl18);clientes.add(cl19);clientes.add(cl20);clientes.add(cl21);clientes.add(cl22);clientes.add(cl23);clientes.add(cl24);clientes.add(cl25);clientes.add(cl26);clientes.add(cl27);clientes.add(cl28);clientes.add(cl29);clientes.add(cl30);clientes.add(cl31);clientes.add(cl32);clientes.add(cl33);clientes.add(cl34);clientes.add(cl35);clientes.add(cl36);clientes.add(cl37);clientes.add(cl38);clientes.add(cl39);clientes.add(cl40);

        List<Empleados> cajeros = new LinkedList<>();
        List<Empleados> administrativos = new LinkedList<>();
        List<Empleados> responsablesOperativos = new LinkedList<>();
        List<Empleados> gerentes = new LinkedList<>();
        List<Empleados> empleados = new LinkedList<>();
        Banco PublicEnemy = new Banco("Public Enemy",empleados,clientes);

        Empleados cajero1 = new Cajero("Alberto Megias",0,50000,PublicEnemy);
        Empleados cajero2 = new Cajero("Augusto Saiz",0,95000,PublicEnemy);
        Empleados cajero3 = new Cajero("Clotilde Mora",0,95000,PublicEnemy);
        Empleados cajero4 = new Cajero("Lucas Mariscal",0,95000,PublicEnemy);
        Empleados cajero5 = new Cajero("Josefa Tortosa",0,95000,PublicEnemy);
        //Empleados cajero6 = new Cajero("Rayan Borrego",0,95000,PublicEnemy);
        cajeros.add(cajero1);cajeros.add(cajero2);cajeros.add(cajero3);cajeros.add(cajero4);cajeros.add(cajero5);//cajeros.add(cajero6);

        Empleados admin1 = new Administrativo("Alejandro Pereira",2,120000,PublicEnemy);
        Empleados admin2 = new Administrativo("Dina Nogales",2,120000,PublicEnemy);
        administrativos.add(admin1);administrativos.add(admin2);

        Empleados respOp1 = new ResponsableOperativo("Nancy Prados",1,150000,PublicEnemy);
        Empleados respOp2 = new ResponsableOperativo("Beatriz Peñalver",1,150000,PublicEnemy);
        Empleados respOp3 = new ResponsableOperativo("Vicente Sierra",1,150000,PublicEnemy);
        responsablesOperativos.add(respOp1);responsablesOperativos.add(respOp2);responsablesOperativos.add(respOp3);

        Empleados gerente1 = new Gerente("Agusto Sanz",3,250000,PublicEnemy);
        gerentes.add(gerente1);

        empleados.addAll(cajeros);empleados.addAll(administrativos);empleados.addAll(responsablesOperativos);empleados.addAll(gerentes);
        System.out.println("\u001B[38;5;48m"+"                              ESTÁ ABIERTO EL BANCO PUBLIC ENEMY"+"\u001B[0m");
        empleadoQueAtendera(clientes,cajeros,administrativos,gerentes,responsablesOperativos);

        PublicEnemy.showPrestamos(clientes);

        System.out.println("");
        System.out.println("\u001B[38;5;106m"+"===============================CLIENTES============================="+"\u001B[0m");
        try {
            PublicEnemy.getClientes();
        }catch (Exception e){}

        System.out.println("");
        System.out.println("\u001B[36m"+"===============================EMPLEADOS============================"+"\u001B[0m");
        PublicEnemy.getEmpleado();

        System.out.println("");
        System.out.println("\u001B[38;5;118m"+"Reservas : $" + PublicEnemy.getReservas());
    }


    public static void empleadoQueAtendera(List<Cliente> clientes , List<Empleados> cajeros, List<Empleados> administrativos, List<Empleados> gerentes, List<Empleados> operativos) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Estan ingresando los clientes...");
        LocalTime myObj = LocalTime.now();
        boolean allAtendidos = false;
        List<Cliente> sinAtenderCl = new LinkedList<>();
        long minutos = 1;
        LocalTime horarioCierre = myObj.plus(Duration.ofMinutes(minutos));
        while (myObj.compareTo(horarioCierre) < 0 && allAtendidos == false){
            myObj = LocalTime.now();
            allAtendidos = true;
            for(int j = 0; j< clientes.size();j++){
                Cliente cliente = clientes.get(j);
                if(cliente.getAtendido() == false){
                    allAtendidos = false;
                    String[] tipo = cliente.getOperacion().split(" ");
                    switch (tipo[0]){
                        case "Deposito","IngresarCheque" -> {
                            String[] info = cliente.getInfoOperacion().split(" ");
                            if((Integer.parseInt(info[0]) > 100000 && info[1] == "p") || (Integer.parseInt(info[0]) > 10000 && info[1] == "d")){
                                if(gerentes.get(0).atenderCliente(cliente) == false){
                                    sinAtenderCl.add(cliente);
                                    filaASerAtendido(sinAtenderCl,cajeros,  administrativos,  gerentes,  operativos);
                                }else{
                                    filaASerAtendido(sinAtenderCl,cajeros,  administrativos,  gerentes,  operativos);
                                    continue;
                                }
                            }else{
                                if(cajeros.get(0).atenderCliente(cliente) == false){
                                    sinAtenderCl.add(cliente);
                                    filaASerAtendido(sinAtenderCl,cajeros,  administrativos,  gerentes,  operativos);
                                }else{
                                    filaASerAtendido(sinAtenderCl,cajeros,  administrativos,  gerentes,  operativos);
                                    continue;
                                }
                            }
                        }
                        case "Transaccion" -> {
                            System.out.print("");
                            String[] info = cliente.getInfoOperacion().split(" ");
                            if((Integer.parseInt(info[0]) > 100000 && info[1] == "p") || (Integer.parseInt(info[0]) > 10000 && info[1] == "d")){
                                if(gerentes.get(0).atenderCliente(cliente) == false){
                                    sinAtenderCl.add(cliente);
                                    filaASerAtendido(sinAtenderCl,cajeros,  administrativos,  gerentes,  operativos);
                                }else{
                                    filaASerAtendido(sinAtenderCl,cajeros,  administrativos,  gerentes,  operativos);
                                    continue;
                                }
                            }else{
                                if(cajeros.get(0).atenderCliente(cliente) == false){
                                    sinAtenderCl.add(cliente);
                                    filaASerAtendido(sinAtenderCl,cajeros,  administrativos,  gerentes,  operativos);
                                }else{
                                    filaASerAtendido(sinAtenderCl,cajeros,  administrativos,  gerentes,  operativos);
                                    continue;
                                }
                            }
                        }
                        case "Prestamo","CambioMoneda" -> {
                            if(administrativos.get(0).atenderCliente(cliente) == false){
                                if(operativos.get(0).atenderCliente(cliente) == false) {
                                    sinAtenderCl.add(cliente);
                                    filaASerAtendido(sinAtenderCl, cajeros, administrativos, gerentes, operativos);
                                }else{
                                    filaASerAtendido(sinAtenderCl,cajeros,  administrativos,  gerentes,  operativos);
                                    continue;
                                }
                            }else{
                                filaASerAtendido(sinAtenderCl,cajeros,  administrativos,  gerentes,  operativos);
                                continue;
                            }
                        }
                        default -> {
                            System.out.print("");
                        }
                    }
                }
            }
        }
        System.out.println("\u001B[36m"+"                                     EL BANCO HA CERRADO");
        System.out.println("                         No se atenderan más clientes, vuelva mañana");
        System.out.println("                                       Muchas Gracias"+"\u001B[0m");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void filaASerAtendido(List<Cliente> cl ,List<Empleados> cajeros, List<Empleados> administrativos, List<Empleados> gerentes, List<Empleados> operativos){
        if(cl.isEmpty() == false){
            int[] toRemove = new int[40];
            for(int i = 0 ; i<40;i++){
                toRemove[i] = -1;
            }
            int cont = 0;
            for(int j = 0; j<cl.size();j++) {
                Cliente cliente = cl.get(j);
                if(cliente.getAtendido() == false){
                    String[] tipo = cliente.getOperacion().split(" ");
                    switch (tipo[0]) {
                        case "Deposito","IngresarCheque" -> {
                            String[] info = cliente.getInfoOperacion().split(" ");
                            if((Integer.parseInt(info[0]) > 100000 && info[1] == "p") || (Integer.parseInt(info[0]) > 10000 && info[1] == "d")) {
                                    if(true){
                                    Empleados gerente = gerentes.get(0);
                                    if (gerente.atenderCliente(cliente) == true) {
                                        if(toRemove[cont] == -1){
                                            toRemove[cont] = cl.indexOf(cliente);
                                            cont++;
                                            break;
                                        }else{
                                            while(toRemove[cont] != -1){cont++;}
                                            toRemove[cont] = cl.indexOf(cliente);
                                            cont++;
                                            break;
                                        }
                                    }
                                }
                            }else{
                                for (int i = 0;i<cajeros.size();i++) {
                                    Empleados cajero = cajeros.get(i);
                                    if (cajero.atenderCliente(cliente) == true) {
                                        if(toRemove[cont] == -1){
                                            toRemove[cont] = cl.indexOf(cliente);
                                            cont++;
                                            break;
                                        }else{
                                            while(toRemove[cont] != -1){cont++;}
                                            toRemove[cont] = cl.indexOf(cliente);
                                            cont++;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        case "Transaccion" -> {
                            System.out.print("");
                            String[] info = cliente.getInfoOperacion().split(" ");
                            if((Integer.parseInt(info[0]) > 100000 && info[1] == "p") || (Integer.parseInt(info[0]) > 10000 && info[1] == "d")) {
                                //for (int i = 0;i<gerentes.size();i++)
                                if(true){
                                    Empleados gerente = gerentes.get(0);
                                    if (gerente.atenderCliente(cliente) == true) {
                                        if(toRemove[cont] == -1){
                                            toRemove[cont] = cl.indexOf(cliente);
                                            cont++;
                                            break;
                                        }else{
                                            while(toRemove[cont] != -1){cont++;}
                                            toRemove[cont] = cl.indexOf(cliente);
                                            cont++;
                                            break;
                                        }
                                    }
                                }
                            }else{
                                for (int i = 0;i<cajeros.size();i++) {
                                    Empleados cajero = cajeros.get(i);
                                    if (cajero.atenderCliente(cliente) == true) {
                                        if(toRemove[cont] == -1){
                                            toRemove[cont] = cl.indexOf(cliente);
                                            cont++;
                                            break;
                                        }else{
                                            while(toRemove[cont] != -1){cont++;}
                                            toRemove[cont] = cl.indexOf(cliente);
                                            cont++;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        case "Prestamo","CambioMoneda" -> {
                            for (int i = 0;i<administrativos.size();i++) {
                                Empleados administrativo = administrativos.get(i);
                                if (administrativo.atenderCliente(cliente) == true) {
                                    if(toRemove[cont] == -1){
                                        toRemove[cont] = cl.indexOf(cliente);
                                        cont++;
                                        break;
                                    }else{
                                        System.out.print("");
                                        while(toRemove[cont] != -1){cont++;}
                                        toRemove[cont] = cl.indexOf(cliente);
                                        cont++;
                                        break;
                                    }
                                }else{
                                    for(int k = 0; k<operativos.size();k++){
                                        Empleados operativo = operativos.get(i);
                                        if (operativo.atenderCliente(cliente) == true) {
                                            if(toRemove[cont] == -1){
                                                toRemove[cont] = cl.indexOf(cliente);
                                                cont++;
                                                break;
                                            }else{
                                                System.out.print("");
                                                while(toRemove[cont] != -1){cont++;}
                                                toRemove[cont] = cl.indexOf(cliente);
                                                cont++;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        default -> {
                            //return;
                        }
                    }
                }
            }
            for(int j=0; j<toRemove.length;j++){
                int i = toRemove[j];
                if(i != -1){
                    try{
                        if(cl.isEmpty() == false && cl.get(i) != null){
                            //System.out.println(cl.get((i)).getName());
                            cl.remove(i);
                            toRemove[j] = -1;
                            //System.out.println("Eliminado");
                            //cont--;
                        }
                    }catch (Exception e){
                        System.out.println(e);
                        break;
                    }
                }
            }
        }
    }





    }
