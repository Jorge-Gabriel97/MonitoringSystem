# 🏥 Sistema de Monitoramento - Casa de Apoio Deus é Fiel

![Status do Projeto](https://img.shields.io/badge/Status-Concluído-brightgreen)
![React](https://img.shields.io/badge/Frontend-React-blue)
![Spring Boot](https://img.shields.io/badge/Backend-Java_25_|_Spring_Boot-green)

## 📌 Sobre o Projeto
Este sistema Full-Stack foi desenvolvido como resultado prático do projeto de extensão universitária **"Capacitar para o Bem-Estar: Uso de tecnologias na saúde"**. 

O objetivo principal é digitalizar e padronizar o registro diário de pacientes, procedimentos cirúrgicos e cronogramas de medicação dos residentes da Casa de Apoio, substituindo controles manuais por uma interface moderna, rápida e segura.

## 🚀 Funcionalidades
- **Interface Amigável (UI/UX):** Painel em React focado na usabilidade para cuidadores e operadores de saúde.
- **Processamento de Dados:** Backend robusto em Java garantindo a integridade das informações via API REST.
- **Persistência Local Offline:** Sistema de arquivos integrado (`.txt`) escolhido estrategicamente para garantir que o histórico médico da instituição jamais seja perdido por instabilidades de internet ou limitações de nuvem.

## 🛠️ Tecnologias Utilizadas
**Frontend:**
- React.js
- Axios (Integração HTTP)
- CSS-in-JS (Estilização de Componentes)

**Backend:**
- Java 25
- Spring Boot 3.2.2
- Spring Web (CORS, REST Controllers)
- File I/O (Gerenciamento de Arquivos)

## ⚙️ Como Executar Localmente

### 1. Backend (Spring Boot)
1. Certifique-se de ter o Java 25 e o Maven instalados.
2. Navegue até a pasta raiz do projeto backend.
3. Execute o comando: `mvn spring-boot:run`
4. O servidor iniciará na porta `8080`.

### 2. Frontend (React)
1. Navegue até a pasta `frontend-casa-apoio`.
2. Instale as dependências: `npm install`
3. Inicie o painel: `npm start`
4. A aplicação abrirá automaticamente no navegador em `http://localhost:3000`.

---
*Desenvolvido com dedicação para otimizar o cuidado humanizado através da tecnologia.*
