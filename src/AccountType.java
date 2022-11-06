public abstract class AccountType {
    protected boolean cuentaCorrientes = false;
    protected boolean cajaAhorro = false;

    public AccountType(int CC, int CA){
        if(CC == 1){
            this.cuentaCorrientes = true;
        }else{
            this.cajaAhorro = true;
        }
    }
}
