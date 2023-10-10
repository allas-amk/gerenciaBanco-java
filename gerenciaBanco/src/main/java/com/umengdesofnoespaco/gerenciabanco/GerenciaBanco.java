/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umengdesofnoespaco.gerenciabanco;

/**
 *
 * @author Allas
 */
public class GerenciaBanco {

    public static void main(String[] args) {
        
        Usuario allas = new Usuario();
        allas.name = "Allas";
        allas.surname = "Maycon";
        allas.age = 31;
        //allas.dadosDoUsuario("Allas", "Maycon", 31);
        
        allas.dadosDoUsuario(allas.name, allas.surname, allas.age);
    }
    
    /*Menu de exibição perfil do usuário*/
    static class Usuario {
        //
        private String name;
        private String surname;
        private int age;
        
        
        void dadosDoUsuario(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            System.out.println("Meu nome é " + name + " " + surname + ", minha idade é " + age);
        }
        
        static void apresentacao(String name, String surname, int age) {
            System.out.println("Meu nome é " + name + " " + surname + ", minha idade é " + age);
        }
    }
}

/*Menu de exibição principal*/



/*Menu de exibição conta corrente*/

/*Menu de exibição conta poupança*/

/*Menu de exibição para investimentos*/

/*Menu de exibição carteira de investimentos*/

/*Menu de exibição cofrinho*/

/*Menu de exibição historico de transações*/

/*Menu de exibição historico de pagamentos*/

/*Menu de exibição fatura*/

/*Menu de exibição emprestimos*/

