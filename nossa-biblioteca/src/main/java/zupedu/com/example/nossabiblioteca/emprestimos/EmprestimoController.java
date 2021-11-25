package zupedu.com.example.nossabiblioteca.emprestimos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    @PostMapping
    public ResponseEntity<EmprestimoResponse> insert(@RequestBody @Valid EmprestimoRequest request) {

        Emprestimo emprestimo = request.toModel();
        emprestimoRepository.save(emprestimo);

        return ResponseEntity.ok(new EmprestimoResponse(emprestimo.getId()));


    }
}
