package control;

import domain.Usuario;


public class ControleUsuario {
    public boolean verificarUsuarioSenha(Usuario usuario){
        if(usuario.getNome().equals("admin") 
                && usuario.getSenha().equals("1234")){
            return true;
        }else{
            return false;
        }
    }
}
