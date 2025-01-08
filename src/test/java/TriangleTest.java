import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void testDefineTriangleWithEqualSides(){
        String actualResult = Triangle.defineTriangle(2, 2, 2);
        boolean typeExists = actualResult.indexOf("равносторонний") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineTriangleWithTwoEqualSides1(){
        String actualResult = Triangle.defineTriangle(2, 4, 4);
        boolean typeExists = actualResult.indexOf("равнобедренный") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineTriangleWithTwoEqualSides2(){
        String actualResult = Triangle.defineTriangle(4, 2, 4);
        boolean typeExists = actualResult.indexOf("равнобедренный") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineTriangleWithTwoEqualSides3(){
        String actualResult = Triangle.defineTriangle(4, 4, 2);
        boolean typeExists = actualResult.indexOf("равнобедренный") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineRightTriangle1(){
        String actualResult = Triangle.defineTriangle(3, 4, 5);
        boolean typeExists = actualResult.indexOf("прямогульный") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineRightTriangle2(){
        String actualResult = Triangle.defineTriangle(3, 5, 4);
        boolean typeExists = actualResult.indexOf("прямогульный") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineRightTriangle3(){
        String actualResult = Triangle.defineTriangle(5, 4, 3);
        boolean typeExists = actualResult.indexOf("прямогульный") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineAnyTriangle1(){
        String actualResult = Triangle.defineTriangle(10, 11, 12);
        boolean typeExists = actualResult.indexOf("обычный") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineAnyTriangle2(){
        String actualResult = Triangle.defineTriangle(11, 10, 12);
        boolean typeExists = actualResult.indexOf("обычный") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineAnyTriangle3(){
        String actualResult = Triangle.defineTriangle(12, 11, 10);
        boolean typeExists = actualResult.indexOf("обычный") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineNotExistingTriangle1(){
        String actualResult = Triangle.defineTriangle(2, 3, 6);
        boolean typeExists = actualResult.indexOf("не является") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineNotExistingTriangle2(){
        String actualResult = Triangle.defineTriangle(3, 6, 2);
        boolean typeExists = actualResult.indexOf("не является") > 0;
        Assertions.assertTrue(typeExists);
    }

    @Test
    public void testDefineNotExistingTriangle3(){
        String actualResult = Triangle.defineTriangle(6, 3, 2);
        boolean typeExists = actualResult.indexOf("не является") > 0;
        Assertions.assertTrue(typeExists);
    }
}
