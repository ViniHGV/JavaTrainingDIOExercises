package domain.models.mjolnir;

import java.util.Scanner;

public class Mjolnir {
    public void execute(){
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        String name;
        int N;

        for (int i = 0; i <  C; i++) {
            name = leitor.next();
            N = leitor.nextInt();
            if (name.equals("Thor")) System.out.println("Y");
            else System.out.println("N");
        }
    }
}
