package br.edu.ifpb.ads.padroes.atv1.interfaces;

/**
 * Interface que abstrai um canal de notificação.
 * Um canal de notificação pode ser: SMS, Email, Push Notification, etc
 * */
public interface ChanelNotification {

    /**
     * Metodo responsavel por enviar determinada notificação
     *
     * @param message mensagem que será exibida em tela
     * */
    public void sendNotification(String message);
}
