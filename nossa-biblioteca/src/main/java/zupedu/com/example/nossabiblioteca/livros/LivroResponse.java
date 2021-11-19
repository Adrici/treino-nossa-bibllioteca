package zupedu.com.example.nossabiblioteca.livros;


public class LivroResponse {
    private Long id;



    public LivroResponse(Livro livro) {
        this.id = livro.getId();

    }

    public Long getId() {
        return id;
    }

}
