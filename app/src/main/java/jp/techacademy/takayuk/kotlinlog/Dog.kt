package jp.techacademy.takayuk.kotlinlog

import android.util.Log

open class Dog// 引数付きコンストラクタ
    (name: String, age: Int) : Animal(name, age) {

    // メソッド
    override fun say() {
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}