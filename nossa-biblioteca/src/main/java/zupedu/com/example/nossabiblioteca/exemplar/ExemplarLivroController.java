package zupedu.com.example.nossabiblioteca.exemplar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zupedu.com.example.nossabiblioteca.livros.CadastroLivroController;
import zupedu.com.example.nossabiblioteca.livros.LivroRepository;

@RestController
@RequestMapping("/exemplar")
public class ExemplarLivroController {

    @Autowired
    private ExemplarRepository exemplarrepository;
    @Autowired
    private CadastroLivroController livroRepository;

  @PostMapping
  public ResponseEntity<ExemplarLivroResponse> insert (@RequestBody ExemplarLivroRequest request){
      ExemplarLivro exemplar = request.toModel(exemplarrepository, livroRepository);
      exemplarrepository.save(exemplar);
      return ResponseEntity.status(201).build();
  }


}

