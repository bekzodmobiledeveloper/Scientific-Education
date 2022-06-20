package com.example.scientificeducation.database

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.scientificeducation.utils.Constant
import com.example.scientificeducation.utils.Info

class MyDbHelper(context: Context) :
    SQLiteOpenHelper(context, Constant.DB_NAME, null, Constant.DB_VERSION), DatabaseService {
    override fun onCreate(db: SQLiteDatabase?) {
        val query =
            "create table contact (${Constant.ID} integer not null primary key autoincrement unique,${Constant.NAME} text not null,${Constant.NUMBER} text not null,${Constant.READ} text not null,${Constant.IMAGE} text not null,${Constant.PDF_NAME} text not null,${Constant.POSITION} text not null)"

        db?.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL("drop table if exists ${Constant.TABLE_NAME}")
    }

    override fun addMovie(info: Info) {
        val database = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(Constant.NAME, info.name)
        contentValues.put(Constant.NUMBER, info.number)
        contentValues.put(Constant.READ, info.read)
        contentValues.put(Constant.IMAGE, info.image)
        contentValues.put(Constant.PDF_NAME, info.pdfName)
        contentValues.put(Constant.POSITION, info.position)
        database.insert(Constant.TABLE_NAME, null, contentValues)
        database.close()
    }

    override fun getAllMovies(): ArrayList<Info> {
        val movieList = ArrayList<Info>()
        val query = "select * from ${Constant.TABLE_NAME}"
        val database = this.readableDatabase
        val cursor = database.rawQuery(query, null)
        if (cursor.moveToFirst()) {
            do {
                val movie = Info(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getInt(2),
                    cursor.getString(3),
                    cursor.getInt(4),
                    cursor.getString(5),
                    cursor.getInt(6)
                )
                movieList.add(movie)
            } while (cursor.moveToNext())
        }
        return movieList
    }


    override fun deleteMovie(info: Info) {
        val database = this.writableDatabase
        database.delete(Constant.TABLE_NAME, "${Constant.ID}=?", arrayOf("${info.id}"))
        database.close()
    }

    @SuppressLint("Recycle")
    override fun getMovieById(id: Int?): Info {
        val database = this.readableDatabase

        val cursor = database.query(
            Constant.TABLE_NAME,
            arrayOf(
                Constant.ID,
                Constant.NAME,
                Constant.NUMBER,
                Constant.READ,
                Constant.IMAGE,
                Constant.PDF_NAME,
                Constant.POSITION
            ),
            "${Constant.ID}",
            arrayOf("$id"),
            null,
            null,
            null
        )
        cursor?.moveToFirst()
        return Info(
            cursor.getInt(0),
            cursor.getString(1),
            cursor.getInt(2),
            cursor.getString(3),
            cursor.getInt(4),
            cursor.getString(5),
            cursor.getInt(6)
        )

    }

}
