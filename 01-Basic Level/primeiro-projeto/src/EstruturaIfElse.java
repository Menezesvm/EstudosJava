public class EstruturaIfElse {
    public static void main(String[] args) {

// teste       int idade = 30;
//
//        if (idade >= 18) {
//            System.out.println("Você é maior de idade");
//
//       }else{
//          System.out.println("Você é menor de idade");
//        }

          boolean estaChovendo = true;

          if(!estaChovendo){
              System.out.println("Maravilha!!");

          }else{
              System.out.println("O chuva do caraio!!");

              boolean temDinheiro = true;
              boolean temCartao = false;

          if(temDinheiro && temCartao){
              System.out.println("Pede um delivery e ifood!!");

          }else if(temDinheiro || temCartao){
              System.out.println("Pede só um ifood!!");

          }else{
              System.out.println("Não pede nada!!");
          }

// Operador ternário          String mensagem = (temDinheiro) ? "pede só um ifood!!" : "Come o que tem em casa";
//          System.out.println(mensagem);
          }

    }

}
