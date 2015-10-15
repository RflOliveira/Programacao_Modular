/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

/**
 *
 * @author Rafael
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       VerificadorSenha verificador = new VerificadorSenha();
		boolean forte = verificador.verificarForcaDaSenha("Ab#123456");
		String resultado = forte ? "Forte" : "Fraca";
		System.out.println("Resultado: " + resultado);
        
    }
}
