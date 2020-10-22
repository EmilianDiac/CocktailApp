package com.example.android.cocktailapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [DatabaseCocktail::class], version = 1, exportSchema = false)
public abstract class CocktailRoomDatabase : RoomDatabase() {

    abstract fun getCocktailDao(): CocktailDAO

//    private class CocktailDatabaseCallback(private val scope: CoroutineScope) :
//        RoomDatabase.Callback() {
//        override fun onOpen(db: SupportSQLiteDatabase) {
//            super.onCreate(db)
//            INSTANCE?.let { database ->
//                scope.launch {
//                    var favoritesDAO = database.favoritesDao()
//
//                    val favoriteCocktail = DatabaseCocktail(
//                        "Mojito",
//                        "https://www.thecocktaildb.com/images/media/drink/3z6xdi1589574603.jpg",
//                        11000
//                    )
//                    favoritesDAO.insert(favoriteCocktail)
//                }
//
//            }
//        }
//    }

    companion object {
        @Volatile
        private var INSTANCE: CocktailRoomDatabase? = null
        fun getDatabase(context: Context): CocktailRoomDatabase {

            return INSTANCE ?: synchronized(this) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    CocktailRoomDatabase::class.java,
                    "favorite_cocktails_table"
                ).build()
//                    .addCallback(CocktailDatabaseCallback(scope))

                INSTANCE as CocktailRoomDatabase
            }
        }
    }

}