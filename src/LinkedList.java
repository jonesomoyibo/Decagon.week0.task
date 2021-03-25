package com.decagon;



public class LinkedList {

    private Node currentNode, previousNode, head;
    private int listSize = 0;


    public void insertAt(int indexPosition, Node node) {


        // make the node the  new head of the list
        if (indexPosition == 0) {
            node.next = head;
            head = node;
            listSize += 1;
            return;
        }

        if(indexPosition>0 && listSize==0){

            System.out.println("An element with index position greater than the size of the list not allowed");
            return;
        }


        // Exits if list size is empty and specified index position is greater than the list size
        if (indexPosition-listSize>1){

            System.out.println("An element with index position greater than the size of the list not allowed");
            return;
        }




        //  start transversing from the head of the list by setting currentNode to head of the list
        currentNode = head;

        // a counter to specify the current position in the list. start from the first element  at position 0 in the list
        int currentIndexPosition = 0;

        // While there are still elements to transverse in the list; repeat .
        while (currentNode != null) {

           // position to insert element has been found.Break from the loop
            if (indexPosition == currentIndexPosition) {

                break;

            }

            // position hasnt been found, make the current element the previous
            // element and the current element point to the next element in the list.
            //And finally,increment the current position by 1.
            else {
                previousNode = currentNode;
                currentNode = currentNode.next;
                currentIndexPosition += 1;

            }


        }

        // do this if  there are no more elements to transverse or position to insert new node has been found,
        //make the new node to point to the current node or the last node if specified  index position is one greater than the list size
        node.next = currentNode;

        //set the previous node to point to the new node inserted.
        previousNode.next = node;

        // increments the size of the list after insertion
        listSize += 1;
        ;

    }



// returns the size of the list
    public int listSize() {

        return listSize;
    }


    // Deletes an element from the list specified by the index position value
    public void deleteAt(int indexPosition) {
        // current position pointer
        int currentIndexPosition = 0;
        //returns  if index position is greater than the list size.
        if (indexPosition > listSize()) {

            System.out.println("Invalid index position.Index position cant be greater than list size");
            return;
        }
        //cant delete fromempty list
        if (listSize() == 0) {
            System.out.println("Cant delete from an empty list");
            return;
        }




        currentNode = head;
        while (currentNode.next != null) {


            if (indexPosition == currentIndexPosition) {


                break;

            } else {

                currentIndexPosition++;
            }
        }

        previousNode = currentNode;
        previousNode.next = currentNode.next;
        listSize -= 1;

    }





     // Returns an Element in a specified position.Returns null if the element cant be found
    public Node getElementAt(int indexPosition) {
        // index position pointer
        int currentIndexPosition = 0;

        //returns null if index position is greater than the list size.
        if (indexPosition > listSize()) {

            System.out.println("Invalid index position");
            return null;
        }

        // returns null..Empty list
        if (listSize() == 0) {
            System.out.println("Cant get element from empty list");
            return null;
        }

        // set current node to head to begin transversing
        currentNode = head;

        // While there are still elements to transverse in the list; repeat .
        while (currentNode.next != null) {

           // index position has been found...break out of loop
            if (indexPosition == currentIndexPosition) {


                break;
            }

              // position not found yet, point to the next node in the list
            else {
                currentNode = currentNode.next;
            }


        }

        // returns the element at the specified index position
        return currentNode;
    }




}



