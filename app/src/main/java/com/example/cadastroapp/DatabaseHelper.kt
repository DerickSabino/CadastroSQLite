package com.example.cadastroapp

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        val createTable = "CREATE TABLE $TABLE_USERS (" +
                "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "$COLUMN_NAME TEXT, " +
                "$COLUMN_DATE TEXT, " +
                "$COLUMN_PHONE TEXT)"
        db.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_USERS")
        onCreate(db)
    }

    // Função para inserir dados
    fun insertUser(name: String, date: String, phone: String): Long {
        val db = writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_NAME, name)
            put(COLUMN_DATE, date)
            put(COLUMN_PHONE, phone)
        }
        return db.insert(TABLE_USERS, null, values)
    }

    // Função para recuperar todos os dados
    fun getAllUsers(): List<User> {
        val users = mutableListOf<User>()
        val db = readableDatabase
        val cursor: Cursor = db.query(TABLE_USERS, null, null, null, null, null, null)

        with(cursor) {
            while (moveToNext()) {
                val id = getLong(getColumnIndexOrThrow(COLUMN_ID))
                val name = getString(getColumnIndexOrThrow(COLUMN_NAME))
                val date = getString(getColumnIndexOrThrow(COLUMN_DATE))
                val phone = getString(getColumnIndexOrThrow(COLUMN_PHONE))
                users.add(User(id, name, date, phone))
            }
        }
        cursor.close()
        return users
    }

    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "CadastroApp.db"
        const val TABLE_USERS = "users"
        const val COLUMN_ID = "id"
        const val COLUMN_NAME = "name"
        const val COLUMN_DATE = "date"
        const val COLUMN_PHONE = "phone"
    }
}

// Classe de dados para armazenar os dados do usuário
data class User(val id: Long, val name: String, val date: String, val phone: String)
