package LojaBolos.Controller;

import java.util.ArrayList;
import java.util.List;

import LojaBolos.Repository.Bolo;
import LojaBolos.Repository.BoloRepository;

public class BoloController implements BoloRepository {
    private List<Bolo> bolos = new ArrayList<>();
    private List<Bolo> bolosRemovidos = new ArrayList<>();
    private static int nextId = 1;

    @Override
    public void adicionarBolo(Bolo bolo) {
        bolo.setId(nextId++);
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
            bolosRemovidos.add(boloExistente);
            System.out.println("Bolo removido: " + boloExistente);
        } else {
            System.out.println("Bolo não encontrado.");
        }
    }

    public List<Bolo> listarBolosRemovidos() {
        return bolosRemovidos;
    }

    public void restaurarBolo(int id) {
        Bolo boloRemovido = bolosRemovidos.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
        if (boloRemovido != null) {
            bolosRemovidos.remove(boloRemovido);
            bolos.add(boloRemovido);
            System.out.println("Bolo restaurado: " + boloRemovido);
        } else {
            System.out.println("Bolo não encontrado na lista de bolos removidos.");
        }
    }
}

