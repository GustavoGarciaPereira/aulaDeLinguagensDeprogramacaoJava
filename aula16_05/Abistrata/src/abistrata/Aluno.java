/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abistrata;

/**
 *
 * @author usrlab06
 */
public class Aluno extends Pessoa{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome();
        System.out.println(aluno.getIdade());
        aluno.exibirMsg();
    }
    @Override
    public void setNome(){
        System.out.println("Pedro"); 
    }
    
    @Override
    public int getIdade(){
        return 35;
    }
}
