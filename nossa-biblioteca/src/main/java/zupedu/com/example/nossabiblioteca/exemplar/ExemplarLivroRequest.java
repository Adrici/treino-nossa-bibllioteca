package zupedu.com.example.nossabiblioteca.exemplar;

import zupedu.com.example.nossabiblioteca.livros.CadastroLivroController;
import zupedu.com.example.nossabiblioteca.livros.Livro;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

public class ExemplarLivroRequest {
    @NotBlank
    @Column(nullable = false)
    private String isbn;

    @Enumerated(EnumType.STRING)
    private  TipoCirculacaoExemplar exemplar;

    public ExemplarLivroRequest(String isbn, TipoCirculacaoExemplar exemplar) {
        this.isbn = isbn;
        this.exemplar = exemplar;
    }

    public String getIsbn() {
        return isbn;
    }

    public ExemplarLivro toModel(ExemplarRepository exemplarrepository, CadastroLivroController livroRepository) {
        //criar a to model
        return null;

    }
}
