public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        Orc orc = new Orc();
        int rodada = 0;
        int vidaMenosJogador;
        int vidaMenosOrc;

        for (rodada = 0; rodada <= jogador.vidaJogador; rodada++) {
            rodada++;
            System.out.printf("Rodada: %d", rodada);
        }
        if(jogador.danoJogador() >= orc.defesaOrc) {
            System.out.println("O jogador ataca com a espada!");
            System.out.printf("O ataque foi %d e acertou!\n", jogador.danoJogador());
            System.out.printf("O Orc recebe %d de dano.", jogador.dado8());
            vidaMenosJogador = jogador.vidaJogador - jogador.dado8();
        } else if(orc.danoOrc() >= jogador.defesaJogador) {
            System.out.println("O Orc ataca com o machado!");
            System.out.printf("O ataque foi %d e acertou!\n", orc.danoOrc());
            System.out.printf("O jogador recebe %d de dano.", jogador.dado8());
            vidaMenosOrc = orc.vidaOrc - jogador.dado8();
        }
    }
}
