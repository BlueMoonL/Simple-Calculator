package com.bluemoonl.ch4calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bluemoonl.ch4calculator.dao.HistoryDao
import com.bluemoonl.ch4calculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}