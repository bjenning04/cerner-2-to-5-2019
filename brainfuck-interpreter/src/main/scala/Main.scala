// cerner_2^5_2019
// Brainfuck interpreter written in Scala
import scala.annotation._
import scala.io.Source

case class Tape(left: List[Byte], cell: Byte, right: List[Byte]) {
  def execute(ch: Char): Tape = (ch: @switch) match {
    case '+' => copy(cell = ((cell + 1) & 0xFF).toByte)
    case '-' => copy(cell = ((cell - 1) & 0xFF).toByte)
    case '<' => Tape(if (left.isEmpty) Nil else left.tail, if (left.isEmpty) 0 else left.head, cell :: right)
    case '>' => Tape(cell :: left, if (right.isEmpty) 0 else right.head, if (right.isEmpty) Nil else right.tail)
    case '.' => print(cell.toChar); this
    case ',' => copy(cell = scala.io.StdIn.readByte())
    case '[' | ']' => this
    case _ => sys.error("Unexpected token: " + ch)
  }
}

class Brainfuck {

  def execute(p: String) {
    val prog = p.replaceAll("[^+\\-\\[\\].,><]", "")

    @tailrec def braceMatcher(pos: Int, stack: List[Int], o2c: Map[Int, Int]): Map[Int,Int] =
      if(pos == prog.length) o2c else (prog(pos): @switch) match {
        case '[' => braceMatcher(pos + 1, pos :: stack, o2c)
        case ']' => braceMatcher(pos + 1, stack.tail, o2c + (stack.head -> pos))
        case _ => braceMatcher(pos + 1, stack, o2c)
      }

    @tailrec def ex(pos:Int, tape:Tape): Unit =
      if(pos < prog.length) ex((prog(pos): @switch) match {
        case '[' if tape.cell == 0 => braceMatcher(0, Nil, Map())(pos)
        case ']' if ! (tape.cell == 0) => braceMatcher(0, Nil, Map()).map(_.swap)(pos)
        case _ => pos + 1
      }, tape.execute(prog(pos)))

    ex(0, Tape(Nil, 0, Nil))
  }
}

/**
 * Run with something like this.
 */
//object Main extends App {
//  val bf = new Brainfuck
//  val prog = Source.fromResource("hello-world.bf").mkString
//  bf.execute(prog)
//}