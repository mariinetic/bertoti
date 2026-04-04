<img width="1500" height="500" alt="Brown Minimalist Welcome Message XTwitter Header" src="https://github.com/user-attachments/assets/99a4e32f-dbe6-4404-b3cf-6a8be7a001ab" />

Graduanda em *Banco de Dados* (formatura prevista para 2026) e atualmente estagiária em *Desenvolvimento Fullstack e Inteligência Artificial na Ericsson*. Sou apaixonada por inovação e organização, acreditando no poder dos dados para transformar negócios e gerar valor. Busco constante aprendizado para evoluir como profissional em dados e machine learning.

<p align="center">
  <strong>Meus contatos!</strong>
</p>

<p align="center">
  <a href="mailto:marianaoliveiry18@gmail.com" title="Gmail">
    <img src="https://img.shields.io/badge/-Gmail-FF69B4?style=flat-square&labelColor=FF69B4&logo=gmail&logoColor=white" alt="Gmail"/>
  </a>

  <a href="https://www.linkedin.com/in/oliveirasmari/" title="LinkedIn">
    <img src="https://img.shields.io/badge/-LinkedIn-FF69B4?style=flat-square&logo=linkedin&logoColor=white" alt="LinkedIn"/>
  </a>

  <a href="mailto:mariana.oliveira59@fatec.sp.gov.br" title="Outlook">
    <img src="https://img.shields.io/badge/-Outlook-FF69B4?style=flat-square&labelColor=FF69B4&logo=microsoft-outlook&logoColor=white" alt="Outlook"/>
  </a>
</p>

![Brown Minimalist Welcome Message XTwitter Header](https://github.com/user-attachments/assets/9c0a0a66-002d-47d0-961e-45f3389eb51c)


---
# Calculadora Científica

![Semestre](https://img.shields.io/badge/semestre-1%C2%BA%20%C2%B7%202024-lightgrey?logo=googledocs&logoColor=white)
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
# Pacer
![Semestre](https://img.shields.io/badge/semestre-2%C2%BA%20%C2%B7%202024-lightgrey?logo=googledocs&logoColor=white)
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

  O projeto foi desenvolvido no segundo semestre de 2025 no contexto da Aprendizagem por Projetos Integrados (API), com o objetivo de automatizar e padronizar o processo de avaliação de competências no PACER, substituindo o modelo manual sujeito a erros e inconsistências.

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
# Timesync
![Semestre](https://img.shields.io/badge/semestre-3%C2%BA%20%C2%B7%202025-lightgrey?logo=googledocs&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=white)
![Angular](https://img.shields.io/badge/Angular-DD0031?logo=angular&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?logo=postgresql&logoColor=white)

O "Sistema de Ponto" é uma aplicação web do 3º semestre projetada para gerenciar o controle de ponto de funcionários em empresas terceirizadas, especialmente em áreas de manutenção. A plataforma oferece uma solução eficiente para o registro e acompanhamento das horas trabalhadas, otimizando a administração de equipes e assegurando maior precisão nos dados.

<p align="center">
  <img width="661" height="283" alt="image" src="https://github.com/user-attachments/assets/3d60faf7-0a9a-405f-be83-2be786cd0fa5" />
  <br/><br/>
   <a href="[https://github.com/DenariusData/API-2SEM](https://github.com/Vortek-API/API3Sem)">
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

![1751367289922](https://github.com/user-attachments/assets/d648d5cd-4e7a-4c87-a94a-9b75ab6de09a)

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
# CIMOB
![Semestre](https://img.shields.io/badge/semestre-2%C2%BA%20%C2%B7%202025-lightgrey?logo=googledocs&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-007396?logo=openjdk&logoColor=white)
![SceneBuilder](https://img.shields.io/badge/Scene%20Builder-ED8B00?logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?logo=mysql&logoColor=white)

Aplicação desktop desenvolvida no 2º semestre com Java, uma solução inovadora para aprimorar o processo de avaliação de competências no PACER, dentro da metodologia de Aprendizagem por Projetos Integrados.

<p align="center">
<img width="756" height="315" alt="image" src="https://github.com/user-attachments/assets/5613a0d4-77f8-4d9b-b74c-03ebde2b8a55" />
  <br/><br/>
  <a href="[https://github.com/DenariusData/API-2SEM](https://github.com/Vortek-API/Cimob-parent)">
    <img src="https://img.shields.io/badge/Repositório-GitHub-FF69B4?logo=github&logoColor=white" alt="Repositório" />
  </a>
</p>

<details>
  <summary>Detalhes do projeto</summary>

  Conteúdo que fica escondido aqui.

</details>

---
