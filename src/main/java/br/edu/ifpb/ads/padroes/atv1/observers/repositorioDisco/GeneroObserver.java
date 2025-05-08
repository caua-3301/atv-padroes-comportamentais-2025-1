package br.edu.ifpb.ads.padroes.atv1.observers.repositorioDisco;

import br.edu.ifpb.ads.padroes.atv1.interfaces.ChanelNotification;
import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.interfaces.Observer;

public class GeneroObserver implements Observer {
    ChanelNotification chanel;

    public GeneroObserver(ChanelNotification chanel) {
        this.chanel = chanel;
    }

    @Override
    public void update(Disco disco) {
        String message = """
                    Um disco do gênero %s acaba de ser registrado
                    """.formatted(disco.getGenero());

        chanel.sendNotification(message);
    }
}
