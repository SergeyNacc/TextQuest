package nacc.sergey.textquest.plotfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nacc.sergey.textquest.MainActivity
import nacc.sergey.textquest.R
import nacc.sergey.textquest.databinding.FragmentPartOneBinding

class PartOneFragment : Fragment() {

    private lateinit var binding: FragmentPartOneBinding

    private val textPartOneList = listOf(
        (R.string.part_one_0),
        (R.string.part_one_1),
        (R.string.part_one_2),
        (R.string.part_one_3),
        (R.string.part_one_4),
        (R.string.part_one_5),
        (R.string.part_one_6),
        (R.string.part_one_7),
        (R.string.part_one_8),
        (R.string.part_one_9),
        (R.string.part_one_10),
        (R.string.part_one_11),
        (R.string.part_one_12),
        (R.string.part_one_13),
        (R.string.part_one_14),
        (R.string.part_one_15),
        (R.string.part_one_16),
        (R.string.part_one_17),
        (R.string.part_one_18),
        (R.string.part_one_19),
        (R.string.part_one_20),
        (R.string.part_one_21),
        (R.string.part_one_22),
        (R.string.part_one_23),
        (R.string.part_one_24),
        (R.string.part_one_25),
        (R.string.part_one_26)
    )

    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPartOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        updateText()

        binding.buttonNext.setOnClickListener {
            when (counter) {
                16 -> {
                    //запустить бой сразу или забать вопрос - драться или нет
                    //осуществить выход из боя с сохранением
                    (activity as MainActivity)
                        .navController.navigate(R.id.action_partOneFragment_to_battleFragment)
                    counter = 17
                }
                26 -> {
                    (activity as MainActivity)
                    .navController.navigate(R.id.action_partOneFragment_to_partTwoFragment)
                }
                else -> {
                    counter += 1
                    updateText()
                }
            }
        }
    }

    private fun updateText() {
        val textId = textPartOneList[counter]
        binding.textPlot.setText(textId)
        if (counter > 0) {
            binding.imageForPlot.visibility = View.GONE
        }
    }
}