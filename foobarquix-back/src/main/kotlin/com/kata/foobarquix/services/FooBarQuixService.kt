package com.kata.foobarquix.services

import org.springframework.stereotype.Component
import java.util.stream.Collector
import kotlin.streams.toList

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {

        val hashMap:HashMap<Int,String> = HashMap<Int,String>() //define empty hashmap.
        hashMap.put(3,"Foo")
        hashMap.put(5,"Bar")

        var result = hashMap.keys.stream()
                     .filter{i-> inputNumber % i == 0}
                     .map { i -> hashMap.get(i) }
                     .toList().joinToString("")

        hashMap.put(7,"Quix")


        result += inputNumber.toString().toCharArray().toList().stream()
                  .map { i -> hashMap.getOrDefault(Character.getNumericValue(i),"") }
                  .toList().joinToString("")


        if(result.isBlank()) result = inputNumber.toString()

        return result
    }

}