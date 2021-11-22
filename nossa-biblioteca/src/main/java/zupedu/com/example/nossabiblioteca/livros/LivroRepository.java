package zupedu.com.example.nossabiblioteca.livros;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    //para saber se existe ou na o valor (optional, valor optional) valores que podem ser nulos.
    Optional<Livro> findByIsbn(String isbn);

}
