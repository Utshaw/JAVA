import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Ref: https://youtu.be/rWlHQnvrZcw
/*

annotation without any values -> Marker Annotation
annotation with values -> Multi value annotation

*/


// Creating a annotation
@Inherited // the derived classes will get inherit the annotation
@Documented // create documentation of the annotation
@Target(ElementType.TYPE) // TYPE -> class level
@Retention(RetentionPolicy.RUNTIME) // meta annotation
@interface SmartPhone 
{   
    String os() default "Symbian"; 
    int version() default 1;

}

@SmartPhone(os="Android", version = 6)
class Nokia {
    String model;
    int size;



    public Nokia(String model, int size) {
        this.model = model;
        this.size = size;
    }


}

class Main{
    public static void main(String[] args) {
        
        Nokia nokiaSix = new Nokia("6.1", 6);
        
        Class c = nokiaSix.getClass();
        Annotation annotation = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)annotation;
        System.out.println(s.os());

    }
}
