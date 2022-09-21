## Características

### Simplicidade

A simplicidade é uma das características importantes a se levar em consideração quando fala-se de código bem escrito. A simplicidade torna a linguagem
mais fácil de aprender, ler e entender, afetando a facilidade de escrita. Um código simples não quer dizer que é o menor, que utiliza a menor quantidade de recursos, mas sim um código que saiba utilizar estrategicamente o minímo de recursos possíveis para sua completa compreensão.

Se um código tem um número elevado de construções, alguns programadores não estarão familiarizados, o que pode levar ao uso incorreto ou falta de
alguns recursos que podem ser úteis e eficientes no projeto. Uma linguagem como Java, por exemplo, possui toda sua estrutura baseada em classes. Uma
das regras da linguagem Java quanto a classes é aceitar apenas herança simples, ou seja, uma classe não pode derivar de mais de uma classe. Já a
linguagem C++ oferece structs, classes e heranças múltiplas, o que o torna mais difícil sua escrita quando comparada ao Java.

Tentar alcançar a Simplicidade pode evitar os seguintes maus-cheiros definidos por Martin Fowler:

Classes longas;
Métodos longos;
Duplicação de código.

É possível refatorar projetos de código extraindo métodos para se alcançar a simplicidade. Com a operação "Extrair Métodos" é possível
identificar um método longo e refatorá-lo para diminuir seu tamanho.

### Modularidade

A modularidade permite que um projeto de código seja dividido em várias partes que interagem entre si. Essas partes são chamadas de módulos.
Nesse cenário, o código desenvolvido é dividido em módulos independentes, que podem ser utilizados a qualquer momento, individualmente
ou em conjunto. Isso permite que uma parte do código possa ser alterada (ou atualizada) sem que todo o código já desenvolvido seja alterado.
Assim, é muito mais prático atualizar um projeto de código (software). É preciso lembrar que buscar uma qualidade dentro dessa quebra por módulos do
projeto é bastante importante para não se ter problemas de comunicação entre eles.

Para se ter uma boa modularidade é preciso ter funcionalidades bem relacionadas entre si (alta coesão) e interdependência entre os módulos (baixo acoplamento).
Com isso, um módulo pode ser trabalhado e testado individualmente sem problemas. Nesse contexto de testes, uma das vantagens da modularidade é permitir a
divisão de tarefas entre os desenvolvedores e a possibilidade de criar testes unitários para os códigos.

Tentar alcançar a Modularidade pode evitar os seguintes maus-cheiros definidos por Martin Fowler:

Duplicação de código;
A obsessão primitiva;
Instruções switch;
Generalização especulativa.

É possível refatorar projetos de código extraindo métodos para se alcançar a modularidade. Utilizar a operação "Extrair método" quando a mesma expressão encontra-se em dois métodos na mesma classe é uma possível refatoração.

### Boa documentação

Uma boa documentação é um texto escrito que acompanha o software e geralmente explica como utilizá-lo. A documentação do software pode auxiliar usuários e programadores sobre as rotinas que estão contidas no software facilitando o uso e o desenvolvimento para futuras evoluções. Consiste num conjunto de manuais gerais e técnicos, até diagramas explicando o funcionamento do programa como um todo ou cada parte dele.

Em termos gerais, documentações precisam ter três elementos:

- contextualização de problema: informa cada obstáculo durante o desenvolvimento e em que situação ele ocorreu;
- contextualização de solução: explica as modificações feitas em processos ou no código que corrigiram o problema;
- detalhes técnicos: familiarizam o responsável por aquela parte do desenvolvimento sobre como, quando e por que aquela intervenção foi realizada.

Em relação com os maus-cheiros de código definidos por Fowler, uma boa documentação auxilia na redução de Códigos Duplicados, Métodos Longos, Classe Grande, Cadeias de Mensagens e Comentários.

Uma operação de refatoração que pode ser feita é remover comentários desnecessários, pois eles podem ser substituídos por uma boa documentação. Outra melhoria é que a documentação reduz as linhas de código e, consequentemente, a complexidade do código.


### Ausência de Duplicidades

Goodliffe(2006) afirma que a duplicação de código é inimiga do design simples e elegante e que as redundâncias fragilizam o código. Um projeto com duplicidades mostra-se menos manutenível e seguro, pois facilita o surgimento de problemas causados por modificações em um trecho de código que não são aplicadas aos trechos duplicados. Desta forma, um bug pode ser corrigido em uma parte do código, mas continuar presente em outra duplicada. Assim, a Ausência de Duplicidades facilita a correção de problemas, propicia um melhor entendimento do código e auxilia na manutenção e segurança do projeto.

A característica de Ausência de Duplicidades está associada ao mau-cheiro Código Duplicado, caracterizado pela repetição de um mesmo trecho de código em vários pontos do projeto. Para Fowler(1999), se um mesmo trecho de código existe em mais de um ponto do projeto, unificá-los aumenta a qualidade do programa.

Uma das operações de refatoração que levam um projeto a apresentar essa característica é a Extrair Método, quando a mesma expressão pode ser encontrada em dois métodos na mesma classe. Também é possível aplicar o método template e extrair comportamentos comuns de dois métodos e implementar a variabilidade em subclasses.

### Extensibilidade
Um código bem projetado, segundo Goodliffe(2006), apresenta a possibilidade de adição de novas funcionalidades, em locais apropriados, quando elas são necessárias. Entretanto, é fundamental aplicar o equilíbrio entre produzir um código extensível mas que não seja completamente focado em lidar com qualquer possível mudança que possa ocorrer. Caso contrário, isto pode gerar uma engenharia excessiva ao projeto. Portanto, busca-se extender o código através de plug-ins, hierarquias de classe e interfaces bem planejadas, funções com retornos úteis e com uma estrutura de código lógica e maleável (GOODLIFFE, 2006).

Como citado, é nescessário buscar um equilíbrio ao aplicar a extensibilidade em um projeto. Quando não existe este cuidado, identifica-se o mau-cheiro de Generalidade Especulativa. Neste caso, os projetos, visando adicionar funcionalidades que, em algum momento, poderiam ser implementadas, se tornam genéricos, apresentando maior complexidade para seu entendimento e manutenção. 

Isto posto, é possível refatorar o projeto através da diminuição da hierarquia (reduzindo classes abstratas que não apresentam grande funcionalidade), da incorporação de classe (quando existem delegações desnecessárias) e a remoção de parâmetros (excluindo parâmetros que não são úteis a um método). Desta forma, elimina-se o mau-cheiro consequente da especulação da adição de futuras funcionalidades.  

## Referências
* GOODLIFFE, P. Code craft : the practice of writing excellent code. San Francisco: No Starch Press, 2006.
