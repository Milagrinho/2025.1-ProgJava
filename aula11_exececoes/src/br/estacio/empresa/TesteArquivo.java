
package br.estacio.empresa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 *
 * @author aluno
 */
public class TesteArquivo {
    public static void main(String[] args) {
        File caminho = new File("C://programas3.txt");
        FileReader arquivo = null;
        try{
            arquivo = new FileReader(caminho);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }finally{
            System.out.println("Fim do programa [FINALLY]");
        }
        System.out.println("Fim do programa");
    }
}
