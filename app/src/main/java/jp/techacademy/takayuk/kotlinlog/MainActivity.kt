package jp.techacademy.takayuk.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  android.util.Log    //ここを追加

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest","ログへの出力テスト")    //ここを追加
    }
}