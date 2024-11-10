package com.example.cadastroapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Inicializa o DatabaseHelper
        databaseHelper = DatabaseHelper(this)

        // Referências aos campos de entrada
        val etName = findViewById<EditText>(R.id.etName)
        val etDate = findViewById<EditText>(R.id.etDate)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val btnSave = findViewById<Button>(R.id.btnSave)

        // Ação do botão Salvar
        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val date = etDate.text.toString()
            val phone = etPhone.text.toString()

            if (name.isNotEmpty() && date.isNotEmpty() && phone.isNotEmpty()) {
                // Insere os dados no banco de dados
                val result = databaseHelper.insertUser(name, date, phone)

                if (result != -1L) {
                    Toast.makeText(this, "Usuário salvo com sucesso!", Toast.LENGTH_SHORT).show()
                    // Limpa os campos após o salvamento
                    etName.text.clear()
                    etDate.text.clear()
                    etPhone.text.clear()
                } else {
                    Toast.makeText(this, "Erro ao salvar usuário", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
