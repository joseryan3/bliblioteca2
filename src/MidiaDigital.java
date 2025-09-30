public class MidiaDigital extends ItemAcervo {
    private String formato;

    public MidiaDigital(String titulo, String autor, int ano, String formato) {
        super(titulo, autor, ano);
        this.formato = formato;
    }

    @Override
    public String fichaCatalografica() {
        return "Mídia Digital: " + titulo + ", " + autor + ", " + ano + ". Formato: " + formato;
    }
}
