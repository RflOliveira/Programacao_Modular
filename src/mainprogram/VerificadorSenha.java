/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author Rafael
 */

    


public class VerificadorSenha {

    /**
     * Verifica se uma senha é forte
     */
    public boolean verificarForcaDaSenha(String senha) {

        // Verifica se a senha tem 8 ou mais caracteres
        if(!verificaTamanhoDaSenha(senha)){
            return false;
        }

        // Verifica se a senha a senha é uma data
        if(!verificaSeSenhaEhData(senha)){
            return false;
        }

        // Verifica se a senha tem um caractere numérico
        if(!verificaCaratereNumerico(senha)){
            return false;
        }

        // Verifica se a senha tem um caractere maiúsculo
        if(!verificaCaratereMaiusculo(senha)){
            return false;
        }

        // Verifica se a senha tem um caractere minúsculo
        if(!verificaCaratereMinusculo(senha)){
            return false;
        }

        // Verifica se a senha tem um caractere de pontuação
        if(!verificaCaracterePontuacao(senha)){
            return false;
        }

        if(!verificaDicionario(senha)){
            return false;
        }

        return true;
    }

    private boolean verificaTamanhoDaSenha(String senha){
        return senha.length()>= 8;
    }

    private boolean verificaSeSenhaEhData(String senha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(senha.trim());
        }
        catch (ParseException e) {
            return true;
        }
        return false;
    }

    private boolean verificaCaratereNumerico(String senha){

        for(int i = 0; i < senha.length(); i++){
            if(Character.isDigit(senha.charAt(i))){
                return true;
            }
        }

        return false;
    }

    private boolean verificaCaratereMaiusculo(String senha){

        for(int i = 0; i < senha.length(); i++){
            if(Character.isUpperCase(senha.charAt(i))){
                return true;
            }
        }

        return false;
    }

    private boolean verificaCaratereMinusculo(String senha){

        for(int i = 0; i < senha.length(); i++){
            if(Character.isLowerCase(senha.charAt(i))){
                return true;
            }
        }

        return false;
    }

    private boolean verificaCaracterePontuacao(String senha){
        String pontos = "!,.:;?!@#$%&*|?^~{}[]+=-_<>";

        for(int i = 0; i < senha.length(); i++){
            for(int j = 0; j < pontos.length(); j++){
                if(senha.charAt(i) == pontos.charAt(j)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean verificaDicionario(String senha){
        String[] dicionario = {"Eu<3PModular", "Senha-01"};

        for (int i = 0; i < dicionario.length; i++ ){
            if(senha.equals(dicionario[i])){
                return false;
            }
        }

        return true;
    }

}

