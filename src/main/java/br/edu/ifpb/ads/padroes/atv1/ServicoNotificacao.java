package br.edu.ifpb.ads.padroes.atv1;

/**
 * Classe responsável por enviar notificações.
 */
public class ServicoNotificacao {

    public void enviarNotificacao(String canal, String message) {
        switch (canal.toLowerCase()) {
            case "email" -> System.out.println("Enviando EMAIL: " + message);
            case "sms" -> System.out.println("Enviando SMS: " + message);
            case "push" -> System.out.println("Enviando PUSH NOTIFICATION: " + message);
            default -> System.out.println("Canal de notificação desconhecido.");
        }
    }

}
