package com.aariz.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aariz.myapp.databinding.CalculatorBinding

class Calculator_example : AppCompatActivity() {

    private lateinit var calci: CalculatorBinding
    private var expression: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        calci = CalculatorBinding.inflate(layoutInflater)
        setContentView(calci.root)

        // Digits
        calci.btn0.setOnClickListener { append("0") }
        calci.btn1.setOnClickListener { append("1") }
        calci.btn2.setOnClickListener { append("2") }
        calci.btn3.setOnClickListener { append("3") }
        calci.btn4.setOnClickListener { append("4") }
        calci.btn5.setOnClickListener { append("5") }
        calci.btn6.setOnClickListener { append("6") }
        calci.btn7.setOnClickListener { append("7") }
        calci.btn8.setOnClickListener { append("8") }
        calci.btn9.setOnClickListener { append("9") }

        // Operators
        calci.btnPlus.setOnClickListener { append("+") }
        calci.btnMinus.setOnClickListener { append("-") }
        calci.btnMultiply.setOnClickListener { append("x") }
        calci.btnDivide.setOnClickListener { append("/") }

        // Clear
        calci.btnAc.setOnClickListener {
            expression = ""
            calci.display.setText("")
        }

        // Equal
        calci.btnEqual.setOnClickListener {
            try {
                val result = evaluate(expression)
                calci.display.setText(result.toString())
                expression = result.toString()
            } catch (e: Exception) {
                calci.display.setText("Error")
                expression = ""
            }

        }
        // Delete (⌫)
        calci.btnDel.setOnClickListener {
            if (expression.isNotEmpty()) {
                expression = expression.trimEnd() // remove trailing space if any

                if (expression.endsWith(" ")) {
                    // Delete operator and surrounding spaces (e.g., " + ")
                    expression = expression.dropLast(3)
                } else {
                    // Delete last digit or dot
                    expression = expression.dropLast(1)
                }

                calci.display.setText(expression)
            }
        }

    }

    private fun append(value: String) {
        if (value in listOf("+", "-", "x", "/")) {
            expression += " $value "
        } else {
            expression += value
        }
        calci.display.setText(expression)
    }


    private fun evaluate(expr: String): Double {
        val tokens = expr.trim().split(" ")
        var result = tokens[0].toDouble()

        var i = 1
        while (i < tokens.size) {
            val operator = tokens[i]
            val nextNumber = tokens[i + 1].toDouble()

            result = when (operator) {
                "+" -> result + nextNumber
                "-" -> result - nextNumber
                "x" -> result * nextNumber
                "/" -> result / nextNumber
                else -> result
            }
            i += 2
        }

        return result
    }

}
