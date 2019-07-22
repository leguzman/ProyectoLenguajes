//Nombre del lenguaje: Diunisio
grammar Diunisio;
compilationUnit
    :   annotations
        (   packageDeclaration dependencia* declaracionTipo*
        |   classOrInterfaceDeclaration declaracionTipo*
        )
        EOF
    |   packageDeclaration? dependencia* declaracionTipo*
        EOF
    ;

packageDeclaration
    :   'package' qualifiedName ';'
    ;

dependencia
    :   'usando'  qualifiedName ('.' '*')? ';'
    ;

declaracionTipo
    :   declaracionClaseOInterfaz
    |   ';'
    ;

declaracionClaseOInterfaz
    :    (declaracionClase | declaracionInterfaz)
    ;

modificadoresDeClase
    :   modificadorClase*
    ;

modificadorClase
    :   annotation       // class or interface
    |   (   'publica'     // class or interface
        |   'protegida'  // class or interface
        |   'privada'    // class or interface
        |   'abstracta'   // class or interface
        |   'estatica'     // class or interface
        |   'final'      // class only -- does not apply to interfaces
        )
    ;

modificadores
    :   modificador*
    ;

declaracionClase
    :   normaldeclaracionClase
    ;

normaldeclaracionClase
    :   'clase' modificadoresDeClase IDENTIFICADOR typeParameters?
        ('extends' tipo)?
        ('implements' typeList)?
        classBody
    ;

typeParameters
    :   '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    :   IDENTIFICADOR ('extends' typeBound)?
    ;

typeBound
    :   tipo ('&' tipo)*
    ;


enumBodyDeclarations
    :   ';' (classBodyDeclaration)*
    ;

declaracionInterfaz
    :   normaldeclaracionInterfaz/*
    |   annotationTypeDeclaration*/
    ;

normaldeclaracionInterfaz
    :   'interface' IDENTIFICADOR typeParameters? ('extends' typeList)? interfaceBody
    ;

typeList
    :   tipo (',' tipo)*
    ;

classBody
    :   '{' classBodyDeclaration* '}'
    ;

interfaceBody
    :   '{' interfaceBodyDeclaration* '}'
    ;

classBodyDeclaration
    :   ';'
    |   'estatica'? bloque
    |   modificadores memberDecl
    ;

memberDecl
    :   genericMethodOrConstructorDecl
    |   memberDeclaration
    |   'void' IDENTIFICADOR voidMethodDeclaratorRest
    |   IDENTIFICADOR constructorDeclaratorRest
    |   declaracionInterfaz
    |   declaracionClase
    ;

memberDeclaration
    :   tipo (methodDeclaration | fieldDeclaration)
    ;

genericMethodOrConstructorDecl
    :   typeParameters genericMethodOrConstructorRest
    ;

genericMethodOrConstructorRest
    :   (tipo | 'void') IDENTIFICADOR methodDeclaratorRest
    |   IDENTIFICADOR constructorDeclaratorRest
    ;

methodDeclaration
    :   IDENTIFICADOR methodDeclaratorRest
    ;

fieldDeclaration
    :   variableDeclarators ';'
    ;

interfaceBodyDeclaration
    :   modificadores interfaceMemberDecl
    |   ';'
    ;

interfaceMemberDecl
    :   interfaceMethodOrFieldDecl
    |   interfaceGenericMethodDecl
    |   'void' IDENTIFICADOR voidInterfaceMethodDeclaratorRest
    |   declaracionInterfaz
    |   declaracionClase
    ;

interfaceMethodOrFieldDecl
    :   tipo IDENTIFICADOR interfaceMethodOrFieldRest
    ;

interfaceMethodOrFieldRest
    :   constantDeclaratorsRest ';'
    |   interfaceMethodDeclaratorRest
    ;

methodDeclaratorRest
    :   formalParameters ('[' ']')*
        ('throws' qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;

voidMethodDeclaratorRest
    :   formalParameters ('throws' qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;

interfaceMethodDeclaratorRest
    :   formalParameters ('[' ']')* ('throws' qualifiedNameList)? ';'
    ;

interfaceGenericMethodDecl
    :   typeParameters (tipo | 'void') IDENTIFICADOR
        interfaceMethodDeclaratorRest
    ;

voidInterfaceMethodDeclaratorRest
    :   formalParameters ('throws' qualifiedNameList)? ';'
    ;

constructorDeclaratorRest
    :   formalParameters ('throws' qualifiedNameList)? constructorBody
    ;

constantDeclarator
    :   IDENTIFICADOR constantDeclaratorRest
    ;

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

constantDeclaratorsRest
    :   constantDeclaratorRest (',' constantDeclarator)*
    ;

constantDeclaratorRest
    :   ('[' ']')* '=' variableInitializer
    ;

variableDeclaratorId
    :   IDENTIFICADOR ('[' ']')*
    ;

qualifiedNameList
    :   qualifiedName (',' qualifiedName)*
    ;
variableInitializer
    :   arrayInitializer
    |   expresion
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

modificador
    :   annotation
    |   (   'publica'
        |   'protegida'
        |   'privada'
        |   'estatica'
        |   'abstracta'
        |   'final'
        |   'native'
        |   'synchronized'
        |   'transient'
        |   'volatile'
        |   'strictfp'
        )
    ;
formalParameters
    :   '(' formalParameterDecls? ')'
    ;

formalParameterDecls
    :   variableModifiers tipo formalParameterDeclsRest
    ;
    variableModifiers
        :   variableModifier*
        ;

variableModifier
    :   'final'
    |   annotation
    ;
formalParameterDeclsRest
    :   variableDeclaratorId (',' formalParameterDecls)?
    |   '...' variableDeclaratorId
    ;
methodBody
    :   block
    ;

constructorBody
    :   block
    ;
qualifiedName
    :   IDENTIFICADOR ('.' IDENTIFICADOR)*
    ;
/*
literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;*/
    block
    :   '{' blockStatement* '}'
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   classOrInterfaceDeclaration
    |   statement
    ;
    classOrInterfaceDeclaration
        :   classOrInterfaceModifiers (declaracionClase | declaracionInterfaz)
        ;

    classOrInterfaceModifiers
        :   classOrInterfaceModifier*
        ;

    classOrInterfaceModifier
        :   annotation       // class or interface
        |   (   'publica'     // class or interface
            |   'protegida'  // class or interface
            |   'privada'    // class or interface
            |   'abstracta'   // class or interface
            |   'estatica'     // class or interface
            |   'final'      // class only -- does not apply to interfaces
            |   'strictfp'   // class or interface
            )
        ;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration
    :  type   variableDeclarators
    ;
/*
variableModifiers
    :   variableModifier*
    ;*/

statement
    :	block
    |   bloque
    |   proposicion
    |   statementExpression ';'
    /*
    |   ASSERT expression (':' expression)? ';'
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'do' statement 'while' parExpression ';'
    |   'try' block (catches finallyBlock? | finallyBlock)
	|	'try' resourceSpecification block catches? finallyBlock?
    |   'switch' parExpression '{' switchBlockStatementGroups '}'
    |   'synchronized' parExpression block
    |   'return' expression? ';'
    |   'throw' expression ';'
    |   'break' Identifier? ';'
    |   'continue' Identifier? ';'
    |   ';'*/

    |   IDENTIFICADOR ':' statement
    ;
    statementExpression
        :   expresion
        ;
    annotations
    :   annotation+
    ;

annotation
    :   '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
    ;

annotationName
    : IDENTIFICADOR ('.' IDENTIFICADOR)*
    ;

elementValuePairs
    :   elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    :   IDENTIFICADOR '=' elementValue
    ;

elementValue
    :   //conditionalExpression//falta ponerla
    |   annotation
    |   elementValueArrayInitializer
    ;

elementValueArrayInitializer
    :   '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;
unaryExpressionNotPlusMinus
    :  primary selector ('++'|'--')?
    |  primary selector* ('++'|'--')?
    ;
//Símbolo inicial
algoritmo
 : ALGORITMO IDENTIFICADOR (PAREN_AP lista_ids PAREN_CI)? DOSPUNTOS bloque TERMINA
 ;

//Lista de identificadores
lista_ids
 : IDENTIFICADOR (COMA IDENTIFICADOR)*
 |
 ;

//Expresiones simples/*
//exp_simpleprop
 //: PAREN_AP exp_simple PAREN_CI
 //| (op=(SUMA | MENOS))? expresionCondicional (op2=(SUMA | MENOS | O) expresionCondicional)*
 //| unaryExpressionNotPlusMinus
 //;
 exp_simple
  : PAREN_AP exp_simple PAREN_CI
  | (op=(SUMA | MENOS))? termino (op2=(SUMA | MENOS | O) termino)*
  | termino
  ;

//Expresiones compuestas
expresion
 :  PAREN_AP expresion PAREN_CI
 | exp_simple op=(IGUAL | DIFERENTE | MEN_IGUAL | MAY_IGUAL | MENOR | MAYOR) exp_simple
 | PAREN_AP exp_simple PAREN_CI
 |expresionCondicional (assignmentOperator expresion)?
 | exp_simple
 | NO expresion
 ;
expresionCondicional
 : unaryExpression
 ;
 assignmentOperator
     :   '='
     |   '+='
     |   '-='
     |   '*='
     |   '/='
     |   '&='
     |   '|='
     |   '^='
     |   '%='
     |   '<<='
     |   '>>='
     |   '>>>='
     ;
 unaryExpression
     :   '+' unaryExpression
     |   '-' unaryExpression
     |   '++' unaryExpression
     |   '--' unaryExpression
     |   unaryExpressionNotPlusMinus
     ;
//Definición de variable
variable
 : IDENTIFICADOR conjunto
 | IDENTIFICADOR
 ;

//Definición de término
termino
 : PAREN_AP termino PAREN_CI
 | factor (op=(MULT | DIV | MOD | Y | O | POTENCIA) factor)*
 | NO termino
 | factor
 ;

//Definición de factor
factor
 : ENTERO
 | REAL
 | CADENA
 | COMPLEJO
 | NULO
 | variable
 | IDENTIFICADOR lista_parsv?
 | IDENTIFICADOR (ANGIZ factor ANGDE)+
 | IDENTIFICADOR
 | NO factor
 | VERDADERO
 | FALSO
 | conjunto
 | PAREN_AP expresion PAREN_CI
 ;

//Lista de parámetros
lista_parsv
 : PAREN_AP (expresion | variable | IDENTIFICADOR) (COMA (expresion | variable | IDENTIFICADOR ))* PAREN_CI
 | PAREN_AP PAREN_CI
 ;

//Definición de conjunto
conjunto
 : LLAVEIZ (expresion (COMA expresion)*)? LLAVEDE
 ;

//Identificador de tipo de retorno
tipo
 : INT | FLOAT | STRING | BOOL | MATRIZ | VECTOR;
type
	:	classOrInterfaceType ('[' ']')*
	|	tipo ('[' ']')*
	;

classOrInterfaceType
	:	IDENTIFICADOR typeArguments? ('.' IDENTIFICADOR typeArguments? )*
	;



//Bloque
bloque
 : LLAVEIZ LLAVEDE
 | LLAVEIZ sec_proposiciones LLAVEDE
 ;

//Secuenciación
sec_proposiciones
 : (proposicion)* proposicion
 ;

//Conjunto de posibles sentencias
proposicion
 : RETORNAR expresion PCOMA
 | fun_senten
 | proc_senten
 | si_senten
 | seleccionar_senten
 | mientras_senten
 | para_senten
 | hacer_mientras_senten
 | asignacion PCOMA
 | IDENTIFICADOR lista_parsv PCOMA //Llamar función o procedimiento
 | LLAVEIZ sec_proposiciones LLAVEDE
 | OTRO {System.err.println("Caracter desconocido: " + $OTRO.text);}
 ;

//Modo de asignación
asignacion
 : IDENTIFICADOR ASIGNAR expresion  #asigNum
 | IDENTIFICADOR ASIGNAR conjunto   #asigVec
 ;

//Selección IF
si_senten
 : SI bloque_condicional (SI_NO SI bloque_condicional)* (SI_NO ENTONCES? bloque)?
 ;

//Expresión a evaluar y bloque de sentencias a ejecutar
bloque_condicional
 : expresion ENTONCES? bloque
 ;

//Iteración WHILE
mientras_senten
 : MIENTRAS bloque_condicional
 ;

//Iteración DO WHILE
hacer_mientras_senten
 : HACER bloque MIENTRAS expresion
 ;

//Selección SWITCH
seleccionar_senten
 : SELECCIONAR IDENTIFICADOR LLAVEIZ casos LLAVEDE
 ;

//Bloque de casos del SWITCH
casos
 : CASO expresion DOSPUNTOS sec_proposiciones (ROMPER PCOMA)? casos     #casosGen
 | DEFECTO DOSPUNTOS sec_proposiciones                                  #casosDef
 ;

//Iteración FOR
para_senten
 : PARA asignacion (COMA asignacion)* PCOMA expresion PCOMA asignacion (COMA asignacion)* bloque
 | PARA PAREN_AP asignacion (COMA asignacion)* PCOMA expresion PCOMA asignacion (COMA asignacion)* PAREN_CI bloque
 ;

//Función
fun_senten
 : DEF tipo IDENTIFICADOR PAREN_AP lista_ids PAREN_CI bloque
 ;

//Procedimiento
proc_senten
 : DEF IDENTIFICADOR PAREN_AP lista_ids PAREN_CI bloque
 ;

//Sentencias de función
funcion
 : LLAVEIZ sec_proposiciones PCOMA LLAVEDE
 ;
primary
: parExpression
| 'esta' arguments?
| 'super' superSuffix
| termino
| literal
| 'nuevo' creator
|	nonWildcardTypeArguments (explicitGenericInvocationSuffix | 'this' arguments)
| IDENTIFICADOR ('.' IDENTIFICADOR)* identifierSuffix?
| tipo ('[' ']')* '.' 'class'
| 'void' '.' 'class'

;
parExpression
: '(' expresion ')'
;
literal
: ENTERO
| FLOAT
| CADENA
| BOOL
| NULO
;
creator
: nonWildcardTypeArguments createdName classCreatorRest
| createdName (arrayCreatorRest | classCreatorRest)
;
createdName
: IDENTIFICADOR typeArgumentsOrDiamond? ('.' IDENTIFICADOR typeArgumentsOrDiamond?)*
|	tipo
;
innerCreator
: IDENTIFICADOR nonWildcardTypeArgumentsOrDiamond? classCreatorRest
;
arrayCreatorRest
: '['
( ']' ('[' ']')* arrayInitializer
| expresion ']' ('[' expresion ']')* ('[' ']')*
)
;
classCreatorRest
: arguments classBody?
;
explicitGenericInvocation
: nonWildcardTypeArguments explicitGenericInvocationSuffix
;
nonWildcardTypeArguments
: '<' typeList '>'
;
typeArgumentsOrDiamond
:	'<' '>'
|	typeArguments
;
nonWildcardTypeArgumentsOrDiamond
:	'<' '>'
|	nonWildcardTypeArguments
;
typeArguments
: '<' typeArgument (',' typeArgument)* '>'
;
typeArgument
: tipo
| '?' (('extends' | 'super') tipo)?
;
explicitGenericInvocationSuffix
:	'super' superSuffix
|	IDENTIFICADOR arguments
;
selector
: '.' IDENTIFICADOR arguments?
|	'.' explicitGenericInvocation
| '.' 'this'
| '.' 'super' superSuffix
| '.' 'new' nonWildcardTypeArguments? innerCreator
| '[' expresion ']'
;
superSuffix
: arguments
| '.' IDENTIFICADOR arguments?
;
 identifierSuffix
     :   ('[' ']')+ '.' 'clase'
     |   '[' expresion ']'
     |   arguments
     |   '.' 'clase'
     |   '.' 'esta'

     ;
arguments
    :   '(' expressionList? ')'
    ;
expressionList
        :   expresion (',' expresion)*
        ;

//Expresiones regulares para tokens
COMENTARIO : ('#' ~[\r\n]*  | '/*' .*? '*/') -> skip;
CLASE : 'Clase';
ALGORITMO : 'ALGORITMO';
TERMINA : '.';
ENTONCES : 'entonces';
O : '||';
Y : '&&';
IGUAL : '==';
DIFERENTE : '!=';
MAYOR : '>';
MENOR : '<';
MAY_IGUAL : '>=';
MEN_IGUAL : '<=';
SUMA : '+';
MENOS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POTENCIA : '^';
NO : '!';
DEF : 'def';
RETORNAR : 'retornar';
INT : 'entero';
FLOAT : 'decimal';
STRING : 'cadena';
BOOL : 'booleano';
MATRIZ : 'matriz';
VECTOR : 'vector';
PCOMA : ';';
ASIGNAR : '=';
PAREN_AP : '(';
PAREN_CI : ')';
LLAVEIZ : '{';
LLAVEDE : '}';
ANGIZ : '[';
ANGDE : ']';
COMA : ',';
DOSPUNTOS : ':';
VERDADERO : 'verdadero';
FALSO : 'falso';
NULO : 'nulo';
SI : 'si';
SI_NO : 'si_no';
MIENTRAS : 'mientras';
SELECCIONAR : 'seleccionar';
CASO: 'caso';
ROMPER: 'romper';
HACER: 'hacer';
PARA : 'para';
DEFECTO : 'defecto';
IDENTIFICADOR : [a-zA-Z_] [a-zA-Z_0-9]*;
ENTERO : [0-9]+;
REAL : [0-9]* '.' [0-9]* ([eE] [+-]? [0-9]+)?;
COMPLEJO : (ENTERO|REAL) [+|-] (ENTERO|REAL)? 'i';
CADENA : '"' (~["\r\n] | '""')* '"';
ESPACIO : [ \t\r\n] -> skip;
OTRO : .;
ESTA : 'esta';