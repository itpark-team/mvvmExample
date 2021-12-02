package com.example.mvvmexample

import android.view.View
import androidx.databinding.ObservableField
import java.lang.Exception

class CalcViewModel {
    var fieldA: ObservableField<String> = ObservableField("3")
    var fieldB: ObservableField<String> = ObservableField("5")
    var fieldResult: ObservableField<String> = ObservableField("0")

    fun calculcate() {
        try {
            var a = fieldA.get().toString().toInt()
            var b = fieldB.get().toString().toInt()
            var result = a + b
            fieldResult.set(result.toString())
        }
        catch(e: Exception) {
            fieldResult.set("0")
        }
    }

}