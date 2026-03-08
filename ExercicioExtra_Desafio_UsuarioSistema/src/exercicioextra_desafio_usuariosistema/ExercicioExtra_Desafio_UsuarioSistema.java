package exercicioextra_desafio_usuariosistema;

public class ExercicioExtra_Desafio_UsuarioSistema {

    public static void main(String[] args) {
        UsuarioSistema objusuario = new UsuarioSistema("Henrique Ibarra",
        "Henriqueortiz3090@gmail.com","123456","Dono");
        objusuario.setSenha("senhanova");  
        System.out.println("Nome: " + objusuario.getNome());
        System.out.println("Email: " + objusuario.getEmail());
        System.out.println("Senha: " + objusuario.getSenha());
        System.out.println("Nível de acesso: " + objusuario.getNivelAcesso());
    }
    
}
