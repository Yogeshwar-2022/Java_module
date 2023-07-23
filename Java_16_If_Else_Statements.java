// Syntax for if-else statement

/*
if (condition-to-be-checked) {
	statements-if-condition-true;
}
else {
	statements-if-condition-false;
}
*/

// Syntax for if-else ladder

/*
if (condition1) {
            //Statements;
else if {
            //Statements;
}
else {
            //Statements
}
*/

// else block is optional

public class Java_16_If_Else_Statements {
    public static void main(String[] args) {
        int a = 29;
        if (a>18) {
            System.out.println("You can drive");
        }
        else{
            System.out.println("You are underage!");
        }

    }
}
