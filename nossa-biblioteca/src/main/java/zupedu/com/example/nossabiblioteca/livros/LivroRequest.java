package zupedu.com.example.nossabiblioteca.livros;

import org.hibernate.validator.constraints.ISBN;
import zupedu.com.example.nossabiblioteca.utils.UniqueValue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class LivroRequest {
    @NotBlank
    private String titulo;

    @NotNull
    @Positive
    private BigDecimal preco;

    @UniqueValue(domainClass = Livro.class, fieldName = "isbn")
    @NotBlank
    @ISBN
    private String isbn;

    public LivroRequest(String titulo, BigDecimal preco, String isbn) {
        this.titulo = titulo;
        this.preco = preco;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getIbsn() {
        return isbn;
    }

    public Livro toModel(){

        return new Livro(this.titulo, this.preco, this.isbn);
    }
}
