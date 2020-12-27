import cn.parking.DAO.Card;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        Card card = new Card();
        List<Object> entity = card.getEntity();
        for (Object o : entity) {
            Object[] arr = (Object[]) o;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
        }
    }
}
