public class Revista extends ItemAcervo {
    private int edicao;

    public Revista(String titulo, String autor, int ano, int edicao) {
        super(titulo, autor, ano);
        this.edicao = edicao;
    }

    @Override
    public String fichaCatalografica() {
        return "Revista: " + titulo + ", " + autor + ", " + ano + ". Edição: " + edicao;
    }
}
