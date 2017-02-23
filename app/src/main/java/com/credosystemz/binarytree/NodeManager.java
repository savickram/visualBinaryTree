package com.credosystemz.binarytree;

public class NodeManager {

    private Node head;

    //Radius of Node Circle
    public static float radius = 50.0f;

    // Total Number of Nodes
    public static int nodeCount = 0;

    public NodeManager(Node head) {
        this.head = head;
    }

    /**
     * This method inserts a Node under the given parent Node
     *
     * @param parent
     * @param child
     * @param leftChild
     * @return
     */
    public Node insertNode(Node parent, Node child, boolean leftChild) {

        radius = RenderView.screenSize.x / 30;

        if (parent == null || child == null) {
            return null;
        }

        if (leftChild) {

            if(parent != null){

                insertNode(parent.childLeft, child, true);

            } else {
                int offset_lx = Node.NODE_LEFT_lX_OFFSET(parent.radius) * 3;

                if (parent.type.equals(Node.NODE_TYPE_LEFT_CHILD)) {
                    offset_lx = Node.NODE_LEFT_lX_OFFSET(parent.radius) - (int) parent.radius;

                } else if (parent.type.equals(Node.NODE_TYPE_RIGHT_CHILD)) {
                    offset_lx = Node.NODE_RIGHT_lX_OFFSET(parent.radius) - (int) parent.radius / 3;
                }


                parent.childLeft = new Node( 10, parent.pos_x + offset_lx, parent.pos_y + Node.NODE_Y_OFFSET(radius), radius);
                parent.childLeft.type = Node.NODE_TYPE_LEFT_CHILD;

                return parent.childLeft;
            }

        } else {

            if (parent.childRight != null) {
                insertNode(parent.childRight, child, false);
            } else {

                int offset_rx = Node.NODE_RIGHT_rX_OFFSET(parent.radius) * 3;

                if (parent.type.equals(Node.NODE_TYPE_LEFT_CHILD)) {

                    offset_rx = Node.NODE_LEFT_rX_OFFSET(parent.radius) + (int) parent.radius / 3;
                } else if (parent.type.equals(Node.NODE_TYPE_RIGHT_CHILD)) {


                    offset_rx = Node.NODE_RIGHT_rX_OFFSET(parent.radius) + (int) parent.radius;
                }

                parent.childRight = new Node(20, parent.pos_x + offset_rx, parent.pos_y + Node.NODE_Y_OFFSET(radius), radius);
                parent.childRight.type = Node.NODE_TYPE_RIGHT_CHILD;

                return parent.childRight;
            }


        }

        return null;
    }

    /**
     * This method will delete the given node
     *
     * @param parent
     * @param hasChild
     * @return
     */
    public Node deleteNode(Node parent, boolean hasChild) {

        return null;
    }

}
