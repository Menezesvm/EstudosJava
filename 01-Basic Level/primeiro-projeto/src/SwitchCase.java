public class SwitchCase {
    public static void main(String[] args) {
      int diaSemana = 2;
      switch(diaSemana){
          case 1:
              System.out.println("Domingo");
              break;
          case 2:
              System.out.println("Segunda");
              break;
          case 3:
              System.out.println("terça");
              break;
          case 4:
              System.out.println("Quarta");
              break;
          case 5:
              System.out.println("Quinta");
              break;
          case 6:
              System.out.println("Sexta");
              break;
          case 7:
              System.out.println("Sabado");
              break;
          default:
              System.out.println("Opcão Inválida");
      }
    }
}
