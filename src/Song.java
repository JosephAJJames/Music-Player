public class Song
{
    private String name;
    private String artist;
    private int duration;

    public Song(String name, String artist, int duration)
    {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    public String getName()
    {
        return name;
    }

    public String getArtist()
    {
        return this.artist;
    }

    public int getDuration()
    {
        return duration;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }
}
