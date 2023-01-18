package Cajero;

class Cuenta{
    private float saldo;

    public Cuenta(){
        this.saldo = 0;
    }

    public Cuenta(float s){
        this.saldo = s;
    }

    public void ingresar(float c){
        this.saldo += c;
    }

    public void extraer(float c){
        this.saldo -= c;
    }

    public float getSaldo(){
        return this.saldo;
    }
}

