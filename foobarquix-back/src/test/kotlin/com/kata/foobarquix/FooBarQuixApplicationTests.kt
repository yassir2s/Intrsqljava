package com.kata.foobarquix

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import com.kata.foobarquix.services.*
import org.junit.jupiter.api.Assertions
import org.springframework.beans.factory.annotation.Autowired

@SpringBootTest
class FooBarQuixApplicationTests {

    @Autowired
    lateinit var service: FooBarQuixService


    @Test
    fun should_return_string() {
        Assertions.assertEquals("2", service.convertNumber(2))
    }


    @Test
    fun should_return_Foo_if_divisible_3() {
        Assertions.assertEquals("Foo", service.convertNumber(9))
    }

    @Test
    fun should_return_Bar_if_divisible_5() {
        Assertions.assertEquals("Bar", service.convertNumber(40))
    }

    @Test
    fun should_return_Quix_if_divisible_7() {
        Assertions.assertEquals("Quix", service.convertNumber(7))
    }

    @Test
    fun should_return_Foo_if_contain_3_and_not_divisible_by_3() {
        Assertions.assertEquals("Foo", service.convertNumber(31))
    }

    @Test
    fun should_return_Foo_if_contain_5_and_not_divisible_by_5() {
        Assertions.assertEquals("Bar", service.convertNumber(52))
    }

    @Test
    fun should_return_Foo_if_contain_7_and_not_divisible_by_7() {
        Assertions.assertEquals("Quix", service.convertNumber(71))
    }

    @Test
    fun should_return_Foo_if_contain_3_and_divisible_by_3() {
        Assertions.assertEquals("Foo", service.convertNumber(93))
    }

    @Test
    fun should_return_Foo_if_contain_5_and_divisible_by_5() {
        Assertions.assertEquals("Bar", service.convertNumber(125))
    }

    @Test
    fun should_return_Foo_if_contain_7_and_divisible_by_7() {
        Assertions.assertEquals("Quix", service.convertNumber(217))
    }

    @Test
    fun should_return_FooFoo_if_3_is_input() {
        Assertions.assertEquals("FooFoo", service.convertNumber(3))
    }

    @Test
    fun should_return_BarBar_if_5_is_input() {
        Assertions.assertEquals("BarBar", service.convertNumber(5))
    }

    @Test
    fun should_return_Quix_if_7_is_input() {
        Assertions.assertEquals("Quix", service.convertNumber(7))
    }

    @Test
    fun should_return_Foo_if_9_is_input() {
        Assertions.assertEquals("Quix", service.convertNumber(9))
    }

    @Test
    fun should_return_FooBar_if_51_is_input() {
        Assertions.assertEquals("FooBar", service.convertNumber(51))
    }

    @Test
    fun should_return_BarFoo_if_53_is_input() {
        Assertions.assertEquals("BarFoo", service.convertNumber(53))
    }

    @Test
    fun should_return_FooFooFooo_if_33_is_input() {
        Assertions.assertEquals("FooFooFoo", service.convertNumber(33))
    }

    @Test
    fun should_return_FooQuix_if_27_is_input() {
        Assertions.assertEquals("FooQuix", service.convertNumber(27))
    }

    @Test
    fun should_return_FooBarBar_if_15_is_input() {
        Assertions.assertEquals("FooFooFoo", service.convertNumber(15))
    }











}
