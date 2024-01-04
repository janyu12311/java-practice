package clone;

import java.util.Arrays;
import java.util.StringJoiner;
public class User implements Cloneable{
    private int id;
    private String name;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String name, String password, String path, int[] data) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return id+","+name+","+password+","+path+","+arrtoString(data);
    }
    public String arrtoString(int[] arr){
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+"");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] Data=this.data;

        int[] newData=new int[data.length];

        for (int i = 0; i < data.length; i++) {
            newData[i]=Data[i];
        }
        User u=(User)super.clone();
        u.data=newData;
        return u;
    }
}
