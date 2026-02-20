package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class GerenciadorArquivos {
    private static final String NOME_ARQUIVO = "monitoramento_casa_apoio.txt";

    // Este é o método que estava faltando e causava o erro na Principal
    public static void salvarRelatorio(String conteudo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOME_ARQUIVO, true))) {
            bw.write(conteudo);
            bw.newLine();
            bw.write("---------------------------------------");
            bw.newLine();
            System.out.println("Relatório salvo com sucesso no arquivo!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    public static void lerRelatorio() {
        System.out.println("\n--- CONSULTANDO HISTÓRICO DIGITAL (Casa de Apoio Deus é Fiel) ---");

        File arquivo = new File(NOME_ARQUIVO);
        if (!arquivo.exists()) {
            System.out.println("Aviso: O arquivo ainda não existe. Salve um registro primeiro.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(NOME_ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}