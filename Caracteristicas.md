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
