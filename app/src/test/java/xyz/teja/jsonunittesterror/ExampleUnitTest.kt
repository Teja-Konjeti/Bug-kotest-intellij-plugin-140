package xyz.teja.jsonunittesterror

import io.kotest.core.spec.style.FreeSpec

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest : FreeSpec({
    "jsonTest" {
        Pojo().a()
    }
})