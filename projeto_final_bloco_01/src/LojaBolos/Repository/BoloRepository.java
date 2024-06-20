package LojaBolos.Repository;

import java.util.List;

public interface BoloRepository {
    void adicionarBolo(Bolo bolo);
    List<Bolo> listarBolos();
    List<Bolo> listarBolosForaDeEstoque();
    Bolo buscarBoloPorId(int id);
    void atualizarBolo(Bolo bolo);
    void removerBolo(int id);
}
