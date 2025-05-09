package br.edu.ifpb.ads.padroes.atv2.model;

import br.edu.ifpb.ads.padroes.atv2.interfaces.Visitor;

/**
 * A presente interface visa abastrair as entidades
 * que serão visitadas para execução de suas funcionalidades
 * */
public interface Item {

    /**
     * Metodo que recebe um visitor para que este
     * execute determinada tarefa
     *
     * @param visitor O visitante que executará determinado comportamento
     * */
    public void accept(Visitor visitor);

}
