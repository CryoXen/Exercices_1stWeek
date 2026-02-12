package academy.exercises.e1;

public class ManipuladorStrings {

    public static String invertir(String s){
        //Declaramos un stringbuilder para ir guardando los carateres en orden invertido
        StringBuilder resInv = new StringBuilder();

        //Bucle para recorrer las letras de la palabra ingresada
        for(int i = s.length()-1; i>=0; i--) {
            resInv.append((s.charAt(i)));
        }
        return resInv.toString();
    }

    public static boolean esPalindromo(String s){
        //se crea una variable de tipo string que limpia la palabra pasada a la funcion
        //se ocupa lower case para convertir todos los caracteres en minusculas
        //y replaceAll para quitar los espacios vacios
        String limpia = s.toLowerCase().replaceAll("\\W+", "");
        return limpia.equals(invertir(limpia));
    }

    public static int contarVocales(String s) {
        int count = 0;
        String vocales = "aeiouAEIOU";

        //Se crea bucle for para recorrer toda la string
        for(int i = 0; i< s.length(); i++){
            char actual = s.charAt(i);
            //Se hace el + "" para hacer autounboxing
            if(vocales.contains(actual + "")){
                count++;
            }
        }
        return count;
    }


    public static StringBuilder construirPiramide(int niveles){
        StringBuilder sb = new StringBuilder();
        //Se ocupa este for para recorrer los niveles
        for(int i= 1; i<= niveles; i++){
            //Se hace un for anidado para los espacios necesarios para cada nivel
            for (int j=0; j<(niveles-i); j++){
                sb.append(" ");
            }

            //un for para los caracteres "*" por nivel
            for(int k=0; k < (2*i-1); k++){
                sb.append("*");

            }
            //Se agrega un salto de linea despues de ingresar los caracteres de cada nivel
            sb.append("\n");
        }


        return sb;
    }

    static void main(String[] args) {
        System.out.println("Invertir 'Hola Mundo': "
                + invertir("Hola Mundo"));
        System.out.println("'Anita lava la tina' es palindromo: "
                + esPalindromo("Anita lava la tina"));
        System.out.println("Vocales en 'Murcielago': "
                + contarVocales("Murcielago"));
        System.out.println("Piramide de 5 niveles:");
        System.out.println(construirPiramide(5));
    }
}
