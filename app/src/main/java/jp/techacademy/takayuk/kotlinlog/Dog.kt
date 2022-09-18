package jp.techacademy.takayuk.kotlinlog

import android.util.Log

open class Dog// 引数付きコンストラクタ
    (name: String, age: Int) : Animal(name, age),Movable{

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}