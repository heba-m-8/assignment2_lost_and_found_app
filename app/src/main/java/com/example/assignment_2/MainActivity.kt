package com.example.assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val lostF = lostFragment()
        val foundF = foundFragment()

        when(item.itemId) {
            R.id.lostItem -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.homeFragment, lostF)
                commit()
            }
            R.id.foundItem -> supportFragmentManager.beginTransaction().apply {
                replace(R.id.homeFragment, foundF)
                commit()
            }
        }
    return true
    }

}
