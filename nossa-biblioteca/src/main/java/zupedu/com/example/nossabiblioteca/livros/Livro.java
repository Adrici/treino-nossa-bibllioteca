package zupedu.com.example.nossabiblioteca.livros;

import org.hibernate.validator.constraints.ISBN;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
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
    
    @Column(nullable = false, unique = true)
    @ISBN
    private String isbn;

    @Deprecated
    public Livro(){

    }

    public Livro(String titulo, BigDecimal preco, String isbn) {
        this.titulo = titulo;
        this.preco = preco;
        this.isbn = isbn;
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
        return isbn;
    }

}
