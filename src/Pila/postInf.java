package Pila;

import input.sist.ito.Consola;
import input.sist.ito.Ventana;

public class postInf
    {

    PilaEstatica obPila = new PilaEstatica(15);
    Operador operador = new Operador();
    public static boolean esOperador(char operador){
        if (operador == '*' || operador == '/' || operador == '+' || operador == '-' || operador == '(' || operador ==')' || operador == '^'){
            return true;
        } return false;
    }

    public String convertirExpresion(String cadEnt){
        char letra;
        String postfija = "";
        for (int i = 0; i < cadEnt.length(); i++) {
             letra = cadEnt.charAt(i);
            if (!esOperador(letra)) {
                postfija += letra;
            }
            else {
                if (letra != ')' ) {
                    if (obPila.isEmpty()) {
                        obPila.push(letra);

                    } else {
                        int priorInfijo = operador.priorInfijo(letra);
                        int prioriPost = operador.prioriPost(obPila.elementope());
                        if (priorInfijo > prioriPost) {
                            obPila.push(letra);

                        } else {
                            postfija = postfija + obPila.pop();
                            obPila.push(letra);
                        }

                    }

                }else {
                    postfija+=obPila.pop();

                }
            }
        }

        while (!obPila.isEmpty()){
            if (obPila.elementope()=='('){
                obPila.pop();
            }else{
            postfija+=obPila.pop();}
        }
        Consola.imprime("Expresión infija ingresada: " + cadEnt);
        return postfija;
    }

        public static void main(String[] args) {
            postInf obj = new postInf();
            Consola.imprime("Expresión final (Postfija): "+obj.convertirExpresion(Ventana.leeCadena("Ingresa una expresión matemáticas")));
        }
}
