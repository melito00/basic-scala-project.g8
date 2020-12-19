package $organization$.$name;format="lower,word"$

import org.scalatest._
import matchers.should._
import org.scalatest.funspec.AnyFunSpec

class HelloWorldSpec extends AnyFunSpec {
  describe("Adding 1 to 1") {
    it("should equals 2"){
      assert(1+1 == 2)
    }
  }
}

class SomeSpec extends AnyFunSpec with Matchers with GivenWhenThen {
  val targetList = List(1, 1, 2, 3, 5, 8)

  describe(s"On ${targetList}") {
    describe("Finding the last element of a list") {
      it("should equal 8") {
        val result = Something.last(targetList)
        result should equal (8)

        info("That's all by info")
        note("This is note")
        markup("This is *also* mark up")
        alert("This is alert")
      }
    }
    describe("Finding the second last of a list") {
      ignore("should equal 5") {

      }
    }
    describe("Finding the Kth element of a list") {
      it("should equal 2") (pending)
    }
  }
}
