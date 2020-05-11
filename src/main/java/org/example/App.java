package org.example;

import Class.Slack;

/*
Generic!!!
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        Slack<Integer> slack = new Slack();

        slack.push(1);
        slack.push(2);
        slack.push(4);
        slack.push(3);
        slack.push(0);

        System.out.println(slack);

        Integer i = slack.getMax();
        System.out.println(i);
        i = slack.getMin();
        System.out.println(i);
    }
}
