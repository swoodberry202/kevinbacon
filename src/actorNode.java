import java.util.ArrayList;

/**
 * Name: sloanwoodberry
 * Lab Name: actorNode
 * Lab Purpose
 * Date: 12/6/18
 * Collaborators: None
 */
public class actorNode extends graphNode{
    public String name;
    ArrayList<movieNode> myMovies;

    public actorNode(String myName){
        isMovie=false;
        name=myName;
        myMovies=new ArrayList<>();
    }
    public void addMovie(movieNode q){myMovies.add(q);}
}
