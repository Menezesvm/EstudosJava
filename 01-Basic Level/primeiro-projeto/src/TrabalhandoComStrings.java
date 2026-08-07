public class TrabalhandoComStrings {
    public static void main(String[] args){
        String nome = "Vinícius";
        String nomeDois  = "Matheus";
        String sobrenome = "Menezes";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(sobrenome);
        String nomeCompleto = nome + sobrenome;

        System.out.println(" Olá " + nome.toLowerCase() + " Seu nome tem "  + tamanhoString + " caracteres");
        System.out.println(" Os nomes São iguais: " + saoIguais);
        System.out.println("Nome completo:  " + nomeCompleto);


    }
}
