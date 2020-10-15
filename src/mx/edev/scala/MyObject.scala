package mx.edev.scala

import mx.edev.scala.classes.definition.JavaPerson
import mx.edev.scala.classes.definition.ScalaPerson

object MyObject {
    def main(args: Array[String]) = {
      var java = new JavaPerson("John","Doe");
      var scala = new ScalaPerson("John","Doe");
      
      println(java.getFullname);
      println(scala.fullname);
    }
}