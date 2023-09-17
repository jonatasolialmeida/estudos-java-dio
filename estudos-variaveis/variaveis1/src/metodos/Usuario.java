package metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        
        System.out.println("Tv está ligada? " + (smartTv.ligada ? "Ligada" : "Desligada"));
        System.out.println("Qual o canal: " + smartTv.canal);
        System.out.println("Qual o volume: " + smartTv.volume);

        System.out.println("//////////////****************//////////////");
        System.out.println("//////////////****************//////////////");


        smartTv.ligarTv();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();

        System.out.println("Tv está ligada? " + (smartTv.ligada ? "Ligada" : "Desligada"));
        System.out.println("Qual o canal: " + smartTv.canal);
        System.out.println("Qual o volume: " + smartTv.volume);

        System.out.println("//////////////****************//////////////");
        System.out.println("//////////////****************//////////////");


        smartTv.ligarTv();
        smartTv.aumentarOuDiminuirParaCanalEscolhido(9);
        smartTv.diminuirVolume();

        System.out.println("Tv está ligada? " + (smartTv.ligada ? "Ligada" : "Desligada"));
        System.out.println("Qual o canal: " + smartTv.canal);
        System.out.println("Qual o volume: " + smartTv.volume);


        System.out.println("//////////////****************//////////////");
        System.out.println("//////////////****************//////////////");


        smartTv.ligarTv();
        smartTv.aumentarOuDiminuirParaCanalEscolhido(3);
        smartTv.diminuirVolume();

        System.out.println("Tv está ligada? " + (smartTv.ligada ? "Ligada" : "Desligada"));
        System.out.println("Qual o canal: " + smartTv.canal);
        System.out.println("Qual o volume: " + smartTv.volume);



        // System.out.println();
    }
}
