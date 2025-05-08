package br.edu.ifpb.ads.padroes.atv1.observers.repositorioDisco;

import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.interfaces.ChanelNotification;
import br.edu.ifpb.ads.padroes.atv1.interfaces.Observer;

/**
 * Classe concreta que implementa um observer, seu objetivo
 * é realizar operações em cima do título de um disco
 * */
public class ArtistaObserver implements Observer {
    ChanelNotification chanel;

    public ArtistaObserver(ChanelNotification chanel) {
        this.chanel = chanel;
    }

    @Override
    public void update(Disco disco) {
        String message = """
                    Um disco do %s acaba de ser registrado
                    """.formatted(disco.getArtista());

        chanel.sendNotification(message);
    }
}
