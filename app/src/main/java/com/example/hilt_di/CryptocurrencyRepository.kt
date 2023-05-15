package com.example.hilt_di

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}