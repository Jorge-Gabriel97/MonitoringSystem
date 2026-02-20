package models;

public class Medicamento {
    private String nome;
    private String dosagem;
    private String horario; // Ex: "08:00"

    public Medicamento(String nome, String dosagem, String horario) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.horario = horario;
    }

    // Getters e Setters para acessar os dados
    public String getInfoMedicamento() {
        return nome + " (" + dosagem + ") às " + horario;
    }
}