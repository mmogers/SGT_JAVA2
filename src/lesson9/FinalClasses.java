package lesson9;

public final class FinalClasses {

    private int someInt;
    public int multiplyBySomeInt(int anotherInt){
        return someInt * anotherInt;
    }
}


/* FINAL CLASSES CANNOT BE EXTENDED
class ExtendedFinalClasses extends FinalClasses{

}*/
