<img width="1500" height="500" alt="Brown Minimalist Welcome Message XTwitter Header" src="https://github.com/user-attachments/assets/037b94f7-36a0-4820-8684-5e83f9450776" />

Graduanda em *Banco de Dados* (formatura prevista para 2026) e atualmente estagiária em *Desenvolvimento Fullstack e Inteligência Artificial na Ericsson*. Sou apaixonada por inovação e organização, acreditando no poder dos dados para transformar negócios e gerar valor. Busco constante aprendizado para evoluir como profissional em dados e machine learning.

<p align="center">
  <strong>Meus contatos!</strong>
</p>

<p align="center">
  <a href="mailto:marianaoliveiray21@gmail.com" title="Gmail">
    <img src="https://img.shields.io/badge/-Gmail-FF69B4?style=flat-square&labelColor=FF69B4&logo=gmail&logoColor=white" alt="Gmail"/>
  </a>

  <a href="https://www.linkedin.com/in/oliveirasmari/" title="LinkedIn">
    <img src="https://img.shields.io/badge/-LinkedIn-FF69B4?style=flat-square&logo=linkedin&logoColor=white" alt="LinkedIn"/>
  </a>

  <a href="mailto:mariana.oliveira7@aluno.cps.sp.gov.br" title="Outlook">
    <img src="https://img.shields.io/badge/-Outlook-FF69B4?style=flat-square&labelColor=FF69B4&logo=microsoft-outlook&logoColor=white" alt="Outlook"/>
  </a>
</p>


![Brown Minimalist Welcome Message X_Twitter Header](https://github.com/user-attachments/assets/435c6d14-6acc-4bf8-93bf-7f380acca4db)


---
# Calculadora Científica (1º semestre)

![Semestre](https://img.shields.io/badge/semestre-1%C2%BA%20%C2%B7%202024-FF69B4?logo=googledocs&logoColor=white)
![TypeScript](https://img.shields.io/badge/TypeScript-3178C6?logo=typescript&logoColor=white)
![Terminal](https://img.shields.io/badge/Terminal%20App-222222?logo=gnubash&logoColor=white)


Aplicação de terminal com operações matemáticas, conversões numéricas e validação de entrada — desenvolvida ao longo do 1º semestre, evoluindo de VisualG até TypeScript.

<p align="center">
  <img width="306" height="176" alt="image" src="https://github.com/user-attachments/assets/8bee0ab4-8466-4994-9e29-1d895e00edcd" />
  <br/><br/>
  <a href="https://github.com/DenariusData/API-1sem">
    <img src="https://img.shields.io/badge/Repositório-GitHub-FF69B4?logo=github&logoColor=white" alt="Repositório" />
  </a>
</p>

<details>
  <summary>Detalhes do projeto</summary>

![Brown Minimalist Welcome Message X_Twitter Header](https://github.com/user-attachments/assets/f3d75862-9269-4cc3-8754-7818520bc0f6)



O projeto foi desenvolvido no primeiro semestre de 2024 com o objetivo de consolidar conceitos fundamentais de lógica de programação e implementação de algoritmos. Ao longo do desenvolvimento, foi possível aplicar na prática estruturas de decisão, repetição e manipulação de dados, fortalecendo o raciocínio lógico e a organização do código.

A solução consistiu em uma calculadora científica com interface textual, capaz de executar múltiplas operações em uma única execução. Entre as funcionalidades implementadas estiveram as operações básicas (soma, subtração, multiplicação e divisão), cálculo de fatorial, resolução de função do segundo grau e conversões entre diferentes bases numéricas, como binário, decimal, octal e hexadecimal. Também foi incluída a funcionalidade de concatenação de strings.

Além disso, foram desenvolvidos algoritmos para cálculos financeiros, como juros simples e juros compostos, permitindo aplicar fórmulas matemáticas em contextos práticos. O projeto teve caráter didático e serviu como base para a evolução em conceitos mais avançados de programação e desenvolvimento de sistemas.

<h2 align="center">Tecnologias</h2>

<p align="center">
  <img src="https://img.shields.io/badge/VSCode-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white" />
  <img src="https://img.shields.io/badge/TypeScript-3178C6?style=for-the-badge&logo=typescript&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
  <img src="https://img.shields.io/badge/Trello-0052CC?style=for-the-badge&logo=trello&logoColor=white" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Visualg-Algoritmos-4CAF50?style=for-the-badge&logoColor=white" />
</p>

<img width="930" height="163" alt="image" src="https://github.com/user-attachments/assets/fe45a5b8-5aa1-4589-880c-0f9ab8c7d89d" />


<details>
<summary>integração de todas as funcionalidades no menu principal</summary>
  
<br>

A função exibirMenu é responsável pela interface inicial de interação com o usuário no terminal. Inicialmente, utiliza clear() para limpar a tela, garantindo uma visualização organizada a cada nova execução do menu. Em seguida, exibe todas as opções disponíveis da aplicação, como operações matemáticas, conversões e funcionalidades adicionais.

Para capturar a entrada do usuário, é utilizada a biblioteca readline-sync, especificamente o método questionInt, que assegura que o valor retornado seja um número inteiro, evitando inconsistências de tipo. Esse valor representa a escolha do usuário e é retornado pela função, sendo posteriormente utilizado para controlar o fluxo da aplicação.

<p align="center">
  <img width="361" height="360" alt="image" src="https://github.com/user-attachments/assets/0f79699d-e6cb-4888-92ee-48cc7218ec26" />
</p>

---

A função executarOperacao atua como um controlador de fluxo baseado na escolha do usuário. Através de uma estrutura switch, ela mapeia cada opção numérica para uma funcionalidade específica do sistema, como chamadas para módulos de operações básicas, cálculo de fatorial, resolução de equação do segundo grau (Bhaskara), conversões de base, concatenação de strings e cálculo de juros.

Cada caso do switch delega a responsabilidade para funções especializadas, promovendo modularização e separação de responsabilidades no código. Além disso, em operações que exibem resultados diretamente no terminal, é utilizado o keypress() para pausar a execução e permitir que o usuário visualize o resultado antes de retornar ao menu. A função também trata entradas inválidas por meio do bloco default, garantindo maior robustez.

<p align="center">
  <img width="409" height="485" alt="image" src="https://github.com/user-attachments/assets/d79e02cf-ac44-40ec-bc1d-ed15c1ee4d64" />
</p>

---

A função menuGeral é o núcleo da aplicação, responsável por manter o ciclo de execução do sistema. Ela utiliza um loop do...while, garantindo que o menu seja exibido ao menos uma vez e continue sendo apresentado até que o usuário escolha encerrar o programa.

Dentro do loop, a função chama exibirMenu() para obter a opção do usuário e realiza validações, verificando se o valor está dentro do intervalo permitido. Caso a opção seja inválida, o sistema informa o erro e reinicia o ciclo sem executar nenhuma operação.

Quando uma opção válida é fornecida, a função limpa a tela e chama executarOperacao, delegando a execução da funcionalidade correspondente. Se o usuário selecionar a opção de saída (7), o programa exibe uma mensagem de encerramento e utiliza exit() para finalizar imediatamente a execução. Essa estrutura garante controle contínuo do fluxo, validação de entrada e organização da interação com o usuário.

<p align="center">
 <img width="424" height="387" alt="image" src="https://github.com/user-attachments/assets/ee23bb3a-b4aa-4281-a5be-784852674de4" />
</p>





</details>

<details>
  <summary>Função de cálculo de segundo grau (Bhaskára)</summary>

  <br>
  
A função eq2grau foi implementada por mim com o objetivo de centralizar toda a regra de negócio do cálculo da equação do segundo grau, mantendo a lógica isolada da interface. Ela recebe três parâmetros tipados como number (a, b e c) e retorna dois possíveis tipos: um objeto com os valores calculados (x1, x2 e delta) ou uma string para representar um cenário inválido. Essa abordagem com union type ({...} | string) foi adotada para garantir um controle mais seguro do fluxo de execução, permitindo tratar diferentes resultados sem comprometer a aplicação.

Inicialmente, essa lógica foi construída no Visualg, onde desenvolvi o algoritmo de forma estruturada, utilizando variáveis simples, entrada de dados via leia e saída com escreva. Nesse contexto, todo o processamento era feito de maneira sequencial, incluindo o cálculo do delta e das raízes. Ao migrar para TypeScript, mantive a mesma lógica base, porém reestruturei o código para separar responsabilidades e aplicar boas práticas, como tipagem explícita e retorno estruturado.

Um ponto importante da implementação foi a decisão de não utilizar funções prontas como Math.sqrt(). Em vez disso, implementei manualmente o cálculo da raiz quadrada utilizando um loop do...while, baseado em um método iterativo. Essa escolha reforça a proposta do projeto de exercitar lógica e algoritmos, aproximando a solução do modelo desenvolvido no Visualg. Além disso, a função foi construída de forma independente de entrada ou saída de dados (exceto um log específico), tornando-a mais reutilizável, testável e alinhada com práticas mais profissionais de desenvolvimento.

  <p align="center">
 <img width="851" height="562" alt="image" src="https://github.com/user-attachments/assets/7f221406-acc7-4e6a-b2c7-aa133036302f" />
</p>


</details>

<img width="933" height="153" alt="image" src="https://github.com/user-attachments/assets/051ad8aa-9248-4dee-804f-7dcf9d5fb227" />


<details>
<summary><strong>Hard Skills</strong></summary>

<br>

- **Lógica de Programação**  
  Desenvolvimento de algoritmos desde a base no Visualg, utilizando estruturas condicionais, loops e variáveis. Evolução para TypeScript mantendo a mesma lógica, porém com melhor organização e controle de fluxo.

- **TypeScript**  
  Aplicação de tipagem estática para garantir maior segurança no código, uso de funções bem definidas, organização modular e prevenção de erros em tempo de desenvolvimento.

- **Estrutura de Código e Modularização**  
  Separação clara entre responsabilidades, dividindo o sistema em funções específicas (cálculo, interface e controle). Isso facilitou manutenção, leitura e reutilização do código.

- **Algoritmos Matemáticos**  
  Implementação manual de operações como fatorial, Bhaskara e conversões de bases numéricas, reforçando o raciocínio lógico e evitando dependência excessiva de funções prontas da linguagem.

- **Interação via Terminal (CLI)**  
  Utilização da biblioteca `readline-sync` para entrada de dados, controle de fluxo com menus interativos e validação de entradas do usuário.

- **Controle de Fluxo**  
  Uso de estruturas como `switch`, `if/else` e loops (`do...while`) para gerenciar a navegação do sistema e execução das funcionalidades.

</details>

<details>
<summary><strong>Soft Skills</strong></summary>

<br>

- **Trabalho em Equipe**  
  Participação ativa no desenvolvimento, colaborando com ideias, discutindo soluções e contribuindo para a evolução do projeto em conjunto.

- **Resolução de Problemas**  
  Identificação e correção de erros durante o desenvolvimento, adaptação da lógica e busca por soluções eficientes para cada funcionalidade implementada.

- **Organização**  
  Estruturação do projeto de forma clara, com separação de arquivos e responsabilidades, facilitando entendimento e futuras melhorias.

- **Comunicação**  
  Capacidade de explicar decisões técnicas, algoritmos e funcionamento do sistema de forma clara, tanto em documentação quanto em apresentações.

- **Autonomia e Aprendizado Contínuo**  
  Evolução do conhecimento a partir do Visualg até TypeScript, buscando entender não apenas o funcionamento, mas também boas práticas de desenvolvimento.

</details>
</details>

---
# Pacer (2º semestre)
![Semestre](https://img.shields.io/badge/semestre-2%C2%BA%20%C2%B7%202024-FF69B4?logo=googledocs&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-007396?logo=openjdk&logoColor=white)
![SceneBuilder](https://img.shields.io/badge/Scene%20Builder-ED8B00?logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?logo=mysql&logoColor=white)

Aplicação desktop desenvolvida no 2º semestre com Java, uma solução inovadora para aprimorar o processo de avaliação de competências no PACER, dentro da metodologia de Aprendizagem por Projetos Integrados.

<p align="center">
  <img width="587" height="273" alt="image" src="https://github.com/user-attachments/assets/7299d01e-203e-49e0-a862-4f1b3dbfb99c" />
  <br/><br/>
  <a href="https://github.com/DenariusData/API-2SEM">
    <img src="https://img.shields.io/badge/Repositório-GitHub-FF69B4?logo=github&logoColor=white" alt="Repositório" />
  </a>
</p>

<details>
  <summary>Detalhes do projeto</summary>
  
  ![Brown Minimalist Welcome Message X_Twitter Header](https://github.com/user-attachments/assets/f3d75862-9269-4cc3-8754-7818520bc0f6)

  O projeto foi desenvolvido no segundo semestre de 2024 no contexto da Aprendizagem por Projetos Integrados (API), com o objetivo de automatizar e padronizar o processo de avaliação de competências no PACER, substituindo o modelo manual sujeito a erros e inconsistências.

A solução consistiu em um sistema web que permite a avaliação entre membros de equipes ao final de cada Sprint, com armazenamento seguro dos dados e geração de relatórios detalhados para professores, incluindo médias por aluno e por grupo.

Entre as principais funcionalidades, destacam-se o gerenciamento de grupos, personalização de critérios de avaliação, controle automático do calendário de Sprints com base na data e autenticação de usuários, garantindo a integridade e a segurança do processo.

O projeto teve foco prático, contribuindo para o desenvolvimento de habilidades em organização de dados, automação de processos e construção de sistemas mais eficientes.

<h2 align="center">Tecnologias</h2>

<p align="center">
  <img src="https://img.shields.io/badge/VSCode-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white" />
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
  <img src="https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=jira&logoColor=white" />
  <img src="https://img.shields.io/badge/Canva-00C4CC?style=for-the-badge&logo=canva&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/JavaFX-007396?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/SceneBuilder-JavaFX-orange?style=for-the-badge&logo=java&logoColor=white" />
</p>

<img width="930" height="163" alt="image" src="https://github.com/user-attachments/assets/fe45a5b8-5aa1-4589-880c-0f9ab8c7d89d" />

<details>
  <summary>Implementação da tela de login e redefinição de senha</summary>

A tela de login foi desenvolvida como ponto de entrada da aplicação, sendo responsável pela autenticação do usuário e controle de acesso ao sistema. Sua estrutura foi pensada para ser simples e objetiva, garantindo uma boa experiência mesmo em um ambiente desktop.

A interface foi construída utilizando JavaFX com Scene Builder, permitindo a separação entre a camada visual (FXML) e a lógica de controle (controller). A tela contém campos para inserção de credenciais (usuário e senha), além de botões de ação, como “Entrar”. O uso do Scene Builder facilitou a organização dos componentes visuais e o alinhamento dos elementos, mantendo um padrão consistente de layout.

No backend da aplicação, a validação das credenciais foi implementada por meio da verificação dos dados informados com os registros armazenados (por exemplo, em banco de dados ou estrutura interna). O sistema trata diferentes cenários, como credenciais inválidas ou campos não preenchidos, exibindo mensagens de feedback ao usuário.

Além disso, foram aplicados conceitos importantes como:

Validação de entrada: verificação de campos vazios antes do processamento
Controle de fluxo: redirecionamento do usuário após login bem-sucedido
Tratamento de erros: exibição de mensagens claras em caso de falha
Separação de responsabilidades: divisão entre interface (FXML), controle (Controller) e lógica

  <p align="center">
 <img width="1052" height="624" alt="image" src="https://github.com/user-attachments/assets/2b0aba40-1b62-4aad-831d-c331199fc64c" />

 <br>
 
 <img width="523" height="362" alt="image" src="https://github.com/user-attachments/assets/6d64a086-6c70-416b-879a-36e96d9bc8ef" />


</p>

Esse controller foi desenvolvido para gerenciar a funcionalidade de recuperação de senha, sendo responsável pela interação entre a interface JavaFX e a lógica de validação dos dados informados pelo usuário. O método initialize é executado automaticamente ao carregar a tela. Nele, foi implementado um listener no campo txtRA, responsável por validar a entrada em tempo real.

Permite apenas valores numéricos (\\d*)
Impede que o RA ultrapasse 13 dígitos
Em caso de entrada inválida, o valor anterior é restaurado
Exibe uma mensagem de alerta utilizando mbox

Esse método é acionado ao clicar no botão de envio. Ele concentra o fluxo principal da recuperação de senha:

Captura do valor digitado
Obtém o RA a partir do campo txtRA
Validação inicial
Verifica se o campo está vazio
Caso esteja, exibe um alerta e interrompe a execução
Feedback ao usuário
Exibe uma mensagem de sucesso simulando o envio do RA
Consulta de dados
Realiza a busca do aluno através do AlunoDAO, utilizando o RA informado
Controle de navegação
Caso o aluno exista, realiza a troca de tela com sceneSwitcher
Recupera o controller da próxima tela (RedefinirSenhaController)
Passa o objeto Aluno para configuração da próxima etapa
Limpeza de estado
Limpa o campo txtRA após o processamento

  <p align="center">
<img width="1008" height="617" alt="image" src="https://github.com/user-attachments/assets/2a7f4240-4b51-4169-9af4-5e938b94e79d" />


 <br>

<img width="228" height="87" alt="image" src="https://github.com/user-attachments/assets/3cb6f126-6b03-4a03-b2dd-598febc5959e" />


<br>
 
<img width="652" height="360" alt="image" src="https://github.com/user-attachments/assets/d7bda901-7788-4f6a-a94a-2f7d47e8732d" />



</p>




A implementação dessa funcionalidade contribuiu para o entendimento de conceitos essenciais como autenticação, organização de interfaces gráficas e integração entre frontend e lógica da aplicação, sendo um componente fundamental para a estrutura do sistema.

</details>


<details>
  <summary>Implementação da Modelagem de banco de dados</summary>

  O banco de dados foi modelado seguindo o modelo relacional, com foco em representar de forma organizada as entidades do sistema e seus relacionamentos. A estrutura foi pensada para garantir integridade dos dados, evitar redundâncias e facilitar consultas futuras, principalmente relacionadas ao acompanhamento acadêmico.

A entidade central do sistema é o aluno, que possui informações como RA, nome, email e senha. Os alunos podem ser organizados em grupos, permitindo o trabalho em equipe dentro da aplicação. Além disso, há a entidade professor, responsável por gerenciar e acompanhar avaliações, critérios e o desempenho dos alunos ao longo do tempo.

As avaliações armazenam informações como nota e data, sendo associadas tanto aos alunos quanto aos critérios definidos no sistema. Os critérios funcionam como parâmetros de avaliação, contendo descrição, nome e status. Já as sprints representam períodos de desenvolvimento, com datas de início e fim, e estão relacionadas ao calendário, que organiza os semestres e períodos letivos.

Os relacionamentos foram definidos para refletir o funcionamento real do sistema, como aluno pertencendo a grupo, realização de avaliações e associação entre avaliações e critérios. Dessa forma, o banco permite consultas mais completas, como análise de desempenho por aluno, por sprint ou por critério, além de oferecer uma base estruturada para futuras melhorias e expansão do sistema.

<p align="center">
<img width="619" height="327" alt="image" src="https://github.com/user-attachments/assets/22bf4cea-1dd5-4657-b9a5-75f03e53f7aa" />
</p>
  
</details>

<details>
<summary><b>Refatoração das Telas</b></summary>

Todas as telas da aplicação foram refeitas em **JavaFX**, com foco na experiência do usuário. A interface foi redesenhada para ser mais intuitiva, acessível e visualmente consistente.

### Tela Principal do Aluno
A tela principal do aluno reuniu as informações essenciais em um único lugar. À esquerda, o perfil do usuário exibiu nome, RA e e-mail.

<p align="center">
  <img width="632" src="https://github.com/user-attachments/assets/1328c01c-6623-486a-92d0-596bef6a6514" alt="Tela Inicial">
</p>

### Tela de Avaliação
Nesta tela, o aluno realizou a avaliação de um colega de grupo. Os critérios — **Qualidade do Código**, **Pontualidade** e **Trabalho em Equipe** — foram exibidos com pontuação de 0 a 3.

<p align="center">
  <img width="751" src="https://github.com/user-attachments/assets/e7a34199-505b-4514-a8a5-c460a0c0ea64" alt="Avaliação">
</p>

### Painel do Professor
O painel do professor foi organizado em cards com ícones ilustrativos para cada funcionalidade: **Gerenciar Equipes**, **Administração de Critérios** e **Configurar Cronograma**.

<p align="center">
  <img width="650" src="https://github.com/user-attachments/assets/95fb6bd2-049e-47df-96b5-77649d6c1d62" alt="Admin">
</p>

### Administração de Critérios
Nesta tela, o professor visualizou todos os critérios cadastrados em uma tabela com ID, nome, descrição e status.

<p align="center">
  <img width="586" src="https://github.com/user-attachments/assets/2cf87342-67c4-42d7-b0b2-f997735fc5ac" alt="Critérios">
</p>

</details>

<img width="933" height="153" alt="image" src="https://github.com/user-attachments/assets/051ad8aa-9248-4dee-804f-7dcf9d5fb227" />

<details>
<summary><strong>Hard Skills</strong></summary>

<br>

- **Java e Programação Orientada a Objetos (POO)**  
  Desenvolvimento da aplicação utilizando conceitos como encapsulamento, classes, objetos e separação de responsabilidades, garantindo organização e reutilização de código.

- **JavaFX e Interfaces Gráficas**  
  Construção de interfaces desktop com JavaFX e Scene Builder, separando estrutura visual (FXML) da lógica (Controller) para melhor manutenção e escalabilidade.

- **Integração com Banco de Dados (MySQL)**  
  Modelagem e manipulação de dados em banco relacional, com foco em integridade, organização e consultas eficientes para geração de relatórios.

- **Modelagem de Banco de Dados**  
  Estruturação de entidades como aluno, grupo, avaliação, critérios e sprint, definindo relacionamentos coerentes com as regras de negócio do sistema.

- **Autenticação e Controle de Acesso**  
  Implementação de login com validação de credenciais, garantindo segurança e restrição de acesso às funcionalidades do sistema.

- **Validação de Dados**  
  Tratamento de entradas do usuário (como RA), aplicação de regras de validação e prevenção de erros durante a execução do sistema.

- **Arquitetura e Organização de Código (MVC)**  
  Separação entre interface, controle e lógica da aplicação, facilitando manutenção, testes e evolução do sistema.

</details>

<details>
<summary><strong>Soft Skills</strong></summary>

<br>

- **Trabalho em Equipe**  
  Colaboração ativa no desenvolvimento do projeto, alinhando decisões técnicas e dividindo responsabilidades entre os membros do grupo.

- **Resolução de Problemas**  
  Identificação e correção de falhas na aplicação, análise de bugs e busca por soluções eficientes durante o desenvolvimento.

- **Pensamento Analítico**  
  Interpretação das necessidades do sistema e tradução em funcionalidades estruturadas, especialmente na modelagem de dados e regras de negócio.

- **Organização**  
  Estruturação clara do projeto, mantendo padrões de código e organização de arquivos para facilitar entendimento e manutenção.

- **Comunicação Técnica**  
  Explicação de funcionalidades, decisões de desenvolvimento e funcionamento do sistema de forma clara em documentação e apresentações.

- **Autonomia e Aprendizado Contínuo**  
  Busca ativa por conhecimento em tecnologias como JavaFX, banco de dados e boas práticas de desenvolvimento durante a construção do projeto.

</details>

</details>

---
# Timesync (3º semestre)
![Semestre](https://img.shields.io/badge/semestre-3%C2%BA%20%C2%B7%202025-FF69B4?logo=googledocs&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=white)
![Angular](https://img.shields.io/badge/Angular-DD0031?logo=angular&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?logo=postgresql&logoColor=white)

O "Sistema de Ponto" é uma aplicação web do 3º semestre projetada para gerenciar o controle de ponto de funcionários em empresas terceirizadas, especialmente em áreas de manutenção. A plataforma oferece uma solução eficiente para o registro e acompanhamento das horas trabalhadas, otimizando a administração de equipes e assegurando maior precisão nos dados.

<p align="center">
  <img width="661" height="283" alt="image" src="https://github.com/user-attachments/assets/3d60faf7-0a9a-405f-be83-2be786cd0fa5" />
  <br/><br/>
   <a href="https://github.com/Vortek-API/Cimob-parent?tab=readme-ov-file">
    <img src="https://img.shields.io/badge/Repositório-GitHub-FF69B4?logo=github&logoColor=white" alt="Repositório" />
  </a>
</p>


<details>
<summary>Detalhes do projeto</summary>

![Brown Minimalist Welcome Message X_Twitter Header](https://github.com/user-attachments/assets/f3d75862-9269-4cc3-8754-7818520bc0f6)

O projeto TIMESYNC foi desenvolvido com o objetivo de automatizar o controle de ponto e o monitoramento de equipes, substituindo processos manuais por uma solução digital integrada, mais segura, padronizada e escalável

A aplicação permite registrar, armazenar e analisar dados de presença e jornada de trabalho em tempo real, centralizando informações que antes eram dispersas e facilitando a gestão operacional, com isso tornando possível acompanhar o desempenho dos colaboradores, identificar padrões e apoiar a tomada de decisão de forma mais estratégica

A solução foi construída seguindo uma arquitetura full stack, com frontend em Angular e backend em Java utilizando o Spring Framework, além da persistência em banco de dados MySQL, garantindo comunicação eficiente entre as camadas, consistência dos dados e maior confiabilidade no sistema

Entre as principais funcionalidades implementadas estão o registro de ponto com armazenamento estruturado em banco de dados, a visualização de informações por colaborador, empresa e período, a aplicação de filtros dinâmicos para consultas específicas, a geração de relatórios com dados consolidados, o controle de autenticação e autorização de usuários e a integração entre múltiplos módulos da aplicação

O desenvolvimento do projeto também envolveu preocupações com usabilidade, organização do código e separação de responsabilidades, permitindo que o sistema fosse facilmente mantido e evoluído ao longo do tempo

<h2 align="center">Tecnologias</h2>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
  <img src="https://img.shields.io/badge/VSCode-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
</p>

<img width="930" height="163" alt="image" src="https://github.com/user-attachments/assets/fe45a5b8-5aa1-4589-880c-0f9ab8c7d89d" />

<details>
<summary>Tela de colaboradores e Tela de espelho de ponto</summary>

No projeto acadêmico, atuei no **desenvolvimento completo da camada de frontend** utilizando **Angular** e **TypeScript**, tecnologias que combinam modularidade e tipagem estática para garantir alta manutenibilidade do código.  

<img width="956" height="447" alt="image" src="https://github.com/user-attachments/assets/0e288b52-fde5-4f1e-99b4-1d22e763beac" />

Desenvolvi **interfaces responsivas e dinâmicas**, com foco em **usabilidade e consistência visual**, criando componentes reutilizáveis para formulários, tabelas dinâmicas, botões de ação e modais informativos.  
Implementei **telas de cadastro com validações reativas**, **listagens com filtros avançados**, **paginação e ordenação de dados**, além de **dashboards interativos** que apresentavam indicadores de performance e estatísticas em tempo real.  

<img width="944" height="438" alt="image" src="https://github.com/user-attachments/assets/b51e9fb3-5f38-40cd-b71d-d9c4357e1a94" />

Durante o desenvolvimento, adotei princípios de **componentização e separação de responsabilidades**, garantindo que cada módulo fosse independente, testável e fácil de evoluir.  
Utilizei **Angular Services** para integração com APIs RESTful, aplicando interceptors para tratamento centralizado de erros e autenticação JWT.  
Apliquei também **Reactive Forms** para manipulação de dados do usuário e **RxJS Observables** para controle de fluxos assíncronos, permitindo respostas rápidas e atualizações em tempo real.  

<img width="988" height="655" alt="image" src="https://github.com/user-attachments/assets/202fb2de-7b01-4193-b8bc-b441f343ca77" />

Essa experiência reforçou a importância da **arquitetura limpa** e da **organização por módulos** em aplicações de larga escala. Além de entregar uma interface funcional, priorizei **acessibilidade**, **feedback visual** e **coerência nas interações**, garantindo uma jornada fluida ao usuário final. 

<img width="946" height="459" alt="image" src="https://github.com/user-attachments/assets/2fc82812-1d6e-42ed-98ce-59927922191d" />

Na **Ericsson**, essa vivência é diretamente aplicável, pois o trabalho envolve **aplicações corporativas complexas**, com alto volume de dados e integração com múltiplos sistemas.  
Saber **estruturar componentes reutilizáveis**, **gerenciar estados com eficiência** e **integrar APIs REST de forma segura e escalável** permite entregar **soluções performáticas e confiáveis**, reduzindo o tempo de desenvolvimento e aumentando a qualidade das entregas.  

</details>

<details>
<summary> Modelagem inicial do banco</summary>

<img width="1046" height="582" alt="image" src="https://github.com/user-attachments/assets/4c17c311-24e8-48f1-b37f-762f835620d2" />

Durante o projeto acadêmico, fui responsável pela **arquitetura e modelagem do banco de dados relacional**, utilizando **MySQL** como base principal.  
Criei um modelo de dados sólido e normalizado, com tabelas para **empresas, profissionais, registros de ponto e controle de horas**, garantindo **integridade referencial**, **consistência dos dados** e **relacionamentos bem estruturados (1:N, N:N)**.  

Implementei **consultas SQL otimizadas** para atender às demandas de filtragem e análise, incluindo:
- Filtros por **período de tempo**, **empresa** e **profissional**;
- **Agrupamentos** para sumarização de horas trabalhadas;
- **Joins complexos** para cruzar dados de múltiplas tabelas sem perda de performance;
- **Stored procedures** para automatizar cálculos e reduzir carga no backend.  

Durante o desenvolvimento, utilizei **índices compostos e chaves primárias otimizadas** para aumentar a velocidade das consultas, além de analisar planos de execução para garantir o melhor desempenho possível.  
Essa abordagem resultou em **tempo de resposta reduzido** e **melhor escalabilidade** da aplicação.  

Na **Ericsson**, essa base técnica é essencial para manipular **grandes volumes de dados provenientes de diferentes fontes**, garantindo que **dashboards e relatórios complexos** mantenham precisão e fluidez.  
O domínio de **modelagem de dados**, **otimização de queries** e **normalização** é um diferencial para integrar sistemas corporativos e suportar funcionalidades de análise avançada e relatórios customizados em tempo real.  

</details>
 
<details>
<summary>Java e Spring Framework no Backend (Tela de espelho de ponto)</summary>

<img width="1856" height="938" alt="image" src="https://github.com/user-attachments/assets/3e72d381-3f85-429e-a199-c5cd945021a1" />

No backend, utilizei **Java** e o **Spring Framework** para desenvolver **APIs RESTful escaláveis, seguras e de fácil manutenção**.  
A arquitetura foi desenhada seguindo princípios de **injeção de dependência**, **camadas bem definidas (Controller, Service, Repository)** e **boas práticas de versionamento e modularização**.  

Implementei endpoints para **cadastro, autenticação e consulta de dados**, aplicando **validação de entrada com Bean Validation**, **tratamento global de exceções** com `@ControllerAdvice` e **retornos padronizados em JSON** para garantir clareza e interoperabilidade com o frontend Angular.  
Também integrei **Spring Security** com **JWT tokens**, implementando autenticação e autorização por perfis de usuário, protegendo rotas sensíveis e garantindo o acesso adequado a cada funcionalidade.  

<img width="1845" height="955" alt="image" src="https://github.com/user-attachments/assets/b78452f0-001e-436c-b610-4a175690bc32" />

Além disso, trabalhei em **filtros dinâmicos de busca**, permitindo consultas parametrizadas via query string, o que aumentou a flexibilidade da API e reduziu a necessidade de múltiplos endpoints.  
A integração entre backend e frontend foi feita por meio de **CORS configurado**, **DTOs bem definidos** e **tratamento de erros padronizado**, garantindo uma comunicação estável e segura.  

Essa experiência me proporcionou uma visão completa de **arquitetura full stack**, além de consolidar boas práticas em **segurança, versionamento de código e performance**.  
O conhecimento em **Spring Boot**, **JPA/Hibernate** e **RESTful Design** permite construir APIs corporativas robustas — características indispensáveis em ambientes de produção como os da Ericsson.  

</details>

<details>
<summary>Product Owner: Definição de Prioridades, Organização do Backlog e Alinhamento com a Empresa</summary>
  
Assumi a função de **Product Owner (PO)**, atuando na **gestão do backlog**, **definição de prioridades** e **mediação entre o time técnico e as partes interessadas**.  
Trabalhei na **elaboração de user stories detalhadas**, com **critérios de aceitação claros** e **descrições técnicas completas**, permitindo que a equipe de desenvolvimento tivesse clareza total sobre o escopo de cada tarefa e com isso a construção da documentação de toda a nossa aplicação.  

[Manual do usuário.pdf](https://github.com/user-attachments/files/23004449/Manual.do.usuario.pdf)

[Manual do usuário (1).pdf](https://github.com/user-attachments/files/23004447/Manual.do.usuario.1.pdf)

Realizei **revisões constantes do backlog**, ajustando prioridades conforme feedbacks do cliente e métricas de valor.  
Essa atuação me ensinou a equilibrar **viabilidade técnica**, **valor de negócio** e **disponibilidade de recursos**, otimizando o uso do tempo e reduzindo gargalos durante o ciclo do sprint.  

Apliquei também práticas de **Scrum** e **Kanban**, utilizando ferramentas como **Jira e Trello** para visualização do fluxo de tarefas e acompanhamento de métricas de produtividade.  
A comunicação constante com a equipe e os stakeholders permitiu garantir **alinhamento estratégico** e **entregas contínuas de valor**, transformando requisitos complexos em resultados concretos e mensuráveis.  

<img width="1046" height="571" alt="image" src="https://github.com/user-attachments/assets/2188cda4-7ebf-44bd-837c-f210bff741a7" />

Essa experiência ampliou minhas habilidades de **planejamento, priorização e comunicação estratégica**, competências diretamente aplicáveis em projetos corporativos de grande escala, como os conduzidos pela Ericsson.  

</details>

<details>
<summary>Definição de todo o protótipo da aplicação</summary>

<img width="1187" height="861" alt="image" src="https://github.com/user-attachments/assets/af5d524f-9f03-41b0-b5cb-59a2019fc6c9" />

No frontend, o uso de **TypeScript aliado ao Angular Framework** foi essencial para garantir **segurança de tipos**, **escalabilidade** e **robustez** do código.  
Aproveitei ao máximo os recursos de **tipagem estática**, **interfaces e classes**, reduzindo erros em tempo de compilação e aumentando a previsibilidade do comportamento da aplicação.  

Implementei **serviços centralizados para chamadas HTTP**, utilizando o `HttpClient` com interceptors para autenticação, manipulação de tokens e tratamento global de erros.  
Trabalhei também na **manipulação de filtros dinâmicos**, **pipes personalizados** e **renderização condicional de componentes**, tornando a interface mais flexível e responsiva às necessidades do usuário.  

<img width="1187" height="861" alt="image" src="https://github.com/user-attachments/assets/1c8a67f2-55c5-47cb-aacb-4b9843de25da" />

Adotei um padrão modular organizado, com **módulos específicos por domínio**, facilitando a manutenção e permitindo que diferentes times trabalhassem de forma independente.  
Além disso, apliquei **princípios de UX/UI** para garantir que cada interação fosse intuitiva, rápida e consistente.  

<img width="1236" height="909" alt="image" src="https://github.com/user-attachments/assets/e42fbe1b-431a-4d68-af06-2be3203ef195" />

A combinação de TypeScript e Angular não apenas melhorou a **qualidade e previsibilidade do código**, mas também elevou o padrão de entrega das interfaces.  
Essa experiência foi determinante para consolidar minha capacidade de **desenvolver soluções frontend escaláveis e de alta performance**, características indispensáveis em projetos corporativos de larga escala.

</details>

<img width="933" height="153" alt="image" src="https://github.com/user-attachments/assets/051ad8aa-9248-4dee-804f-7dcf9d5fb227" />

<details>
<summary><strong>Hard Skills</strong></summary>

<br>

- **Java**  
  No backend, utilizei Java para criar APIs RESTful que deram suporte às funcionalidades do sistema. Atividades: desenvolvimento de endpoints detalhados (VTK-67), ajustes para empresas e colaboradores (VTK-28/30), filtros por data, empresa e profissional, integração com Spring Framework. Também atuei na organização das rotas, padronização de respostas e estruturação da aplicação para facilitar manutenção e escalabilidade.

- **Angular**  
  No frontend, utilizei Angular para desenvolver interfaces dinâmicas, incluindo telas de cadastro, upload de fotos com preview, listas filtráveis e ordenáveis, além de dashboard interativo com gráficos e relatórios exportáveis. Trabalhei com componentização, reaproveitamento de código e organização da aplicação para garantir melhor experiência do usuário e facilidade de evolução.

- **TypeScript**  
  Usei TypeScript para estruturar o frontend e garantir tipagem segura, com criação de interfaces, serviços reutilizáveis para requisições HTTP, filtros e manipulação de datas. A tipagem foi aplicada nos componentes Angular para prevenir erros, melhorar a legibilidade do código e facilitar manutenção em longo prazo.

- **MySQL**  
  Realizei a modelagem de tabelas como empresas, profissionais e registros de ponto, além da criação de consultas filtradas e totalização de horas. Trabalhei com otimização de queries, uso de joins e preparação de dados para consumo em APIs e exportação em formatos como PDF e Excel, garantindo performance e integridade das informações.

- **Spring Framework**  
  Estruturei o backend em camadas (service, repository e controller), aplicando autenticação e autorização, validação de dados e tratamento de exceções. Também participei da integração com Angular e TypeScript, garantindo comunicação eficiente entre frontend e backend e organização do fluxo de dados da aplicação.

</details>

<details>
<summary><strong>Soft Skills</strong></summary>

<br>

- **Comunicação**  
  Atuei como ponto de contato entre cliente e equipe, traduzindo requisitos de negócio para linguagem técnica, participando de reuniões e criando user stories e tarefas detalhadas. Essa atuação ajudou a minimizar retrabalho e garantir alinhamento entre todos os envolvidos no projeto.

- **Liderança**  
  Atuei como Product Owner, coordenando equipe multidisciplinar, definindo metas, planejando sprints e promovendo engajamento do time. Também fui responsável por acompanhar entregas, priorizar demandas e garantir que o projeto evoluísse de forma consistente e organizada.

- **Organização**  
  Realizei o gerenciamento de backlog, priorização de tarefas, planejamento de sprints e acompanhamento das entregas. Mantive registros detalhados e organização das atividades, contribuindo para maior clareza nas decisões e melhor controle do andamento do projeto.

- **Trabalho em equipe**  
  Colaborei com diferentes perfis técnicos, incentivando a troca de conhecimento, realizando revisões coletivas e ajudando na integração das entregas. Também atuei na mediação de conflitos e no alinhamento de decisões técnicas em grupo.

- **Resolução de problemas**  
  Atuei na identificação rápida de obstáculos, análise de cenários e avaliação de alternativas. Implementei soluções eficientes, replanejei tarefas quando necessário e garanti a continuidade do fluxo de desenvolvimento mesmo diante de imprevistos.

</details>


</details>

---
# CIMOB (4º semestre)
![Semestre](https://img.shields.io/badge/semestre-4%C2%BA%20%C2%B7%202025-FF69B4?logo=googledocs&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/Vue-007396?logo=openjdk&logoColor=white)
![Oracle](https://img.shields.io/badge/Oracle-F80000?logo=oracle&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-DC382D?logo=redis&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white)
![Nuxt](https://img.shields.io/badge/Nuxt-00DC82?logo=nuxt.js&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?logo=spring&logoColor=white)

Aplicação desktop desenvolvida no 4º semestre com Java, uma solução inovadora para aprimorar o processo de avaliação de competências no PACER, dentro da metodologia de Aprendizagem por Projetos Integrados.

<p align="center">
<img width="756" height="315" alt="image" src="https://github.com/user-attachments/assets/5613a0d4-77f8-4d9b-b74c-03ebde2b8a55" />
  <br/><br/>
  <a href="https://github.com/Vortek-API/Cimob-parent">
    <img src="https://img.shields.io/badge/Repositório-GitHub-FF69B4?logo=github&logoColor=white" alt="Repositório" />
  </a>
</p>

<details>
  <summary>Detalhes do projeto</summary>

![Brown Minimalist Welcome Message X_Twitter Header](https://github.com/user-attachments/assets/f3d75862-9269-4cc3-8754-7818520bc0f6)

O sistema proposto teve como objetivo a manipulação e análise de dados de radares de trânsito de São José dos Campos, permitindo a visualização de informações em tempo real por meio de dashboards interativos. Foi construído sobre um banco de dados relacional, com API RESTful em Spring Boot e atualizações via WebSocket, garantindo acesso seguro e eficiente.

A interface foi desenvolvida em Vue.js, sendo responsiva e intuitiva, integrando gráficos e mapas georreferenciados. Isso permitiu o monitoramento de indicadores e o disparo de alertas automáticos, facilitando a tomada de decisão na gestão do tráfego urbano.

<h2 align="center">Tecnologias</h2>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Vue.js-4FC08D?style=for-the-badge&logo=vue.js&logoColor=white" />
  <img src="https://img.shields.io/badge/Nuxt.js-00DC82?style=for-the-badge&logo=nuxtdotjs&logoColor=white" />
  <img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
  <img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white" />
  <img src="https://img.shields.io/badge/VSCode-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" />
  <img src="https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=redis&logoColor=white" />
</p>

<img width="930" height="163" alt="image" src="https://github.com/user-attachments/assets/fe45a5b8-5aa1-4589-880c-0f9ab8c7d89d" />

<details>
<summary>Planejamento do projeto e prototipos de telas</summary>

Fui responsável por toda a camada de frontend do projeto **CIMOB** (Controle Inteligente de Mobilidade), uma plataforma web voltada ao monitoramento de sistemas de mobilidade urbana de São José dos Campos, cobrindo desde a prototipação no Figma até a entrega final em produção.

Antes de iniciar o desenvolvimento, fui responsável pela **prototipação completa de todas as telas no Figma**, criando os wireframes e o design inicial de cada interface do sistema — desde o login até o painel administrativo. O protótipo completo está disponível [aqui](https://www.figma.com/design/ODP0OoiQv6W4ddHt4jUGQn/CIMOB---API-4%C2%B0-Semestre?m=auto&t=F8g6PwKNA3BmtShf-6).

A aplicação foi construída com **Vue.js** e **TypeScript**, adotando o **Composition API** para organização da lógica de cada componente de forma clara e reutilizável. A estrutura do projeto foi dividida em módulos independentes, facilitando manutenção e escalabilidade conforme novas funcionalidades eram adicionadas ao longo das sprints.

As interfaces entregues incluem **tela de login e cadastro** com validações em tempo real, toggle de visibilidade de senha e redirecionamento automático após autenticação; **tela principal com dashboard de indicadores** de mobilidade urbana filtráveis por região, com suporte a hover para exibição de detalhes e seleção customizada de até 6 indicadores simultâneos pelo administrador; **visualização de mapa interativo** com carregamento de radares e pontos de ônibus de São José dos Campos, com filtros de camadas e contagem total de pontos; **painel administrativo** com gerenciamento de usuários, tabela de logs com filtros por tipo, data e usuário, além de criação e edição de eventos externos georreferenciados; e integração com **grupo do Telegram** para envio automático de alertas críticos em tempo real aos administradores.

O consumo de APIs RESTful foi feito com **Axios**, configurado com interceptors para tratamento centralizado de erros e autenticação JWT. O gerenciamento de estado global foi implementado com **Pinia**, e os fluxos assíncronos foram controlados via **Composables**, garantindo atualizações em tempo real nos indicadores e logs da interface.

O código seguiu padrões de **clean code** e **separação de responsabilidades**, com componentes pequenos e bem definidos, composables para lógica compartilhada e uma camada de serviços dedicada à comunicação com o backend. Isso tornou o projeto mais fácil de testar, evoluir e revisar em equipe.


</details>


<details>
<summary> Documentação do projeto</summary>

Fui responsável pela produção de toda a documentação do projeto, centralizada em um repositório dedicado, organizado para cobrir todas as etapas do ciclo de desenvolvimento do CIMOB.
Elaborei o manual do usuário, guiando qualquer pessoa pelo uso da plataforma tela a tela, desde o primeiro acesso até as funcionalidades exclusivas do administrador. Produzi também o guia de instalação, com o passo a passo completo para configurar e executar o projeto localmente, cobrindo dependências, variáveis de ambiente e execução dos serviços.
Além disso, organizei as apresentações das sprints, documentando a evolução das entregas ao longo do semestre, as decisões técnicas tomadas em cada ciclo e o progresso das funcionalidades implementadas. Por fim, compilei os vídeos de evolução do projeto, que registram visualmente o desenvolvimento da aplicação do início ao fim, mostrando como o sistema foi tomando forma sprint a sprint.
Toda a documentação foi produzida com o mesmo cuidado aplicado ao código, garantindo rastreabilidade, clareza e facilidade de onboarding para qualquer pessoa que queira entender ou dar continuidade ao projeto.

<img width="497" height="389" alt="image" src="https://github.com/user-attachments/assets/9eac7e81-e287-4974-abfd-415430bc822b" />

<img width="502" height="484" alt="image" src="https://github.com/user-attachments/assets/3b720f13-5725-4745-99f3-c2121ea5f42f" />

</details>

<details>
<summary>Product Owner: Definição de Prioridades, Organização do Backlog e Alinhamento com a Empresa</summary>
  
Assumi a função de **Product Owner (PO)**, atuando na **gestão do backlog**, **definição de prioridades** e **mediação entre o time técnico e as partes interessadas**.  
Trabalhei na **elaboração de user stories detalhadas**, com **critérios de aceitação claros** e **descrições técnicas completas**, permitindo que a equipe de desenvolvimento tivesse clareza total sobre o escopo de cada tarefa e com isso a construção da documentação de toda a nossa aplicação.  


Realizei **revisões constantes do backlog**, ajustando prioridades conforme feedbacks do cliente e métricas de valor.  
Essa atuação me ensinou a equilibrar **viabilidade técnica**, **valor de negócio** e **disponibilidade de recursos**, otimizando o uso do tempo e reduzindo gargalos durante o ciclo do sprint.  

Apliquei também práticas de **Scrum** e **Kanban**, utilizando ferramentas como **Jira e Trello** para visualização do fluxo de tarefas e acompanhamento de métricas de produtividade.  
A comunicação constante com a equipe e os stakeholders permitiu garantir **alinhamento estratégico** e **entregas contínuas de valor**, transformando requisitos complexos em resultados concretos e mensuráveis. 
exemplo de entregaveis:  
- [Sprint 1](https://github.com/Vortek-API/cimob-docs/blob/main/CIMOB%20-%20V1.pptx)
- [Sprint 2](https://github.com/Vortek-API/cimob-docs/blob/main/CIMOB%20-%20V2.pptx)
- [Sprint 3](https://github.com/Vortek-API/cimob-docs/blob/main/CIMOB%20-%20V3.pptx)
  
</details>


<details>
<summary>Feitura de todas as telas do frontend</summary>

🔐 Login e Cadastro
A tela de login conta com autenticação por e-mail e senha, toggle de visibilidade de senha e link para recuperação de acesso. Já a tela de cadastro possui formulário com campos obrigatórios e realiza o login automaticamente após o registro.
<div align="center">
<img width="750" height="336" alt="login" src="https://github.com/user-attachments/assets/93ec962f-0784-4263-89b1-0265dd5df6ce" />
<img width="868" height="602" alt="cadastro" src="https://github.com/user-attachments/assets/a710ed9a-9c95-400c-9b61-0b5161148880" />
</div>

🏠 Tela Principal
A tela principal é o centro da aplicação, com sidebar de navegação, dashboard de indicadores de mobilidade urbana filtráveis por região, exibição de índices críticos e timestamp da última atualização dos dados.
<div align="center">
<img width="759" height="331" alt="tela principal" src="https://github.com/user-attachments/assets/2a532700-a087-4217-b2ee-5f9a92afe9b2" />
</div>

🗺️ Mapas
A tela de mapas oferece visualização interativa com radares e pontos de ônibus de São José dos Campos, filtros de camadas e contagem total de pontos no mapa.
<div align="center">
<img width="700" height="371" alt="mapas" src="https://github.com/user-attachments/assets/06cd01ea-82ac-4bbe-b4fa-6365c96c5e21" />
</div>

📊 Dashboard
O dashboard é dividido em duas subpáginas: Velocidades Registradas e Tipos de Veículos, ambas apresentando os dados coletados pelos radares da cidade.

🛡️ Administrador
Para usuários com perfil de administrador, foram desenvolvidas três telas exclusivas: Logs, com tabela completa de atividades filtráveis por usuário, indicador, tipo e data; Acessos, com gerenciamento de usuários, criação de novos acessos, edição de permissões e exclusão; e Eventos Externos, para criação e listagem de eventos georreferenciados exibidos diretamente no mapa.
<div align="center">
<img width="750" height="339" alt="logs" src="https://github.com/user-attachments/assets/1f78592f-cd39-4b35-b773-82f3111f1ef2" />
<img width="754" height="330" alt="acessos" src="https://github.com/user-attachments/assets/c1908add-08e2-48a4-b25c-5017a2010f93" />
</div>

✉️ Telegram e Recuperação de Senha
Foi implementada a integração com o Telegram, onde administradores acessam o grupo de alertas em tempo real direto pela interface. A tela de recuperação de senha permite que o usuário informe seu e-mail e receba o link de redefinição, com confirmação visual de envio na própria tela.
<div align="center">
<img width="582" height="548" alt="telegram e recuperação de senha" src="https://github.com/user-attachments/assets/31e592d4-fe30-465e-8ed6-eea4ab49b516" />
</div>
</details>

<details>
<summary>Implementação do e monitoramento dos logs no telegram</summary>
Contribuí com a implementação da integração entre o backend e o Telegram, conectando o sistema ao bot oficial da plataforma para envio automático de mensagens ao grupo de alertas. A integração utiliza a API do Telegram via requisições HTTP, enviando notificações em tempo real sempre que um evento relevante é registrado no sistema, como novos logs e alertas críticos. As mensagens são enviadas com formatação Markdown, permitindo uma leitura mais clara e estruturada diretamente no grupo.
<div align="center">
<img width="865" height="497" alt="image" src="https://github.com/user-attachments/assets/392f1037-5462-4f40-8456-03585f7f5b77" />

</div>

O serviço foi desenvolvido em Java com Spring Boot e funciona da seguinte forma: o token do bot e o ID do grupo são carregados de variáveis de ambiente, mantendo dados sensíveis fora do código. Quando um evento é disparado no sistema, o serviço monta uma requisição HTTP via RestTemplate e faz um POST direto para a API oficial do Telegram, passando o ID do grupo destino, o conteúdo da mensagem e o modo de formatação Markdown, que permite enviar alertas com negrito, itálico e links clicáveis diretamente no grupo.

<div align="center">
<img width="629" height="433" alt="image" src="https://github.com/user-attachments/assets/e928de5f-6e91-43e0-bb22-ecb1e4062d60" />

</div>

Contribuí também com a formatação das mensagens de alerta enviadas ao Telegram. O sistema verifica automaticamente a cada 5 minutos todos os indicadores de cada região da cidade e, quando algum atinge nível crítico, dispara o alerta automaticamente.
Cada mensagem chega formatada com o nível de severidade em três graus — Normal, Atenção e Crítico — com emojis, barra de progresso visual, região afetada, horário do registro e uma recomendação de ação personalizada conforme a gravidade, tudo em Markdown para ficar organizado e legível no grupo.

<div align="center">
<img width="950" height="612" alt="image" src="https://github.com/user-attachments/assets/4d38f849-0683-4e08-9fc7-653a76b4934a" />

</div>

</details>

<img width="933" height="153" alt="image" src="https://github.com/user-attachments/assets/051ad8aa-9248-4dee-804f-7dcf9d5fb227" />

<details>
<summary><strong>Hard Skills</strong></summary>
<br>

- **Vue.js**
Fui responsável por toda a camada de frontend do projeto CIMOB, construindo a aplicação com Vue.js e TypeScript usando o Composition API. A estrutura foi dividida em módulos independentes, facilitando manutenção e escalabilidade conforme novas funcionalidades eram adicionadas ao longo das sprints.

- **TypeScript**
Utilizei TypeScript em todo o frontend para garantir tipagem segura, criando interfaces, composables reutilizáveis e serviços para requisições HTTP, prevenindo erros e facilitando a manutenção do código em longo prazo.

- **Figma**
Fui responsável pela prototipação completa de todas as telas antes do desenvolvimento, criando wireframes e o design inicial de cada interface — do login ao painel administrativo. O protótipo está disponível [aqui](https://www.figma.com/design/ODP0OoiQv6W4ddHt4jUGQn/CIMOB---API-4%C2%B0-Semestre?m=auto&t=F8g6PwKNA3BmtShf-6).

- **Java / Spring Boot**
Contribuí com a integração do sistema ao Telegram via Spring Boot, com envio automático de alertas formatados em Markdown para o grupo de administradores. Implementei também o agendador que verifica a cada 5 minutos os indicadores de cada região e dispara notificações com nível de severidade, barra de progresso visual, horário e recomendação de ação conforme a gravidade.

</details>

<details>
<summary><strong>Soft Skills</strong></summary>
<br>

- **Organização**
Centralizei toda a documentação do projeto em um [repositório dedicado](https://github.com/Vortek-API/cimob-docs), reunindo manual do usuário, guia de instalação, apresentações das sprints ([Sprint 1](https://github.com/Vortek-API/cimob-docs/blob/main/CIMOB%20-%20V1.pptx), [Sprint 2](https://github.com/Vortek-API/cimob-docs/blob/main/CIMOB%20-%20V2.pptx), [Sprint 3](https://github.com/Vortek-API/cimob-docs/blob/main/CIMOB%20-%20V3.pptx)) e vídeos de evolução, mantendo tudo atualizado e acessível ao longo do semestre.

- **Comunicação**
Traduzi decisões técnicas em documentações claras e acessíveis, garantindo que qualquer pessoa pudesse entender ou dar continuidade ao projeto sem dificuldade.

- **Trabalho em equipe**
Colaborei com diferentes frentes do projeto, atuando tanto no frontend quanto no backend. A integração com o Telegram, por exemplo, exigiu alinhamento direto com o time para garantir que os alertas chegassem no formato e no momento certos.

- **Resolução de problemas**
Atuei de forma proativa em diferentes camadas do sistema, desde ajustes de interface até a lógica de formatação dos alertas, buscando soluções eficientes para os desafios encontrados ao longo do desenvolvimento.

</details>

</details>

---
# Strategic Cost Analytics (SCARS) (5º semestre) ![Status](https://img.shields.io/badge/Em%20Progresso-FF69B4?style=flat-square)
![Semestre](https://img.shields.io/badge/semestre-5%C2%BA%20%C2%B7%202026-FF69B4?logo=googledocs&logoColor=white)
![Python](https://img.shields.io/badge/Python-3776AB?logo=python&logoColor=white)
![Django](https://img.shields.io/badge/Django-092E20?logo=django&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?logo=postgresql&logoColor=white)
![Vue.js](https://img.shields.io/badge/Vue.js-4FC08D?logo=vue.js&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white)
![TypeScript](https://img.shields.io/badge/TypeScript-3178C6?logo=typescript&logoColor=white)
![DevOps](https://img.shields.io/badge/DevOps-0A0A0A?logo=azuredevops&logoColor=white)

Este projeto foi desenvolvido pela Steam Ducks, equipe formada por estudantes do 5º semestre do curso de Banco de Dados da FATEC São José dos Campos.

A proposta consiste na construção do SCARS, uma solução analítica voltada à consolidação e visualização de custos de projetos estratégicos, desenvolvida em parceria com a SIATT.

<p align="center">
<img width="659" height="133" alt="image" src="https://github.com/user-attachments/assets/13d090d0-3d73-43ce-b6c0-5eb4d04ddaf5" />
  <br/><br/>
  <a href="https://github.com/Steam-Ducks/strategic-cost-analytics?tab=readme-ov-file">
    <img src="https://img.shields.io/badge/Repositório-GitHub-FF69B4?logo=github&logoColor=white" alt="Repositório" />
  </a>
</p>

<details>
  <summary>Detalhes do projeto</summary>

![Brown Minimalist Welcome Message X_Twitter Header](https://github.com/user-attachments/assets/f3d75862-9269-4cc3-8754-7818520bc0f6)

O projeto tem como objetivo projetar e implementar um Data Warehouse capaz de consolidar dados relacionados a materiais, horas técnicas, projetos, programas e indicadores orçamentários, permitindo análises estruturadas e históricas para apoiar a tomada de decisão.

A plataforma é concebida para oferecer análise multidimensional, contemplando diferentes perspectivas — como tempo, programa, projeto, material, colaborador e situação financeira — ampliando a visibilidade, rastreabilidade e previsibilidade das iniciativas estratégicas.

<h2 align="center">Tecnologias</h2>

<p align="center">
  <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white" />
  <img src="https://img.shields.io/badge/Django-092E20?style=for-the-badge&logo=django&logoColor=white" />
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" />
  <img src="https://img.shields.io/badge/Vue.js-4FC08D?style=for-the-badge&logo=vue.js&logoColor=white" />
  <img src="https://img.shields.io/badge/TypeScript-3178C6?style=for-the-badge&logo=typescript&logoColor=white" />
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
  <img src="https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=githubactions&logoColor=white" />
  <img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white" />
  <img src="https://img.shields.io/badge/VS_Code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white" />
</p>

<img width="930" height="163" alt="image" src="https://github.com/user-attachments/assets/fe45a5b8-5aa1-4589-880c-0f9ab8c7d89d" />

<details>
  <summary><strong>Trilha de Desenvolvimento</strong></summary>
  
  <br>
  
<details>
  <summary><strong>Tela de Materiais</strong></summary>
  A tela de Materiais foi desenvolvida com base no wireframe disponibilizado pelo Product Owner na primeira sprint, servindo como referência inicial para a definição da estrutura, hierarquia de informações e organização dos componentes visuais.
<img width="1340" height="556" alt="Captura de tela 2026-04-05 183000" src="https://github.com/user-attachments/assets/f515674f-aef1-475c-9790-cb0d1d9dc437" />

O foco principal da implementação foi garantir a entrega de todas as seções previstas no protótipo do Figma, respeitando tanto os requisitos funcionais quanto a consistência visual do design proposto. A interface foi construída visando clareza na apresentação dos dados e suporte à análise estratégica.
<img width="1338" height="335" alt="Captura de tela 2026-04-05 183010" src="https://github.com/user-attachments/assets/b5858d8b-fb51-450c-ae78-158979129113" />

Entre os principais elementos implementados, destacam-se:



Cards de indicadores (KPIs) no topo da tela, apresentando:
Custo total de materiais
Total de itens
Custo médio por item
Camada de filtros dinâmicos, permitindo segmentação por:
Período
Programa
Projeto
Material
Campo de busca textual
Visualizações gráficas para समर्थन analítico:
Top 10 materiais por custo
Top 10 por quantidade consumida
Custo de materiais por projeto
Evolução temporal dos custos
Tabela detalhada de materiais, contemplando:
Informações como material, projeto, programa e fornecedor
Quantidade, valor unitário e valor total
Classificação por categoria
Paginação para navegação entre registros
<img width="1337" height="485" alt="Captura de tela 2026-04-05 183018" src="https://github.com/user-attachments/assets/74fe554b-be54-402b-b650-023c3c8da109" />

A implementação priorizou modularização dos componentes, facilitando manutenção e escalabilidade, além de seguir boas práticas de organização de layout e reutilização de elementos.


</details>

</details>

<details>
  <summary><strong>Trilha DevOps</strong></summary>

<br>

<details>
  <summary><strong>Monitoramento</strong></summary>
  
A trilha de monitoramento contemplou o planejamento e a estruturação completa da observabilidade da aplicação, inicialmente em ambiente de desenvolvimento (dev) e posteriormente preparada para evolução em produção (prod).

O processo teve início com a definição da estratégia de monitoramento da interface, considerando métricas relevantes para análise de desempenho, comportamento e consumo de recursos. A implementação foi guiada pela necessidade de fornecer visibilidade operacional e suporte à tomada de decisão técnica.

<img width="270" height="38" alt="Captura de tela 2026-04-05 183716" src="https://github.com/user-attachments/assets/55c7f8b0-9edb-45c7-a636-f4291ba55fe2" />


No ambiente de desenvolvimento, foi configurada uma stack baseada em:

Prometheus, responsável pela coleta e armazenamento de métricas da aplicação
Alertmanager, para gerenciamento e disparo de alertas
Grafana, para visualização dos dados por meio de dashboards interativos

Foram implementados:

Arquivos de configuração do Prometheus (prometheus.yml) com definição de targets e scraping
Regras de alerta (alerts.yml) para monitoramento de condições críticas
Provisionamento automático de dashboards no Grafana
Configuração de datasources integrando Prometheus ao Grafana
Dashboard inicial de visão geral (sca-production-overview.json)

<img width="293" height="349" alt="Captura de tela 2026-04-05 183803" src="https://github.com/user-attachments/assets/1fc4f8aa-2e4b-499b-bd20-347e1183e0cb" />

Além disso, foi estruturada uma camada complementar de logs utilizando:

Nginx como ponto de entrada
Logstash para processamento de logs
Organização de pipelines (logstash.conf) e armazenamento local (app.log)

A infraestrutura foi orquestrada utilizando dois Docker Compose distintos, separados por contexto:
<img width="289" height="65" alt="Captura de tela 2026-04-05 183727" src="https://github.com/user-attachments/assets/6078dafb-67e2-491e-9b05-fb35794c148b" />

Docker de desenvolvimento (dev): voltado para testes locais, validação de métricas e ajustes rápidos
Docker de produção (prod): preparado para execução estável, com foco em confiabilidade, isolamento e escalabilidade

Essa separação permitiu maior controle sobre o ciclo de vida da aplicação, garantindo que o ambiente produtivo mantenha configurações mais robustas, enquanto o ambiente de desenvolvimento permanece flexível para evolução contínua.

Como resultado, a trilha estabeleceu uma base sólida de monitoramento, observabilidade e análise, integrando métricas, logs e alertas em uma arquitetura coesa e escalável.

</details>

<details>
  <summary><strong>Documentação e testes da minhas features</strong></summary>

Embora eu não fosse a responsável principal pela trilha de testes e documentação, mantive como prática constante ao longo do projeto garantir que todas as features desenvolvidas fossem devidamente documentadas e testadas.

Cada funcionalidade implementada seguiu um fluxo consistente de validação, incluindo:

Testes funcionais, assegurando que os requisitos fossem atendidos conforme o esperado
Validação de integração, principalmente entre frontend, API e dados apresentados nos dashboards
Verificação de consistência dos dados, especialmente em telas analíticas como a de materiais

No aspecto de documentação, foi adotada uma abordagem contínua:

Registro das funcionalidades desenvolvidas e suas respectivas regras de negócio
Documentação das decisões técnicas relevantes
Organização das entregas para facilitar entendimento e manutenção por outros membros do time

Essa postura contribuiu para maior rastreabilidade, qualidade das entregas e facilidade de evolução do sistema, mesmo sem atuação direta como responsável pela trilha.


</details>

</details>

</details>

---

# (6º semestre) ![Status](https://img.shields.io/badge/Em%20Breve-FF69B4?style=flat-square)
![Semestre](https://img.shields.io/badge/semestre-6%C2%BA%20%C2%B7%202026-FF69B4?logo=googledocs&logoColor=white)


<br>



---

![Brown Minimalist Welcome Message XTwitter Header (1)](https://github.com/user-attachments/assets/89030cf3-8b72-4d0b-8b0f-6286b52520a3)



