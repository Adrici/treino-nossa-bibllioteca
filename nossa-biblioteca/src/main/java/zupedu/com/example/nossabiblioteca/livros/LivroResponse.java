package zupedu.com.example.nossabiblioteca.livros;

import java.math.BigDecimal;

public class LivroResponse {
    private Long id;
    private String titulo;
    private BigDecimal preco;
    private String ibsn;


    public LivroResponse(Livro livro) {
        this.id = livro.getId();
        this.titulo = livro.getTitulo();
        this.preco = livro.getPreco();
        this.ibsn = livro.getIbsn();
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
