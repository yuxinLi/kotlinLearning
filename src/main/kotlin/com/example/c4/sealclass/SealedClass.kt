package com.example.c4.sealclass

sealed class PlayCMD {
    class Play(val url: String , val position: Long = 0): PlayCMD()

    class Seek(val position: Long): PlayCMD()

    object Pause: PlayCMD()

}

enum class PlayState{
    IDLE , PAUSE
}