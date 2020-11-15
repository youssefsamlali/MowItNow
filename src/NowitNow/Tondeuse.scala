package NowitNow

class Tondeuse(private var x: Int, private var y: Int, private var orientation: Char) {
  /**
   * Effectue une orientation vers la droite
   */
  def moveRight(): Unit = {
    orientation = orientation match {
      case 'N' => 'E'
      case 'E' => 'S'
      case 'W' => 'N'
      case 'S' => 'W'
    }
  }

  /**
   * Effectue une orientation vers la gauche
   */
  def moveLeft(): Unit = {
    orientation = orientation match {
      case 'N' => 'W'
      case 'E' => 'N'
      case 'W' => 'S'
      case 'S' => 'E'
    }
  }

  /**
   * Modification des coordonnées pour un avancement de la tondeuse sur une pelouse
   */
  def moveForward(pelouse: Pelouse): Unit = {
    orientation match {
      case 'N' => if (y + 1 <= pelouse.getYMax) y += 1 else y
      case 'E' => if (x + 1 <= pelouse.getYMax) x += 1 else x
      case 'W' => if (x - 1 >= 0) x -= 1 else x
      case 'S' => if (y - 1 >= 0) y -= 1 else y
    }
  }
  /**
   * Retourne la position sur l'axe X de la tondeuse
   * @return Int
   */
  def getX : Int = x

  /**
   * Retourne la position sur l'axe Y de la tondeuse
   * @return Int
   */
  def getY : Int = y

  /**
   * Retourne l'orientation de la tondeuse
   * @return Char
   */
  def getOrientation :Char = orientation

}
