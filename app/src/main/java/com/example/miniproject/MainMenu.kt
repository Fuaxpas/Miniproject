package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main_menu.*

var ani = "ani"
var image = "image"
var dec = "dec"

class MainMenu : AppCompatActivity() {
    var auth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        auth = FirebaseAuth.getInstance()
        if (auth!!.currentUser == null){
            val it = Intent(this, Login::class.java)
            startActivity(it)
            finish()
        }

        imageView.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"Deep Squat")
            intent.putExtra(image,R.drawable.w1)
            intent.putExtra(dec,"บอดี้เวทท่า Deep Squat เริ่มจากการยืนตัวตรง กางขาให้กว้างเท่ากับหัวไหล่ หลังเหยียดตรง เหยียดแขนขึ้นด้านบน พร้อมค่อยๆย่อเข่า คล้ายกับการนั่งยอง แยกขาออกให้กว้างจนรู้สึกตึงบริเวณกล้ามเนื้อ " +
                    "hamstrings นับ 1-5 ไว้ในใจ ทำแบบนี้ 6 ครั้งนับเป็น 1 เซ็ต ทำทั้งหมด 2 เซ็ต")
            startActivity(intent)
        }
        imageView2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"Lunge")
            intent.putExtra(image,R.drawable.w2)
            intent.putExtra(dec,"หลังจากเสร็จท่า Deep Squat จากนั้นยืนตัวตรงก้าวเท้าซ้ายไปด้านหน้า กดสะโพกพร้อมกับงอเข่าขวาลง ในองศาที่ตั้งฉาก โดยเข่าขวาห้ามโดนพื้น พยายามรักษาสมดุล ค้างไว้ 5 วินาที ทำแบบนี้ 6 ครั้ง " +
                    "นับเป็น 1 เซ็ต โดยสลับขาข้างละ 3 ครั้ง ทำทั้งหมด 3 เซ็ต")
            startActivity(intent)
        }
        imageView4.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"Squat Jump with floor touch")
            intent.putExtra(image,R.drawable.w3)
            intent.putExtra(dec,"ท่า Squat Jump with floor touch เริ่มจากนั่งยองแยกขาออก เอามือไว้บริเวณหว่างขาชิดกับหัวเข่า ใช้มือแตะพื้นค้างไว้ 2 วินาที จากนั้นกระโดดตบมือเหนือหัว ทำแบบ 6 ครั้ง นับเป็น 1 เซ็ต " +
                    "โดยทำทั้งหมด 3 เซ็ต")
            startActivity(intent)
        }
        imageView5.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"Bridge")
            intent.putExtra(image,R.drawable.w4)
            intent.putExtra(dec,"ท่าบอดี้เวท นอนหงาย คว่ำมือไว้ข้างตัว ตั้งเข่าทั้งสองข้างขึ้น จากให้ยกสะโพกโดยไม่ใช้มือช่วย ฝ่าเท้าต้องติดกับพื้นเพื่อเพิ่มแรงยกสะโพก ทำท่านี้ค้างไว้ 5 วินาที ทำ 6 ครั้งนับเป็น 1 เซ็ต ทำทั้งหมด 2 เซ็ต")
            startActivity(intent)
        }
        imageView6.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"Plank")
            intent.putExtra(image,R.drawable.w5)
            intent.putExtra(dec,"นอนคว่ำหน้า อยู่ในท่าวิดพื้น จากนั้นงอข้อศอกลงตั้งฉากกับพื้น ให้แขนท่อนบนติดกับพื้น ปรับระยะความกว้างของข้อศอกให้ขนานกับหัวไหล่ ลำตัวเป็นเส้นตรง หลังไม่โก้ง ทำค้างไว้ครั้งละ 20 วินาที " +
                    "นับเป็น 1 เซ็ต ทำทั้งหมด 3 เซ็ต")
            startActivity(intent)
        }
        imageView7.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"Mountain Climbers")
            intent.putExtra(image,R.drawable.w6)
            intent.putExtra(dec,"ตั้งท่าวิดพื้น ดึงเข่าขวาไปด้านหน้า จากนั้นดึงเข่าขวากลับไปที่ตำแหน่งเดิม ทำแบบเดียวกันกับขาข้างซ้าย สลับกันไปมา เน้นไปที่การทำความความเร็ว พยายามรักษาความเร็วให้เพิ่มขึ้นหรือคงที่ " +
                    "ขณะทำให้จับเวลาในการทำ 1 นาที")
            startActivity(intent)
        }
        imageView8.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"Bridge Kick")
            intent.putExtra(image,R.drawable.w7)
            intent.putExtra(dec,"ท่าบอดี้เวท นั่งยืดขาข้างขวา ตั้งเข่าขาข้างซ้าย ส่วนขาขวาเหยียดตรง ใช้มือสองข้างยันพื้น จากนั้นยกสะโพกขึ้น โดยให้ขาขวายังคงเหยียดตรงไปด้านบน 90 องศา พยายามรักษาสมดุลให้ได้ 5 วินาที " +
                    "ทำแบบนี้ 6 ครั้ง โดยสลับขาข้างละ 3 ครั้ง ทำทั้งหมด 3 เซ็ต")
            startActivity(intent)
        }
        imageView9.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(ani,"Press up Burpee")
            intent.putExtra(image,R.drawable.w8)
            intent.putExtra(dec,"เริ่มจากการนั่งยองก้างเข่าออก วางมือไว้บริเวณหว่างขา จากนั้นนอนคว่ำหน้า เหมือนกับท่าวิดพื้น จากนั้นกระโดดตบมือเหนือหัว ทำแบบนี้ 6 ครั้ง ทำทั้งหมด 3 เซ็ต")
            startActivity(intent)
        }
        cmdLogout.setOnClickListener {
            auth!!.signOut()
            Toast.makeText(this, "Logout Complete", Toast.LENGTH_LONG).show()

            val it = Intent(this, Login::class.java)
            startActivity(it)
            finish()
        }
    }
}