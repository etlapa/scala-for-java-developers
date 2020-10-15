package mx.edev.scala.classes.definition

class ScalaPerson(name:String,lastname:String) {
    val fullname = String.format("Scala: %s %s",name,lastname)
    def this(name:String) = {
       this(name,"")
    }
}