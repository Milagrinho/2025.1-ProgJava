
package br.estacio.polimorfismo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Juca", "juca@email.com", "12345");
        Pessoa p2 = new Pessoa("Mara", "mara@email.com", "98765");
        Pessoa p3 = new Pessoa("Juca", "juca@email.com", "12345");
        Pessoa p4 = new Pessoa("Maria", "maria@email.com", "12345");
        
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
        
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        
        Set<Pessoa> colecao = new HashSet<>();
        //List<Pessoa> colecao = new ArrayList<>();
        
        colecao.add(p1);
        colecao.add(p2);
        colecao.add(p3);
        colecao.add(p4);
        
        for (Pessoa pessoa : colecao) {
            System.out.println(pessoa.hashCode());
        }
    }
}
