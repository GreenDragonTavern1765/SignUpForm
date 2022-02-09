package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<TextView>(R.id.nameInput)
        val email = findViewById<TextView>(R.id.emailInput)
        val password = findViewById<TextView>(R.id.passwordInput)
        val confirm = findViewById<TextView>(R.id.confirmInput)

        findViewById<Button>(R.id.createButton).setOnClickListener {
            checkBlankInput(name.text.toString(), email.text.toString(), password.text.toString(), confirm.text.toString())
            if (passwordMatch(password.text.toString(), confirm.text.toString()) == 0)
                findViewById<TextView>(R.id.confirmInput).setError("Password do not match")
        }
    }

    fun passwordMatch(password: String, confirm: String) : Int {
        if (password == confirm)
            return 1
        return 0
    }

    fun checkBlankInput(name: String, email: String, password: String, confirm: String) {
        if (name.isBlank())
            findViewById<TextView>(R.id.nameInput).setError("Please enter a valid name")
        if (email.isBlank())
            findViewById<TextView>(R.id.emailInput).setError("Please enter a valid email")
        if (password.isBlank())
            findViewById<TextView>(R.id.passwordInput).setError("Please enter a password")
        if (confirm.isBlank())
            findViewById<TextView>(R.id.confirmInput).setError("Please confirm the password")
    }
}