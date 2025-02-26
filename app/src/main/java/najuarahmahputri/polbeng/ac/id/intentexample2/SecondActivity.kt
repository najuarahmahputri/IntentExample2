package najuarahmahputri.polbeng.ac.id.intentexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import najuarahmahputri.polbeng.ac.id.intentexample2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val receiveData = intent.getStringExtra("main_activity_data")
        binding.textView.text = receiveData
    }
}
