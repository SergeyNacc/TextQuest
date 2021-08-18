package nacc.sergey.textquest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nacc.sergey.textquest.databinding.FragmentIntroBinding


class IntroFragment : Fragment() {

    private lateinit var binding: FragmentIntroBinding

    private val textIntroList = listOf(R.string.intro2, R.string.intro3, R.string.intro4,
        R.string.intro5, R.string.intro6, R.string.intro7, R.string.intro8, R.string.intro9)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentIntroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textPlot.text = getText(R.string.intro1)

        binding.buttonNext.setOnClickListener {
            textIntroList.forEach()
        }


    }

}