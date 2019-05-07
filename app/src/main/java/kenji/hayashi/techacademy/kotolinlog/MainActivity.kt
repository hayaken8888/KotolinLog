package kenji.hayashi.techacademy.kotolinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("健二", 39 ,"釣り")

        human1.say()

        human1.think()

       val human2 =Human("kenji",39,"酒")
        human2.say()

        human2.think()
    }
}



