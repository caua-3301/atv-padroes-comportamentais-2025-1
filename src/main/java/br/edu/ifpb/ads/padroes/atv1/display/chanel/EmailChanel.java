package br.edu.ifpb.ads.padroes.atv1.display.chanel;

import br.edu.ifpb.ads.padroes.atv1.interfaces.ChanelNotification;

public class EmailChanel implements ChanelNotification {
    @Override
    public void sendNotification(String message) {
        String out = """
                    Enviando via Email: %s
                    """.formatted(message);

        System.out.println(out);
    }
}
