expect interface Foo {

    val bar: Int
    val bar2: Int

    fun start()
    fun end()

    fun put(a: Int = 0, f: Int.() -> Int)
}
