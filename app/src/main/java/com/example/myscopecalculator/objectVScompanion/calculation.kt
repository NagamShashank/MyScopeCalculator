package com.example.myscopecalculator.objectVScompanion

class calculation {


    companion object {
        var number1 :Int = 0
        var number2 :Int = 0
        fun getSum():Int{
            return this.number1 + this.number2
        }
    }

    fun getMul(number1 : Int,number2 : Int):Int{
        return number1 * number2
    }
}