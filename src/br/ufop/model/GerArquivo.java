package br.ufop.model;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;

/** Classe onde estarão os metodos para leitura e escrita em arquivo (entrada e saída).
    * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839 / Leonardo Oliveira 12.2.8343
    * @version 1.0
    * @since 03/12/2017
*/
public class GerArquivo {
	private static BufferedReader read;
	/*
	* @param String de entrada(caminho do arquivo)
	* @return verificar se vazio
	*/
	
// Lê linha por linha do arquivo path;

    /**
     *
     * @param Caminho
     * @return String
     * @throws IOException
     */
	public static String Read(String Caminho){
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n\r";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Caminho Invalido, tente novamente!");
            return "";
        }
    }
    /**
     * 
     * @param Caminho
     * @param Texto
     * @return 
     */
    public static boolean Write(String Caminho,String Texto){
        try {
            FileWriter arq = new FileWriter(Caminho);
            try (PrintWriter gravarArq = new PrintWriter(arq)) {
                gravarArq.write(Texto);
                gravarArq.println();
            }
            arq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    /**
     * 
     * @param Caminho
     * @param Texto
     * @return 
     */
    public static boolean WriteTag(String Caminho,String Texto){
        try {
            FileWriter arq = new FileWriter(Caminho);
            try (PrintWriter gravarArq = new PrintWriter(arq)) {
                gravarArq.write(Texto);
                gravarArq.println();
            }
            arq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    /**
     * 
     * @param Caminho
     * @param Texto
     * @param tamanho
     * @return 
     */
    public static boolean WriteTagVet(String Caminho,String Texto[], int tamanho){
        try {
            FileWriter arq = new FileWriter(Caminho);
            try (PrintWriter gravarArq = new PrintWriter(arq)) {
                for(int i=0; i<tamanho; i++){
                    gravarArq.write(Texto[i]);
                    gravarArq.println();
                }
            }
            arq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
