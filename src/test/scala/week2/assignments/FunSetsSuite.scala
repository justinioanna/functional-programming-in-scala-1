package week2.assignments

import FunSets._
import org.scalatest.FunSuite

class FunSetSuite extends FunSuite {

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
  }

  test("singletonSet(1) contains 1") {
    new TestSets {
      assert(contains(s1, 1), "Singleton")
    }
  }

  test("union contains all elements of each set") {
    new TestSets {
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
    }
  }

  test("Intersection of two sets") {
    new TestSets {
      val s = union(s1, s2)
      val sIntersect = intersect(s, s1)
      assert(contains(sIntersect, 1), "Intersect 1")
      assert(!contains(sIntersect, 2), "Intersect 2")
    }
  }

  test("Diff of two sets") {
    new TestSets {
      val s = union(s1, s2)
      val sDiff = diff(s, s1)
      assert(!contains(sDiff, 1), "Diff 1")
      assert(contains(sDiff, 2), "Diff 2")
    }
  }

  test("Filter sets") {
    new TestSets {
      val s = union(s1, union(s2, s3)) // {1, 2, 3}
      val sFilter = filter(s, (x => x != 2))
      assert(contains(sFilter, 1), "Filter contains 1")
      assert(!contains(sFilter, 2), "Filter does not contain 2")
      assert(contains(sFilter, 3), "Filter contains 3")
    }
  }

  test("Forall") {
    new TestSets {
      val s = union(s1, union(s2, s3)) // {1, 2, 3}
      assert(!forall(s, x => x % 2 == 0), "Forall false")
      assert(forall(s, x => x <= 3), "Forall true")
    }
  }

  test("exists") {
    new TestSets {
      val s = union(s1, union(s2, s3)) // {1, 2, 3}
      assert(exists(s, x => x % 2 == 0), "exists true")
      assert(!exists(s, x => x > 3), "exists false")
    }
  }

  test("map") {
    new TestSets {
      val s = union(s1, union(s2, s3)) // {1, 2, 3}
      val sm = map(s, x => x * x) // {1, 4, 9}

      assert(s(1), "s contains 1")
      assert(sm(1), "sm contains 1")

      assert(s(2), "s contains 2")
      assert(!sm(2), "sm does not contain 2")

      assert(!s(4), "s does not contain 4")
      assert(sm(4), "sm contains 4")

    }
  }

}
