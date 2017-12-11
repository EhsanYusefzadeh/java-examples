import java.io.FileWriter

fun main(arg:Array<String>) {

    var yesOrNo: Boolean = true;
    var answer:String?
    while (yesOrNo) {
        print("Enter The Name for The File: ");
        var fileName: String = readLine()!!.toString();
        fileName += ".txt";

        print("Please Enter First Name: ");
        var fName: String = readLine()!!.toString();
        print("Please Enter Last Name: ");
        var lName: String = readLine()!!.toString();
        print("Please Enter Age: ");
        var age: Int = readLine()!!.toInt();
        createTextFile(fileName, fName, lName, age);

        print("Do You Want to Add Another? (y/ n)");
        answer = readLine()!!.toString();
        if(answer == "y" || answer == "Y" || answer == "Yes" || answer == "yes" || answer == "YES")
        {
            yesOrNo = true;
        }else if (answer == "n" || answer == "N" || answer == "No" || answer == "NO" || answer == "no") {
            yesOrNo = false;
        }
        else
        {
            yesOrNo = true;
            print("You did not enter correct answer. So Software continues wo work.")
        }
    }
}

fun createTextFile(fileName:String, fName:String, lName:String, age:Int){
    // Recommented to use exception handling in writing to files
    // Maybe, Some files only be readable
    try {
        var file = FileWriter(fileName, true);// true is for enabling the append feature

        file.write(fName + '\n');
        file.write(lName + '\n');
        file.write(age.toString() + '\n');
        file.write("--------------------" + '\n')
        file.close();
        println("File Successfully Created and Material Saved in it totally.");
    }
    catch (ex:Exception){
        println(ex.message);
    }
}