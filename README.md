# Nome do Projeto: CadastroApp


## Descrição do projeto
Este é um aplicativo Android desenvolvido para a cadeira de computação para dispositivos móveis em Kotlin com suporte a banco de dados SQLite para cadastro e listagem de usuários. O projeto conta com uma tela de cadastro e uma tela de listagem dos dados cadastrados. O aplicativo também possui suporte a múltiplos idiomas (Português, Ingles e Espanhol) 

## Funcionalidades
- Tela de Cadastro: Permite que o usuário insira o nome, data de nascimento e telefone.
- Tela de Listagem: Mostra todos os usuários cadastrados em um RecyclerView.
- Suporte a Múltiplos Idiomas: O aplicativo está disponível em Português e Espanhol.
- Estilos Personalizados: As telas utilizam Styles para uma interface visual consistente.

## Tecnologias Utilizadas
- Kotlin: Linguagem de programação para desenvolvimento Android.
- SQLite: Banco de dados embutido no Android para persistência de dados.
- RecyclerView: Utilizado para exibir a lista de usuários cadastrados.
- Multilanguage Support: Suporte para Português e Espanhol.
- Styles e Themes: Para personalizar o visual das telas.

## Estrutura do Projeto
- Estrutura do Projeto
- DatabaseHelper.kt: Classe responsável pela criação e manipulação do banco de dados SQLite.
- RegisterActivity.kt: Activity que contém a tela de cadastro de usuários.
- ListActivity.kt: Activity que exibe a lista de usuários cadastrados.
- UserAdapter.kt: Adapter utilizado pelo RecyclerView na listagem de usuários.
- Strings e Tradução: Arquivos strings.xml para Português e Espanhol.
- Styles e Themes: Arquivos de estilo para padronização visual.

## Instalação e Configuração
- Clone o repositório: git clone https://github.com/DerickSabino/CadastroSQLite.git
- Abra o projeto no Android Studio:
- Certifique-se de que você tem o Android Studio instalado e configurado com o SDK apropriado.
Configuração do Emulador
- Crie um dispositivo virtual Android (AVD) no Android Studio com pelo menos API 30.
Caso prefira, utilize um dispositivo físico.
- Execute o Aplicativo:
- No Android Studio, selecione "Run" para compilar e executar o aplicativo no emulador ou dispositivo físico.

## Utilização
Tela de Cadastro:

- Insira o Nome, Data de Nascimento e Telefone do usuário.
- Clique em Salvar para armazenar o usuário no banco de dados SQLite.
- Tela de Listagem:

- Acesse a lista de todos os usuários cadastrados.
- Cada usuário é exibido com as informações inseridas na tela de cadastro.

  ## Desenvolvedor Derick Sabino




