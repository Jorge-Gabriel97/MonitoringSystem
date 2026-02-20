package models;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private int idade;
    private String procedimentoCirurgico;
    private List<Medicamento> medicamentos; // Mantido!

    // NOVO CAMPO ADICIONADO PARA O REACT:
    private String medicacao;

    // 1. CONSTRUTOR VAZIO (Mantido - Essencial para o Spring)
    public Paciente() {
        this.medicamentos = new ArrayList<>();
    }

    // 2. CONSTRUTOR COM ARGUMENTOS (Mantido)
    public Paciente(String nome, int idade, String procedimentoCirurgico) {
        this.nome = nome;
        this.idade = idade;
        this.procedimentoCirurgico = procedimentoCirurgico;
        this.medicamentos = new ArrayList<>();
    }

    // MÉTODOS DE ACESSO
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getProcedimentoCirurgico() { return procedimentoCirurgico; }
    public void setProcedimentoCirurgico(String procedimentoCirurgico) { this.procedimentoCirurgico = procedimentoCirurgico; }

    public List<Medicamento> getMedicamentos() { return medicamentos; }

    public void adicionarMedicamento(Medicamento med) {
        this.medicamentos.add(med);
    }

    // NOVOS GETTERS E SETTERS PARA O REACT:
    public String getMedicacao() { return medicacao; }
    public void setMedicacao(String medicacao) { this.medicacao = medicacao; }
}