package jp.techacademy.takayuk.kotlinlog

abstract class Animal {
    // プロパティ
    var name: String
    var age: Int
    val hobby: String


    // 引数付きコンストラクタ
    constructor(name: String,age: Int,hobby: String) {
        this.name = name
        this.age = age
        this.hobby = hobby
    }



    abstract fun say()

}