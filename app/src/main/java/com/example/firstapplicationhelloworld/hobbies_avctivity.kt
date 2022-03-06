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

class hobbies_avctivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hobbies_avctivity)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#53789F")))

        val buttonSkillsHome = findViewById<Button>(R.id.buttonSkillsHome)
        val buttonAchievements = findViewById<Button>(R.id.buttonAchievementsII)

        buttonSkillsHome.setOnClickListener{
            val intentSkillsHome = Intent(this,skills_activivity::class.java)
            startActivity(intentSkillsHome)
            finish()
        }

        buttonAchievements.setOnClickListener{
            val intentAchievements = Intent(this,achievements_activity::class.java)
            startActivity(intentAchievements)
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
            R.id.nav_exit -> Toast.makeText(this,"Thanks For using this App.", Toast.LENGTH_SHORT).show()
        }
        finish()
        return super.onOptionsItemSelected(item)
    }
}