public class Shape {
    protected Vector2 position;
    protected char[] texture;

    public Shape(Vector2 position, char[] texture){
        this.position = position;
        this.texture = texture;
    }
    public char[] Draw(Graphics graphics){
        return new char[graphics.getWidth()* graphics.getHeight()];
    }
    public void Move(Vector2 direction){
        position = Vector2.vectorSum(position, direction);
    }

    public void setPosition(Vector2 position) {this.position = position;}
    public Vector2 getPosition(){return position;}
}

