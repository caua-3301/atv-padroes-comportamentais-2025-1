package br.edu.ifpb.ads.padroes.atv1.repository;

import br.edu.ifpb.ads.padroes.atv1.interfaces.Observer;
import br.edu.ifpb.ads.padroes.atv1.interfaces.Subject;
import br.edu.ifpb.ads.padroes.atv1.model.Disco;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe responsável por gerenciar o repositório de discos.
 * Ela permite buscar discos por título, artista, gênero e ano de lançamento.
 * Além disso, permite adicionar e remover discos do repositório.
 */
public class RepositorioDiscos implements Subject {

    //Obervadores desta classe
    private List<Observer> observers;

    //Simulando uma base de dados
    private List<Disco> discos;

    public RepositorioDiscos() {
        observers = new LinkedList<>();
        discos = new LinkedList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(Disco disco) {
        observers.forEach(observer -> {
            observer.update(disco);
        });
    }

    //consulta discos com base no título ou parte dele
    public List<Disco> buscarDiscos(String titulo) {
        return discos.stream().filter(d -> d.getTitulo().toLowerCase()
                .contains(titulo.toLowerCase())).toList();
    }

    //consulta com base nop nome do artista
    public List<Disco> buscarDiscosPorArtista(String artista) {
        return discos.stream().filter(d -> d.getArtista().toLowerCase()
                .contains(artista.toLowerCase())).toList();
    }

    //consulta com base no gênero do disco
    public List<Disco> buscarDiscosPorGenero(String genero) {
        return discos.stream().filter(d -> d.getGenero().toLowerCase()
                .contains(genero.toLowerCase())).toList();
    }

    //consulta com base no ano de lançamento do disco
    public List<Disco> buscarDiscosPorAno(int ano) {
        return discos.stream().filter(d -> d.getAnoLancamento() == ano).toList();
    }

    //simula a persistência de um disco na base de dados
    public void addDisco(Disco disco) {
        discos.add(disco);
        notifyObservers(disco);
    }

    //simula a exclusão de um disco da base de dados
    public void removeDisco(Disco disco) {
        discos.remove(disco);
    }
}
