import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaPais consultaPais = new ConsultaPais();

        System.out.println("Digite um País para consultar: ");
        var pais = leitura.nextLine();

        try{
            Paises novoConsultaPais = consultaPais.buscarPais(pais);
            System.out.println(novoConsultaPais);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoConsultaPais);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}