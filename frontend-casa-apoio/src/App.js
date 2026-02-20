import React, { useState } from 'react';
import axios from 'axios';

function App() {
  const [nome, setNome] = useState('');
  const [procedimento, setProcedimento] = useState('');
  const [medicacao, setMedicacao] = useState(''); // NOVO CAMPO ADICIONADO

  const salvarNoSistema = (e) => {
    e.preventDefault();

    axios.post('http://localhost:8080/pacientes/salvar', {
        nome: nome,
        procedimentoCirurgico: procedimento,
        medicacao: medicacao // ENVIANDO PARA O JAVA
    })
    .then(response => {
        alert("Sucesso! Registro salvo no monitoramento.");
        // LIMPA OS TRÊS CAMPOS APÓS SALVAR
        setNome("");
        setProcedimento("");
        setMedicacao("");
    })
    .catch(error => {
        alert("Erro ao conectar. Verifique se o servidor Java está rodando.");
        console.error(error);
    });
  };

  return (
    <div style={styles.container}>
      <div style={styles.card}>
        <div style={styles.header}>
          <h1 style={styles.title}>Casa de Apoio Deus é Fiel</h1>
          <p style={styles.subtitle}>Registro Digital de Saúde</p>
        </div>

        <form onSubmit={salvarNoSistema} style={styles.form}>

          <div style={styles.inputGroup}>
            <label style={styles.label}>Assistido (Nome):</label>
            <input
              placeholder="Ex: João Silva"
              value={nome}
              onChange={e => setNome(e.target.value)}
              style={styles.input}
              required
            />
          </div>

          <div style={styles.inputGroup}>
            <label style={styles.label}>Procedimento:</label>
            <input
              placeholder="Ex: Pós-Cirúrgico Cardíaco"
              value={procedimento}
              onChange={e => setProcedimento(e.target.value)}
              style={styles.input}
              required
            />
          </div>

          <div style={styles.inputGroup}>
            <label style={styles.label}>Medicação e Horário:</label>
            <input
              placeholder="Ex: Atenolol (25mg) às 08:00"
              value={medicacao}
              onChange={e => setMedicacao(e.target.value)}
              style={styles.input}
              required
            />
          </div>

          <button type="submit" style={styles.button}>
            Salvar Registro
          </button>
        </form>
      </div>
    </div>
  );
}

// ESTILOS PROFISSIONAIS (CSS in JS)
const styles = {
  container: { display: 'flex', justifyContent: 'center', alignItems: 'center', minHeight: '100vh', backgroundColor: '#eef2f5', fontFamily: 'Arial, sans-serif' },
  card: { backgroundColor: '#ffffff', padding: '40px', borderRadius: '12px', boxShadow: '0 4px 12px rgba(0,0,0,0.1)', width: '100%', maxWidth: '450px' },
  header: { textAlign: 'center', marginBottom: '30px' },
  title: { margin: '0', color: '#1a5276', fontSize: '24px' }, // Azul saúde
  subtitle: { margin: '5px 0 0 0', color: '#7f8c8d', fontSize: '14px' },
  form: { display: 'flex', flexDirection: 'column' },
  inputGroup: { marginBottom: '20px' },
  label: { display: 'block', marginBottom: '8px', color: '#34495e', fontWeight: 'bold', fontSize: '14px' },
  input: { width: '100%', padding: '12px', borderRadius: '6px', border: '1px solid #bdc3c7', boxSizing: 'border-box', fontSize: '14px', outline: 'none' },
  button: { backgroundColor: '#27ae60', color: 'white', padding: '14px', border: 'none', borderRadius: '6px', fontSize: '16px', fontWeight: 'bold', cursor: 'pointer', marginTop: '10px', transition: 'background-color 0.3s' }
};

export default App;