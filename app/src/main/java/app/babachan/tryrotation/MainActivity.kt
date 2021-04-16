package app.babachan.tryrotation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar5.progress=50
        progressBar.progress=50
        progressBar6.progress=50
        progressBar3.progress=50
        progressBar4.progress=50
    }
}