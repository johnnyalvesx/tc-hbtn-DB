package java_jdbc_manipulation.src;

public class Cliente {

    public String nome;
    public int idade;
    public String CPF;
    public String RG;

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

    public String getCPF() {
	return CPF;
    }

    public void setCPF(String cPF) {
	CPF = cPF;
    }

    public String getRG() {
	return RG;
    }

    public void setRG(String rG) {
	RG = rG;
    }
}
