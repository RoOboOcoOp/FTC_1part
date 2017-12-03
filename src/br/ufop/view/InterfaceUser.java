package br.ufop.view;

import br.ufop.controller.Tag;
import static br.ufop.model.GerArquivo.Read;
import static br.ufop.model.GerArquivo.WriteTag;
import static br.ufop.model.GerArquivo.WriteTagVet;
import java.io.IOException;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Interface gerenciadora com o usuario onde estão contidos as opções do menu.
 *
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839
 * @version 0.01
 * @since 04/07/2017
 */
public class InterfaceUser {

    private static Scanner ler;

    /**
     *@param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //variaveis globais 
        boolean exit = false;
        String inicial;
        //List<String> inicial = new ArrayList<String>();

        //entradas do usuário
        System.out.println("------\t Informe a entrada \t-----------");
        ler = new Scanner(System.in);
        inicial = ler.nextLine();
        //Entrada tagUsuario = new Entrada(); 
        EntradaUsuario entradaUser = new EntradaUsuario();
        
        /*System.out.println(tagDivida);*/
        
        
        do {
            String menu = null;
            System.out.println("------\t ANALISADOR de TAGS \t------");
            System.out.println(":f - Realizar divisão em tags da string do arquivo informado;");
            System.out.println(":l - Carregar um arquivo com definições de tags;");
            System.out.println(":o - Especificar o caminho do arquivo de saída para a divisão em tags;");
            System.out.println(":p - Realizar divisão em tags da entrada informada;");
            System.out.println(":s - Salvar as tags;");
            System.out.println(":t - Imprimir Tags válidas;");
            System.out.println(":s - Salvar as tags.");
            System.out.println(":q - Sair do programa.\n");

            while (menu == null) {
                System.out.print("\nEntre com o comando:\n");
                menu = ler.next();
            }

            switch (menu) {
                case ":f": {
                    /**
                     * Realiza a divisão em tags da string do arquivo informado
                     *
                     */
                    String caminho;

                    System.out.println("------\t Realizar divisão em tags, da string do arquivo informado \t------");
                    System.out.println("Opção/Funcionalidade disponível versão 1 do trabalho!!!");
                    System.out.println("Informe o caminho do arquivo:");
                    caminho = ler.next();

                    /*
                     Passa o caminho do arquivo com a string como parametro para o metodo de divisão das tags.
                     */
                    String arq = ("\\input.txt");

                    if (!WriteTag(caminho + arq, inicial)) {
                        System.out.println("[ERRO] Arquivo não foi salvo!");
                    } else {
                        System.out.println("[INFO]Arquivo salvo com sucesso!");
                    }
                }
                break;
                case ":l": {
                    /**
                     * Carrega um arquivo "tags.lex" com definições de tags
                     */
                    String caminho;

                    System.out.println("------\t Carregar um arquivo \"tags.lex\" com definições de tags \t------");
                    System.out.println("Opção/Funcionalidade disponível versão 1 do trabalho!!!");

                    System.out.println("Informe o caminho do arquivo:");
                    caminho = ler.next();
                        if(caminho==null){
                            System.out.println("[WARNING] Informe um caminho válido para o arquivo");
                        }
                    
                    String arq;
                    arq = Read(caminho);
                    if(arq==null){
                        System.out.println("[ERRO] As definições de tags não foram carregadas");
                    }
                    System.out.println(arq);
                        System.out.println("[INFO] As definições de tags não foram carregadas");

                }
                break;
                case ":o": {
                    /**
                     * Especifica o caminho do arquivo de saída "output.txt"
                     * para a divisão em tags;
                     */
                    String caminho;

                    System.out.println("------\t Especifica o caminho do arquivo de saída \"output.txt\" para a divisão em tags \t------");
                    System.out.println("Opção/Funcionalidade disponível versão 1 do trabalho!!!");
                    System.out.println("Informe o caminho do arquivo:");
                    
                    caminho = ler.next();
                         if(caminho==null){
                            System.out.println("[WARNING] Informe um caminho válido para o arquivo");
                        }
                    if (WriteTag(caminho + "\\output.txt", "Escrevendo arquivo....")) {
                        System.out.println("[INFO] Arquivo foi salvo com sucesso!");
                    } else {
                        System.out.println("[ERRO] Ao salvar o arquivo!");
                    }

                }
                break;
                case ":p": {
                    /**
                     * Realiza a divisão em tags da STRING informada, metodo
                     * implementado pelo Controler (Gerenciador) metodo
                     * responsável comparaTags(string);
                     */
                    String[] retorno_entrada;
                    System.out.println("------\t Realiza a divisão em tags da entrada do usuario \t-------");
                    retorno_entrada = entradaUser.identificaTag(inicial);
                    
                    System.out.println("[INFO]Saída se entrada de usuário é uma TAG: " + Arrays.toString(retorno_entrada));
                    //System.out.println("Tags inforomadas divididas com sucesso!!!\n");
                    //identificaTag(inicial);
                    
                }
                break;
                case ":t":{
                    /**
                     * Imprime todas as Tags validas, tanto as de arquivo quanto as inseridas
                     */
                    System.out.println("------\t Imprime as Tags válidas \t-------");
                    
                    break;
                }
                case ":q": {
                    /**
                     * Realiza a saída do programa
                     */
                }
                System.out.println("[INFO]Saindo do programa, obrigado pela visita!!!!");
                exit = true;
                break;
                case ":s": {
                    /**
                     * Salva as tags no arquivo "file.txt"
                     */
                    int tags_qtde = 0;
                    Scanner tag = new Scanner(System.in);
                    String caminho;
                    String tagVet[];

                    System.out.println("------\t Salva as tags no arquivo \"file.txt\" \t-------");
                    System.out.println("Informe a quantidade de tags");
                    tags_qtde = ler.nextInt();

                    System.out.println("Informe o caminho do arquivo");
                    caminho = ler.next();

                    tagVet = new String[tags_qtde];
    
                    for (int i = 0; i < tags_qtde; i++) {
                        System.out.println("Informe a " + (i + 1) + " tag :\t");
                        tagVet[i] = tag.nextLine();
                         
                    }
                            
                    System.out.println(Arrays.toString(tagVet));

                    if (WriteTagVet(caminho + "\\file.txt", tagVet, tags_qtde)) {
                        System.out.println("[INFO]Arquivo salvo com sucesso!");
                    } else {
                        System.out.println("[ERRO] ao salvar o arquivo!");
                    }
                }
                break;
                default:
                    System.out.println("[WARNING]O comando não pode ser reconhecido pelo menu!");
                    break;
            }

        } while (exit == false);
    }
}

   

