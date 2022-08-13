package com.mcvector36.loterialuimihai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonInit()
    }

    private fun buttonInit() {
        val button: Button = findViewById(R.id.playButton)
        button.setOnClickListener {
            objectsInit()
        }
    }

    private fun objectsInit() {

        val ball1 = Ball()
        val ball2 = Ball()
        val ball3 = Ball()
        val ball4 = Ball()
        val ball5 = Ball()
        val ball6 = Ball()

        val ballRoll1 = ball1.roll()
        val ballRoll2 = ball2.roll()
        val ballRoll3 = ball3.roll()
        val ballRoll4 = ball4.roll()
        val ballRoll5 = ball5.roll()
        val ballRoll6 = ball6.roll()

        val ballImage1: ImageView = findViewById(R.id.ball1)
        val ballImage2: ImageView = findViewById(R.id.ball2)
        val ballImage3: ImageView = findViewById(R.id.ball3)
        val ballImage4: ImageView = findViewById(R.id.ball4)
        val ballImage5: ImageView = findViewById(R.id.ball5)
        val ballImage6: ImageView = findViewById(R.id.ball6)

        ballImage1.setImageResource(rollBalls(ballRoll1))
        ballImage2.setImageResource(rollBalls(ballRoll2))
        ballImage3.setImageResource(rollBalls(ballRoll3))
        ballImage4.setImageResource(rollBalls(ballRoll4))
        ballImage5.setImageResource(rollBalls(ballRoll5))
        ballImage6.setImageResource(rollBalls(ballRoll6))

    }

    private fun rollBalls(ballRoll: Int): Int {
        val result = when(ballRoll) {
            1 -> R.drawable.i1
            2 -> R.drawable.i2
            3 -> R.drawable.i3
            4 -> R.drawable.i4
            5 -> R.drawable.i5
            6 -> R.drawable.i6
            7 -> R.drawable.i7
            8 -> R.drawable.i8
            9 -> R.drawable.i9
            10 -> R.drawable.i10

            11 -> R.drawable.i11
            12 -> R.drawable.i12
            13 -> R.drawable.i13
            14 -> R.drawable.i14
            15 -> R.drawable.i15
            16 -> R.drawable.i16
            17 -> R.drawable.i17
            18 -> R.drawable.i18
            19 -> R.drawable.i19
            20 -> R.drawable.i20

            21 -> R.drawable.i21
            22 -> R.drawable.i22
            23 -> R.drawable.i23
            24 -> R.drawable.i24
            25 -> R.drawable.i25
            26 -> R.drawable.i26
            27 -> R.drawable.i27
            28 -> R.drawable.i28
            29 -> R.drawable.i29
            30 -> R.drawable.i30

            31 -> R.drawable.i31
            32 -> R.drawable.i32
            33 -> R.drawable.i33
            34 -> R.drawable.i34
            35 -> R.drawable.i35
            36 -> R.drawable.i36
            37 -> R.drawable.i37
            38 -> R.drawable.i38
            39 -> R.drawable.i39
            40 -> R.drawable.i40

            41 -> R.drawable.i41
            42 -> R.drawable.i42
            43 -> R.drawable.i43
            44 -> R.drawable.i44
            45 -> R.drawable.i45
            46 -> R.drawable.i46
            47 -> R.drawable.i47
            48 -> R.drawable.i48
            else -> R.drawable.i49
        }

        return result
    }
}
