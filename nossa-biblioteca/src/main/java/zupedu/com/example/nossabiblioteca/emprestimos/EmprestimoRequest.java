package zupedu.com.example.nossabiblioteca.emprestimos;

import zupedu.com.example.nossabiblioteca.exemplar.ExemplarLivro;
import zupedu.com.example.nossabiblioteca.usuario.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class EmprestimoRequest {
    @NotNull
    @Max(60)
    private int tempoEmprestimoDias;


    private LocalDate dataEmprestimo = LocalDate.now();

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;

    @ManyToOne
    private ExemplarLivro exemplarLivro;


    public EmprestimoRequest(int tempoEmprestimoDias, LocalDate dataEmprestimo, Usuario usuario, ExemplarLivro exemplarLivro) {
        this.tempoEmprestimoDias = tempoEmprestimoDias;
        this.dataEmprestimo = dataEmprestimo;
        this.usuario = usuario;
        this.exemplarLivro = exemplarLivro;
    }

    public int getTempoEmprestimoDias() {
        return tempoEmprestimoDias;
    }

    public LocalDate getDataEmprestimo() {,
        return dataEmprestimo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ExemplarLivro getExemplarLivro() {
        return exemplarLivro;
    }

    public Emprestimo toModel() {
        return new Emprestimo(tempoEmprestimoDias, dataEmprestimo,usuario, exemplarLivro);
    }
}
