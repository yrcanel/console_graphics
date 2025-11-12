public class Vector2 {
    private float x;
    private float y;

    public Vector2(){
        y=0;
        x=0;
    }
    public Vector2(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){return x;}
    private void setX(int x){this.x=x;}
    public float getY(){return y;}
    private void setY(int y){this.y=y;}

    public static Vector2 vectorSum(Vector2 a, Vector2 b){
        return new Vector2(a.x+b.x, a.y+b.y);
    }
    public static Vector2 vectorSub(Vector2 a, Vector2 b){
        return new Vector2(a.x-b.x, a.y-b.y);
    }
}
