//suma de enteros positivos
//@return la suma de a +b, o -1 si alguno es negativo

public class metodo3 {

    public int sumarEnteros (int a, int b){
        if (a < 0 || b < 0){
            return -1;
        }
        return a + b;
    }

    // Prueba de que el metodo funciona
    public static void main(String[] args){
        metodo3 micalc = new metodo3();

        int resultado = micalc.sumarEnteros(8,6);

        System.out.println("La suma es :" + resultado);
    }
}