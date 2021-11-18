package zupedu.com.example.nossabiblioteca.livros;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String titulo;

    @NotNull
    @Column(nullable = false)
    private BigDecimal preco;

    //nao pode ser duplicado - Unique value
    private String ibsn;

   @Deprecated
    public Livro(){

    }

    public Livro(String titulo, BigDecimal preco, String ibsn) {
        this.titulo = titulo;
        this.preco = preco;
        this.ibsn = ibsn;
    }

    public Long getId() {
        return id;
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
}
