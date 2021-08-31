package com.carlosjimz87.applibrary

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ManagerTest {
    @Test
    fun getString_isOK() {
        val result = Manager.getString()
        assertEquals(result,"String")
    }

    @Test
    fun getInt_isOK() {
        val result = Manager.getInt()
        assertEquals(result,1)
    }

    @Test
    fun getFloat_isOK() {
        val result = Manager.getFloat()
        assertEquals(result,1f)
    }

    @Test
    fun getBoolean_isOK() {
        val result = Manager.getBoolean()
        assertEquals(result,true)
    }
}