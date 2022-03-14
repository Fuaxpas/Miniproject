package com.example.miniproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.math.expm1

class MainActivity2 : AppCompatActivity() {
    private var mTimer:Long=0;
    private lateinit var mCountDownTimer : CountDownTimer;
    private var mTimerRunning : Boolean=false;
    private var mTimeLeftInMillis : Long=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView4.text = intent.getStringExtra(ani)
        imageView3.setImageDrawable(ContextCompat.getDrawable(this@MainActivity2,intent.getIntExtra(image,-1)))
        textView5.text = intent.getStringExtra(dec)


        mButtonStartPause.setOnClickListener {
            if (mTimerRunning){
                pauseTimer()
            }else{
                startTimer()
            }

        }

        mButtonReset.setOnClickListener {
            resetTimer()
        }
        updateCountDownText()
    }
    private fun startTimer (){
        mTimer = ((time1.text.toString().toLong()*60)+time2.text.toString().toLong())*1000
        mTimeLeftInMillis = mTimer
        mCountDownTimer = object:CountDownTimer(mTimeLeftInMillis,1000){
            override fun onTick(millisUntilFinished:Long){
                mTimeLeftInMillis = millisUntilFinished
                updateCountDownText()
            }

            override fun onFinish() {
                mTimerRunning = false
                mButtonStartPause.setText("จับเวลา")
            }
        }.start()
        mTimerRunning = true
        mButtonStartPause.setText("หยุดเวลา")
    }

    private fun pauseTimer(){
        mCountDownTimer.cancel()
        mTimerRunning = false
        mButtonStartPause.setText("จับเวลา")
    }

    private fun resetTimer(){
        mTimeLeftInMillis = 0
        updateCountDownText()
    }

    private fun updateCountDownText(){
        var minutes = ((mTimeLeftInMillis/1000)/60).toInt()
        var seconds = ((mTimeLeftInMillis/1000)%60).toInt()

        time1.setText(minutes.toString())
        time2.setText(seconds.toString())
    }
}