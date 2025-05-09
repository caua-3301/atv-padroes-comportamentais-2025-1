package br.edu.ifpb.ads.padroes.atv1.app;

import br.edu.ifpb.ads.padroes.atv1.display.chanel.EmailChanel;
import br.edu.ifpb.ads.padroes.atv1.display.chanel.PushNotfChanel;
import br.edu.ifpb.ads.padroes.atv1.display.chanel.SMSChanel;
import br.edu.ifpb.ads.padroes.atv1.interfaces.ChanelNotification;
import br.edu.ifpb.ads.padroes.atv1.model.Disco;
import br.edu.ifpb.ads.padroes.atv1.repository.RepositorioDiscos;
import br.edu.ifpb.ads.padroes.atv1.interfaces.Observer;
import br.edu.ifpb.ads.padroes.atv1.observers.repositorioDisco.GeneroObserver;
import br.edu.ifpb.ads.padroes.atv1.observers.repositorioDisco.TituloObserver;

/**
 * Inicializa a aplicação
 * */
public class Main {
    public static void main(String[] args) {

        //instanciando um repositorio
        RepositorioDiscos discosRep = new RepositorioDiscos();

        //instanciando um disco qualquer
        Disco disco = new Disco("Cauã", "Nascer... Morrer", "MPB", 2025);

        //canais a serem utilizados pelos observadores
        ChanelNotification emailChanel = new EmailChanel();
        ChanelNotification pushNotfChanel = new PushNotfChanel();
        ChanelNotification SMLChanel = new SMSChanel();

        //criando dois observadores e logo em seguido adicionando eles ao meu repositorio
        Observer observerDisco = new TituloObserver(pushNotfChanel);
        Observer observerGenero = new GeneroObserver(emailChanel);

        //criando um mesmo interessado com um canal diferente
        Observer observerDiscoViaSMS = new TituloObserver(SMLChanel);

        discosRep.addObserver(observerDisco);
        discosRep.addObserver(observerGenero);
        discosRep.addObserver(observerDiscoViaSMS);

        //persistindo um disco e consequentemente acionando os observadores
        discosRep.addDisco(disco);
    }
}
