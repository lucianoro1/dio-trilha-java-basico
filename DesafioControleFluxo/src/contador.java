import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class contador {
   
    public static void main(String[] args){

   try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro numero ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo numero !");
        int parametroDois = scanner.nextInt();
        scanner.close();    

        if (parametroDois > parametroUm){
         System.out.println( "Não foi possivel efetuar o calculo"); 
           }
        else{
            int contagem = parametroUm - parametroDois;

            for (int numero = 1; numero <= contagem; numero++){
            System.out.println("a quantidade de numero é: " + numero);
            }
        }
    }catch (InputMismatchException e){
        System.out.println( "O campo precisa ser numerico");
    }
    }

        
}    
