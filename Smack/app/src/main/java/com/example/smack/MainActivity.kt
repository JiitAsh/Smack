package com.example.smack

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import com.example.smack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)
        val toolbar:Toolbar=findViewById(R.id.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout

        val toggle = ActionBarDrawerToggle(this,drawerLayout,toolbar,0,0)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

    }


    override fun onBackPressed(){
//        val drawer_layout: DrawerLayout = findViewById(R.id.drawer_layout)
//        if(drawer_layout.isDrawerOpen(GravityCompat.START)){
//            drawer_layout.closeDrawer(GravityCompat.START)
//        }else{
//            super.onBackPressed()
//        }

        val drawerLayout: DrawerLayout = binding.drawerLayout
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }






//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val toolbar:Toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)
//
////        val drawer_layout:DrawerLayout = findViewById(R.id.drawer_layout)
//        val drawer_layout = findViewById<DrawerLayout>(R.id.drawer_layout)
//        val toggle = ActionBarDrawerToggle(this,drawer_layout,toolbar,0,0)
//        drawer_layout.addDrawerListener(toggle)
//        toggle.syncState()
//    }
//
//    override fun onBackPressed() {
//        val drawer_layout = findViewById<DrawerLayout>(R.id.drawer_layout)
//        if(drawer_layout.isDrawerOpen(GravityCompat.START)){
//            drawer_layout.closeDrawer(GravityCompat.START)
//        }else {
//            super.onBackPressed()
//        }
//    }


    fun loginBtnNavClicked(view: View){
        val loginIntent = Intent(this,LoginActivity::class.java)
        startActivity(loginIntent)
    }

    fun addChannelClicked(view: View){

    }

    fun sendMsgBtnClicked(view: View){

    }

}