package zupedu.com.example.nossabiblioteca.livros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/livros")
public class CadastroLivroController {


        @Autowired
        private  LivroRepository livroRepository;


        @PostMapping
        public ResponseEntity<LivroResponse> insert(@RequestBody @Valid LivroRequest request) {

            Livro livro = request.toModel();
            livroRepository.save(livro);

            return ResponseEntity.ok(new LivroResponse(livro));

        }
}
