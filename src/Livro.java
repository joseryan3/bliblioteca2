public class Livro extends ItemAcervo  {
    private int paginas;

    public Livro(String titulo, String autor, int ano, int paginas) {
        super(titulo, autor, ano);
        this.paginas = paginas;
    }


    public void reservar() {
        System.out.println("Livro \"" + titulo + "\" reservado com sucesso.");
    }

    @Override
    public String fichaCatalografica() {
        return "Livro: " + titulo + ", " + autor + ", " + ano + ". " + paginas + " páginas.";
    }
}
