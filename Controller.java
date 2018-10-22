package model;

import java.util.ArrayList;

public class Controller {

    ArrayList<Funcionario> funcionarios = new ArrayList();

    public boolean show(String nome) {
        for (Funcionario i : funcionarios) {
            if (i.getNome().equals(nome)) {
                System.out.println(i);
                return true;
            }
        }
        System.out.println("Funcionário " + nome + " não existe.");
        return false;
    }

    public boolean addProf(String nome, char classe) {
        Professor p = new Professor(nome, classe);
        funcionarios.add(p);
        return true;
    }

    public boolean addSta(String nome, int nivel) {
        STA s = new STA(nome, nivel);
        funcionarios.add(s);
        return true;
    }

    public boolean addTer(String nome, int horasTrabalhadas, boolean insalubre) {
        Terceirizado t = new Terceirizado(nome, horasTrabalhadas, insalubre);
        funcionarios.add(t);
        return true;
    }

    public boolean addDiaria(String nome) {
        for (Funcionario f : funcionarios) {
            if (f instanceof Terceirizado) {
                System.out.println("Terceirizados não podem receber diárias.");
            } else if (f.getNome().equals(nome) && f.getDiarias() < f.getMaxDiarias()) {
                f.addDiaria();
                return true;
            } else {
                System.out.println("fail: limites de diárias atingido");
            }
        }
        return false;
    }

    public boolean rm(String nome) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNome().equals(nome)) {
                funcionarios.remove(i);
                return true;
            }
        }
        System.out.println("Funcionário " + nome + " não existe.");
        return false;
    }
}
