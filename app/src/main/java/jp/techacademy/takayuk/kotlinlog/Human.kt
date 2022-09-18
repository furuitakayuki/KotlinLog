package jp.techacademy.takayuk.kotlinlog

import  android.util.Log

import android.util.Log

open class Human:Animal {
    // 引数付きコンストラクタ
    constructor(name: String,age: Int): super(name,age) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest","私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Animalクラスのメソッドをオーバーライド
    override  fun say() {
        Log.d("kotlintest","私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
}