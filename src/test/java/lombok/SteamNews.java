package lombok;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SteamNews {
    private AppNews appnews;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AppNews {
        private int appid;
        private ArrayList<NewsItem> newsitems;
        private int count;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class NewsItem {
        private String gid;
        private String title;
        private String url;
        private boolean is_external_url;
        private String author;
        private String contents;
        private String feedLabel;
        private int date;
        private String feedName;
        private int feed_type;
        private int appid;
    }
}