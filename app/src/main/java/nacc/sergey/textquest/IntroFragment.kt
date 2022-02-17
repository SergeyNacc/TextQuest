package nacc.sergey.textquest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nacc.sergey.textquest.databinding.FragmentIntroBinding


class IntroFragment : Fragment() {

    private lateinit var binding: FragmentIntroBinding

    private val textIntroList = listOf(
        (R.string.intro1), (R.string.intro2),
        (R.string.intro3), (R.string.intro4), (R.string.intro5),
        (R.string.intro6), (R.string.intro7), (R.string.intro8),
        (R.string.intro9)
    )

    private var counter = 0

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
            if (counter >= textIntroList.size - 1) {
                (activity as MainActivity)
                    .navController.navigate(R.id.action_introFragment_to_partOneFragment)
            } else {
                counter += 1
                updateText()
            }
        }
    }

    private fun updateText() {
        val textId = textIntroList[counter]
        binding.textPlot.setText(textId)
    }

}