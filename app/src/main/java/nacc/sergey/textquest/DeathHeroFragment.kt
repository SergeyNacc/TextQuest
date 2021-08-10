package nacc.sergey.textquest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nacc.sergey.textquest.databinding.FragmentDeathheroBinding


class DeathHeroFragment : Fragment() {

    private lateinit var binding: FragmentDeathheroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentDeathheroBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonAfterDeath.setOnClickListener {
            //код для возврата в главное меню
        }
    }
}