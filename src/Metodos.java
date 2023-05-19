import java.util.*;
public class Metodos {
    public static void FCADRASTRAESTATISTICA(estatistica[] estatisticas){
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<10;i++){
            System.out.println("---------------------------------------------------------------");
            System.out.println("|\tCADASTRO ESTATISTICA\t               \t|");
            System.out.println("| 1 - Codigo da cidade:\t\t\t|");
            estatisticas[i].codigoCidade=sc.nextInt();
            System.out.println("| 2 - Nome da cidade:\t\t\t|");
            estatisticas[i].nomeCidade=sc.next();
            System.out.println("| 3 - Quantidade de acidentes na cidade:\t\t\t|");
            estatisticas[i].qtdAcidentes=sc.nextInt();
        }
    }

    public static void PQTDACIDENTES(estatistica[] estatisticas){
        int i;
        for(i=0;i<10;i++){
            if(estatisticas[i].qtdAcidentes>100 & estatisticas[i].qtdAcidentes<500){
                System.out.println("Qantidade de acidentes na "+estatisticas[i].nomeCidade+", de codigo "+estatisticas[i].codigoCidade+": "+estatisticas[i].qtdAcidentes;
            }
        }
    }
    public static void PMAIORMENOR(estatistica[] estatisticas){
        int i;
        String cidadeMaior="";
        String cidadeMenor="";
        int maior=0;
        int menor=0;
        for(i=0;i<10;i++){
            if(i==0){
                cidadeMaior=estatisticas[i].nomeCidade;
                cidadeMenor=estatisticas[i].nomeCidade;
                maior=estatisticas[i].qtdAcidentes;
                menor=estatisticas[i].qtdAcidentes;
            }
            if(maior<estatisticas[i].qtdAcidentes){
                cidadeMaior=estatisticas[i].nomeCidade;
                maior=estatisticas[i].qtdAcidentes;
            }
            if(menor>estatisticas[i].qtdAcidentes){
                cidadeMenor=estatisticas[i].nomeCidade;
                menor=estatisticas[i].qtdAcidentes;
            }
        }
        System.out.println("Cidade com maior numero de acidentes: "+cidadeMaior+" com "+maior+" acidentes");
        System.out.println("Cidade com menor numero de acidentes: "+cidadeMenor+" com "+menor+" acidentes");
    }

    public static void PACIMA(estatistica[] estatisticas){
        int i;
        int somaAcidentes=0;
        for(i=0;i<9;i++){
            somaAcidentes+=estatisticas[i].qtdAcidentes;
        }
        long media=somaAcidentes/10;
        System.out.println("Cidades com numero de acidentes acima da media:");
        for(i=0;i<10;i++){
            if(estatisticas[i].qtdAcidentes>media){
                System.out.println(estatisticas[i].nomeCidade);
            }
        }
    }
}
