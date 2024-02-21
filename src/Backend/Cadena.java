//Joseph Quintero
//Intrucciones: Elabora un programa en Java que reciba una cadena 
//de texto como argumento en el momento de ejecutar 
//tu aplicación e imprima en consola las subcadenas

package Backend;

public class Cadena {

    public static void main(String[] args) {
        String cadenaTexto = args[0];
        generacionSubcadena(cadenaTexto);
        generacionSubcadenaReves(cadenaTexto);
    }

    static void generacionSubcadena(String cadenaTexto) {
        int tamanioCadena = cadenaTexto.length();
        for (int i = tamanioCadena; i >= 1; i--) {
            String subcadena = cadenaTexto.substring(0, i);
            System.out.println("\"" + subcadena + "\"");
        }
    }

    static void generacionSubcadenaReves(String cadenaTexto) {
        int tamanioCadena = cadenaTexto.length();
        for (int i = tamanioCadena - 1; i >= 0; i--) {
            String subcadenaReves = cadenaTexto.substring(i, tamanioCadena);
            System.out.println("\"" + subcadenaReves + "\"");
        }
    }
}
