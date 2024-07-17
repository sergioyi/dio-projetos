package controller;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.AparelhoTelefonico;
import model.NavegadorInternet;
import model.ReprodutorMusical;
public class Controller {
	  public void exibir(){
		    System.out.println("Está no controller");
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Iniciando o Iphone");
		    System.out.println("Escolha uma das opções: \n1 - Telefone \n2 - Reprodutor Músical \n3 - Navegador");

		    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
		    AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
		    NavegadorInternet navegadorInternet = new NavegadorInternet();

		    try {
		      int opcao = scanner.nextInt();
		      System.out.println("opcao: " + opcao);
		      if (opcao == 1) {
		        System.out.println("Iniciando o Telefone");
		        System.out.println("Escolha uma das opções: \n1 - Ligar \n2 - Atender \n3 - iniciarCorreio de Voz");
		        int opcaotelefone = scanner.nextInt();
		        if (opcaotelefone == 1) {
		          System.out.println("Digite o número do telefone: ");
		          String numero = scanner.next();
		          aparelhoTelefonico.ligar(numero);          
		        } 
		        else if(opcaotelefone == 2){
		          aparelhoTelefonico.atender();
		        }
		        else if(opcaotelefone == 3){
		          aparelhoTelefonico.iniciarCorreioVoz();
		        }
		        else{
		          System.out.println("opção inválida");
		        }
		      } 
		      else if (opcao == 2) {
		        System.out.println("Iniciando o reprodutor músical");
		        System.out.println("Escolha uma das opções: \n1 - Selecionar Música \n2 - tocar \n3 - Pausar");
		        int opcaomusica = scanner.nextInt();
		        if(opcaomusica == 1){
		          System.out.println("Escolha a música: ");
		          String musica = scanner.next();
		          reprodutorMusical.selecionarMusica(musica);
		        }
		        if(opcaomusica == 2){
		          reprodutorMusical.tocar();
		        }
		        if(opcao == 3){
		          reprodutorMusical.pausar();
		        }
		      }
		      else if (opcao == 3) {
		        System.out.println("Iniciando o navegador");
		        System.out.println("Escolha uma das opções: \n1 - Exibir página \n2 - Adicionar nova \n3 - Atualizar página");
		        int opcaoNavegador = scanner.nextInt();
		        if(opcaoNavegador == 1){
		          System.out.println("Digite a url: ");
		          String url = scanner.next();
		          navegadorInternet.exibirPagina(url);
		        }
		        else if(opcaoNavegador == 2){
		        navegadorInternet.adicionarNovaAba();
		        }
		      else if(opcaoNavegador == 3){
		        navegadorInternet.atualizarPagina();
		      } else {
		        System.out.println("Opção invalida !");
		      }
		    } 
		    }catch (InputMismatchException erro) {
		      throw new InputMismatchException("ERRO: não pode colocar letras apenas números " + erro);
		  }
		}
}
