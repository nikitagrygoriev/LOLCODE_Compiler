grammar lolcode;

program
   : 'HAI' code_block 'KTHXBYE'?
   ;

code_block
   : statement+
   ;

statement
   : loop
   | declaration
   | comment
   | print_block
   | if_block
   | input_block
   | func_decl
   | assignment
   | expression
   ;

loop
   : 'IM IN YR' LABEL 'WILE' expression code_block 'IM OUTTA YR' LABEL
   ;

declaration
   : 'I HAS A' LABEL
   | 'I HAS A' LABEL 'ITZ' < value >
   ;

comment
   : 'BTW' STRING
   | 'OBTW' STRING 'TLDR'
   ;

print_block
   : 'VISIBLE' expression* 'MKAY?'?
   ;

if_block
   : 'O RLY?' 'YA RLY' code_block 'OIC'
   | 'O RLY?' 'YA RLY' code_block else_if_block 'OIC'
   ;

else_if_block
   : 'MEBBE' expression code_block else_if_block
   | 'NO WAI' code_block
   | 'MEBBE' expression code_block
   ;

input_block
   : 'GIMMEH' LABEL
   ;

func_decl
   : 'HOW DUZ I' LABEL (('YR' LABEL) ('AN YR' LABEL)*)? code_block 'IF U SAY SO'
   ;

assignment
   : LABEL 'R' expression
   ;

expression
   : equals
   | both
   | not_equals
   | greater
   | less
   | add
   | sub
   | mul
   | div
   | mod
   | cast
   | either
   | r_all
   | r_any
   | r_not
   | func
   | LABEL
   | ATOM
   ;

equals
   : 'BOTH SAEM' expression 'AN' expression
   ;

not_equals
   : 'DIFFRINT' expression 'AN' expression
   ;

both
   : 'BOTH OF' expression 'AN' expression
   ;

either
   : 'EITHER OF' expression 'AN' expression
   ;

greater
   : 'BIGGR OF' expression 'AN' expression
   ;

less
   : 'SMALLR OF' expression 'AN' expression
   ;

add
   : 'SUM OF' expression 'AN' expression
   ;

sub
   : 'DIFF OF' expression 'AN' expression
   ;

mul
   : 'PRODUKT OF' expression 'AN' expression
   ;

div
   : 'QUOSHUNT OF' expression 'AN' expression
   ;

mod
   : 'MOD OF' expression 'AN' expression
   ;

cast
   : 'MAEK' expression 'A' < type >
   ;

r_all
   : 'ALL OF' expression ('AN' expression)* 'MKAY?'
   ;

r_any
   : 'ANY OF' expression ('AN' expression)* 'MKAY?'
   ;

r_not
   : 'NOT' expression
   ;

func
   : LABEL expression+ 'MKAY?'
   ;

LABEL
   : ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')+
   ;

ATOM
   : 'WIN'
   | 'FAIL'
   | 'NOOB'
   | ('0' .. '9')+
   | ('0' .. '9')* '.' ('0' .. '9')*
   | STRING
   ;

STRING
   : '"' ('\'"' | ~ '"')* '"'
   ;

WS
   : [ \r\n] -> skip
   ;

