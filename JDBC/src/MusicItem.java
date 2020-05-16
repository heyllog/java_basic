public class MusicItem {
    private int id;
    private String name;
    private String author;
    private String releaseDate;
    private float listPrice;
    private float price;
    private int version;

    public MusicItem(int id, String name, String author, String releaseDate, float listPrice, float price, int version) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
        this.listPrice = listPrice;
        this.price = price;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public float getListPrice() {
        return listPrice;
    }

    public float getPrice() {
        return price;
    }

    public int getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "MusicItem {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
