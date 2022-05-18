package uz.ithelp.geometriya;

public class ModelViewPager {

     private int image;
     private String Bouncher;
     private String Description;
     private String url;


    public ModelViewPager(int image, String bouncher, String description, String url) {
        this.image = image;
        Bouncher = bouncher;
        Description = description;
        this.url = url;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBouncher() {
        return Bouncher;
    }

    public void setBouncher(String bouncher) {
        Bouncher = bouncher;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
