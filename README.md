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
