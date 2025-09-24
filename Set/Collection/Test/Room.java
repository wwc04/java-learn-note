package JiHe.Collection.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    private List<Card> allCards = new ArrayList<>();

    public Room() {
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠", "♥", "♣", "♦"};
        int size = 0;
        for (String num : nums) {
            size++;
            for (String color : colors) {
                Card c = new Card(num, color, size);
                allCards.add(c);
            }
        }
        Card c1 = new Card("小王", "joker", ++size);
        Card c2 = new Card("大王", "Joker", size++);
        Collections.addAll(allCards, c1, c2);
        System.out.print("新牌" + allCards);
        System.out.println();
    }

    public void start() {
        Collections.shuffle(allCards);
        System.out.print("洗牌" + allCards);
        System.out.println();

        List<Card> q = new ArrayList<>();
        List<Card> w = new ArrayList<>();
        List<Card> e = new ArrayList<>();

        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i); //创建集合对象接收数据
            if (i % 3 == 0) {
                q.add(c);
            } else if (i % 3 == 1) {
                w.add(c);
            } else if (i % 3 == 2) {
                e.add(c);
            }
        }

        //调用方法
        sortCards(q);
        sortCards(w);
        sortCards(e);

        System.out.println("q:" + q);
        System.out.println("w:" + w);
        System.out.println("e:" + e);
        List<Card> lastCards = allCards.subList(allCards.size() - 3, allCards.size()); //创建三张底牌
        System.out.println("底牌:" + lastCards);
        e.addAll(lastCards); //将底牌加入到抢到地主的玩家手中
        sortCards(e); //再次调用方法
        System.out.println("e抢到地主:"+ e);
    }

    //将牌从大到小排序的方法
    public void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSize() - o2.getSize();
            }
        });
    }
}
