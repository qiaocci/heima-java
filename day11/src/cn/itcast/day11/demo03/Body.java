package cn.itcast.day11.demo03;

public class Body {

    public class Heart {
        public void Beat() {
            System.out.println("心脏跳动");
            System.out.println("我叫" + name);
        }
    }

    private String name;

    public void methodBody() {
        System.out.println("外部类方法");
        new Heart().Beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
