# LOLCodev2.0 Compiler

The project for Compilation Theory and Compilers course at AGH UST made by Computer Science students in 2020. 

## About project
* GOAL: Build LOLCode compiler using ANTLR. 
Inspiration from [LOLCode](https://github.com/justinmeza/lolcode-spec/blob/master/v1.2/lolcode-spec-v1.2.md)

## LOLCodev2.0
Here describe our current possibilites. Tutorial over LOLCodev2.0

#### Program structure
```
HAI LOL

KTHXBYE
```
LOL is our program type (newly introduced in v2.0). You can replace LOL with 3 mode types available:
* LOL - With every statement program is delivering one random joke from database (jokes not cenzored yet by development team, if anyone feels offened we're truly sorry)
* GOT - Normal compiling, no jokes and no additional comments
* GEEK - Your program does not work as expected? Your're tired of constant printing output? We will do it for you - in our geek mode you are always(24/7) informed what's going on in our compiler 



#### Available types
These are called ATOM, which can be:
* BOOLEAN: WIN (true like) or FAIL (false like)
* NOOB (sort of None)
* integer or double values as we know them
* STRING

#### Statements
Each program is build of many statements. They can be: 

##### Loop
TODO
##### Declaration
We can either declare empty variable with 'NOOB' value or initialize it at declaration with any available type (see below). 
```
I HAS A variable1
I HAS A variableinitialized ITZ 12
```
##### Comment
TODO
##### Print block
Between VISIBLE and MKAY? we put what needs to be printed. 
```
VISIBLE "stringtobeprinted" MKAY?
VISIBLE "stringtobeprinted" 12 WIN zmienna MKAY?
```
##### If block
TODO
##### Input block
After keyword GIMMEH we put already declared LABEL (initlialized with NOOB value or already assigned value which will be changed).
```
HAI GEEK
I HAS A zmienna2
GIMMEH zmienna2
VISIBLE NOT zmienna2 MKAY?
KTHXBYE
```
##### Function declaration
TODO
##### Assignment
We can also change value of our variable at any time during coding. Below example shows how to do that: 
```
I HAS A zmienna ITZ "trolololo"
zmienna R WIN
```
##### Full expression
Consists of expression and NEWLINE character. 
* equals - (==) operation with a little LOL effect
```
BOTH SAEM 12 AN "WIN"
```
* no equals - (!=) operation with a little LOL effect
```
DIFFRINT WIN AN FAIL
```
* both - (AND) operation with a little LOL effect
```
BOTH OF "me" AN "you"
```
* grater - (>) operation with a little LOL effect
```
BIGGR OF 12 AN 11.999
```
* less - (<) operation with a little LOL effect
```
I HAS A zmienna ITZ "you"
SMALLR OF zmienna AN "zmienna"
```
* add - (+) operation with a little LOL effect
```
SUM OF 12 AN 12
```
* sub - (-) operation with a little LOL effect
```
DIFF OF "string" AN WIN
```
* mul - (*) operation with a little LOL effect
```
PRODUKT OF 134 AN FAIL
```
* div - (/) operation with a little LOL effect
```
QUOSHUNT OF SUM OF 12 AN 15 AN "text"
```
* mod - (%) operation with a little LOL effect
```
MOD OF 100 AN 10
```
* either - (XOR) operation with a little LOL effect
```
EITHER OF 1 AN 0
```
TODO
* r_any - 
TODO
* nope - 
```
NOT "alamakota"
```
* func - 
TODO

Authors hope that funny way of implemented calculations on various type will have positive affect on programmer's mood ;)  
## Prerequisites

* Java 8+
* Maven 
* (optional - if needed to edit compiler) ANTLR 4.7.2

##  Getting Started

To start with this project and compile example LOLCodev2.0 file: 
```
git clone https://github.com/nikitagrygoriev/LOLCODE_Compiler.git
javac lolcodeCustomListener.java
java lolcodeCustomListener examples/lolProgram1.lol
```
Another way is to open that in InteliJ, run lolcodeCustomListen.class main method providing examples/lolProgram1.lol as parameter. 

Feel free now to edit your lolProgram1.lol example file. Enjoy!

## TODO
Deadline for below tasks is 7th June 2020:
* loops
* comments
* if block
* else if block
* functions

## Built With

* [ANTLR4](https://www.antlr.org/) - Powerful parser generator
* [Maven](https://maven.apache.org/) - Dependency Management
* [Java](https://www.java.com/en/) - Java is a general-purpose programming language, Oracle

## Inspiration

* [AGH syllabus](https://syllabuskrk.agh.edu.pl/2017-2018/pl/magnesite/study_plans/stacjonarne-informatyka--6/module/eit-1-602-s-teoria-kompilacji-i-kompilatory) - Great source of our last 3 years inspiration to do anything. 
* [PJM website](https://home.agh.edu.pl/~pjm/didactics/compilers/home) - Motivation to work hard and meet deadlines (at least try)
* [LOLCode](https://github.com/justinmeza/lolcode-spec/blob/master/v1.2/lolcode-spec-v1.2.md) - Idea to make programming fun, not necessarily clear and logic
* [CleanJokes](https://github.com/amoudgl/short-jokes-dataset/blob/master/data/reddit-cleanjokes.csv) - Some of the jokes under this link

But main inspiration for this project is to make programming fun again. It's not about making perfect language and compiler.
It's about motivating to learning more to create entertaining things and developing ourselves. 

## Versioning

LOLCode version 2.0 (updated by this team). 

## Authors

* **Małgorzata Barnach** - *Tester, Java developer: enhancements* 
* **Mikołaj Ogarek** - *Java developer: expression and LOLCode extension* 
* **Nikita Grygoriev** - *Java developer: project init and statement* 
* **Zuzanna Śmiech** - *PM, ANTLR4 specialist, Java developer: enhancements* 

## License

No info yet. 

## Acknowledgments

* Big thanks to Paweł Jemioło, MSc. - for inspiring us to doing this project, perfect cooperation and availability.
