package Reto3;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Tripulante Jhon = new Tripulante(
                "Jhon Doe",
                "1037654354",
                "123456789",
                "john.doe@udea.co",
                "Soy una persona con muchas ganas de aprender", 5);

        // jhon.resolverReto(1);
        // jhon.resolverReto(2);
        // jhon.resolverReto(3);

        // Formador Jane = new Formador(
        // "3D", "Jane Di", "1038654355", "9876454321",
        // "jane.di@udea.co", "Me gusta enseñar");

        System.out.print(Array.getLength(Jhon.getCalificaciones()));
        System.out.print(Array.getLength(Jhon.getEntregas()));

    }

}

