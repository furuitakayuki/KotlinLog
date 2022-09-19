package jp.techacademy.takayuk.kotlinlog

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ",3)       // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say()
        dog.move()
        Log.d("kotlintest","犬の名前は" + dog.name + "です。")
        Log.d("kotlintest","犬の年齢は" + dog.name + "歳です。")

        val bigdog = BigDog("ヨーゼフ",15)      // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say()
        Log.d("kotlintest","犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest","犬の年齢は" + bigdog.name + "歳です。")

        val human = Human("古井貴之",26,"")    // 名前を古井貴之、年齢3歳で、Humanのインスタンスを作る
        human.say()

        val thinkable = Human("",0,"kotlin")    // 考えていることをkotlinで、Humanのインスタンスを作る
        thinkable.think()
    }
}