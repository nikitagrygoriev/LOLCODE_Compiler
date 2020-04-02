import sys
from antlr4 import *
from lolcodeLexer import lolcodeLexer
from lolcodeParser import lolcodeParser
from lolcodeListener import lolcodeListener


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = lolcodeLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = lolcodeParser(stream)
    tree = parser.program()
    printer = lolcodeListener()
    walker = ParseTreeWalker()
    walker.walk(printer,tree)	
 
if __name__ == '__main__':
    main(sys.argv)
