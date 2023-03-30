package clases;

import interfaces.IDomesticos;

public class Pepe extends Animal implements IDomesticos {

    public Pepe() {
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
    public void pasear() {
        System.out.println("Hola soy Pepe y estoy paseando");
    }

}
