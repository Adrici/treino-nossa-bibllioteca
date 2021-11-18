package zupedu.com.example.nossabiblioteca.livros;

import zupedu.com.example.nossabiblioteca.utils.UniqueValue;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class LivroRequest {

    @NotBlank
    @Column(nullable = false)
    private String titulo;

    @NotNull
    @Column(nullable = false)
    private BigDecimal preco;

    @UniqueValue(domainClass = Livro.class, fieldName = "isbn")
    private String ibsn;

    public LivroRequest(String titulo, BigDecimal preco, String ibsn) {
        this.titulo = titulo;
        this.preco = preco;
        this.ibsn = ibsn;
    }

    public String getTitulo() {
        return titulo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getIbsn() {
        return ibsn;
    }

    public Livro toModel(){

        return new Livro(this.titulo, this.preco, this.ibsn);
    }
}
