import java.util.Random;

public class Jogador {
    Random random = new Random();
    int vidaJogador = 10;
    int cotaDeMalha = 4;
    int defesaJogador = 10 + cotaDeMalha;
    int espada = 2;


    public int dado20(){
        int dado20 = random.nextInt(0, 20);
        return dado20;
    }
     public int dado8(){
         int dado8 = random.nextInt(0, 9);
         return dado8;
     }

    public int danoJogador(){
        int danos = espada + dado20();
        return danos;
    }



}
