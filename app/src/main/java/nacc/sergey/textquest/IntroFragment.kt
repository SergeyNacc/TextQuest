package nacc.sergey.textquest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_intro.*
import nacc.sergey.textquest.databinding.FragmentIntroBinding


class IntroFragment : Fragment(R.id.intro_fragment) {

    private lateinit var binding: FragmentIntroBinding

    private val textIntroList = listOf(
        (R.string.intro1), (R.string.intro2),
        (R.string.intro3), (R.string.intro4), (R.string.intro5),
        (R.string.intro6), (R.string.intro7), (R.string.intro8),
        (R.string.intro9)
    )

    private var currentIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentIntroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        updateText()

        binding.buttonNext.setOnClickListener {
            currentIndex = (currentIndex + 1) % textIntroList.size
            updateText()
            if (currentIndex >= textIntroList.size) {
            }

            // как только массив заканчивается,
            // нужен код для вызова следующего фрагмента
        }
    }

    private fun updateText() {
        val textId = textIntroList[currentIndex]
        binding.textPlot.setText(textId)
    }

}