package com.example.mediame.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mediame.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.converter.gson.GsonConverterFactory

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home,container,false)
        return view

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val api = RetrofitClient.apiinterface
        api.getarticles().enqueue(object : Callback<Myarticles> {
        override fun onResponse(call: Call<Myarticles>, response: Response<Myarticles>) {

        val data=response.body()
        val myadapter =Adapter(data!!.articles as List<Myarticles.Article>)
            myadapter.onClick={
                Toast.makeText(context, "Title: $it", Toast.LENGTH_SHORT).show()
                currentfragments(commentFragment())

            }

            val recyclerview =view.findViewById<RecyclerView>(R.id.recyclerviewid)

            recyclerview.layoutManager=LinearLayoutManager(context,RecyclerView.VERTICAL,false)

            recyclerview.adapter=myadapter


            }

            override fun onFailure(call: Call<Myarticles>, t: Throwable) {

                

            }

    })




    }

    private fun currentfragments(fragment: Fragment) =
        requireActivity().supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout,fragment)
            commit()
        }





}
