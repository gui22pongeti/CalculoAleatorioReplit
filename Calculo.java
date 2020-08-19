import java.util.Scanner;
class Calculo{

  int num;
  int num2;
  int resul = 0;

Scanner ler = new Scanner(System.in);
    public void leituraDeDados(){

    
    System.out.println("Digite um número: ");
    this.num = ler.nextInt();
    System.out.println("Digite um número: ");
    this.num2 = ler.nextInt();
     this.resul = this.num + this.num2;
    }
    
     
    

    public void seSenao(){   
    if (this.resul >= 50 ){
    System.out.println("Correta resposta!");
    }
    else{
      System.out.println("Morra...");
    }
}

}