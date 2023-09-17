package metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv(){
        ligada = true;
    }
    public void desligarTv(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarOuDiminuirParaCanalEscolhido(int canalEscolhilo){
        canal = canalEscolhilo;
    }
}
