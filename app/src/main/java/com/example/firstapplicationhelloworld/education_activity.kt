package com.example.firstapplicationhelloworld

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class education_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#53789F")))
//icon on action bar start

    // Note that the Toolbar defined in the layout has the id "my_toolbar"

//icon on action bar end
        val buttonEducationHome = findViewById<Button>(R.id.buttonEducationHome)
        val buttonSkillsII = findViewById<Button>(R.id.buttonSkillsII)

        buttonEducationHome.setOnClickListener{
            val intentEducationHome = Intent(this,MainActivity::class.java)
            startActivity(intentEducationHome)
            finish()
        }

        buttonSkillsII.setOnClickListener{
            val intentSkillsII = Intent(this,skills_activivity::class.java)
            startActivity(intentSkillsII)
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