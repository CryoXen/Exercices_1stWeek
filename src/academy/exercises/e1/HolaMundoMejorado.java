package academy.exercises.e1;

public class HolaMundoMejorado {
   public static void main() {
        //Aqui declaramos las variables
       String nombre = "Christian";
       int edad = 24;
       double altura = 1.78;
       boolean esActivo = false;

       //Concatenación de mensaje
       String mensaje1 = "Me llamo " + nombre + ", tengo " + edad + " años, mido: " +altura+ " m y estoy " + (esActivo ? "activo" : "inactivo" + ".");
       System.out.println(mensaje1);

       //Ahora usaremos el String.format()4
       String mensaje2 = String.format("Me llamo %s, tengo %d anios, mido %.2f m y estoy %s.",
               nombre, edad, altura, esActivo ? "activo" : "inactivo"
        );
       System.out.println(mensaje2);
    }
}
