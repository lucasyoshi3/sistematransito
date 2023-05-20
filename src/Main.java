import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Metodos metodos=new Metodos();
        int i;

        String nomeArquivo="ArquivoDeTransito.txt";
        BufferedWriter escreva=new BufferedWriter(new FileWriter(nomeArquivo));

        estatistica[] estatisticas=new estatistica[10];
        for(i=0;i<10;i++){
            estatisticas[i]=new estatistica();
        }
        int menu=0;
        while(menu!=9){
            System.out.println("---------------------------------------------------------------");
            System.out.println("|\tMENU ESTATÍSTICA\t               \t|");
            System.out.println("| Estatísticas de acidentes em 2020\t\t|");
            System.out.println("| 1 - Cadastro Estatística\t\t\t|");
            System.out.println("| 2 - Consulta por quantidade de acidentes\t|");
            System.out.println("| 3 - Consulta por estatísticas de acidentes\t|");
            System.out.println("| 4 - Acidentes acima da média das 10 cidades   |");
            System.out.println("| 9 - Finalizar 		   		              |");
            menu=sc.nextInt();

            switch (menu) {
                case 1:
                    metodos.FCADRASTRAESTATISTICA(estatisticas);
                    break;
                case 2:
                    metodos.PQTDACIDENTES(estatisticas);
                    for (i = 0; i < 10; i++) {
                        if (estatisticas[i].qtdAcidentes > 100 & estatisticas[i].qtdAcidentes < 500) {
                            escreva.write("Quantidade de acidentes na cidade de " + estatisticas[i].nomeCidade + ", de codigo " + Integer.toString(estatisticas[i].codigoCidade) + ": " +Integer.toString(estatisticas[i].qtdAcidentes));
                            escreva.newLine();
                        }
                    }
                    break;
                case 3:
                    escreva.write(metodos.PMAIORMENOR(estatisticas));
                    break;
                case 4:
                    escreva.newLine();
                    escreva.write(metodos.PACIMA(estatisticas));
                    break;
                case 9:
                    System.out.println("Finalizado");
                    break;
                default:
                    System.out.println("Codigo invalido");
                    break;
            }
        }
        escreva.close();
        System.exit(0);
    }
}