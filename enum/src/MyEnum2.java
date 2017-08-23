import javax.swing.*;

public class MyEnum2 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("How big is your pizza?\n1: SMALL\n2: MEDIUM\n3: LARGE\n4: EXTRA_LARGE");
        Size size = null;
        try
        {
            size = Size.valueOf(input);
        }
        catch (IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null,"Wrong Input!!!");
            return;
        }
        Pizza pizza = new Pizza();
        pizza.setSize(size);
        String message;
        switch (size)
        {
            case SMALL:
            case MEDIUM:
                message = "I hope it is only for 1 person";
                break;
            case LARGE:
            case EXTRA_LARGE:
                message = "I hope u brought your cavalry";
                break;
            default:
                    message = "Oops did I miss something";
        }
        JOptionPane.showMessageDialog(null,"Size: " + pizza.getSize() + ". " + message);



    }

}

class Pizza
{
    private Size size;

    public Size getSize()
    {
        return size;
    }

    public void setSize(Size size)
    {
        this.size = size;
    }
}
