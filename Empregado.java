public class Empregado {
    private String nome;
    private int idade;
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void promover() {
        if (idade < 18) {
            System.out.println("Não é possível promover, pois o funcionário tem menos de 18 anos.");
            return;
        }
        aumentarSalario(25);
    }

    public void aumentarSalario(double percentual) {
        salario += (salario * percentual / 100);
    }

    public void demitir(int motivo) {
        double multa = 0;
        double aposentadoriaSalario = 0;

        switch (motivo) {
            case 1:
                System.out.println("Demitido por justa causa.");
                break;
            case 2:
                multa = salario * 0.4;
                System.out.printf("Demitido por decisão do empregador. Multa de: %.2f%n", multa);
                break;
            case 3:
                if (salario >= 1000 && salario < 2000) {
                    aposentadoriaSalario = 1500;
                } else if (salario >= 2000 && salario < 3000) {
                    aposentadoriaSalario = 2500;
                } else if (salario >= 3000 && salario < 4000) {
                    aposentadoriaSalario = 3500;
                } else if (salario >= 4000) {
                    aposentadoriaSalario = 4000;
                }
                System.out.printf("Aposentadoria. Salário de aposentadoria: %.2f%n", aposentadoriaSalario);
                break;
            default:
                System.out.println("Motivo de demissão inválido.");
                return;
        }
    }

    public void fazerAniversario() {
        idade++;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}
    
