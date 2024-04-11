package domain.models.multiplication;

import java.text.MessageFormat;
import java.util.Scanner;

public class Multiplication {
    private int primaryValue;
    private int secondValue;
    private int total;
    private Scanner scan = new Scanner(System.in);

    public Multiplication() {

    }

    public void InsertValues () {
        this.primaryValue = scan.nextInt();
        this.secondValue = scan.nextInt();
    }

    public int CalculateMultiplication(){
        this.total = this.primaryValue * this.secondValue;
        return this.total;
    }

    public void ApresentationTotal(){
        System.out.println(MessageFormat.format("PROD = {0}", this.total));
    }

}
