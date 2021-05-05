package app.miki.mikiso.renda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //タップを数える変数を準備する
    var tapCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ボタンがタップされた時に
        tapButton.setOnClickListener {

            //タップを数える変数にプラス1する
            tapCount = tapCount + 1

            //タップされた数をテキストビューに反映する
            countText.text = tapCount.toString()

        }
    }
}