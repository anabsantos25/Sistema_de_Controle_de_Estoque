[![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)](https://github.com/seu-usuario/seu-repositorio)

![Capa](https://github.com/user-attachments/assets/87e7688c-599d-40a4-bf78-4928a0f1ff1e)

<h1 align="center" style="text-shadow: 2px 2px 5px white;">📦 Sistema de Controle de Estoque 📦</h1>

<h2 align="center" style="font-size: 28px; text-shadow: 2px 2px 5px white;">📝 Descrição do Projeto</h2>

O Sistema de Controle de Estoque é uma aplicação desenvolvida na IDE IntelliJ com Spring Boot e Java para gerenciar o cadastro, listagem, atualização e exclusão de produtos em estoque. Ele utiliza um backend com Spring Data JPA e um banco de dados H2 em memória, além de um frontend simples e eficaz em HTML/JavaScript com Axios.
<br>
💡 Objetivo: Fornecer uma interface simples e intuitiva para o gerenciamento de produtos em estoque para pequenas e médias empresas.
</p>

---

<h2 align="center" style="font-size: 28px; text-shadow: 2px 2px 5px white;">🔧 Layout e Funcionalidades</h2>

- <strong>Tela Inicial:</strong> Interface do programa

![interface](https://github.com/user-attachments/assets/68b6c46f-dc35-434d-90b1-a10e1a5b166d)
  
- <strong>Cadastro de Produtos:</strong> Insira informações como nome, descrição e quantidade em uma tabela.

![cadastro](https://github.com/user-attachments/assets/94bd11b4-dc41-4496-9797-0b33e828f82e)

  
- <strong>Listagem de Produtos:</strong> Visualize todos os produtos cadastrados.

![tabela de produtos](https://github.com/user-attachments/assets/bffd6e5d-aa63-4410-aaae-0ff8c532dde7)

- <strong>Atualização de Produtos:</strong> Edite as informações de produtos existentes.

![atualizacao](https://github.com/user-attachments/assets/77cb346b-ff24-444b-b531-e7def6ff9eab)


- <strong>Exclusão de Produtos:</strong> Remova produtos do estoque.

![image](https://github.com/user-attachments/assets/795eb609-4d5e-4b06-b82f-271c77501dd2)
![image](https://github.com/user-attachments/assets/cd1f8d9a-82ce-4ab1-8054-22d60f8d126d)




---

<h2 align="center" style="font-size: 28px; text-shadow: 2px 2px 5px white;"> 🔗 Acesso ao Projeto - O que você precisa para rodar</h2>

📂 Este projeto está hospedado no GitHub! Siga os passos abaixo para rodar o projeto de forma simples, seja por comandos ou por extração manual, com instruções para as IDEs IntelliJ IDEA e VS Code.

- Certifique-se de ter o Gradle Wrapper configurado no projeto. O arquivo gradlew (Mac/Linux) ou gradlew.bat (Windows) já está incluído no repositório.
- A versão do JDK é 21.
- Necessário instalar o Node.js em qualquer versão.
- Alertas sobre o Git podem ser ignorados.
- Certifique-se que todas as dependências estão ativas, sem arquivos corrompidos.

---

### 💻 **WINDOWS**

#### 1️⃣ Baixando o Código
1. [Clique *aqui* para fazer o download do código](https://github.com/anabsantos25/Sistema_de_Controle_de_Estoque/archive/refs/heads/master.zip)
3. Extraia o conteúdo do arquivo ZIP para uma pasta de sua escolha.

#### 2️⃣ Usando no IntelliJ IDEA
1. Abra o IntelliJ IDEA.
2. Clique em **Open** e selecione a pasta extraída do projeto.
3. Aguarde o IntelliJ detectar o projeto Gradle. Se necessário, clique em **Import Project** e escolha **Gradle**.
4. No painel lateral, abra o arquivo `SistemaDeControleDeEstoqueApplication.java`.
5. Clique com o botão direito no arquivo e escolha **Run SistemaDeControleDeEstoqueApplication**.
6. Acesse o sistema no navegador em: **[http://localhost:8080](http://localhost:8080)**.

#### 3️⃣ Usando no VS Code
1. Abra o VS Code e instale a extensão **Extension Pack for Java** da Microsoft.
2. Clique em **File > Open Folder** e selecione a pasta do projeto.
3. Aguarde o VS Code reconhecer o projeto Gradle.
4. No terminal integrado do VS Code, digite o comando:
   ```bash
   .\gradlew.bat bootRun

---

### 🍎 **MAC**

Aqui estão as instruções detalhadas para configurar e executar o projeto no **Mac**, usando **IntelliJ IDEA** ou **VS Code**.

#### 1️⃣ Baixando o Código
1. [Clique *aqui* para fazer o download do código](https://github.com/anabsantos25/Sistema_de_Controle_de_Estoque/archive/refs/heads/master.zip)
2. Extraia o conteúdo do arquivo ZIP para uma pasta de sua escolha.

#### 2️⃣ Usando no IntelliJ IDEA
1. Abra o IntelliJ IDEA.
2. Clique em **Open** e selecione a pasta onde você extraiu o projeto.
3. Aguarde o IntelliJ detectar automaticamente o projeto Gradle. Caso contrário:
   - Clique em **Import Project** e selecione o **Gradle** como o sistema de build.
4. Certifique-se de que o **Java JDK 11 ou superior** está configurado:
   - Vá para **IntelliJ IDEA > Preferences > Build, Execution, Deployment > SDKs** e adicione o JDK correto.
5. No painel lateral, abra o arquivo `SistemaDeControleDeEstoqueApplication.java`.
6. Clique com o botão direito no arquivo e selecione **Run SistemaDeControleDeEstoqueApplication**.
7. Abra o navegador e acesse o sistema em: **[http://localhost:8080](http://localhost:8080)**.

#### 3️⃣ Usando no VS Code
1. Abra o VS Code.
2. Certifique-se de que a extensão **Extension Pack for Java** está instalada. Caso não esteja, instale-a no marketplace do VS Code.
3. Clique em **File > Open Folder** e selecione a pasta do projeto.
4. Aguarde o VS Code reconhecer o projeto Gradle.
5. Certifique-se de que o Java JDK 11 ou superior está instalado e configurado.
6. Abra o terminal integrado do VS Code (atalho: **Ctrl+`**) e execute o comando:
   ```bash
   ./gradlew bootRun

---

<h2 align="center" style="font-size: 28px; text-shadow: 2px 2px 5px white;">🛠️ Tecnologias Utilizadas</h2>
  
🚀 **Backend:** Spring Boot | Spring Data JPA

📂 **Banco de Dados:** H2 Database (em memória)

🌐 **Frontend:** HTML | CSS | JavaScript | Axios

🔧 **Ferramenta de Build:** Gradle

⚙️ **IDE:** IntelliJ IDEA Ultimate

---

<h2 align="center" style="font-size: 28px; text-shadow: 2px 2px 5px white;">👩‍💻 Desenvolvedores</h2>

- Ana Beatriz Santos Leal: Back-end, testes, documentação e funcionalidades.

- Iago de Zagiacomo Aliende: Back-end, front-end e gerenciamento de testes.

---

<h2 align="center" style="font-size: 28px; text-shadow: 2px 2px 5px white;">📜 Licença</h2>

Este projeto está licenciado sob a <strong>Licença MIT</strong>.
