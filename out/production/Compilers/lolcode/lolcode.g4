grammar lolcode;

program
   : 'HAI' prog_type NEWLINE code_block 'KTHXBYE'?
   ;

prog_type
   :'LOL'|'GOT'|'GEEK'
   ;

code_block
   : statement +
   ;

statement
   : declaration NEWLINE
   | comment NEWLINE
   | print_block NEWLINE
   | if_block NEWLINE
   | input_block NEWLINE
   | assignment NEWLINE
   | full_expression
   ;


declaration
   : 'I HAS A' LABEL
   | 'I HAS A' LABEL 'ITZ' ATOM
   ;

comment
   : 'BTW' expression
   | 'OBTW' NEWLINE full_expression* 'TLDR'
   | 'BTW' STRING
   | 'OBTW' NEWLINE STRING NEWLINE 'TLDR'
   ;

print_block
   : 'VISIBLE' expression* 'MKAY?'?
   ;

if_block
   : 'O RLY?' NEWLINE 'YA RLY' NEWLINE (equals|not_equals|both|either|greater|less) NEWLINE code_block 'OIC'
   | 'O RLY?' NEWLINE 'YA RLY' NEWLINE (equals|not_equals|both|either|greater|less) NEWLINE code_block else_if_block 'OIC'
   ;

else_if_block
   : 'MEBBE' (equals|not_equals|both|either|greater|less) NEWLINE code_block else_if_block
   | 'NO WAI' NEWLINE code_block
   | 'MEBBE' (equals|not_equals|both|either|greater|less) NEWLINE code_block
   ;

input_block
   : 'GIMMEH' LABEL
   ;

assignment
   : LABEL 'R' expression
   ;

full_expression
   : expression NEWLINE
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
   | either
   | nope
   | LABEL
   | ATOM
   ;

equals
   : 'BOTH SAEM' expression r_an
   ;

not_equals
   : 'DIFFRINT' expression r_an
   ;

both
   : 'BOTH OF' expression r_an
   ;

either
   : 'EITHER OF' expression r_an
   ;

greater
   : 'BIGGR OF' expression r_an
   ;

less
   : 'SMALLR OF' expression r_an
   ;

add
   : 'SUM OF' expression r_an
   ;

sub
   : 'DIFF OF' expression r_an
   ;

mul
   : 'PRODUKT OF' expression r_an
   ;

div
   : 'QUOSHUNT OF' expression r_an
   ;

mod
   : 'MOD OF' expression r_an
   ;


nope
   : 'NOT' expression
   ;


r_an
   : 'AN' expression
   ;

ATOM
   : BOOLEAN | 'NOOB' | ('0' .. '9') + | ('0' .. '9')* '.' ('0' .. '9')* | STRING
   ;

LABEL
   : ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_') +
   ;

BOOLEAN
    : 'WIN' | 'FAIL'
    ;

STRING
    : '"' ('\'"' | ~ '"')* '"'
    ;

WHITESPACE : ' ' -> skip ;

NEWLINE : ('\r'? '\n' | '\r')+ | ',' ;
