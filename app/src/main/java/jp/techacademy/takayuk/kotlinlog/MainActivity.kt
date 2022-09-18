package jp.techacademy.takayuk.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("古井貴之",26,"")      // 名前を古井貴之、年齢3歳で、Humanのインスタンスを作る
        val thinkable = Human("",0,"kotlin")    // 考えていることをkotlinで、Humanのインスタンスを作る

        human.say()
        thinkable.think()
    }
}