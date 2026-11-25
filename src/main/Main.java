package main;
import modelo.Animal;
import modelo.Gato;
import modelo.Perro;
import modelo.Circulo;
import modelo.Rectangulo;
import modelo.Figura;

public class Main{
public static void main(String[] args) {
    Animal miAnimal = new Animal();
    Animal miPerro = new Perro();
    Animal miGato = new Gato ();
    miAnimal.hacerSonido();
    miPerro.hacerSonido();
    miGato.hacerSonido();
 // Parte 3 (Desafío): Figuras con polimorfismo 
 System.out.println("----------DESAFIO----------------------- ");
        Figura[] figuras = {
            new Circulo(4.0),
            new Rectangulo(5.0, 3.0),
            new Circulo(2.5)
        };

        for (Figura figura : figuras) {
            figura.mostrarTipo();
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("----------------------");

}}
}
