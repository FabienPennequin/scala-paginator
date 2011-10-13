package paginator
package adapter

class InMemory[A](elems: Seq[A]) extends Adapter[A] {

  def nbResults: Int = elems.length

  def slice(offset: Int, length: Int): Seq[A] = elems.slice(offset, offset + length)
}
