
fun main(arg:Array<String>){
    var names = ArrayList<String>();
    names.add("Ehsan");
    names.add("Hossein");
    names.add("Mammad");

    print("Enter an number to show the name:");
    var choice = readLine()!!.toInt();
    try {
        println(names[choice]);
    }catch (ex:Exception){
        println(ex.message);
        print("Enter an number to show the name:");
        var choice = readLine()!!.toInt();
        println(names[choice])
    }
}