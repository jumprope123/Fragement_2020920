package kr.co.tjoeun.fragement_2020920.Fragements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragement_second.*
import kr.co.tjoeun.fragement_2020920.R

class SecondFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragement_second,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toastBtn.setOnClickListener {

            Toast.makeText(context,"버튼이 눌림", Toast.LENGTH_SHORT).show()
        }
    }
}