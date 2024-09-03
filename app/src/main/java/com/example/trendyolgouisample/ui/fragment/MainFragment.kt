package com.example.trendyolgouisample.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.trendyolgouisample.R
import com.example.trendyolgouisample.data.entity.CardModel
import com.example.trendyolgouisample.databinding.FragmentMainBinding
import com.example.trendyolgouisample.ui.adapter.AdvAdapter
import com.example.trendyolgouisample.ui.adapter.CuisineAdapter
import com.example.trendyolgouisample.ui.adapter.OpportunityAdapter


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    private lateinit var advAdapter: AdvAdapter
    private lateinit var advList: List<CardModel>
    private lateinit var rvAdv: RecyclerView

    private lateinit var opportunityAdapter: OpportunityAdapter
    private lateinit var opportunityList: List<CardModel>
    private lateinit var rvOpportunity: RecyclerView

    private lateinit var cuisineAdapter: CuisineAdapter
    private lateinit var cuisineList: List<CardModel>
    private lateinit var rvCuisine: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        initialize()
        addToList()

        advAdapter = AdvAdapter(advList)
        rvAdv.adapter = advAdapter
        rvAdv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        opportunityAdapter = OpportunityAdapter(opportunityList)
        rvOpportunity.adapter = opportunityAdapter
        rvOpportunity.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        cuisineAdapter = CuisineAdapter(cuisineList)
        rvCuisine.adapter = cuisineAdapter
        rvCuisine.layoutManager =
            StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)





        return binding.root
    }


    private fun initialize() {
        advList = listOf()
        rvAdv = binding.rvAdv

        opportunityList = listOf()
        rvOpportunity = binding.rvOpportunity

        cuisineList = listOf()
        rvCuisine = binding.rvCuisine

    }

    private fun addToList() {
        advList = listOf(
            R.drawable.adv1, R.drawable.adv2, R.drawable.adv3, R.drawable.adv4
        ).map { CardModel(it) }



        opportunityList = listOf(
            R.drawable.oppurtunity1,
            R.drawable.opportunity2,
            R.drawable.opportunity3,
            R.drawable.opportunity4
        ).map { CardModel(it) }

        cuisineList = listOf(
            R.drawable.doner,
            R.drawable.hamburger,
            R.drawable.tatli,
            R.drawable.cigkofte,
            R.drawable.pizza,
            R.drawable.pidelahmacun,
            R.drawable.kebap,
            R.drawable.tostsandvic,
            R.drawable.sokaklezzetleri,
            R.drawable.evyemekleri,
            R.drawable.dondurma,
            R.drawable.pastanefirin,
            R.drawable.kofte,
            R.drawable.mantimakarna,
            R.drawable.dunyamutfagicafe,
            R.drawable.kahveicecek,
            R.drawable.uzakdogu,
            R.drawable.salatasaglik,
            R.drawable.balikdenizurunleri,
            R.drawable.steak,
            R.drawable.borek,
            R.drawable.kahvalti
        ).map { CardModel(it) }
    }

}

