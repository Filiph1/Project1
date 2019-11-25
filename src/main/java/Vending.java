public interface Vending
{

    default String start(){
        return "Starting process";
    }

   default String stop(){
       return "Stopping process";
   }

    String toString();
}
