
public class Cat
{
    private Double originWeight;
    private Double weight;

    private final Double MINWEIGHT = 1000.0;
    private final Double MAXWEIGHT = 9000.0;

    public final int LEGS = 4;
    public final int EYES = 2;
    private Color myColor ;

    private boolean wasAlive;
    private Double totalAmount = 0.0;

    static int count = 0;

    public Cat(double weight, Color myColor)
    {
        this.weight = weight;
        originWeight = weight;
        this.myColor = myColor;
        totalAmount = 0.0;
        if (weight >= MINWEIGHT & weight <= MAXWEIGHT) {
            wasAlive = true;
            count++;
        }
    }

    public Cat()
    {
        this(1500.0 + 3000.0*Math.random(), Color.WHITE);
//        weight = 1500.0 + 3000.0 * Math.random();
//        originWeight = weight;
//        totalAmount = 0.0;
//        count++;
//        wasAlive = true;
//        myColor = Color.WHITE;
    }

    public Cat makeTwin()
    {
        Cat catTwin = new Cat();
        catTwin.weight = this.weight;
        catTwin.myColor = this.myColor;
//      catTwin.totalAmount = this.totalAmount; - я проверяла эту строчку, клонируется кот с уже съеденой едой, а дальше их вес меняется сам по себе.
        catTwin.originWeight = this.originWeight;

        if (this.wasAlive = true) {
            count++;
        }
        return catTwin;
    }

    public void setColor(Color myColor)
    {
       this.myColor = myColor;
    }

    public Color getColor()
    {
        return myColor;
    }

    public static Cat getKitten()
    {
        Cat kitten = new Cat(250,Color.BLACK);
        return kitten;
    }

    public void shit()
    {
        if (wasAlive) {
            weight = weight - (100 + 1000 * Math.random());
            System.out.println("You feel a strange smell");
            if (weight < MINWEIGHT) {
                count--;
                wasAlive = false;
            }
        }
    }

    public void meow()
    {
        if (wasAlive) {
            weight = weight - 1;
            System.out.println("Meow");
            if (weight < MINWEIGHT) {
                count--;
                wasAlive = false;
            }
        }
    }

    public Double feed(Double amount)
    {
        if(wasAlive) {
            weight = weight + amount;
            totalAmount = totalAmount + amount;
            if (weight > MAXWEIGHT) {
                count--;
                wasAlive = false;
            }
        }
        return weight;
    }

    public void drink(Double amount)

    {
        if(wasAlive)
        {
            weight = weight + amount;
            if (weight > MAXWEIGHT) {
                count--;
                wasAlive = false;
            }
        }
    }

    public boolean getWasAlive()
    {
        return wasAlive;
    }

    public Double getWeight()
    {
        return weight;
    }

    static int getCount()
    {
        return count;
    }

    public Double getTotalAmount()
    {
        return totalAmount;
    }

    public String getStatus()
    {
        if(weight < MINWEIGHT) {
            return "Dead";
        }
        else if(weight > MAXWEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}