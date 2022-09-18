package jp.techacademy.takayuk.kotlinlog

import android.util.Log

class Dog(var name: String, var age: Int) {
    // プロパティの初期化以外の処理を記述する場合はinitを使う
    init {
        //処理
    }
    // メソッド
    fun say() {
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}