
public class Cat
{
    private Double originWeight;
    private Double weight;

    private final Double MINWEIGHT = 1000.0;
    private final Double MAXWEIGHT = 9000.0;

    public final int LEGS = 4;
    public final int EYES = 2;

    private boolean wasAlive;
    private Double totalAmount = 0.0;

    private String color;

    static int count = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        // minWeight = 1000.0;
        // maxWeight = 9000.0;
        totalAmount = 0.0;
        count++;
        wasAlive = true;
    }

    public void setColor(String color)
    {
       this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public Cat(double weight)

    {
        this.weight=weight;
        originWeight = this.weight;
        double minWeight = 100.0;
        double maxWeight = 500.0;
    }

    public static Cat getKitten()
    {
        Cat kitten = new Cat(250);
        return new Cat();
    }

    public void shit()
    {
        if (wasAlive) {
            weight = weight - (100 + 1000 * Math.random());
            System.out.println("You feel a strange smell");
            if (weight < MINWEIGHT) count --;
        }
    }

    public void meow()
    {
        if (wasAlive) {
            weight = weight - 1;
            System.out.println("Meow");
            if (weight < MAXWEIGHT) count --;
        }
    }

    public Double feed(Double amount)
    {
        if(wasAlive) {
            weight = weight + amount;
            //System.out.println(amount);
            totalAmount = totalAmount + amount;
            if (weight > MAXWEIGHT) count --;
        }
        return weight;
    }

    public void drink(Double amount)

    {
        if(wasAlive)
        {
            weight = weight + amount;
            if (weight >MAXWEIGHT) count --;
        }
    }

//    public boolean getWasAlive() {return wasAlive;}

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

    public Cat makeTwin()
    {
        Cat catTwin = new Cat();
        this.weight = weight;
        this.totalAmount = totalAmount;
        this.originWeight = originWeight;

        return catTwin;
    }
}