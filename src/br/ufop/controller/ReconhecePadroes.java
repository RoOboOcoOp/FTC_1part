package br.ufop.controller;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import java.util.ArrayList;
import jdk.nashorn.internal.runtime.regexp.joni.Matcher;
/** Classe que contem as estruturas e metodos para reconhecer os padrões das expressões regulares
 * usadas na String de entrada do usuario.
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839
 * @version 0.01
 * @since 04/07/2017
 */

public class ReconhecePadroes {
    //Reconhece os padores (tags), implementa tratamentos e execeções das TAGS informadas pelo usuário
    
   /*
    public ArrayList<String> reconheTag(ArrayList<String> Array){
        //compara cada "tag" identificada no array com as "tags" padroes do sistema e retorna um array com as tags nas posições corretas
        ArrayList<String> ArrayListTag = null;
        return ArrayListTag;
    }
    
    public String VAR(String string) {
        String VAR = "";
        Pattern pattern = Pattern.compile("[a-z][z-a]*[A-Z][Z-A]*[0-9][9-0]*");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            VAR += matcher.group();
        }
        return VAR;
    }

    public String INT(String string) {
        String INT = "";
        Pattern pattern = Pattern.compile("[0-9][9-0]*");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            INT += matcher.group();
        }
        return INT;
    }

    public String EQUALS(String string) {
        String EQUALS = "";
        Pattern pattern = Pattern.compile("[=]");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            EQUALS += matcher.group();
        }
        return EQUALS;
    }

    public String SPACE(String string) {
        String SPACE = "";
        Pattern pattern = Pattern.compile("[ ]");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            SPACE += matcher.group();
        }
        return SPACE;
    }

    public String COMMENT(String string) {
        String COMMENT = "";
        Pattern pattern = Pattern.compile("[\\*a-z][z-a]*[A-Z][Z-A]*[0-9][9-0\\*]*");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            COMMENT += matcher.group();
        }
        return COMMENT;
    }
*/
   
}
