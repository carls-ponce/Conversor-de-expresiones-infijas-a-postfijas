package Pila;

public class Operador {
    char operador;


    public int priorInfijo(char operador)
    {
        if (operador == '^') return 4;
        if (operador == '*' || operador == '/') return 2;
        if (operador == '+' || operador == '-') return  1;
        if (operador == '(') return 5;
        return 0;
    }
    public int prioriPost(char operador)
    {
        if (operador == '^') return  3;
        if (operador == '*' || operador == '/') return 2;
        if (operador == '+' || operador == '-') return 1;

        return 0;
    }


    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

}
