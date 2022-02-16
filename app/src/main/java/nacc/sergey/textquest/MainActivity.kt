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
        supportFragmentManager
            .beginTransaction()
            .replace(binding.root.id, BaseFragment())
            .commit()
    }

    fun launchIntroFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.start_fragment, IntroFragment())
            .addToBackStack(null)
            .commit()
    }
}