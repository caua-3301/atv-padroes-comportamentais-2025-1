package br.edu.ifpb.ads.padroes.atv1.interfaces;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;

/**
 * Interface responsável pela abstração das classes
 * que contém observadores/partes interessadas
 * */
public interface Subject {

    /**
     * Metodo que aciona um observer ao subject
     *
     * @param observer Observer a ser adiconado
     * */
    public void addObserver(Observer observer);

    /**
     * Metodo que aciona um observer ao subject
     *
     * @param observer Observer a ser removido
     * */
    public void removeObserver(Observer observer);

    /**
     * Metodo que notifica todos os interessados no
     * subject
     *
     * @param disco disco em que a operação foi realizada
     * */
    public void notifyObservers(Disco disco);

}
