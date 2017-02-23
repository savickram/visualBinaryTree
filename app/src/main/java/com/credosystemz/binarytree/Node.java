package com.credosystemz.binarytree;

public class Node {


    public float radius = 25.0f;
    public int value;

    public String type;

    public Node childLeft;
    public Node childRight;

    public float pos_x, pos_y;

    public static String NODE_TYPE_LEFT_CHILD = "left";
    public static String NODE_TYPE_RIGHT_CHILD = "right";
    public static String NODE_TYPE_HEAD = "head";

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, float posx, float posy, float radius) {
        this.value = value;
        this.pos_x = posx;
        this.pos_y = posy;
        this.radius = radius;
    }

    public static int NODE_LEFT_lX_OFFSET(float radius) {

        int offset = ((int) radius) * 2 * -1;
        return offset;
    }

    public static int NODE_LEFT_rX_OFFSET(float radius) {
        int offset = (((int) radius / 2));
        return offset;
    }

    public static int NODE_RIGHT_lX_OFFSET(float radius) {

        int offset = ((((int) radius) / 2)) * -1;
        return offset;
    }

    public static int NODE_RIGHT_rX_OFFSET(float radius) {
        int offset = ((((int) radius) * 2));
        return offset;
    }


    public static int NODE_Y_OFFSET(float radius) {
        int offset = ((int) radius * 2);
        return offset;
    }
}
