import java.io.FileReader

fun main(args:Array<String>){
    print("Enter a File Name: ");
    var fileName:String = readLine()!!.toString();
    readFile(fileName);
}

fun readFile(fileName:String){
    try {
        var file = FileReader(fileName);
        var c:Int?
        do {
            c = file.read();
            print(c.toChar())
        }while (c != -1);

    }catch (ex:Exception){
        println(ex.message);
    }
}