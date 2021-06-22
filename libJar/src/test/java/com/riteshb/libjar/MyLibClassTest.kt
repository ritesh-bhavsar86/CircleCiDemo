package com.riteshb.libjar

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith

//@RunWith(MockitoJUnitRunner::class)
internal class MyLibClassTest{

    @Test
    fun `additionInt success`(){
        var param1 : Int = 4
        var param2 : Int = 3
        // ...then the result should be the expected one.
        assertThat(7, `is`(param1+param2))
    }
    @Test
    fun `additionInt failed`(){
        var param1 : Int = 4
        var param2 : Int = 3
        // ...then the result should be the expected one.
        assertThat(7, `is`(param1+param2))
    }
}