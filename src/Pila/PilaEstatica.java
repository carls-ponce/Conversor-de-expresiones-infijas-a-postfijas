package Pila;

public class PilaEstatica {
   private char pila[];
   private int tope;

    public PilaEstatica(int tamaño) {
        pila = new char[tamaño];
        tope = -1;
    }

    public boolean isEmpty() {
        return tope == -1? true : false;
    }

    public boolean isFull() {
        return tope == pila.length - 1 ? true : false;
    }

    public boolean push(char nuevo) {
        if (!isFull()) {
            pila[++tope] = nuevo;
            return true;
        }
        return false;
    }
    public char elementope()
    {
        char c=' ';
        if(!isEmpty())
            c=pila[tope];

        return c;
    }

    public char pop(){
        char aux = 0;
        if (!isEmpty()){
            aux=pila[tope];
            tope--;
        }
        return aux;
    }

    public char[] getPila() {
        return pila;
    }

    public void setPila(char[] pila) {
        this.pila = pila;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }
}
