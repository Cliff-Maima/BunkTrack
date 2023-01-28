package com.prateekthakur272.bunkmate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prateekthakur272.bunkmate.databinding.ActivityContactMeBinding

class ContactMeActivity : AppCompatActivity() {
    private lateinit var binding :ActivityContactMeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactMeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = getString(R.string.contact_me)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.webView.loadUrl("https://www.linkedin.com/in/cliff-maima-a8a580246?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3B%2BQCGkhS8TQ2TFGA6ZhO0ow%3D%3D")
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (binding.webView.canGoBack())
            binding.webView.goBack()
        else
            finish()
    }
}