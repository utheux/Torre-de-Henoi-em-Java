package TorreDeHanoi;

public class TorreMain {
    public static void main(String[] args) {


        long tempoInicial =  System.currentTimeMillis();
        TorreDeHanoi.resolveTorreDeHanoi(10,"A","C","B");
        TorreDeHanoi.retornaNumeroDeMovimentos();
        long tempoFinal = System.currentTimeMillis();

        long tempoGasto = tempoFinal - tempoInicial;

        long segundosTotais = tempoGasto / 1000;
        int milissegundosRestantes = (int) (tempoGasto % 1000);
        int segundos = (int) (segundosTotais % 60);
        int minutos = (int) ((segundosTotais / 60) % 60);
        int horas = (int) (segundosTotais / 3600);

        String tempoFormatado = String.format("%02d:%02d:%02d:%03d", horas, minutos, segundos, milissegundosRestantes);
        System.out.println("Tempo formatado: " + tempoFormatado);






    }
}
