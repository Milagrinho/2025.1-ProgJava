
package br.estacio.loja;

public interface IAtualizavel {
    //Até o java 1.7 eram permitados apenas métodos abstratos em interfaces
    public abstract void atualizaVersao(String versao);
}
