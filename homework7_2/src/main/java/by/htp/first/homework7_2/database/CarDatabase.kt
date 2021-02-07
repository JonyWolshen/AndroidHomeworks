package by.htp.first.homework7_2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import by.htp.first.homework7_2.entity.Car
import by.htp.first.homework7_2.entity.Work

@Database(entities = [Car::class, Work::class], version = 1)
abstract class CarDatabase : RoomDatabase() {

    abstract fun getCarDatabaseDAO(): CarDatabaseDAO
    abstract fun getWorkDatabaseDAO(): WorkDatabaseDAO

    companion object {
        fun init(context: Context) = Room.databaseBuilder(context, CarDatabase::class.java, "database")
            .fallbackToDestructiveMigration()
            .build()
    }
}