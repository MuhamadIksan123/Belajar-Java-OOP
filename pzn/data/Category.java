package pzn.data;

public class Category {
    private String id;
    private boolean expensive;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        if(id != null) {
            this.id = id;
        }
    }

    public Boolean getExpensive() {
        return this.expensive;
    }

    public void setExpensive(Boolean expensive) {
        this.expensive = expensive;
    }
}
