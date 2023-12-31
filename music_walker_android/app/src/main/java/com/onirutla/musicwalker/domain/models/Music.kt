package com.onirutla.musicwalker.domain.models

import androidx.core.net.toUri
import androidx.media3.common.MediaItem
import androidx.media3.common.MediaMetadata

data class Music(
    val album: String = "",
    val artist: String = "",
    val duration: Int = 0,
    val genre: String = "",
    val id: String = "",
    val image: String = "",
    val site: String = "",
    val source: String = "",
    val title: String = "",
    val totalTrackCount: Int = 0,
    val trackNumber: Int = 0,
)



val dummyMusic = listOf(
    Music(
        id = "wake_up_01",
        title = "Intro - The Way Of Waking Up (feat. Alan Watts)",
        album = "Wake Up",
        artist = "The Kyoto Connection",
        genre = "Electronic",
        source = "https://storage.googleapis.com/uamp/The_Kyoto_Connection_-_Wake_Up/01_-_Intro_-_The_Way_Of_Waking_Up_feat_Alan_Watts.mp3",
        image = "https://storage.googleapis.com/uamp/The_Kyoto_Connection_-_Wake_Up/art.jpg",
        trackNumber = 1,
        totalTrackCount = 13,
        duration = 90,
        site = "http://freemusicarchive.org/music/The_Kyoto_Connection/Wake_Up_1957/"
    ),
    Music(
        id = "wake_up_01",
        title = "Intro - The Way Of Waking Up (feat. Alan Watts)",
        album = "Wake Up",
        artist = "The Kyoto Connection",
        genre = "Electronic",
        source = "https://storage.googleapis.com/uamp/The_Kyoto_Connection_-_Wake_Up/01_-_Intro_-_The_Way_Of_Waking_Up_feat_Alan_Watts.mp3",
        image = "https://storage.googleapis.com/uamp/The_Kyoto_Connection_-_Wake_Up/art.jpg",
        trackNumber = 1,
        totalTrackCount = 13,
        duration = 90,
        site = "http://freemusicarchive.org/music/The_Kyoto_Connection/Wake_Up_1957/"
    ),
    Music(
        id = "wake_up_01",
        title = "Intro - The Way Of Waking Up (feat. Alan Watts)",
        album = "Wake Up",
        artist = "The Kyoto Connection",
        genre = "Electronic",
        source = "https://storage.googleapis.com/uamp/The_Kyoto_Connection_-_Wake_Up/01_-_Intro_-_The_Way_Of_Waking_Up_feat_Alan_Watts.mp3",
        image = "https://storage.googleapis.com/uamp/The_Kyoto_Connection_-_Wake_Up/art.jpg",
        trackNumber = 1,
        totalTrackCount = 13,
        duration = 90,
        site = "http://freemusicarchive.org/music/The_Kyoto_Connection/Wake_Up_1957/"
    ),
    Music(
        id = "wake_up_01",
        title = "Intro - The Way Of Waking Up (feat. Alan Watts)",
        album = "Wake Up",
        artist = "The Kyoto Connection",
        genre = "Electronic",
        source = "https://storage.googleapis.com/uamp/The_Kyoto_Connection_-_Wake_Up/01_-_Intro_-_The_Way_Of_Waking_Up_feat_Alan_Watts.mp3",
        image = "https://storage.googleapis.com/uamp/The_Kyoto_Connection_-_Wake_Up/art.jpg",
        trackNumber = 1,
        totalTrackCount = 13,
        duration = 90,
        site = "http://freemusicarchive.org/music/The_Kyoto_Connection/Wake_Up_1957/"
    ),
    Music(
        id = "wake_up_01",
        title = "Intro - The Way Of Waking Up (feat. Alan Watts)",
        album = "Wake Up",
        artist = "The Kyoto Connection",
        genre = "Electronic",
        source = "https://storage.googleapis.com/uamp/The_Kyoto_Connection_-_Wake_Up/01_-_Intro_-_The_Way_Of_Waking_Up_feat_Alan_Watts.mp3",
        image = "https://storage.googleapis.com/uamp/The_Kyoto_Connection_-_Wake_Up/art.jpg",
        trackNumber = 1,
        totalTrackCount = 13,
        duration = 90,
        site = "http://freemusicarchive.org/music/The_Kyoto_Connection/Wake_Up_1957/"
    ),
)
