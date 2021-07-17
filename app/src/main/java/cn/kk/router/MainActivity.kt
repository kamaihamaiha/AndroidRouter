package cn.kk.router

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kk.router.annotations.Destination

@Destination(
    url = "hello",
    description = "kk"
)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}