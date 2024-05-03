package adityadifa.tugasmobile.difanotes

import adityadifa.tugasmobile.difanotes.databinding.ActivityMainBinding
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tombolTambah.setOnClickListener{
            Log.d(TAG, "onCreate: tombol tambah clicked")
            val dialogFragment = TambahFile()
            dialogFragment.show(supportFragmentManager, "my_dialog_fragment_tag")
        }
    }
}