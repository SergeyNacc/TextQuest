package nacc.sergey.textquest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import nacc.sergey.textquest.databinding.FragmentBaseBinding

class BaseFragment : Fragment() {

    private lateinit var binding: FragmentBaseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBaseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.startBtn.setOnClickListener { startNewGame() }
        binding.continueBtn.setOnClickListener { continueGame() }

    }

    private fun continueGame() {
        Toast.makeText(context, "Продолжить игру", Toast.LENGTH_SHORT).show()
    }

    private fun startNewGame() {
    }
}