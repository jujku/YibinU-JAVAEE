package enity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
    private String uname;
    private List<String> hobbyList;
    private Map<String,String> residenceMap;
    private Set<String> aliasSet;
    public User(String uname,List<String> hobbyList,Map<String,String> residenceMap,Set<String> aliasSet){
        super();
        this.uname = uname;
        this.hobbyList = hobbyList;
        this.residenceMap = residenceMap;
        this.aliasSet = aliasSet;
    }
    public User() {super();}
    public void setUname(String uname) {this.uname = uanme;}
    public void setHobbyList(List<String> hobbyList) {this.hobbyList = hobbyList;}
    public void setResidenceMap(Map<String,String> residenceMap) { this.residenceMap = residenceMap;}
    public void setAliasSet(Set<String> aliasSet) {this.aliasSet = aliasSet;}
}
