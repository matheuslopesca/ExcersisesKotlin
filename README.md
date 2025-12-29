# Diário de Estudos: Desafios Kotlin (Iniciante)

Este repositório contém as soluções para três desafios práticos de Kotlin, focados em lógica de programação e sintaxe básica.

## 1. O Saudador Condicional (`ConditionerHello.kt`)
**Objetivo:** Praticar input/output e estruturas condicionais (`if/else`).
O programa solicita nome e idade do usuário e exibe uma mensagem personalizada baseada na faixa etária.

**Aprendizados Chave:**
*   **Operadores Relacionais:** A importância da precisão nos intervalos. Diferença entre `>` (maior que) e `>=` (maior ou igual). Ex: `age >= 60` para incluir quem tem exatamente 60 anos na "terceira idade".
*   **Padronização de Código:** Manter a consistência no uso de chaves `{}` em blocos `if/else` melhora a legibilidade.

---

## 2. Conversor de Temperaturas (`TemperatureConversor.kt`)
**Objetivo:** Praticar loops (`do-while`), criação de funções e menus interativos.
Um conversor contínuo entre Celsius e Fahrenheit que só encerra quando o usuário escolhe a opção "Sair".

**Aprendizados Chave:**
*   **Escopo de Variáveis em Loops:** Variáveis declaradas *dentro* do bloco `do` não são visíveis na condição `while`. A solução é declarar a variável de controle *antes* do loop.
*   **Matemática Inteira vs Double:** Cuidado com divisões como `9/5` que resultam em `1` se ambos forem inteiros. A melhor prática é usar `9.0/5.0` ou multiplicação direta (`1.8`) ao trabalhar com fórmulas precisas.
*   **Single Responsibility:** Separar a lógica de "pegar input" (`getTemperature`) da lógica de conversão (`celsiusToFahrenheit`) deixa o código mais limpo.

---

## 3. Pedra, Papel e Tesoura (`rockPaperOrScissors.kt`)
**Objetivo:** Praticar lógica condicional composta (E/OU), randomização e loops.
O clássico jogo Jokenpô contra o computador.

**Aprendizados Chave:**
*   **Lógica Circular:** "Maior que" não funciona aqui (Pedra > Tesoura, mas Tesoura > Papel, etc). Foi necessário mapear especificamente as condições de vitória (`&&`).
*   **Lógica Booleana:** Como construir condições compostas (ex: `escolha == 1 && computador == 3`) para verificar vitórias específicas.
*   **Reforço de Escopo:** Novamente, a importância de declarar a variável de repetição (`Quer jogar novamente?`) fora do escopo do `do-while` para que o teste de saída funcione.

---

## 4. A Tabuada Personalizada (`calculatorTab.kt`)
**Objetivo:** Praticar loops definidos (`for`) e modularização de código.
O programa solicita um número ao usuário e exibe sua tabuada completa de 1 a 10.

**Aprendizados Chave:**
*   **Modularização:** A separação de responsabilidades em funções (`getInput` vs `geraTabuada`) facilita a leitura e manutenção.
*   **Interpolação de Strings:** Uso de `${}` para realizar cálculos diretamente dentro da string de exibição.

---

## 5. Calculadora de IMC (`icmCalculator.kt`)
**Objetivo:** Praticar lógica matemática e a estrutura de decisão `when`.
Calcula o Índice de Massa Corporal (IMC) e fornece um diagnóstico de saúde baseado no resultado.

**Aprendizados Chave:**
*   **When sem Argumentos:** Uso da estrutura `when` como uma alternativa mais limpa a cadeias de `if/else if`, testando condições booleanas diretamente.
*   **Tipagem Forte:** Manipulação de `Double` para cálculos precisos de peso e altura.

---

## 6. Jogo da Adivinhação (`MisteriousGame.kt`)
**Objetivo:** Trabalhar com números aleatórios (`Random`) e loops condicionais (`do-while`).
Um jogo onde o usuário tenta adivinhar um número secreto, recebendo dicas de "Mais" ou "Menos".

**Aprendizados Chave:**
*   **Lógica de Loop:** Uso do `do-while` para garantir que o input seja solicitado ao menos uma vez antes do teste lógico.
*   **Randomização:** Uso de `Random.nextInt` e a importância de entender os limites (exclusivo vs inclusivo) dos intervalos.

---

## 7. Lista de Convidados (`guessList.kt`)
**Objetivo:** Introdução ao conceito de Coleções (`List`) e manipulação de dados em memória.
Armazena nomes em uma lista dinâmica e os exibe na ordem inversa.

**Aprendizados Chave:**
*   **Passagem por Referência:** Compreensão de que Objetos (como Listas) passados para funções podem ser modificados internamente sem necessidade de retorno.
*   **Coleções Mutáveis:** Uso de `MutableList` para adicionar itens dinamicamente em tempo de execução.

---

## 8. O Analisador de Números (`NumberAnalyzer.kt`) - *Novo!*
**Objetivo:** Praticar Listas (`List/MutableList`), Loops (`for`), Random e Lógica de Comparação.
Gera uma lista de números aleatórios e realiza análises manuais (contagem de pares/ímpares, maior/menor valor) para exercitar a lógica pura sem depender excessivamente de funções prontas.

**Aprendizados Chave:**
*   **Algoritmo "Rei da Colina":** Implementação manual da lógica para encontrar Maior/Menor valor percorrendo a lista e mantendo o "campeão atual".
*   **Iteração Segura:** Uso de `list.indices` para percorrer listas de forma segura e performática, evitando erros de "Index Out of Bounds".
*   **Clean Code:** A importância de manter nomenclaturas consistentes (Inglês vs Português) para evitar confusão mental.

---

## 9. Simulador de Supermercado (`Supermarket.kt`) - *Novo!*
**Objetivo:** Praticar Loops condicionais (`while/do-while`), Acumuladores e Lógica Matemática com Double.
Simula um caixa onde o usuário "compra" itens até o dinheiro acabar. Exige controle de fluxo cuidadoso para não permitir gastos além do saldo.

**Aprendizados Chave:**
*   **Perigos do Casting:** Converter `Double` para `Int` (ex: `0.50` para `0`) pode quebrar a lógica de validação. A comparação deve ser feita com o tipo original.
*   **Controle de Fluxo:** Estruturar o `do-while` para garantir que a verificação de saldo ocorra *antes* da subtração efetiva.
*   **Lógica de Saída:** Diferença entre sair por vontade própria (loop break) e sair por falta de recursos (while condition).