package exercicioextra_desafio_usuariosistema;

public class UsuarioSistema {

    private String nome;
    private String email;
    private String senha;
    private String nivelAcesso;

    public UsuarioSistema(String nome, String email, String senha, String nivelAcesso) {
        this.nome = nome;
        this.email = email;
        setSenha(senha); 
        this.nivelAcesso = nivelAcesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public void setSenha(String senha) {
        if (senha != null && senha.length() >= 6) {
            this.senha = senha;
        } else {
            System.out.println("Senha inválida! Deve ter pelo menos 6 caracteres.");
        }
    }
      
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }
}
