package zupedu.com.example.nossabiblioteca.emprestimos;

import zupedu.com.example.nossabiblioteca.exemplar.ExemplarLivro;
import zupedu.com.example.nossabiblioteca.usuario.Usuario;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Max(60)
    @Column(nullable = false)
    private int tempoEmprestimoDias;

    @Column(nullable = false)
    private LocalDate dataEmprestimo = LocalDate.now();

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;

    @ManyToOne
    private ExemplarLivro exemplarLivro;

    public Emprestimo( int tempoEmprestimoDias, LocalDate dataEmprestimo, Usuario usuario, ExemplarLivro exemplarLivro) {
        this.tempoEmprestimoDias = tempoEmprestimoDias;
        this.dataEmprestimo = dataEmprestimo;
        this.usuario = usuario;
        this.exemplarLivro = exemplarLivro;
    }
    @Deprecated
    public Emprestimo(){

    }

    public Long getId() {
        return id;
    }

    public int getTempoEmprestimoDias() {
        return tempoEmprestimoDias;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ExemplarLivro getExemplarLivro() {
        return exemplarLivro;
    }
}
