fun main() {

    //  This creates a comment. This is ignored by the machine.

    //  This creates a multi-line comment.
    //  To close the comment chain, use */

    //  Comments can be used to create developer notes.
    // 	Using ctrl + / comments out a line of code.*/

    //  The "fun" keyword is used to declare a function.
    //  A function is a block of code designed to perform a particular task.
    // 	Above, it declares the main() function.*/

    // The main() function tells the computer to execute everything in the curly brackets {}

    print("This prints a line to the console")
    println(", and this function automatically enters afterwards.")

    println("\nUse this character to enter another line.\n")

    println("|\nV The print function can also contain math")
    println(3+18)

    //     Variables can be declared then used later.

    val variable_name = "Insert Value Here"
    val number_value = 23

    //     ^Using "val" instead of "var" locks the variable's value
    //     Variables can hold several types of data, inculding:
    //
    //     Strings: lines of characters, put in quotation marks
    //     E.G: "This is a string"

    //     There are many different ways to store integers.
    //
    //     Boolean: Takes up 1(one) bit! Can only be true or false.
    //     E.G: true, false
    //
    //     Byte: An integer you know won't grow large. Very small, very restricting. Takes up a byte
    //     Range: -128 to 127
    //
    //     Short: Bigger than a byte, still fairly restricting. Takes up 16 bits (2 bytes)
    //     Range: -32768 to 32767
    //
    //     Int: The most common variable. Takes up 32 bits (4 bytes).
    //     Range: -2,147,483,648 to 2,147,483,647
    //
    //     Long: The longest variable you'll need. Takes up 64 bits, the limit of all computer threads (8 bytes).
    //     A long can be declared by adding "L" to the end of a number
    //     E.G: var number = 12l or 12L
    //     Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    //
    //     Just typing "Int" will work, as going larger than 32 bits will automatically change to a Long.
    //     To go smaller than "Int" needs manual work, and could result in errors.

    //     To store real numbers (decimal points), there are seperate data types.
    //
    //     Double: Autofills when there's a decimal point. Takes up 64 bits, but only uses 56 bits of data.
    //     E.G: var number = 123.5
    //
    //     Float: Needs to be manually declared. Takes up 32 bits, but only uses 24 bits of data.
    //     E.G: var number = 123.5f or 123.5F

    var string = "example"
    var boolean = true
    var byte: Byte = 123
    var short: Short = 12345
    var integer = 1234567890
    var long: Long = 123456789000000000
    var double = 1234.5678
    //     var float: Float = 2.3 (didn't work and I don't know why. Just commenting out for now.)

    //     Operators
    //     An operation has three factors: an Operand, an Operator, and another Operand.
    //     E.G:

    var plus = 100 + 50

    //     We declare the variable, have an Operand (100), and Operator ("+"), and another Operand (50).
    //     There are many different Operators

    //     There are the standard arithmetic operators
    //     + : Addition
    //     - : Subtraction
    //     * : Multiplication
    //     / : Division
    //     % : Modulus (Returns the remainder of a division)
    //     ++ : Increment (Increases Operand by 1)
    //     -- : Decrement (Decreases Operand by 1)

    //     There are operators that assign values to Operands
    //     = : Equals
    //     += : Addition Assignment
    //     -= : Subtraction Assignment
    //     *= : Multiplication Assignment
    //     /= : Division Assignment
    //     %= Modulus Assignment

    //     There are Operators that directly compare Operands and return a true/false boolean
    //     == : Equal to (Checks if Operand #1 = Operand #2)
    //     != : Not Equal to (Checks if Operand #1 != Operand #2)
    //     > : Greater than
    //     < : Less than
    //     >= : Greater than or equal to
    //     <= : Less than or equal to

    //     The last type of Operator is Logical operators, which only takes Operands with a boolean output
    //     && : Logical and (Returns true if both statements is true)
    //     || : Logical or (Returns true if one of the statements are true)
    //     ! : Logical not (Reverses the result of a statement)

    //     Strings, like their name, are just strings of unicode characters. So individual bits of data can
    //     be derived from them just like an array (starting at zero).

    val stringexample = "A String Of Unicode Characters"
    println(stringexample)
    println(stringexample[0]) //Prints the first letter of the string
    println(stringexample[3]) //Prints the fourth letter of the string

    //     The length of the string can be found with the .length argument

    println(stringexample.length)

    //     The capitilization can be changed with the arguments .toUpperCase() and .toLowerCase()

    println(stringexample.toUpperCase())
    println(stringexample.toLowerCase())

    //     Two strings can be checked to see if they're the same with .compareTo()

    println(stringexample.compareTo(stringexample)) //If the strings are equal the output is 0 (else 1)

    //     The equivilent of ctrl + f of strings is .indexOf("")

    println(stringexample.indexOf("Unicode")) //Outputs the location of the first character in the array

    //     The .plus argument combines two strings

    println(stringexample.plus(variable_name))

    //     You can also put the $ character infront of a variable to combine it inside a string

    println("Test Test $stringexample Test Test $variable_name Test Test")
}