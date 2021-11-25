package zupedu.com.example.nossabiblioteca.emprestimos;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import zupedu.com.example.nossabiblioteca.exemplar.ExemplarLivro;
import zupedu.com.example.nossabiblioteca.livros.Livro;
import zupedu.com.example.nossabiblioteca.livros.LivroRepository;
import zupedu.com.example.nossabiblioteca.usuario.Usuario;
import zupedu.com.example.nossabiblioteca.usuario.UsuarioRepository;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Optional;

public class EmprestimoRequest {

    @Max(60)
    @Positive
    private int tempoEmprestimoDias;

    private Long usuarioId;

    private Long livroId;


    public Emprestimo toModel(UsuarioRepository usuarioRepository, LivroRepository livroRepository) {
        Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);
        if (usuario.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        Optional<Livro> livro = livroRepository.findById(livroId);
        if (livro.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }


        return new Emprestimo(tempoEmprestimoDias);

    }
}