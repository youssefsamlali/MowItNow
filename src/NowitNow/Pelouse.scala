package NowitNow
class Pelouse {
  private var xTopRight = -1
  private var yTopRight = -1 //initialisation

  /**
   * définie les limites de la pelouse
   * @param coordonnees : une chaine de caractère contenant les deux coordonnées séparées avec un espace
   */
  def setPelouse(coordonnees: String): Unit ={

    val t1 = coordonnees.split(" ")
    (
      t1(0),
      t1(1)
    )
    this.xTopRight= t1(0).toInt
    this.yTopRight = t1(1).toInt
  }

  /**
   * Retourne la limite de la pelouse sur l'axe X (la largeur de la pelouse-1)
   * @return Int
   */
  def getXMax : Int = xTopRight

  /**
   * Retourne la limite de la pelouse sur l'axe Y (la longeur de la pelouse-1)
   * @return Int
   */
  def getYMax : Int = yTopRight

}
