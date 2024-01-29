
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        System.out.print("Informe o cep que deseja consultar: ");
        String cep = sc.nextLine();

        try {
            Endereco endereco = consultaCep.consultarCep(cep);
            System.out.println(endereco);

            GeradorArquivo geradorArquivo = new GeradorArquivo();
            geradorArquivo.gerarJson(endereco);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando o programa...");
        }
        sc.close();
    }
}
