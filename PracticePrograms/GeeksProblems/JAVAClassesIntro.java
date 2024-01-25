package PracticePrograms.GeeksProblems;

public class JAVAClassesIntro {
    public static void main(String[] args) {
        JAVAClassesIntro classesIntro = new JAVAClassesIntro();
        classesIntro.set_length(10);
        classesIntro.set_width(20);
        classesIntro.set_height(30);
        classesIntro.volume();
    }
    
    Cuboid cuboid = new Cuboid();
    public void set_length(int l)
    {
        //Add your code here.
        cuboid.setLength(l);
    }
    public void set_width(int w)
    {
        //Add your code here.
        cuboid.setWidth(w);
    }
    public void set_height(int h)
    {
        //Add your code here.
        cuboid.setHeight(h);
    }
    public void volume()
    {
        //Add your code here.
        System.out.println(cuboid.length*cuboid.width*cuboid.height);
    }
    /**
     * Cuboid
     */
    class Cuboid {
        private int length;
        private int width;
        private int height;

        public void setHeight(int height) {
            this.height = height;
        }
        public void setLength(int length) {
            this.length = length;
        }
        public void setWidth(int width) {
            this.width = width;
        }
    }
}
