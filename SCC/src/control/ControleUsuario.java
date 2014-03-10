/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
