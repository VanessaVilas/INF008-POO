// Formas de relacionamento entre classes:

// Composição - um objeto contém outro(s)
// Agregação - um objeto contém outro(s)
// Herança - um objeto é um (tipo particular) objeto

// Object -> P2D -> P3D -> P4D -> P5D

class P2D {
    private float x;
    private float y;

    public P2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }
    public void display() {
        System.out.print(x + ", " + y);
    }
}

class P3D extends P2D {
    private float z;

    public P3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public void move(float dx, float dy, float dz) {
        move(dx, dy);
        z += dz;
    }
    @Override
    public void display() {
        super.display();
        System.out.print(", " + z);
    }
}

class P4D extends P3D {
    protected float w;

    public P4D(float x, float y, float z, float w) {
        super(x, y, z);
        this.w = w;
    }
}

class Heranca {
    public static void main(String []args) {
        P2D p2d = new P2D(1.0f, 2.0f);
        p2d.move(-1.0f, 2.0f);
        p2d.display();
        System.out.println("");

        P3D p3d = new P3D(1.0f, 2.0f, 3.0f);
        p3d.move(-1.0f, 2.0f, -1.0f);
        p3d.display();
        System.out.println("");
    }
}
