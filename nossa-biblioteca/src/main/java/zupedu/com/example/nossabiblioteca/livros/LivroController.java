package zupedu.com.example.nossabiblioteca.livros;


import javax.transaction.Transactional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private  LivroRepository livroRepository;


    @PostMapping
    @Transactional
    public ResponseEntity<LivroResponse> insert(@RequestBody @Valid LivroRequest request) {

       Livro livro = request.toModel();
        livroRepository.save(livro);

        return ResponseEntity.ok(new LivroResponse(livro));

    }
}
