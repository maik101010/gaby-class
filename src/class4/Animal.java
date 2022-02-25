package class4;

public class Animal {
    private Integer id;
    private String name;
    private int size;

    public Animal(Integer id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}

