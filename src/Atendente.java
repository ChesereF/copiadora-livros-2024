public class Atendente {

    private String nome;

    public boolean emprestarLivro(Prateleira prateleira, String nomeLivro) {
        return prateleira.emprestarLivro(nomeLivro);
    }

    public boolean devolverLivro(Prateleira prateleira, String nomeLivro) {
        return prateleira.devolverLivro(nomeLivro);
    }

}
