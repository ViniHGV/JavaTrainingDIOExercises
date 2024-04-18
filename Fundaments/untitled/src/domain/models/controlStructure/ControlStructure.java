package domain.models.controlStructure;


import java.util.Scanner;

/*
REGRAS
[X] Ataque Aéreo vs. Pedra: Neste caso, o jogador com o Ataque Aéreo derrota o jogador com a Pedra, por razões óbvias.
[X] Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel, porque a Pedra machuca muito mais.
[X] Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, porque Ataque Aéreo sempre ganha e o Papel é patético.
[X] Papel vs. Papel: Nesta variação, ambos os jogadores ganham, porque o Papel é inútil e ninguém que enfrenta o Papel pode perder.
[X] Pedra vs. Pedra: Para este caso não há ganhador, porque depende do que os jogadores decidem fazer com a Pedra e normalmente não fazem nada.
[X] Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, todos os jogadores perdem, devido a Aniquilação Mútua.
 */

public class ControlStructure {
    public void execute(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String primaryPlayer, secondPlayer;

        for (int i = 0; i < N; i++) {
            primaryPlayer = scan.next();
            secondPlayer = scan.next();

            if (primaryPlayer.equalsIgnoreCase("ataque") &&
                    secondPlayer.equalsIgnoreCase("ataque"))
                System.out.println("Aniquilacao mutua");

            else if (primaryPlayer.equalsIgnoreCase("ataque") &&
                    secondPlayer.equalsIgnoreCase("pedra"))
                System.out.println("Jogador 1 venceu");
            else if (primaryPlayer.equalsIgnoreCase("pedra") &&
                    secondPlayer.equalsIgnoreCase("ataque"))
                System.out.println("Jogador 2 venceu");


            else if (primaryPlayer.equalsIgnoreCase("papel") &&
                    secondPlayer.equalsIgnoreCase("pedra"))
                System.out.println("Jogador 2 venceu");
            else if (primaryPlayer.equalsIgnoreCase("pedra") &&
                    secondPlayer.equalsIgnoreCase("papel"))
                System.out.println("Jogador 1 venceu");



            else if (primaryPlayer.equalsIgnoreCase("ataque") &&
                    secondPlayer.equalsIgnoreCase("papel"))
                System.out.println("Jogador 1 venceu");
            else if (primaryPlayer.equalsIgnoreCase("papel") &&
                    secondPlayer.equalsIgnoreCase("ataque"))
                System.out.println("Jogador 2 venceu");

            else if (secondPlayer.equalsIgnoreCase("papel") &&
                    primaryPlayer.equalsIgnoreCase("papel"))
                System.out.println("Ambos venceram");

            else if (secondPlayer.equalsIgnoreCase("pedra") &&
                    primaryPlayer.equalsIgnoreCase("pedra"))
                System.out.println("Sem ganhador");
        }
    }

}
