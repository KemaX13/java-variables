public class Cakes {
    public static void main(String[] args) {
        //Tenemos 1 pastel y queremos dividirlo para 5 personas

        int cake = 1;
        int people = 5;

        //Cuando dividimos dos enteros cabe la posibilidad de que el resultado sea una fracción, pero no está bien cambiar a double algo que conceptualmente es un entero (como el pastel o las personas)
        //Para que el resultado cambie de tipo usamos "type casting" y se hace agregando entre paréntesis lo que queremos convertir
        
        //Corre el siguiente código
        System.out.println("Cada persona se lleva " + ((double)cake / people) + " partes de pastel");
        //El resultado obtenido es de tipo double.
        

        //Ahora vamos a escribir un programa que convierta un valor de tipo double a int y de int a double.

        //Declara y asigna un valor a una variable double
        //Escribe aquí tu código
        double numdb = 1.5;
        System.out.println("Valor original de double: " + numdb);

        //Convierte double a int
        //Escribe aquí tu código
        System.out.println("Valor convertido de double a int: " + (int)numdb);

        //Declara y asigna un valor a una variable int
        //Escribe aquí tu código
        int i = 2;
        System.out.println("Valor original de int: " + i);

        //Convierte int a double
        //Escribe aquí tu código
        System.out.println("Valor convertido de int a double: " + (double)i);
    }
}
