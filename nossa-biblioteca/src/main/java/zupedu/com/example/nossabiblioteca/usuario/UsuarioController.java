package zupedu.com.example.nossabiblioteca.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<UsuarioResponse> insert(@RequestBody @Valid UsuarioRequest request) {

        Usuario usuario = request.toModel();
        usuarioRepository.save(usuario);

        return ResponseEntity.ok(new UsuarioResponse(usuario.getId()));

    }
}
