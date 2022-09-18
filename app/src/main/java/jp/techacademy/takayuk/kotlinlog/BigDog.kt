package jp.techacademy.takayuk.kotlinlog

import android.util.Log

class BigDog// superで親クラスのコンストラクタを呼ぶ
    (name: String, age: Int) : Dog(name, age) {

    override fun say() {
        super.say()
        Log.d("kotlintest","大きな犬です。")
    }
}