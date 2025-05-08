package br.edu.ifpb.ads.padroes.atv1.display.chanel;

import br.edu.ifpb.ads.padroes.atv1.interfaces.ChanelNotification;

public class SMSChanel  implements ChanelNotification {
    @Override
    public void sendNotification(String message) {
        String out = """
                    Enviando via SMS para 4002-8922, buscando sinal e enviando: %s
                    """.formatted(message);

        System.out.println(out);
    }
}