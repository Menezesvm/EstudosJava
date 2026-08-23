package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> prod = new TreeMap<>();

        System.out.print("Entre com o caminho: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (prod.containsKey(name)) {
                    int prodTotalVendas = prod.get(name);
                    prod.put(name, count + prodTotalVendas);
                } else {
                    prod.put(name, count);
                }
                line = br.readLine();
            }
            for (String key : prod.keySet()) {
                System.out.println(key + ": " + prod.get(key));
            }
            String maisVendido = "";
            int maiorQtd = 0;
            int totalGeral = 0;

            for (String key : prod.keySet()) {
                int qtd = prod.get(key);

                totalGeral += qtd;

                if (qtd > maiorQtd) {
                    maiorQtd = qtd;
                    maisVendido = key;
                }
            }

            System.out.println("Produto mais vendido: " + maisVendido + " (" + maiorQtd + " unidades)");
            System.out.println("Total geral de vendas: " + totalGeral);

        }
        catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
