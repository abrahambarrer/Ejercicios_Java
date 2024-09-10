public class promedio {
    public static void main(String[] args){
        // Ejemplo
        int[] creditos = {20, 6, 6, 12, 10, 25};
        int[] calf = {6, 8, 9, 8, 7, 7};
        imprimirProm(creditos, calf);
    }

    // Funcion calcular ponderacion
    static int ponderacion(int[] creditos, int[] calf){
        int suma = 0;
        for (int i = 0; i < calf.length; i++)
            suma += calf[i]*creditos[i];
        return suma;
    }
    // Funcion sumar elementos de un vector
    static int suma(int[] vector){
        int suma = 0;
        for (int i = 0; i < vector.length; i++)
            suma += vector[i];
        return suma;
    }
    // Funcion calcular promedio ponderado
    static float calcularProm(int[] creditos, int[] calf){
        return ponderacion(calf, creditos)/(float)(suma(creditos));
    }
    // Funcion imprimir promedio
    static void imprimirProm(int[] creditos, int[] calf){
        String espacios = String.valueOf(" ").repeat(10);
        System.out.println("Creditos | Calificaciones | Total");
        System.out.println("----------------------------------");
        for (int i =0; i < creditos.length;i++){
        System.out.printf("%4d%s%4d%s%4d\n", creditos[i], espacios, calf[i], espacios, calf[i]*creditos[i]);
        }
        System.out.println("----------------------------------");
        System.out.printf("%4d%sentre%s%d\n\n", suma(creditos), espacios, espacios, ponderacion(creditos, calf));
        System.out.printf("Promedio = %.2f", calcularProm(creditos, calf));
    }
}