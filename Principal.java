package exec;

import model.Controller;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Controller c = new Controller();
        System.out.println("*** Sistema de Cálculo de Salário ***");
        System.out.println("==============================COMANDOS==============================\n"
                + "addProf(nome, classe) = Adiciona Professor\n"
                + "addSta(nome, nivel) = Adiciona Servidor Técnico Administrativo\n"
                + "addTer(nome, horas trabalhadas, insalubre) = Adiciona Terceirizado\n"
                + "addDiaria(nome) = Adiciona Diária ao Funcionário\n"
                + "rm(nome) = Remove Funcionário\n"
                + "show(nome) = Mostra Funcionário\n"
                + "fechar = Finaliza o programa\n");
        String comandos;
        System.out.print("Digite um comando: ");

        while (true) {
            comandos = input.nextLine();
            if (comandos.equals("fechar")) {
                break;
            } else {
                String cm[];
                cm = comandos.split(" ");
                switch (cm[0]) {
                    case "addProf":
                        if (cm.length != 3) {
                            System.out.println("Dados incompletos, tente novamente");
                        } else {
                            c.addProf(cm[1], cm[2].charAt(0));
                            System.out.println("done");
                        }
                        break;
                    case "addSta":
                        if (cm.length != 3) {
                            System.out.println("Dados incompletos, tente novamente");
                        } else {
                            c.addSta(cm[1], Integer.parseInt(cm[2]));
                            System.out.println("done");
                        }
                        break;
                    case "addTer":
                        if (cm.length != 4) {
                            System.out.println("Dados incompletos, tente novamente");
                        } else {
                            c.addTer(cm[1], Integer.parseInt(cm[2]), Boolean.parseBoolean(cm[3]));
                            System.out.println("done");
                        }
                        break;
                    case "addDiaria":
                        if (cm.length != 2) {
                            System.out.println("Dados incompletos, tente novamente");
                        } else if (c.addDiaria(cm[1])) {
                            System.out.println("done");
                        }
                        break;
                    case "rm":
                        if (cm.length != 2) {
                            System.out.println("Dados incompletos, tente novamente");
                        } else if (c.rm(cm[1])) {
                            System.out.println(cm[1] + " removido");
                        }
                        break;
                    case "show":
                        if (cm.length != 2) {
                            System.out.println("Dados incompletos, tente novamente");
                        } else {
                            c.show(cm[1]);
                        }
                        break;
                    default:
                        System.out.println("Comando inválido, tente novamente");
                }
            }
        }
    }
}
