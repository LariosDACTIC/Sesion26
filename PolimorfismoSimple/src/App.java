public class App {
    public static void main(String[] args) throws Exception {
        

        // Calculadora calc = new Calculadora();
        // System.out.println(calc.sumar(5, 3));       // Llama al método sumar(int, int)
        // System.out.println(calc.sumar(5.5, 3.2));   // Llama al método sumar(double, double)
        // System.out.println(calc.sumar(1, 2, 3));    // Llama al método sumar(int, int, int)


        Animal miAnimal;

        Animal an = new Animal();
        an.hacerSonido();

        // Animal perro = new Perro();
        // Animal gato = new Gato();

        // gato.hacerSonido();
        // perro.hacerSonido();


        miAnimal = new Perro();
        miAnimal.hacerSonido();  // Llama al método hacerSonido() de la clase Perro

        miAnimal = new Gato();
        miAnimal.hacerSonido();  // Llama al método hacerSonido() de la clase Gato

        //Este es un ejemplo claro de cómo el polimorfismo permite que un solo tipo de referencia (Animal) pueda apuntar a objetos de diferentes clases derivadas (Perro y Gato) y ejecutar el método correspondiente a la clase del objeto actual al que se refiere la variable.

    }
}
