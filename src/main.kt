fun main(){
    var toyota = Car("Toyota","Prado","KCT 123B",0)
    var subaru = Car("Subaru","Forester","KDB 001G",0)
    toyota.start()
    toyota.speed
    toyota.accelerate(30)
    toyota.accelerate(70)
    println(subaru.registration)
    subaru.start()
    toyota.hoot()
    subaru.hoot()
    subaru.accelerate(70)
    subaru.decelerate(20)
    subaru.stop()

    var verite = Student("Verite",24,"AnitaB")
    var nadine = Student("Nadine",23,"Lisalab")
    var liliane = Student("liliane",22,"LoveLace")
    println(verite.age)
    println(nadine.stream)
    println(liliane.name)


}
// A class has a name
// The body of a class is denoted by a pair of curly braces

class Car(var make:String, var model:String, var registration:String, var speed:Int){
    fun start(){
        println("Chogio gio gio")
    }
    fun accelerate(acceleration:Int):Int{
        speed+=acceleration
        println("Current speed is : $speed")
        return speed
    }
    fun hoot(){
        println("Hoin hoooiiinnnn")
    }
    fun decelerate(deceleration:Int):Int{
        speed-=deceleration
        println("The current speed is: $speed")
        return speed
    }
    fun stop(){
        speed=0
        println("The current speed is: $speed")
    }
}
data class Student(var name:String, var age:Int, var stream:String)