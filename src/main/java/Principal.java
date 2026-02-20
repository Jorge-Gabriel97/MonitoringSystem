import models.Medicamento;
import models.Paciente;
import util.GerenciadorArquivos;

public class Principal {
    public static void main(String[] args) {
        // --- ETAPA 1: CRIAÇÃO E SALVAMENTO (Escrita) ---
        // Criando o objeto com os dados da Casa de Apoio conforme planejado
        Paciente p1 = new Paciente("João Silva", 65, "Pós-Cirúrgico Cardíaco");

        // Adicionando um medicamento mapeado na metodologia
        Medicamento med1 = new Medicamento("Atenolol", "25mg", "08:00");
        p1.adicionarMedicamento(med1);

        // Estruturando o relatório para persistência
        String relatorio = "REGISTRO DE SAÚDE - CASA DE APOIO DEUS É FIEL\n" +
                "Assistido: " + p1.getNome() + "\n" +
                "Procedimento: " + p1.getProcedimentoCirurgico() + "\n" +
                "Medicação: " + med1.getInfoMedicamento();

        // Salva os dados no arquivo .txt
        GerenciadorArquivos.salvarRelatorio(relatorio);

        System.out.println("\n-------------------------------------------");

        // --- ETAPA 2: RECUPERAÇÃO DE DADOS (Leitura) ---
        // O sistema lê o que foi persistido, validando a funcionalidade prática
        GerenciadorArquivos.lerRelatorio();

        System.out.println("\n[Sistema pronto para novos registros]");
    }

    public static class CasaDeApoioApplication {
    }
}