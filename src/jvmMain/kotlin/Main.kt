fun main() {
    val foo = object : Foo {
        override fun jvmOnly() {
            TODO("Not yet implemented")
        }

        override fun jvmOnly2() {
            TODO("Not yet implemented")
        }

        override fun put(a: Int, f: Int.() -> Int) {
            TODO("Not yet implemented")
        }

        override val bar: Int
            get() = TODO("Not yet implemented")
        override val bar2: Int
            get() = TODO("Not yet implemented")

        override fun start() {
            TODO("Not yet implemented")
        }

        override fun end() {
            TODO("Not yet implemented")
        }
    }

    val sf = StructuredFoo(emptyList<Int>(), foo)
    sf.start()
    sf.put(0) { 0 }
}