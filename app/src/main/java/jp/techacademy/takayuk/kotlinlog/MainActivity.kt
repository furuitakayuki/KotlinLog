package jp.techacademy.takayuk.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("古井　貴之",26)       // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        human.say()

    }
}