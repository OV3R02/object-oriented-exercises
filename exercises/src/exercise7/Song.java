package exercise7;

public class Song {
    private String songTitle;
    private String singerName;
    private String musicType;
    
    public Song(String songTitle, String singerName, String musicType) {
        this.songTitle = songTitle;
        this.singerName = singerName;
        this.musicType = musicType;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((songTitle == null) ? 0 : songTitle.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Song other = (Song) obj;
        if (songTitle == null) {
            if (other.songTitle != null)
                return false;
        } else if (!songTitle.equals(other.songTitle))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Song [Song Title = " + songTitle+"\n"+ ", Singer = " + singerName +"\n"+ ", Music Genre= " + musicType + "]";
    }

    
}
