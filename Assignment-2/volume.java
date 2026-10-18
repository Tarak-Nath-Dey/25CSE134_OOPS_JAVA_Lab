import java.lang.*;

class volume {
    public static void main(String[] args){
        int side=5, length=10, breadth=4, height=7;
        int cubeVol = side * side * side;
        int cuboidVol = length * breadth * height;
        System.out.println("Volume of cube is: " + cubeVol);
        System.out.println("Volume of cuboid is: " + cuboidVol);
    }
}
