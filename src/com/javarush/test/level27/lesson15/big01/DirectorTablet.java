package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.statistic.StatisticManager;

import java.util.Map;

/**
 * Created by
 * Polurival on 08.03.2016.
 */
public class DirectorTablet
{
    public void printAdvertisementProfit() {
        Map<String, Long> map = StatisticManager.getInstance().getStatisticForShownAdvertisement();
        long totalAmount = 0;

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            totalAmount += entry.getValue();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("Total - " + totalAmount);
    }

    public void printCookWorkloading() {
        Map<String, Map<String, Integer>> map = StatisticManager.getInstance().getStatisticForCooks();

        for (Map.Entry<String, Map<String, Integer>> entry1 : map.entrySet()) {
            System.out.println(entry1.getKey());
            for (Map.Entry<String, Integer> entry2 : entry1.getValue().entrySet()) {
                System.out.println(entry2.getKey() + " - " + (entry2.getValue() / 60) + " min");
            }
        }
    }

    public void printActiveVideoSet() {

    }

    public void printArchivedVideoSet() {

    }
}