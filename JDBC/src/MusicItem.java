public class MusicItem {
    private int id;
    private String name;
    private String author;

    public MusicItem(int id, String title, String author) {
        this.id = id;
        this.name = title;
        this.author = author;
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

    @Override
    public String toString() {
        return "MusicItem {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
