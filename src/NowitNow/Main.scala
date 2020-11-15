package NowitNow

object Main extends App {

  /*
  Ouverture du fichier
   */
  val instructionsSource = io.Source.fromResource("instructions.txt")
  val lines = instructionsSource.getLines()
  val coordonneesTopRight = lines.next()

  /*
  Création de la pelouse
 */
  val pelouse = new Pelouse()
  pelouse.setPelouse(coordonneesTopRight)

  /*
  Initialisation des pelouses une après l'autre
   */
var  iter = 1 //iterateur
while (lines.hasNext) {
  val tondeuseArray = lines.next().split(" ")
  val tondeuse: Tondeuse = new Tondeuse(tondeuseArray(0).toInt, tondeuseArray(1).toInt, tondeuseArray(2).charAt(0))
  val sequenceArray = lines.next().toCharArray // tableau d'instructions
  for (i <- 0 until sequenceArray.length) {
    sequenceArray(i) match {
      case 'G' => tondeuse.moveLeft()
      case 'D' => tondeuse.moveRight()
      case 'A' => tondeuse.moveForward(pelouse)
      case _ => println(sequenceArray(i)," : instruction non reconnue (Skipped)")
    }
  }
  println("Tondeuse " +iter+" : "+tondeuse.getX+" "+tondeuse.getY+" "+tondeuse.getOrientation)
  iter+=1
}


}
