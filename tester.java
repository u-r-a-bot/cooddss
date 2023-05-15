import java.util.Scanner;

class Production{
    String title, director, writer;
    Production(String title, String director, String writer) {
        this.title = title;
        this.director = director;
        this.writer = writer;
    }
    Production(){}
    String getTitle() {
        return title;
    }

    String getDirector() {
        return director;
    }

    String getWriter() {
        return writer;
    }
    void setter(String title, String director, String writer){
        this.title = title;
        this.director = director;
        this.writer = writer;
    }
    public string toString(){
        return "Title: "+ title+" Director "+ director+" Writer: "+ writer;
    }

    

}
class Play extends Production{
    int performances=0,playCost=500,seats;
    public int getPerformances() {
        return performances;
    }
    public int gettotalPlayCost() {
        return playCost*seats;
    }
    Play(String title, String director, String writer,int seats){
        super(title, director, writer);
        performances++;
    }
    Play(){}
    void setterPlay(){
        setter(title, director, writer);
    }

}
class Musical extends Play{
    String composer,lyricist;
    int musicalCost =800;
    public Musical(String title, String director, String writer, String composer, String lyricist) {
        setterPlay(title, director, writer);
        this.composer = composer;
        this.lyricist = lyricist;
        super.performances++;
    }

}
class tester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
