package application;

import util.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.printf("Vida inicial: ");
        int life = sc.nextInt();
        System.out.printf("Ataque: ");
        int attack = sc.nextInt();
        System.out.printf("Armadura: ");
        int armor = sc.nextInt();

         Champion championA  = new Champion(name,life,attack,armor);
        System.out.println("-------------------------------------");

        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Nome: ");
        name = sc.next();
        System.out.printf("Vida inicial: ");
        life = sc.nextInt();
        System.out.printf("Ataque: ");
        attack = sc.nextInt();
        System.out.printf("Armadura: ");
        armor = sc.nextInt();


        Champion championB  = new Champion(name,life,attack,armor);
        System.out.println("-------------------------------------");
        System.out.printf("Quantos turnos você deseja executar? ");
        int numeroTurnos = sc.nextInt();

        for(int i =1; i<=numeroTurnos; i++){

            System.out.println("Resultado do turno : " + i);
            championA.takeDamage(championB);
            championB.takeDamage(championA);

            System.out.println(championA.status());
            System.out.println();
            System.out.println(championB.status());

            if (championA.getLife()<=0 || championB.getLife()<=0)
                break;

            }

        System.out.println("-----------------------------");
        System.out.println("       FIM DO COMBATE ");
        System.out.println("-----------------------------");





        sc.close();

    }
}

