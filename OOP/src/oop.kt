
class car(){
    private var Name:String = "";
    private var Model:Int = 0;
    private var Color:String = "";
    constructor(name:String, model:Int, color:String):this(){
        this.Name = name;
        this.Model = model;
        this.Color = color;
    }

    fun setName(name:String){
        this.Name = name;
    }

    fun setModel(model:Int){
        this.Model = model;
    }

    fun setColor(color:String){
        this.Color = color;
    }

    fun getInformation():String{
        return this.Name + ", " + this.Model + ", " + this.Color;
    }

    fun getName():String{
        return this.Name;
    }
}


fun main(arg:Array<String>){
    var cont = true;
    var answer:String?
    var cars = ArrayList<car>();
    while (cont){
        print("1. print all car models in store\n");
        print("2. add a new car model\n");
        print("3. remove a car model\n");
        var choice:Int = readLine()!!.toInt();
        when(choice){
            1->{
                if(cars.size == 0){
                    print("nothing to be showed. store is empty.")
                }
                else {
                    for (s:car in cars){
                        println(s.getInformation());
                    }
                }
            }
            2->{
                print("enter car name (a string): ");
                var newCarName:String = readLine()!!.toString();
                print("enter car model (an integer number): ");
                var newCarModel:Int = readLine()!!.toInt();
                print("enter car color (a string): ")
                var newCarColor:String = readLine()!!.toString();
                var newCar = car(newCarName, newCarModel, newCarColor);
                cars.add(newCar);
                print("new car successfully added\n")
            }
            3->{
                print("enter the car name you want to delete");
                var deletedCarName:String = readLine()!!.toString();
                for (c in cars){
                    if(c.getName() == deletedCarName){
                        cars.remove(c);
                        break;
                    }
                }
            }
        }
        print("do you want to continue? (y/ n)\n");
        answer = readLine()!!.toString();
        cont = answer == "y" || answer == "Y";
    }
}