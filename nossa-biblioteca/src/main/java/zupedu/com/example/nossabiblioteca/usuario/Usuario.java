package zupedu.com.example.nossabiblioteca.usuario;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @NotBlank
    @Column(nullable = false)
    private TipoUsuario tipoUsuario;

    @Deprecated
    public Usuario() {
    }

    public Usuario(String nome, TipoUsuario tipoUsuario) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

}
