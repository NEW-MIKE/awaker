package com.ruzhan.day.model

data class AlbumModel(
        var guid: Int = 0,
        var type: Int = 0,
        var cat: String? = null,
        var title: String? = null,
        var cover_thumb: String? = null,
        var cover_landscape: String? = null,
        var cover_landscape_hd: String? = null,
        var pubdate: String? = null,
        var archive_timestamp: Int = 0,
        var pubdate_timestamp: Int = 0,
        var lastupdate_timestamp: Int = 0,
        var author: String? = null,
        var source: String? = null,
        var ui_sets: UiSetsModel? = null,
        var link_share: String? = null,
        var link_wechat: String? = null,
        var title_wechat_tml: String? = null,
        var has_caption: Int = 0,
        var has_news: Int = 0,
        var has_hotspots: Int = 0,
        var latitude: Double = 0.toDouble(),
        var longitude: Double = 0.toDouble(),
        var geo_span: Double = 0.toDouble(),
        var location: String? = null,
        var summary: String? = null,
        var content: String? = null,
        var ei_sets: EiSetsModel? = null,
        var news_count: Int = 0,
        var coordinate_sets: List<Any>? = null,
        var entry_imgs: List<Any>? = null,
        var tags: List<TagsModel>? = null
)
