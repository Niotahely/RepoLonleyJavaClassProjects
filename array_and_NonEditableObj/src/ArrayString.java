import org.jetbrains.annotations.NotNull;

public class ArrayString <String>{

    private final char[] chars ;

    private ArrayString(int length) { // internal use only, see concat
        this.chars = new char[length]; // elements initialized with the default value: char of code 0

    }


    // constructor that initialize the object to represent the string str
    public ArrayString(@NotNull String str){

        this.chars = new char[str.toString().length()];
        int Length = this.chars.length;

        for (int i = 0; i < Length; i++){
            this.chars[i] = str.toString().charAt(i);
        }


    }



    // method that returns the length of the string
    public int length() {
        return this.chars.length;
    }


// method that return the char of the string in index position
    public char charAt(int index ){
        return this.chars[index];
    }


// method combines specified string at the end of this string. It returns a combined string.
    ArrayString<String> concat(@NotNull ArrayString str){

        int thisLength = this.chars.length;
        int strLength = str.chars.length;

        ArrayString<Integer> res = new ArrayString<>(thisLength + strLength);
        for (int i = 0; i < thisLength; i++)
            res.chars[i] = this.chars[i];

        for (int i = 0; i < strLength; i++)
            res.chars[i + thisLength] = str.chars[i];


        return this;


    }
}
