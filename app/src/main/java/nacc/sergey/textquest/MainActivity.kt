package nacc.sergey.textquest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nacc.sergey.textquest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // код для начала новой игры и фрагмента
        binding.startBtn.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.start_activity, TextFragment())
                .commit()
        }

        binding.continueBtn.setOnClickListener {
            //код для продолжения игры
        }

    }

}