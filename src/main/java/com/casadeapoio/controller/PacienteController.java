package com.casadeapoio.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
@CrossOrigin(origins = "http://localhost:3000")
public class PacienteController {

    @PostMapping("/salvar")
    public org.springframework.http.ResponseEntity<String> salvar(@RequestBody models.Paciente p) {

        try {
            // Montando o texto com o layout exato solicitado para o relatório
            String dados = "REGISTRO DE SAÚDE - CASA DE APOIO DEUS É FIEL\n" +
                    "Assistido: " + p.getNome() + "\n" +
                    "Procedimento: " + p.getProcedimentoCirurgico() + "\n" +
                    "Medicação: " + p.getMedicacao();

            // Chama a utilidade para salvar no TXT
            util.GerenciadorArquivos.salvarRelatorio(dados);

            return org.springframework.http.ResponseEntity.ok("Salvo com sucesso!");
        }
        catch (Exception e) {
            return org.springframework.http.ResponseEntity.status(500).body("Erro no servidor");
        }

    }

}