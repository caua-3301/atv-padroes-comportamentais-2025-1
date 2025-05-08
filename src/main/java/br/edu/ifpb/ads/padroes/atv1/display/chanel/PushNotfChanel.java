package br.edu.ifpb.ads.padroes.atv1.display.chanel;

import br.edu.ifpb.ads.padroes.atv1.interfaces.ChanelNotification;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PushNotfChanel  implements ChanelNotification {
    @Override
    public void sendNotification(String message) {
        String out = """
                    Log server - %s: %s
                    """.formatted(getCurrentDateFormated(), message);

        System.out.println(out);
    }

    /**
     * Metodo responsável pela obtenção da data atual no formado dd/MM/yyyy
     *
     * @return String com a data atual
     * */
    private String getCurrentDateFormated() {
        LocalDate currentDate = LocalDate.now();

        return currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
