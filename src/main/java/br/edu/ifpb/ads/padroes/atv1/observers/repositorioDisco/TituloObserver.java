package br.edu.ifpb.ads.padroes.atv1.observers.repositorioDisco;

import br.edu.ifpb.ads.padroes.atv1.interfaces.ChanelNotification;
import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.interfaces.Observer;

public class TituloObserver implements Observer {
    ChanelNotification chanel;

    public TituloObserver(ChanelNotification chanel) {
        this.chanel = chanel;
    }
    @Override
    public void update(Disco disco) {
        String message = """
                    O disco %s acaba de ser registrado
                    """.formatted(disco.getTitulo());

        chanel.sendNotification(message);
    }
}