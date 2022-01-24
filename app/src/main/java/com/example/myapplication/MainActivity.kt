package com.example.myapplication

import android.Manifest
import android.R.attr
import android.app.Activity
import android.content.Intent
import android.content.Intent.*
import android.content.pm.PackageManager
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding
import android.R.attr.phoneNumber
import android.app.AlertDialog
import android.content.DialogInterface
import android.util.Patterns
import android.util.Patterns.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupUI()
    }

    fun setupUI() {
        binding.btnShowAlert.setOnClickListener {
            //TODO : Create alert dialogue builder
            val builder = AlertDialog.Builder(this)
            //TODO : Set props
            builder.setTitle("This is my title")
            builder.setMessage("This is my message")
            builder.setIcon(R.drawable.ic_tv)
            builder.setCancelable(false)
            //TODO : Set buttons and event handlers
            builder.setPositiveButton("Yes") { p0, p1 ->
                Toast.makeText(this, "Yes Clicked", Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("No", null)
            builder.setNeutralButton("Neutral") { p0, p1 ->
                Toast.makeText(this, "Neutral Clicked", Toast.LENGTH_SHORT).show()
            }
            //TODO : Create and show alert dialog
            val alert = builder.create()
            alert.show()
        }
    }
}