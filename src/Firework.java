import java.awt.Color;
public class Firework {
    public int x;
    public int y;
    public Color color;

    public Firework() {}

    public Firework(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    public Firework(int _x, int _y, Color _color) {
        this(_x, _y);
        this.color = _color;
    }

    public void move(double xVelocity, double yVelocity) {
        this.x += xVelocity;
        this.y += yVelocity;
    }
}
