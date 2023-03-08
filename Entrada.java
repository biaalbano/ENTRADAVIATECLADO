import java.util.Scanner;
public class Entrada{
    public static void main (String[] args){
        int idade; 
        String nomeCompleto;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade=leia.nextInt();

        Scanner entrada = new Scanner(System.in);
        System.out.println("sua idade é de :"+ idade);
        System.out.println("Digite o seu nome completo");
        nomeCompleto=entrada.nextLine();
        System.out.println(nomeCompleto);
        
        leia.close();
        entrada.close();
    }
}