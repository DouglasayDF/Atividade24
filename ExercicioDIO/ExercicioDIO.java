import java.util.Scanner;

/**
 *
 * @author Douglasay
 */
public class ExercicioDIO {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int exp;
        String Nome, Rank;

        System.out.println("Digite o nome do personagem");
        Nome = ler.nextLine();

        System.out.println("Digite a quantidade de exp. dele(a)");
        exp = ler.nextInt();

        while (exp <= -1) {
            System.out.println("Este número não é valido");
            System.out.println("Digite novamente a quantidade de exp. dele(a)");
            exp = ler.nextInt();
        }

        Rank = switch ((exp - 1) / 1000) {
            case 0 -> "Ferro";
            case 1 -> "Bronze";
            case 2 -> "Prata";
            case 3 -> "Prata";
            case 4 -> "Prata";
            case 5 -> "Ouro";
            case 6 -> "Ouro";
            case 7 -> "Platina";     
            case 8 -> "Ascendente";
            case 9 -> "Imortal";
            default -> "Radiante";
        }; 

        System.out.println("O Herói do nome " + Nome + " está no nível de " + Rank);
    }

}
        /*if (exp <= 1000) {
            Rank = "Ferro";
        } else if (exp > 1000 && exp <= 2000) {
            Rank = "Bronze";
        } else if (exp > 2000 && exp <= 5000) {
            Rank = "Prata";
        } else if (exp > 5000 && exp <= 7000) {
            Rank = "Ouro";
        } else if (exp > 7000 && exp <= 8000) {
            Rank = "Platina";
        } else if (exp > 8000 && exp <= 9000) {
            Rank = "Ascendente";
        } else if (exp > 9000 && exp <= 10000) {
            Rank = "Imortal";
        } else {
            Rank = "Radiante";
        } 
        -Essa parte foi feita por que não tinha lido a necessidade de utilizar estruturas de decisões no exercício
*/
