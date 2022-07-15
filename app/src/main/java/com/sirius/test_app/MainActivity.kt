package com.sirius.test_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var description: TextView
    private lateinit var date1: TextView
    private lateinit var date2: TextView
    private lateinit var name1: TextView
    private lateinit var name2: TextView
    private lateinit var message1: TextView
    private lateinit var message2: TextView
    private lateinit var gameName: TextView
    private lateinit var tag1: MaterialButton
    private lateinit var tag2: MaterialButton
    private lateinit var tag3: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        description = findViewById(R.id.description)
        date1 = findViewById(R.id.dateText1)
        date2 = findViewById(R.id.dateText2)
        name1 = findViewById(R.id.name1)
        name2 = findViewById(R.id.name2)
        message1 = findViewById(R.id.message1)
        message2 = findViewById(R.id.message2)
        gameName = findViewById(R.id.gameName)
        tag1 = findViewById(R.id.tag1)
        tag2 = findViewById(R.id.tag2)
        tag3 = findViewById(R.id.tag3)
        val data = DataModel()
        runOnUiThread {
            description.text = data.description
            gameName.text = data.name
            tag1.text = data.tags[0]
            tag2.text = data.tags[1]
            tag3.text = data.tags[2]
            date1.text = data.reviews[0].date
            date2.text = data.reviews[1].date
            name1.text = data.reviews[0].userName
            name2.text = data.reviews[1].userName
            message1.text = data.reviews[0].message
            message2.text = data.reviews[1].message
        }
    }

}
}