package jp.techacademy.wenglon.leong.humanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("レオン", 43, "travelling")
        val human2 = Human("エイコ", 33, "cooking")

        human.say()
        human2.say()

        human.think()
        human2.think()
    }
}