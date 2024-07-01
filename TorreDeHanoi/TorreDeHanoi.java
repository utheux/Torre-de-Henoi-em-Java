package TorreDeHanoi;

public class TorreDeHanoi {
    static long contador;

    public static void resolveTorreDeHanoi(int numeroDoDisco, String inicio, String destino, String auxiliar){
        if (numeroDoDisco == 1 ){
            System.out.println(" Disco " + numeroDoDisco + " torre " + inicio + " torre " + destino);
            contador++;
            return;
        }

        resolveTorreDeHanoi(numeroDoDisco-1, inicio, auxiliar, destino);
        System.out.println(" Disco " + numeroDoDisco + " torre " + inicio + " torre " + destino);
        contador++;
        resolveTorreDeHanoi(numeroDoDisco-1, auxiliar, destino, inicio);
    }

    public static void retornaNumeroDeMovimentos(){
        System.out.println(contador);
    }
}
