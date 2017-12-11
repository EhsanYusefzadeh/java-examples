
class Student{
    private var name:String="";
    private var family:String="";
    private var average:String="";
    fun setName(n:String){
        this.name=n;
    }
    fun setFamliy(f:String){
        this.family = f;
    }
    fun setAverage(a:String){
        this.average = a;
    }
    fun getName():String{
        return this.name;
    }
    fun getFamily():String{
        return this.family;
    }
    fun getAverage():String{
        return this.average;
    }
}

enum class defaultAverage(){
    bad,
    Medium,
    good,
    excellent
}

fun main(arg:Array<String>){
    var studentArray = ArrayList<Student>();
    var student1 = Student();
    student1.setName("Mustafa");
    student1.setFamliy("Ceceli");
    student1.setAverage(defaultAverage.good.toString());

    var student2 = Student();
    student2.setName("Ibrahim");
    student2.setFamliy("Tatlises")
    student2.setAverage(defaultAverage.excellent.toString())

    var student3 = Student();
    student3.setName("Akbar")
    student3.setFamliy("Shiran")
    student3.setAverage(defaultAverage.Medium.toString())

    studentArray.add(student1)
    studentArray.add(student2)
    studentArray.add(student3)

    for(s in studentArray){
        println(s.getName() + ", " + s.getFamily() + ", " + s.getAverage())
    }
}