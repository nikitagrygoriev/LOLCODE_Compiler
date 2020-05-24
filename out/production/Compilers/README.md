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
* equals - 
```

```
* both - 
```

```
* not equals - 
```

```
* grater - 
```

```
* less - 
```

```
* add - 
```

```
* sub - 
```

```
* mul - 
```

```
* div - 
```

```
* mod - 
```

```
* either - 
```

```
* r_all - 
```

```
* r_any - 
```

```
* nope - 
```

```
* func - 
```

```
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
