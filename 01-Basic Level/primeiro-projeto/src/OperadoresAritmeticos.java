public class OperadoresAritmeticos {

public static void main(String[] args) {

        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 3.50;
        double desconto = 5.00;
        int totalDiasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalcomDesconto = valorTotal - desconto;
        double valorTotalDivido = valorTotalcomDesconto / 2;
        double valorTotalMensal = valorTotalcomDesconto * totalDiasDoMes;

        System.out.println("Qual o valor total diário? R$" + valorTotal );
        System.out.println("Qual o valor total com desconto? R$" + valorTotalcomDesconto);
        System.out.println("Qual o valor total no mês? R$" + valorTotalMensal);

    }
}
