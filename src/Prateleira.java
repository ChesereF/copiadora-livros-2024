import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    private String categoria;
    private List<Livro> livros;

    public Prateleira(String categoria) {
        this.categoria = categoria;
        this.livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public Boolean emprestarLivro(String nomeLivro) {
        for (Livro livro : livros) {
            if (livro.getNome().equals(nomeLivro) && livro.isDisponibilidade()) {
                livro.setDisponibilidade(false);
                return true; // Livro emprestado com sucesso
            }
        }
        return false; // Livro não encontrado ou não disponível
    }

    public Boolean devolverLivro(String nomeLivro) {
        for (Livro livro : livros) {
            if (livro.getNome().equals(nomeLivro) && !livro.isDisponibilidade()) {
                livro.setDisponibilidade(true);
                return true; // Livro devolvido com sucesso
            }
        }
        return false; // Livro não encontrado ou já disponível
    }
}
