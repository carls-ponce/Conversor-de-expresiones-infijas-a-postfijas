package Pila;

public class Nodo {
    Operador info;

    public Nodo(Operador a) {
        this.info=a;
    }

    public Operador getInfo() {
        return info;
    }

    public void setInfo(Operador info) {
        this.info = info;
    }
}
