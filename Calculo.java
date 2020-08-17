import java.util.Scanner;
class Calculo{

Scanner ler = new Scanner(System.in);
    public void leituraDeDados(){

    int num = 0;
    int num2 = 0;
    int resul = 0;
    System.out.println("Digite um número: ");
    num = ler.nextInt();
    System.out.println("Digite um número: ");
    num2 = ler.nextInt();
    }
    
    public void calculo (){
    resul = num + num2;
    }

    public void seSenao(){   
    if (resul >= 50 ){
    System.out.println("Correta resposta!");
    }
    else{
      System.out.println("Morra...");
    }
}

}