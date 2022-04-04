package jp.techacademy.wenglon.leong.humanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("レオン", 43, "travelling")
        human.say()
        human.think()

        val human2 = Human("エイコ", 33, "cooking")
        human2.say()
        human2.think()

    }
}