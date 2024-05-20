# Sistema Concessionaria KarroNovo
Um sistema que gerencia 4 tipos de de veiculos diferentes para uma concessionaria 
## Descrição do Projeto
Este projeto é um sistema de controle de veículos desenvolvido para a Concessionária KarroNovo. O sistema permite gerenciar diferentes tipos de veículos: Carros, Motos, Caminhões e Bicicletas. Cada veículo possui atributos específicos e funcionalidades que facilitam a administração dos mesmos pela concessionária.
# Funcionalidades do Sistema
## 1. Cadastro de Veículos
O sistema permite o cadastro de novos veículos, incluindo:
- Carros: com informações de quantidade de portas e tipo de combustível.
- Motos: com informações de partida elétrica, cilindradas e tipo de combustível.
- Caminhões: com informações de carga máxima, número de eixos e tipo de combustível.
- Bicicletas: com informações do tipo de freio.
## 2. Edição de Veículos
É possível editar os dados dos veículos cadastrados, incluindo atributos específicos de cada tipo de veículo.
## 3. Consulta de Veículos
O usuário pode consultar as informações detalhadas de um veículo específico utilizando seu código (placa ou número de série).
## 4. Exclusão de Veículos
O sistema permite a exclusão de veículos cadastrados.
## 5. Listagem de Todos os Veículos
Os usuários podem visualizar uma lista de todos os veículos cadastrados no sistema, com seus principais atributos.
## 6. Validação de Dados
O sistema valida os dados inseridos para garantir a integridade das informações:
- Tipos de combustíveis permitidos para veículos automotores (Gasolina, Álcool, Flex, Elétrico, Diesel).
- Tipos de freio permitidos para bicicletas (Cantiléver, V-Brake, Ferradura, Disco Mecânico, Disco Hidráulico).
# Estrutura do Projeto
O projeto é estruturado com base em princípios de herança e encapsulamento, conforme detalhado abaixo:
## Classes Principais
O sistema permite o cadastro de novos veículos, incluindo:
- Veiculo: Classe base para todos os tipos de veículos, contendo atributos comuns (código, cor, marca, modelo, valor).
- Automotor: Subclasse de Veiculo, adiciona o atributo de combustível, sendo base para veículos automotores (Carros, Motos, Caminhões).
- Carro: Subclasse de Automotor, adiciona o atributo de quantidade de portas.
- Moto: Subclasse de Automotor, adiciona os atributos de partida elétrica e cilindradas.
- Caminhao: Subclasse de Automotor, adiciona os atributos de carga máxima e número de eixos.
- Bicicleta: Subclasse de Veiculo, adiciona o atributo de tipo de freio.
## Linguagem utilizada
- Java
# Instruções de Uso
## Menu Principal
Ao iniciar o programa, o usuário verá o seguinte menu:
- Cadastrar novo veículo
- Editar veículo
- Ver informações de um veículo específico
- Excluir um veículo
- Ver todos os veículos
- Sair
## Cadastrar Veículos
Selecionando a opção de cadastro, o usuário poderá escolher o tipo de veículo a ser cadastrado:
- Carro
- Moto
- Caminhão
- Bicicleta
- Voltar ao menu inicial
Cada tipo de veículo terá seu próprio conjunto de perguntas para capturar todos os atributos necessários.
## Edição, Consulta e Exclusão
O sistema solicitará o código do veículo para realizar as operações de edição, consulta ou exclusão.
## Membros do Grupo
- Gabriel Rozetto
- João Lucas
- Bruno
- Felipe
- João Gabriel
- Alice
- Gabriel Dantas
- Maria Luiza

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT)
