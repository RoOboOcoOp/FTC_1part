package br.ufop.controller;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//import  java.util.regex.PatternSyntaxException:


/** Classe para linguagem de definição das tags, implementa classe regex para construção das expressões regulares
 * @author Fabio Humberto de Carvalho 13.2.8398 / Wuldson Fernandes 12.1.839
 * @version 0.01
 * @since 04/07/2017
 */
public class ExpressoesTags {
    //Estruturas com os padroes de expressão regular, classes regex
   private final String INT = "[0-9][9-0]*";
   private final String VAR = "[a-z][z-a]*[A-Z][Z-A]*[0-9][9-0]*";
   private final String EQUALS = "[=]";
   private final String SPACE = "[ ]";
   private final String COMMENT = "[\\*a-z][z-a]*[A-Z][Z-A]*[0-9][9-0\\*]*";
}




