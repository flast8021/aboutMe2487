package com.example.firstapplicationhelloworld

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class achievements_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievements)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#53789F")))
        val buttonHobbiesHome = findViewById<Button>(R.id.buttonHobbiesHome)
        val buttonHome = findViewById<Button>(R.id.buttonHome)

        buttonHobbiesHome.setOnClickListener{
            val intentHobbiesHome = Intent(this,hobbies_avctivity::class.java)
            startActivity(intentHobbiesHome)
            finish()
        }
        buttonHome.setOnClickListener{
            val intentHome = Intent(this,MainActivity::class.java)
            startActivity(intentHome)
            finish()
        }

    }
    /*
*Refrence:
* https://www.youtube.com/watch?v=SbNQxPDUWaI
*/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_nav,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.nav_exit -> Toast.makeText(this,"Thanks For using this App.",Toast.LENGTH_SHORT).show()
        }
        finish()
        return super.onOptionsItemSelected(item)
    }
}