package skillklan.module4.theme3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
    public int id;
    public String name;
    public String status;
//    public ArrayList<String> photoUrls;
//    public ArrayList<Tag> tags;
}