import java.util.ArrayList;
import java.util.List;

public class Copiadora {
    public List<Livro> copiarLivro(Livro livro, int quantidadeCopias) {

        List<Livro> copiar = new ArrayList<>();

        for(int i = 0; i <= quantidadeCopias; i++) {
            copiar.add(new Livro(livro.getNome(), livro.getAutor(), livro.getAno(), livro.isDisponibilidade()));

        }

        return copiar;

        }


}
