public class Main {

    public static void main(String[] args) {

        Livro pequenoPrincipe = new Livro("Pequeno Príncipe", " Antoine de Saint-Exupéry", 1943, true);
        Livro domQuixote = new Livro("Dom Quixote", "Miguel de Cervantes", 1605,  false);
        Livro aArteDaGuerra = new Livro("A Arte da Guerra", "Sun Tzu", 1996, true);


        Copiadora copia = new Copiadora();

        copia.copiarLivro(pequenoPrincipe, 11);

        //System.out.println(pequenoPrincipe.getNome());


        Prateleira prateleira = new Prateleira("Literatura");
        prateleira.adicionarLivro(domQuixote);
        prateleira.adicionarLivro(aArteDaGuerra);
        prateleira.adicionarLivro(pequenoPrincipe);

        //prateleira.removerLivro(domQuixote);

        Atendente atendente = new Atendente();
        atendente.emprestarLivro(prateleira, "Dom Quixote");

        System.out.println("Livros na prateleira:");
        for (Livro livro : prateleira.getLivros()) {
            System.out.println("Nome: " + livro.getNome() + " - Disponível: " + (livro.isDisponibilidade() ? "Sim" : "Não"));
        }

    }
}