import java.util.Scanner;
import java.lang.Math;
// Exercicio 18: Faça um programa que peça o tamanho de um arquivo para
// download (em MB) e a velocidade de um link de Internet (em Mbps),
// calcule e informe o tempo aproximado de download do arquivo usando
// este link (em minutos).
class Main {
  
  public static void main(String[] args) {
  //Declaração de variáveis
  double tamanhoDoArquivo;
  double velocidadeDoLink;
  double conversaoEmBits;
  double conversaoVelocidade;
  double tempoDoDownload;
    
      Scanner teclado = new Scanner(System.in);
    //Fazer a entrada dos dados
    System.out.println("Digite o tamanho do arquivo em MB: ");
   tamanhoDoArquivo = teclado.nextDouble();
    System.out.println("Digite a velociade da internet em  Mbps: ");
    velocidadeDoLink = teclado.nextDouble();

     //Fazendo os calculos
    conversaoEmBits = tamanhoDoArquivo * 8;
    conversaoVelocidade = velocidadeDoLink * 60;
    tempoDoDownload = conversaoEmBits / conversaoVelocidade;
    
    //Monstrando o resultado pro usuário
    System.out.printf("O tempo aproximado de download é de %.2f minutos.", tempoDoDownload);
       
  }
  
}