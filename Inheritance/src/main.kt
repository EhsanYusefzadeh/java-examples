import sun.util.locale.StringTokenIterator

open class Volvo(){
    private var name:String="";
    private var price:Double=0.0;
    private var color:String="";
    private var model:Int=0;

    // Our class constructor
    constructor(n:String, p:Double, c:String, m:Int) : this() {
        this.name = n;
        this.price = p;
        this.color = c;
        this.model = m;
    }

    // getter and setter methods for our class
    // getters
    fun getName():String{
        return this.name;
    }

    fun getPrice():Double{
        return this.price;
    }

    fun getColor():String{
        return this.color;
    }

    fun getModel():Int{
        return this.model;
    }

    // setters
    fun setName(n:String){
        this.name = n;
    }

    fun setPrice(p:Double){
        this.price = p;
    }
    fun setColor(c:String){
        this.color = c;
    }
    fun setModel(m:Int){
        this.model = m;
    }

}

class Car():Volvo(){
    private var personVolume:Int = 0;
    private var options:String="";
    constructor(p:Int, o:String):this(){
        this.personVolume = p;
        this.options = o;
    }
    // getters and setters
    // getters
    fun getPersonVolume():Int{
        return this.personVolume;
    }
    fun getOptions():String{
        return this.options;
    }
    // setters
    fun setPersonVolume(p:Int){
        this.personVolume = p;
    }
    fun setOptions(o:String){
        this.options = o;
    }
}


class Truck():Volvo(){
    private var mehvar:Int = 0;
    private var wheel:Int = 0;

    // getters and setters
    // getters
    fun getMehvar():Int{
        return mehvar;
    }
    fun getWheel():Int{
        return wheel;
    }

    fun setMehvar(m:Int){
        this.mehvar = m;
    }
    fun setWheel(w:Int){
        this.wheel = w;
    }
}

fun main(args:Array<String>){

    // Two initial products
    var pride = Car();
    var kral = Truck();
    kral.setName("Kral");
    kral.setModel(2016);
    kral.setPrice(1_000_000_000_000.0);
    kral.setColor("Black");
    kral.setMehvar(12);
    kral.setWheel(42);
    //--------------------------------------
    pride.setName("Pride");
    pride.setModel(2017);
    pride.setPrice(1_000_000.0);
    pride.setColor("Red");
    pride.setPersonVolume(6);
    pride.setOptions("Air Bag");

    // --- Defining ArrayLists for cars and trucks
    var volvoCars = ArrayList<Car>();
    var volvoTrucks = ArrayList<Truck>();
    println("Welcome. This is Your Store Detail Keeping System.");

    volvoCars.add(pride);
    volvoTrucks.add(kral);

    var doYouWantToContinue:Boolean = true;
    var choice:Int;
    while(doYouWantToContinue){
        print("1. List of the Volvo Cars.\n")
        print("2. List of the Volvo Trucks.\n")
        print("3. Add a new Volvo Car.\n")
        print("4. Add a new Volvo Truck.\n")
        print("5. Delete a Volvo Car from list.\n")
        print("6. Delete a Volvo Truck from list.\n")
        print("Enter Your Choice: ")
        choice = readLine()!!.toInt();
        when(choice){
            1->{
                if(volvoCars.size == 0){
                    print("Your Store is empty from cars.\n")
                }
                else {
                    for (c in volvoCars) {
                        print("Car Name: " + c.getName() + "\n")
                        print("Car Model: " + c.getModel() + "\n")
                        print("Car Price: " + c.getPrice() + "\n")
                        print("Car Color: " + c.getColor() + "\n")
                        print("Car Persons: " + c.getPersonVolume() + "\n")
                        print("Car Options: " + c.getOptions() + "\n")
                        print("--------------------------------" + "\n")
                    }
                }
            }
            2->{
                if(volvoTrucks.size == 0){
                    print("Your store is empty from trucks.\n")
                }
                else {
                    for (t in volvoTrucks) {
                        print("Truck Name: " + t.getName() + "\n")
                        print("Truck Model: " + t.getModel() + "\n")
                        print("Truck Price: " + t.getPrice() + "\n")
                        print("Truck Color: " + t.getColor() + "\n")
                        print("Truck Mehvar: " + t.getMehvar() + "\n")
                        print("Truck Wheel: " + t.getWheel() + "\n")
                        print("--------------------------------" + "\n")
                    }
                }
            }
            3->{
                print("Enter New Car Name: ");
                var nameofNewCar:String = readLine()!!.toString();
                print("Enter New Car Model: ");
                var modelOfNewCar:Int = readLine()!!.toInt();
                print("Enter New Car Color: ");
                var colorOfNewCar:String = readLine()!!.toString();
                print("Enter New Car Price: ");
                var priceOfNewCar:Double = readLine()!!.toDouble();
                print("Enter New Car Number of Persons: ");
                var numberOfPersonsOfNewCar:Int = readLine()!!.toInt();
                print("Enter New Car Options: ");
                var optionsOfNewCar:String = readLine()!!.toString();

                var newCar = Car();
                newCar.setModel(modelOfNewCar);
                newCar.setName(nameofNewCar);
                newCar.setPrice(priceOfNewCar);
                newCar.setColor(colorOfNewCar);
                newCar.setPersonVolume(numberOfPersonsOfNewCar);
                newCar.setOptions(optionsOfNewCar);

                volvoCars.add(newCar);
                print("New Car Added Successfully.\n")
            }
            4->{
                print("Enter New Truck Name: ");
                var nameofNewTruck:String = readLine()!!.toString();
                print("Enter New Truck Model: ");
                var modelOfNewTruck:Int = readLine()!!.toInt();
                print("Enter New Truck Color: ");
                var colorOfNewTruck:String = readLine()!!.toString();
                print("Enter New Truck Price: ");
                var priceOfNewTruck:Double = readLine()!!.toDouble();
                print("Enter New Truck Number of Wheels: ");
                var numberOfWheelsOfNewTruck:Int = readLine()!!.toInt();
                print("Enter New Truck Axises: ");
                var axisesOfNewTruck:Int = readLine()!!.toInt();

                var newTruck = Truck();
                newTruck.setModel(modelOfNewTruck);
                newTruck.setName(nameofNewTruck);
                newTruck.setPrice(priceOfNewTruck);
                newTruck.setColor(colorOfNewTruck);
                newTruck.setWheel(numberOfWheelsOfNewTruck);
                newTruck.setMehvar(axisesOfNewTruck);

                volvoTrucks.add(newTruck);
                print("New Truck Added Successfully.\n")
            }
            5->{
                print("Enter the Name of the Car which you want to delete.")
                var carToDeleteName:String = readLine()!!.toString();
                for(c in volvoCars){
                    if(c.getName() == carToDeleteName) {
                        volvoCars.remove(c);
                        break;
                    }
                }
                print("The Specified Car deleted Successfully.\n")
            }
            6->{
                print("Enter the Name of the Truck which you want to delete.")
                var truckToDeleteName:String = readLine()!!.toString();
                for(t in volvoTrucks){
                    if(t.getName() == truckToDeleteName) {
                        volvoTrucks.remove(t);
                        break;
                    }
                }
                print("The Specified Truck deleted Successfully.\n")
            }
        }

        print("Do you want to continue? (y/ n)\n")
        var answer:String = readLine()!!.toString()
        doYouWantToContinue = answer == "y" || answer == "Y"
    }
}