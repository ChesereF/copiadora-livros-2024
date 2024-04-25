public class Livro {

    private  String nome;
    private String autor;
    private int ano;
    private  boolean disponibilidade;


    public Livro(String nome, String autor, int ano, boolean disponibilidade) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.disponibilidade = true;
    }


    public String getNome() {

        return nome;
    }

    public String getAutor() {

        return autor;
    }

    public int getAno() {

        return ano;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setAno(int ano) {

        this.ano = ano;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public void setDisponibilidade(boolean disponibilidade) {

        this.disponibilidade = disponibilidade;
    }
}

