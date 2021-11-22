package zupedu.com.example.nossabiblioteca.usuario;

import javax.validation.constraints.NotBlank;

public class UsuarioRequest {
    @NotBlank
    private String nome;

    @NotBlank
    private TipoUsuario tipoUsuario;

    public UsuarioRequest(String nome, TipoUsuario tipoUsuario) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }


    public String getNome() {
        return nome;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public Usuario toModel() {
        return new Usuario(this.nome, this.tipoUsuario);
    }
}
