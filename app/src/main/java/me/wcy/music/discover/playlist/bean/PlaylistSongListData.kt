package me.wcy.music.discover.playlist.bean

import com.google.gson.annotations.SerializedName
import me.wcy.music.common.bean.SongData

/**
 * Created by wangchenyan.top on 2023/9/22.
 */
data class PlaylistSongListData(
    @SerializedName("code")
    val code: Int = 0,
    @SerializedName("songs")
    val songs: List<SongData> = emptyList()
)