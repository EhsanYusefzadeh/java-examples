open class Person(){
    private var name:String = "";
    private var family:String = "";

    fun setName(n:String){
        this.name = n;
    }
    fun setFamily(f:String){
        this.family = f;
    }
    open fun printer(){
        println(this.name + " " + this.family + "\n");
    }
}


class Men():Person(){
    override fun printer() {
        print("Mr. ")
        super.printer()
    }
}

class Women():Person(){
    override fun printer() {
        print("Mrs. ")
        super.printer()
    }
}

fun main(args: Array<String>){
    var personList = ArrayList<Person>();
    var man1 = Men();
    man1.setName("ALi");
    man1.setFamily("Mohammadi");
    personList.add(man1);

    var woman1 = Women();
    woman1.setName("Zeynab");
    woman1.setFamily("Zahrayi");
    personList.add(woman1);

    var woman2 = Women();
    woman2.setName("Mozhde")
    woman2.setName("Akbari")
    personList.add(woman2)

    for(i in personList){
        i.printer();
    }
}