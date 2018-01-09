# Explicação

Dada um canvas de tamanho WxH na qual cada elemento represente um pixel, crie
um programa que leia uma sequência de comandos e os interprete manipulando o canvas de acordo com a descrição abaixo de cada comando.

## Comandos

### new [largura] [altura] [cor]
Cria um novo canvas MxN, com uma cor padrão

### clean
Limpa a matriz. O tamanho permanece o mesmo. Todos os pixels ficam com a cor padrão.

### paint [linha] [coluna] [cor]
Colore um pixel de coordenadas (X,Y) com uma determinada cor.

### paint-vertical [coluna] [linhaInicial] [linhaFinal] [cor]
Desenha uma linha vertical na coluna X nas linhas de Y1 a Y2 (intervalo
inclusivo) com determinada cor.

### paint-horizontal [linha] [colunaInicial] [colunaFinal] [cor]
Desenha uma linha horizontal na linha Y nas colunas de X1 a X2 (intervalo
inclusivo) com determinada cor.

### paint-rectangle [linhaInicial] [colunaInicial] [linhaFinal] [colunaFinal] [cor]
Desenha um retangulo de cor C. <linhaInicial> <colunaInicial> é o canto superior esquerdo e <linhaFinal> <colunaFinal> o
canto inferior direito.

### fill [linha] [coluna] [cor]
Preenche a região com a cor determinada. A região é definida da seguinte forma:
O pixel (X,Y) pertence à região. Outro pixel pertence à região, se e somente se,
ele tiver a mesma cor que o pixel (X,Y) e tiver pelo menos um lado em comum com
um pixel pertencente à região.

### exit
Encerra o programa.

### help
Exibe a lista de comandos

## Considerações
Comandos diferentes dos que foram informados devem exibir um erro.


