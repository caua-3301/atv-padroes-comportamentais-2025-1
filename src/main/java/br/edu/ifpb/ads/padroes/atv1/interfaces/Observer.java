package br.edu.ifpb.ads.padroes.atv1.interfaces;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;

/**
 * Interface que abstrai as classes que observam/tem interesse
 * em outras
 * */
public interface Observer {

    /**
     * Metodo responsável pela execução do comportamento
     * do observer quando este observar uma modificação
     * em um subject
     *
     * @param disco O disco em que a operação foi realizada
     * */
    public void update(Disco disco);

}
