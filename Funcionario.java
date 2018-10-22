package model;

public class Funcionario {

    private String nome;
    private int maxDiarias;
    private int diarias;

    public Funcionario(String nome, int maxDiarias) {
        this.nome = nome;
        this.maxDiarias = maxDiarias;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiarias() {
        return this.diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public boolean addDiaria() {
        if (this.diarias > this.maxDiarias) {
            return false;
        } else {
            this.diarias++;
            return true;
        }
    }

    public int getMaxDiarias() {
        return maxDiarias;
    }

    public String toString() {
        String res = "";
        res += "\nNome: " + this.nome + "\n";
        res += "Diárias: " + this.diarias + "\n";
        return res;
    }

    public double calcularSalario() {
        return 0.0;
    }
}
