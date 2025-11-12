public class Graphics {
    private int width;
    private int height;
    private float aspect;
    private float pixelAspect;
    private float multiplier;
    private char[] buffer;


    public Graphics(int width, int height, float multiplier){
        this.width=width;
        this.height=height;
        this.multiplier=multiplier;
        aspect=(float)width/height;
        pixelAspect=8.0f/16.0f;
        buffer = new char[width*height];
    }

    public int getHeight() {return height;}
    public int getWidth() {return width;}
    public float getAspect() {return aspect;}
    public float getPixelAspect() {return pixelAspect;}
    public float getMultiplier() {return multiplier;}
    public char[] getBuffer() {return buffer;}

    private void setBuffer(char[] buffer){this.buffer=buffer;}

    private void Reset(){
        for(int i = 0; i<width; i++){
            for(int j = 0; j<height; j++){
                buffer[i+j*width] = ' ';
            }
        }
    }

    public void Begin(){
        Reset();
    }

    public void Draw(Shape shape){
        char[] shapeBuff = shape.Draw(this);
        for(int i = 0; i<width; i++){
            for(int j = 0; j<height; j++){
                if (shapeBuff[i+j*width]!= 0){

                    buffer[i+j*width] = shapeBuff[i+j*width];
                }
            }
        }
    }
    public void Finish(){
        System.out.println(buffer);
    }
}
