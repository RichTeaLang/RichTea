# RichTea

Welcome to my very first programming language!  I hope you like it.  I implore you to use `RichTea` in all your production environments regardless of use-case or the fact that it has many limitations (features).

`RichTea` is a hobby project which, if nothing else, is an interesting resource and reference point to use when learning to design and implement a simple programming language.

---

## Installation

`RichTea` makes use of the `maven` build process - If you are familiar with `maven` compilation should be straight forward.

In the near future, after setting up a continuous integration server,  I will write full documentation for setup and provide binaries.

---

## By example



The infamous hello world program:

`Print("Hello world")`

Other random examples:

```
// Simple "if / else"
If(true {
    Print("Hello world")
}, else {
    Print("Go home program, you're drunk!")
})
```

```
Print(true ? "Hello world" : "Go home program, you're drunk!"); // Ternary expression
```

```
While(true, { Print("Hello world") }) // Loop forever, printing "Hello world"
```

```
Map([1, 2, 3, 4], { Return(_ * 2) }) // Returns [2, 4, 6, 8]
```

```
Filter([1, 2, 3, 4], { Return(_ > 1 && _ < 4) }) // Returns [2, 3]
```

```
// First class functions
(someFunction:Print("Hello world") {
    someFunction(); // Executes 'Print("Hello world")'
})
```

```
// Inline functions ("@" prefix denotes that the returned value, not the function itself, will be used)
Print(@RandomNumber(from:1 to:10));
```

```
// Eval support (Parse string as RichTea code and then execute it)
(x:100, y:200 {
    Eval("Print(x + y)") 
})
```

```
// UI Example - Window with button (Clicking the button closes the program)
Frame("Hello UI", width:800, height:600, content {
    Button("Close", mouseClicked {
        SystemExit()
    })
})
```
---

## Language Documentation

### Data Types

RichTea supports the following datatypes.

* `Float` - e.g. `1`, `1.5`, `3.14`
* `String` - e.g. `"Hello world"`
* `Boolean`- e.g. `true`, `false`
* `Function` - e.g. `Print("Hello world")`
* `Array` - e.g. `[3.14, "Hello world", true, Print(), []]`


### Scopes

All datatypes in RichTea are stored in `scope` objects.  The most simple (and useless) scope is defined as:

`()`

This scope contains no data or executable code.  Data can be stored inside a scope like so:

`(x:100, y:"Hello world", z:[true, false])`

The above scope contains the variables `x`, `y`, and `z` (Their datatypes are `float`, `string`, and `array` respectively).

`Scope` objects are only containers for data.  A function must be added to a `Scope` object to add behaviour / logic to a `RichTea` program.

### Functions

Functions can be bound  to `scope` objects by adding the name of the function to the beginning of the `scope` declaration - e.g.

`Print(message:"Hello world")`

The `Print` function has been bound to the `scope` `(message:"Hello world")`.  

Functions have access to the data stored in a scope - In many cases specifically named datatypes will be required in a `scope` for a function to execute correctly.  In the case of the `Print` function, a `message` datatype should be present.

#### Implicit attributes

`scope` objects can contain one unnamed data type - This is known as the _implicit_ attribute.  Many functions make use of the _implicit_ syntax to reduce the amount of code needed to be written:

_Examples_

`Print("Hello world")` is the same as `Print(message:"Hello world")`

`If(true)` is the same as `If(expression:true)`

```
ForEach("item" in:[1, 2, 3] {
    Print(item);
})
// Is the same as
ForEach(as:"item" in:[1, 2, 3] {
    Print(message:item)
})
```

### Branches

Branches are executable code blocks defined in a `scope` object. Like data types, branches can be named and can also be _implicit_.

```
(x:100, do {
    Print(message:x);
})
// Is the same as
(x:100 {
    Print(x)
})
```

# More documentation to come!
