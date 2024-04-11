import domain.models.multiplication.Multiplication;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      Exercicio de Multiplicação Simples
        Multiplication multiplication = new Multiplication();
        multiplication.InsertValues();
        multiplication.CalculateMultiplication();
        multiplication.ApresentationTotal();
    }
}