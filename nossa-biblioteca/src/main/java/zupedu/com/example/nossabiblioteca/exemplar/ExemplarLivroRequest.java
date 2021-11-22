package zupedu.com.example.nossabiblioteca.exemplar;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import zupedu.com.example.nossabiblioteca.livros.Livro;

public class ExemplarLivroRequest {

    @JsonProperty
    private  TipoCirculacaoExemplar exemplar;

    @JsonCreator //no momento da criação do objeto vai por a variavel la dentro
    public ExemplarLivroRequest(TipoCirculacaoExemplar exemplar) {
        this.exemplar = exemplar;
    }


    public ExemplarLivro toModel(ExemplarRepository exemplarrepository, Livro livro) {

        return new ExemplarLivro(exemplar, livro);

    }
}
