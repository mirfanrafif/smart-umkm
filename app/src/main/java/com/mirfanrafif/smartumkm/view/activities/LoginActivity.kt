package com.mirfanrafif.smartumkm.view.activities

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.databinding.ActivityLoginBinding
import com.mirfanrafif.smartumkm.view.fragments.DaftarFragment
import com.mirfanrafif.smartumkm.view.fragments.LoginFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var loginFragment: LoginFragment
    private lateinit var daftarFragment: DaftarFragment
    private var bulet: Drawable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        loginFragment = LoginFragment.newInstance()
        daftarFragment = DaftarFragment.newInstance()
        bulet = ResourcesCompat.getDrawable(resources, R.drawable.bulet, null)

        supportFragmentManager.beginTransaction()
            .add(binding.loginFrame.id, loginFragment, null )
            .commit()

        binding.tvDaftar.setOnClickListener {
            pindahHalaman("daftar")
        }

        binding.tvLogin.setOnClickListener {
            pindahHalaman("login")
        }
    }

    private fun pindahHalaman(selected: String) {
        when(selected) {
            "daftar" -> {
                binding.tvLoginTitle.text = resources.getString(R.string.create_account)
                binding.tvLoginDesc.text = ""
                supportFragmentManager.beginTransaction()
                    .replace(binding.loginFrame.id, daftarFragment, null )
                    .commit()
                binding.tvDaftar.setCompoundDrawablesWithIntrinsicBounds(null, null, null, bulet)
                binding.tvLogin.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
            }
            "login" -> {
                binding.tvLoginTitle.text = resources.getString(R.string.login_title)
                binding.tvLoginDesc.text = resources.getString(R.string.login_desc)
                supportFragmentManager.beginTransaction()
                    .replace(binding.loginFrame.id, loginFragment, null )
                    .commit()
                binding.tvDaftar.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
                binding.tvLogin.setCompoundDrawablesWithIntrinsicBounds(null, null, null, bulet)
            }
        }
    }
}