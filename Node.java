package com.company;


public class Node {
        Bilgi kişi;
        Node previous, next;

        public Node(){
            kişi = null;
            next = null;
            previous = null;
        }

        public Node(Bilgi kişi, Node previous, Node next){
            this.kişi = kişi;
            this.previous = previous;
            this.next = next;
        }
    } // end of inner class

