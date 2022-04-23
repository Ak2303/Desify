package org.tensorflow.lite.examples.soundclassifier
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.tensorflow.lite.examples.detection.DetectorActivity
import org.tensorflow.lite.examples.soundclassifier.MainActivity
import org.tensorflow.lite.examples.soundclassifier.R

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val soundClassification: Button = findViewById(R.id.soundClassificationBtn)
        soundClassification.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val objectDetection: Button = findViewById(R.id.objectDetectionBtn)
        objectDetection.setOnClickListener {
            val intent = Intent(this, DetectorActivity::class.java)
            startActivity(intent)
        }

        val developerInfo: Button = findViewById(R.id.devInfoBtn)
        developerInfo.setOnClickListener {
            val intent = Intent(this, DevInfoActivity::class.java)
            startActivity(intent)
        }
    }
}