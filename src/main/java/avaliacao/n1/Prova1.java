/*
 * Copyright (C) 2024 Ozeias Campos <ozeiash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package avaliacao.n1;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 08/03/2024
 * @brief Class Prova1
 */
import java.util.Scanner; //Importa a biblioteca Scanner

public class Prova1 {

    public static void main(String[] args) { //Bloco de instruções que inicia o fluxo de processamento
        int opcao = 0, qde_cafeCoado = 0, qde_capuccino = 0, //Declaração e inicialização das variáveis tipo inteiras
                qde_ovomaltine = 0, qde_cafes_vendidos;
        double valor_coado, valor_capuccino, //Declaração das variáveis tipo double
                valor_ovomaltine, valor_cafes_vendidos;

        Scanner sc = new Scanner(System.in); //Habilita o teclado para o usuário entrar com dados

        do { //Fará o programa executar o próximo comando pelo menos uma vez

            System.out.println("Forneça uma opção: \n" //Mensagem apresentada na tela para o usuário
                    + "1 ­ café coado; \n" //Menu apresentado na tela para escolha do usuário
                    + "2 ­ café capuccino; \n" //Menu apresentado na tela para escolha do usuário
                    + "3 ­ leite com ovomaltine; \n" //Menu apresentado na tela para escolha do usuário
                    + "4 ­ totalizar vendas;"); //Menu apresentado na tela para escolha do usuário

            opcao = sc.nextInt(); //A variável opção receberá e armazenará o valor digitado pelo usuário

            if (opcao == 1) { //Caso seja digitado 1
                qde_cafeCoado++; //Quantidade de café coado expresso será incrementada em + 1
            } else if (opcao == 2) { //Caso o usuário digite 2
                qde_capuccino++; //Quantidade de capuccino será incrementada em + 1
            } else if (opcao == 3) { //Caso o usuário digite 3
                qde_ovomaltine++; //A quantidade de ovomaltine será incementada em mais 1
            } else if (opcao != 4) { //Caso o usuário digite algo maior que 4, será executado o próximo comando
                System.out.println("Opção inválida"); //Apresenta na tela a mensagem "Opção inválida
            }

        } while (opcao != 4); //Enquanto a opção digitada for menor que 4 o programa executará os próximos comandos

        valor_coado = qde_cafeCoado * 0.50; //Multiplica a quantidade de cafés expresso por 0,75
        valor_capuccino = qde_capuccino; //Multiplica a quantidade de capuccino pela quantidade de capuccino escolhida
        valor_ovomaltine = qde_ovomaltine * 1.75; //Multiplica a quantidade de leite por 1.25
        qde_cafes_vendidos = qde_cafeCoado + qde_capuccino + qde_ovomaltine; //Totaliza quantidade de cafés selecionada
        valor_cafes_vendidos = valor_coado + valor_capuccino + valor_ovomaltine; //Apresenta a soma do valor total do pedido

        System.out.println("Qde café coado: " + qde_cafeCoado + " ­ valor: " + valor_coado); //Apresenta na tela a quantidade de cafes coados e seu valor
        System.out.println("Qde café capuccino: " + qde_capuccino + " ­ valor: " + valor_capuccino); // Apresenta na tela quantidade de capuccinos e seu valor
        System.out.println("Qde ovomaltine: " + qde_ovomaltine
                + " ­ valor: " + valor_ovomaltine); //Apresenta na tela a quantidade de ovomaltine solicitada e seu valor 
        System.out.println("Qde cafés vendidos: " + qde_cafes_vendidos
                + " ­ valor cafés vendidos: " + valor_cafes_vendidos); //Apresenta na tela o total de cafés vendidos e total geral da conta do cliente
    } //Encerra o bloco main

}
