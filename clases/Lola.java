package clases;

import interfaces.ISalvajes;

public class Lola extends Animal implements ISalvajes {

    public Lola() {
    }

    @Override
    public void hacerSonido(String sonido) {
        this.sonido=sonido;
    }

    @Override
    public void nombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void edad(int edad) {
        this.edad=edad;
    }

    @Override
    public void cazar() {
        System.out.println("Hola soy Lola y estoy cazando");
    }

    @Override
    public void defender() {
        System.out.println("Hola soy Lola y me estoy defendiendo");
    }
}
