package com.bondi.haraka_mall.repository


import com.bondi.haraka_mall.data.UserDao
import com.bondi.haraka_mall.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}