package nacc.sergey.textquest.plotfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nacc.sergey.textquest.MainActivity
import nacc.sergey.textquest.R
import nacc.sergey.textquest.databinding.FragmentPartTwoBinding

class PartTwoFragment : Fragment() {

    private lateinit var binding: FragmentPartTwoBinding

    private val textPartTwoList = listOf(
        (R.string.part_two_0), (R.string.part_two_1), (R.string.part_two_2),
        (R.string.part_two_3), (R.string.part_two_4), (R.string.part_two_5),
        (R.string.part_two_6), (R.string.part_two_7), (R.string.part_two_8),
        (R.string.part_two_9), (R.string.part_two_10), (R.string.part_two_11),
        (R.string.part_two_12), (R.string.part_two_13), (R.string.part_two_14),
        (R.string.part_two_15), (R.string.part_two_16), (R.string.part_two_17),
        (R.string.part_two_18), (R.string.part_two_19), (R.string.part_two_20),
        (R.string.part_two_21), (R.string.part_two_22), (R.string.part_two_23),
        (R.string.part_two_24), (R.string.part_two_25), (R.string.part_two_26),
        (R.string.part_two_27), (R.string.part_two_28), (R.string.part_two_29),
        (R.string.part_two_30), (R.string.part_two_31), (R.string.part_two_32),
        (R.string.part_two_33), (R.string.part_two_34),
    )

    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPartTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        updateText()

        binding.buttonNext.setOnClickListener {
            when (counter) {
                29 -> {
                    //запустить бой сразу или забать вопрос - драться или нет
                    //осуществить выход из боя с сохранением
                    (activity as MainActivity)
                        .navController.navigate(R.id.action_partTwoFragment_to_battleFragment)
                    counter = 30
                }
                34 -> {
                    (activity as MainActivity)
                    //.navController.navigate(R.id. !сдесь будет экшн на PartThreeFragment )
                }
                else -> {
                    counter += 1
                    updateText()
                }
            }
        }
    }


    private fun updateText() {
        val textId = textPartTwoList[counter]
        binding.textPlot.setText(textId)
        if (counter > 0) {
            binding.imageForPlot.visibility = View.GONE
        }
    }
}