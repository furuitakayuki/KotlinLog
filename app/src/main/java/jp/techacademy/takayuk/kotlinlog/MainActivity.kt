package jp.techacademy.takayuk.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest","ログへの出力テスト")

        // 整数型の変数をnumという名前で作成して、１０を代入する
        var num = 10
        Log.d("kotlintest",Integer.toString(num))

        // numに５０を代入する
        // 変数や定数に .tostring() と記述する方法もある
        num = 50
        Log.d("kotlintest",num.toString())

        //演算子
        val num1 = 10+5-2*4/2
        Log.d("kotlintest","10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest","flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest","flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest","num2 < num3 = " + (num2 < num3))

        //if文
        num = 60

        if (num >=90) {
            Log.d("kotlintest","優")
        } else if (num >= 75){
            Log.d("kotlintest","良")
        } else if (num >= 60){
            Log.d("kotlintest","可")
        } else {
            Log.d("kotlintest","不可")
        }

        //when文
        val drink = 1

        when (drink) {
            0 -> {
                Log.d("kotlintest","コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest","紅茶を注文しました")
            2 -> Log.d("kotlintest","ミルクを注文しました")
            else -> Log.d("kotlintest","オーダーミスです")
        }
        
    }
}