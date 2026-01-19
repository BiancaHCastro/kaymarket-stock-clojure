# KayMarket - Carteira de Ações

# kaymarket

KayMarket é um projeto de um gerenciador de carteira de ações na bolsa de valores do Brasil.

O projeto acessa a API da Brapi para consultar os valores das ações em tempo real ou na data histórica conforme necessidade

Utiliza conceitos de Programação Funcional como imutabilidade, atomicidade, pureza e estratégias de recursão.

Foi desenvolvido por Bianca e Kaylany, na linguagem Clojure, com orientação do Professor Gilson Pereira, sob a ótica do livro Programação Funcional: Uma introdução em Clojure por Gregório Melo.

O sistema usa o conceito de divisão impura e funções puras, com CLI que é onde o usuário realiza as atividades.

Ele pode: 

- Comprar e vender ações
- Consultar ação em tempo real
- Consultar histórico de transações
- Consultar Saldo da Carteira

## Usage

### Instruções de execução

A seguir estão instruções para executar o projeto em ambiente Windows.

Utilizando leiningen, no Prompt de Comando

1. **INSERIR CHAVE DA API NO CLIENT.CLJ**
    
    Insira sua chave gratuita corretamente no campo “SUA_CHAVE”
    
2. Acessa pasta do projeto no Prompt de Comando
Roda o servidor com:
lein run
    
    Essa execução irá iniciar o servidor na porta 3000.
    
3. Acessa OUTRA aba de Prompt de Comando
Roda o REPL:
lein repl
4. Roda os seguinte comandos, linha por linha:
(require '[kaymarket.cli :as cli])
    
    (cli/menu-principal)
    

→ Executar os testes de acordo com a necessidade.

FIXME: explanation

```
$ java -jar kaymarket-0.1.0-standalone.jar [args]

```

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections

### That You Think

### Might be Useful

###
