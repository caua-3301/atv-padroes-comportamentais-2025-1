package br.edu.ifpb.ads.padroes.atv1.display.chanel;

import br.edu.ifpb.ads.padroes.common.GenericDate;
import br.edu.ifpb.ads.padroes.atv1.interfaces.ChanelNotification;

public class PushNotfChanel  implements ChanelNotification {
    @Override
    public void sendNotification(String message) {
        String out = """
                    Log server - %s: %s
                    """.formatted(GenericDate.getCurrentDate(), message);

        System.out.println(out);
    }

}
