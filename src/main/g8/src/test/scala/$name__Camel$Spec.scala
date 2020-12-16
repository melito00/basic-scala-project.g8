package $organization$.$name;format="lower,word"$

import org.scalatest.funspec.AnyFunSpec

class HelloWorldSpec extends AnyFunSpec {
  describe("Adding 1 to 1") {
    it("should equals 2"){
      assert(1+1 == 2)
    }
  }
}

