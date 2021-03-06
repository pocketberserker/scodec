package scodec
package codecs

import scalaz.\/

import scodec.bits.BitVector

private[codecs] final class FailCodec[A](encErr: Err, decErr: Err) extends Codec[A] {

  override def encode(a: A) = \/.left(encErr)

  override def decode(b: BitVector) = \/.left(encErr)

  override def toString = "fail"
}
