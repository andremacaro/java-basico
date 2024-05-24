public class SmartTv {
    int canal = 1;
    int volume = 25;
    boolean ligada = false;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        System.out.println("Diminuindo o volume para: " + volume);
        volume --;
    }

    public void mudarCanal(int canal){
       this.canal = canal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }


}
