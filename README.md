# projetoautomatos
Projeto prático, implementar um autômato em java

Deve ser modelado e implementado um autômato que faça a validação de atribuições. Uma atribuição possui a
seguinte sintaxe:

identificador op_atrib (identificador | numero) (op_arit (identificador | numero) )* pv
Sendo que:

• identificador: inicia por uma letra minúscula, seguido por uma quantidade qualquer de letras minúsculas,
dígitos ou underline.
• op_atrib: é representado pelo caractere ‘=’
• numero: inicia por um dígito, seguido por uma quantidade qualquer de dígitos, podendo ter opcionalmente
a parte fracionária. Caso ele tenha a parte fracionária, ele recebe o caractere ‘.’ , seguido de uma sequência
de um ou mais dígitos.
• op_arit: é representado por um dos operadores aritméticos (‘+’ | ‘-’ | ‘*’ | ‘/’ )
• pv: é representado pelo caractere ‘;’.

Os tokens são representados pelas seguintes expressões regulares:

• identificador: [a-z] ( [a-z] | [0-9] | [_])*
• op_atrib: ‘=’
• numero: ( [0-9]([0-9])* ) | ( [0-9]([0-9])*‘.’ [0-9]([0-9])* )
• op_arit: (‘+’ | ‘-’ | ‘*’ | ‘/’ )
• pv: ‘;’
