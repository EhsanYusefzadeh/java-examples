interface Car{
    fun stop();
    fun boost();
    fun lighting();
    fun snowCleaning();
}

class VolvoCompanyProducts():Car{
    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun boost() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lighting() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun snowCleaning() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class PeugeotCompanyProducts():Car{
    override fun stop() {
        println("ABS")
    }

    override fun boost() {
        println("360")
    }

    override fun lighting() {
        println("Very Good")
    }

    override fun snowCleaning() {
        println("Excellent")
    }

}

fun main(arg:Array<String>){
    var peugeot206 = PeugeotCompanyProducts();
    peugeot206.boost();
    peugeot206.lighting();
    peugeot206.snowCleaning();
    peugeot206.stop();
}