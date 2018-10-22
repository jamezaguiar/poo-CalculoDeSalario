package model;

public class STA extends Funcionario {

    private int nivel;

    public STA(String nome, int nivel) {
        super(nome, 1);
        this.nivel = nivel;

    }

    public int getNivel() {
        return this.nivel;

    }

    public void setNivel(int nivel) {
        this.nivel = nivel;

    }

    public String toString() {
        String res = "";
        res += super.toString();
        res += "Nível: " + this.nivel + "\n";
        res += "Salário: " + calcularSalario() + "\n";
        return res;
    }

    public double calcularSalario() {
        return 3000 + 300 * this.nivel + 100 * this.getDiarias();
    }

    public boolean addDiaria() {
        if (this.getDiarias() < 1) {
            this.setDiarias(this.getDiarias() + 1);
            return true;
        }
        return false;
    }

}
