package jp.techacademy.takayuk.kotlinlog

abstract class Animal// 引数付きコンストラクタ
    (// プロパティ
    var name: String, var age: Int
) {

    abstract fun say()
}