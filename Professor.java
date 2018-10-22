package model;

public class Professor extends Funcionario {

    private char classe;

    public Professor(String nome, char classe) {
        super(nome, 2);
        this.classe = classe;
    }

    public char getClasse() {
        return this.classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public String toString() {
        String res = "";
        res += super.toString();
        res += "Classe: " + this.classe + "\n";
        res += "Salário: " + calcularSalario() + "\n";
        return res;
    }

    public double calcularSalario() {
        switch (this.classe) {
            case 'A':
                return 3000 + (100 * this.getDiarias());
            case 'B':
                return 5000 + (100 * this.getDiarias());
            case 'C':
                return 7000 + (100 * this.getDiarias());
            case 'D':
                return 9000 + (100 * this.getDiarias());
            default:
                return 11000 + (100 * this.getDiarias());
        }
    }

    public boolean addDiaria() {
        if (this.getDiarias() < 2) {
            this.setDiarias(this.getDiarias() + 1);
            return true;
        }
        return false;
    }

}
