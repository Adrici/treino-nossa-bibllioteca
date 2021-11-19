package zupedu.com.example.nossabiblioteca.exemplar;

import zupedu.com.example.nossabiblioteca.livros.Livro;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

public class ExemplarLivro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;


    @NotBlank
    @Column(nullable = false)
    private String isbn;

    @Enumerated(EnumType.STRING)
    private  TipoCirculacaoExemplar exemplar;

    @ManyToOne(optional = false)
    private Livro livro;

    public ExemplarLivro( String isbn, TipoCirculacaoExemplar exemplar, Livro livro) {

        this.isbn = isbn;
        this.exemplar = exemplar;
        this.livro = livro;
    }

    @Deprecated
    public ExemplarLivro(){

    }

    public String getId() {
        return id;
    }


    public String getIsbn() {
        return isbn;
    }

    public TipoCirculacaoExemplar getExemplar() {
        return exemplar;
    }

    public Livro getLivro() {
        return livro;
    }
}
