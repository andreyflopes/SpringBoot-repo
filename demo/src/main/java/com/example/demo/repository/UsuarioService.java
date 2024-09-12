

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.UsuarioEntity;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioEntity salvarUsuario(String nome, String email) {
        // Criando uma nova entidade
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setNome(nome);
        usuario.setEmail(email);
        
        Object jpaRepository;
        // Salvando no banco de dados usando o método save()
        return ((Object) jpaRepository).save(usuario);
    }
}