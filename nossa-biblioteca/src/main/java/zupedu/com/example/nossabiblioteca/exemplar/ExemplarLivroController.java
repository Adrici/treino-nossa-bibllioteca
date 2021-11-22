package zupedu.com.example.nossabiblioteca.exemplar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import zupedu.com.example.nossabiblioteca.livros.CadastroLivroController;
import zupedu.com.example.nossabiblioteca.livros.Livro;
import zupedu.com.example.nossabiblioteca.livros.LivroRepository;
import zupedu.com.example.nossabiblioteca.livros.LivroRequest;

@RestController
@RequestMapping("/exemplares")
public class ExemplarLivroController {

    @Autowired
    private ExemplarRepository exemplarrepository;
    @Autowired
    private LivroRepository livroRepository;

  @PostMapping("/{isbn}")
  public ResponseEntity<ExemplarLivroResponse> insert ( @PathVariable String isbn,  @RequestBody ExemplarLivroRequest request){
      Livro livro = livroRepository.findByIsbn(isbn).orElseThrow(() -> new ResponseStatusException(
              HttpStatus.NOT_FOUND, "Livro não cadastrado no sistema"));
      ExemplarLivro exemplar = request.toModel(exemplarrepository, livro);
      exemplarrepository.save(exemplar);
      return ResponseEntity.status(201).build();
  }


}

