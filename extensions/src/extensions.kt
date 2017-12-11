fun ArrayList<Student>.printAll(){
    for(item in this){
        print("Name: " + item.getName() + ", Average: " + item.getAvg() + "\n")
    }
}

enum class Average{
    bad,
    medium,
    good,
    excellent
}

class Student{
    private var name:String="";
    private var average:String="";
    fun getName():String{
        return this.name;
    }
    fun getAvg():String{
        return this.average;
    }
    fun setName(name:String){
        this.name = name;
    }
    fun setAvg(average:String){
        this.average = average;
    }
}
fun main(args:Array<String>){
    var stList = ArrayList<Student>();

    var st1 = Student();
    st1.setName("Ehsan Yousefzadeh");
    st1.setAvg(Average.good.toString());
    stList.add(st1);

    var st2 = Student();
    st2.setName("Ehsan Kolivand");
    st2.setAvg(Average.excellent.toString());
    stList.add(st2);

    stList.printAll();
}