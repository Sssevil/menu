package com.example.a6lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tvTitle: TextView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTitle = findViewById(R.id.tvTitle)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       val intent = Intent(applicationContext,prodact:: class.java)
        val intent1 = Intent(applicationContext,service:: class.java)
        when(item.itemId) {
            R.id.product -> startActivity(intent)
            R.id.service -> startActivity(intent1)
            R.id.application -> tvTitle?.text=getString(R.string.opisanie)
            R.id.reviews-> tvTitle?.text= getString(R.string.otzyv)
        }
        return super.onOptionsItemSelected(item)
    }

}