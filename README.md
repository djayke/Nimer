# Nimer

Nimer is my very own toy programming language. Im working on it as of today to fix many incomplete features. The language now support if, else, while, for, function that still need work. Im also working on a C# version of the project and a complete tutorial on how I did and for people that would like to make their own programming language from scratch. Ive been looking for nice and complete tutorial a lot on the intrnet over past years and after many attempt, im finally coming to something and I want to share what I learned in the process with people.

<i><b>There is many things wrong with this current version.</b></i> 

Feel free to message me if you're the type to work on project like that or have any question on how to start!

### Idea Setup
1) Download ANTLR .jar -> https://www.antlr.org/download.html
2) Add antlr.jar to project <b>CTRL+ALT+SHIFT+S</b>
   ![image](https://github.com/djayke/Nimer/assets/146222213/e0f96c4a-6f08-4204-a7c8-be0025ba64ea)
3) Add <b>ANTLR4</b> plugin
4) Right Click on grammar file in tree explorer and then configure ANTLR...
   ![image](https://github.com/djayke/Nimer/assets/146222213/ba97db09-56e5-40bd-9804-9b918a93e1bf)
5) [OPTIONAL] To apply change made to grammar right click on gramma file and then Generate ANTLT Recognizer

### Language
Program take file that contains Nimer Script as input.
1) <b>Variable</b>
```
a = true;
b = false;
```
2) <b>Print</b>
```
log a;
```
3) <b>If Statement</b>
```
if a && b {
  log "1 :: a=" + a +", b=" + b;
}
else if a || b {
  log "2 :: a=" + a +", b=" + b;
}
else {
  log "3 :: a=" + a +", b=" + b;
}

```
4) <b>For Statement</b>
```
i = 1;
for i=0; i<7; i=i+1;
{
  log i;
}
```
5) <b>While Statement</b>
```
x = 1;
while x < 5 {
    log x;
    x = x + 1;
}
```
6) <b>Function and Method</b>
```
func recursive(a)
{
    if(a>1)
    {
        recursive(0);
    }
    return a;
}

i = recursive(3);
log i;
```

### Useful Unix Command to use Antlr
Command Line Antlr
  Generic Usage
   ```
   java -jar <antlr.jar> <grammar.g4> -Dlanguage=<language> -o <output_folder> -visitor
   ```
   ```
   java -jar antlr.jar T.g4 -Dlanguage=Java -o Antlr -visitor
   ```
