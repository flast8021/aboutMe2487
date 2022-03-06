package com.example.firstapplicationhelloworld

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#53789F")))

        val button_education = findViewById<Button>(R.id.buttonEducation)
        val button_skills = findViewById<Button>(R.id.buttonSkills)
        val button_hobbies = findViewById<Button>(R.id.buttonHobbies)
        val button_achievements = findViewById<Button>(R.id.buttonAchievments)

        button_education.setOnClickListener{
        val intentEducation = Intent(this,education_activity::class.java)
            startActivity(intentEducation)
            finish()
        }
        button_skills.setOnClickListener{
            val intentSkills = Intent(this,skills_activivity::class.java)
            startActivity(intentSkills)
            finish()
        }
        button_hobbies.setOnClickListener{
            val intentHobbies = Intent(this,hobbies_avctivity::class.java)
            startActivity(intentHobbies)
            finish()
        }
        button_achievements.setOnClickListener{
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
            R.id.nav_exit -> Toast.makeText(this,"Thanks For using this App.",Toast.LENGTH_SHORT).show()
        }
        finish()
        return super.onOptionsItemSelected(item)
    }
}