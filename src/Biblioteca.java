import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Membro> membros = new ArrayList<>();
    private ArrayList<ItemAcervo> acervo = new ArrayList<>();

    public void cadastrarMembro(String nome, int id) {
        membros.add(new Membro(nome, id));
    }

    public void adicionarItem(ItemAcervo item) {
        acervo.add(item);
    }

    public void exibirFichaCatalografica() {
        for (ItemAcervo item : acervo) {
            System.out.println(item.fichaCatalografica());
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Cadastro de membros
        biblioteca.cadastrarMembro("Alice", 1);
        biblioteca.cadastrarMembro("Bob", 2);

        // Adicionando itens
        biblioteca.adicionarItem(new Livro("Aprendendo Java", "João Silva", 2023, 250));
        biblioteca.adicionarItem(new Revista("Ciência Hoje", "Editora ABC", 2022, 12));
        biblioteca.adicionarItem(new MidiaDigital("Curso de Python", "Online Academy", 2024, "MP4"));

        // Exibindo fichas catalográficas
        biblioteca.exibirFichaCatalografica();
    }
}
