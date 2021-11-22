package zupedu.com.example.nossabiblioteca.exemplar;


import zupedu.com.example.nossabiblioteca.livros.Livro;

import javax.persistence.*;


@Entity
public class ExemplarLivro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING) //vinculada a Entidade
    private  TipoCirculacaoExemplar exemplar;

    @ManyToOne(optional = false)
    private Livro livro;

    public ExemplarLivro(TipoCirculacaoExemplar exemplar, Livro livro) {

        this.exemplar = exemplar;
        this.livro = livro;
    }

    @Deprecated
    public ExemplarLivro(){

    }

    public Long getId() {
        return id;
    }


    public TipoCirculacaoExemplar getExemplar() {
        return exemplar;
    }

    public Livro getLivro() {
        return livro;
    }
}
