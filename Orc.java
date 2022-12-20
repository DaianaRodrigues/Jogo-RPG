import java.util.Random;

public class Orc {
    Jogador jogador = new Jogador();
    int vidaOrc = 8;
    int defesaOrc = 10;
    int machadoOrc = 0;
    Random random = new Random();
    int dado12 = random.nextInt(0, 13);

    public int danoOrc(){
        int danosOrc = machadoOrc + jogador.dado20();
        return danosOrc;
    }

}
