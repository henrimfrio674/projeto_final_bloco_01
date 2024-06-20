package LojaBolos.Controller;

import java.util.ArrayList;
import java.util.List;

import LojaBolos.Repository.Bolo;
import LojaBolos.Repository.BoloRepository;

public class BoloController implements BoloRepository {
    private List<Bolo> bolos = new ArrayList<>();

    @Override
    public void adicionarBolo(Bolo bolo) {
        bolos.add(bolo);
        System.out.println("Bolo adicionado: " + bolo);
    }

    @Override
    public List<Bolo> listarBolos() {
        return bolos;
    }

    @Override
    public Bolo buscarBoloPorId(int id) {
        return bolos.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void atualizarBolo(Bolo bolo) {
        Bolo boloExistente = buscarBoloPorId(bolo.getId());
        if (boloExistente != null) {
            bolos.set(bolos.indexOf(boloExistente), bolo);
            System.out.println("Bolo atualizado: " + bolo);
        } else {
            System.out.println("Bolo não encontrado.");
        }
    }

    @Override
    public void removerBolo(int id) {
        Bolo boloExistente = buscarBoloPorId(id);
        if (boloExistente != null) {
            bolos.remove(boloExistente);
            System.out.println("Bolo removido: " + boloExistente);
        } else {
            System.out.println("Bolo não encontrado.");
        }
    }
}
