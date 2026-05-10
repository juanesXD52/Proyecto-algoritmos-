
public class Metodos {

    // Método que saluda al usuario
    public static void saludar() {
        System.out.println("¡Hola! Bienvenido al programa :p.");
    }

    // Método principal
    public static void main(String[] args) {
        saludar();

        int a = 0; //Esto se debe cambiar, solo agrege a y b para que no de error el codigo 
        int b = 0; //linea 13 y 14

        int resultado =(a + b);
        
        System.out.println("La suma de los números es: " + resultado);
    }
}
