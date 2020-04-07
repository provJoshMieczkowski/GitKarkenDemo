package org.dexcare.gitkrakendemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        doingSomeWork()
        justAnotherFun()
    }

    private fun doingSomeWork() {
        (0..100).map {
            it * 2
        }.map {
            it * it
        }.sortedDescending().forEach {
            val message = "current value: $it"
            Log.wtf("TEST", message)
        }
    }

    private fun justAnotherFun(){
        "someString*anotherString*moreStrings".split("*")
                .forEach {
                    Log.wtf("TEST", it)
                }
    }
}
