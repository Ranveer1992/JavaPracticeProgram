package com.basic.linklist;



//Java program for flattening a Linked List 
class FlatterSLL 
{ 
 FlatterNode head;  // head of list 

 /* Linked list Node*/
 class FlatterNode 
 { 
     int data; 
     FlatterNode right, downNext; 
     FlatterNode(int data) 
     { 
         this.data = data; 
         right = null; 
         downNext = null; 
     } 
 } 
//An utility function to merge two sorted linked lists 
FlatterNode merge(FlatterNode a, FlatterNode b) 
{ 
   // if first linked list is empty then second 
   // is the answer 
   if (a == null)     return b; 

   // if second linked list is empty then first 
   // is the result 
   if (b == null)      return a; 

   // compare the data members of the two linked lists 
   // and put the larger one in the result 
   FlatterNode result; 

   if (a.data < b.data) 
   { 
       result = a; 
       result.downNext =  merge(a.downNext, b); 
   } 
   else
   { 
       result = b; 
       result.downNext = merge(a, b.downNext); 
   } 
   result.right = null;  
   return result; 
} 

FlatterNode flatten(FlatterNode root) 
{ 
   // Base Cases 
   if (root == null || root.right == null) 
       return root; 

   // recur for list on right 
   root.right = flatten(root.right); 

   // now merge 
   root = merge(root, root.right); 

   // return the root 
   // it will be in turn merged with its left 
   return root; 
} 

/* Utility function to insert a node at beginning of the 
  linked list */
FlatterNode push(FlatterNode head_ref, int data) 
{ 
   /* 1 & 2: Allocate the Node & 
             Put in the data*/
   FlatterNode new_node = new FlatterNode(data); 

   /* 3. Make next of new Node as head */
   new_node.downNext = head_ref; 

   /* 4. Move the head to point to new Node */
   head_ref = new_node; 

   /*5. return to link it back */
   return head_ref; 
} 

void printList() 
{ 
   FlatterNode temp = head; 
   while (temp != null) 
   { 
       System.out.print(temp.data + " "); 
       temp = temp.downNext; 
   } 
   System.out.println(); 
} 

 
 /* Driver program to test above functions */
 public static void main(String args[]) 
 { 
     FlatterSLL L = new FlatterSLL(); 

     /* Let us create the following linked list 
         5 -> 10 -> 19 -> 28 
         |    |     |     | 
         V    V     V     V 
         7    20    22    35 
         |          |     | 
         V          V     V 
         8          50    40 
         |                | 
         V                V 
         30               45 
     */

     L.head = L.push(L.head, 30); 
     L.head = L.push(L.head, 8); 
     L.head = L.push(L.head, 7); 
     L.head = L.push(L.head, 5); 

     L.head.right = L.push(L.head.right, 20); 
     L.head.right = L.push(L.head.right, 10); 

     L.head.right.right = L.push(L.head.right.right, 50); 
     L.head.right.right = L.push(L.head.right.right, 22); 
     L.head.right.right = L.push(L.head.right.right, 19); 

     L.head.right.right.right = L.push(L.head.right.right.right, 45); 
     L.head.right.right.right = L.push(L.head.right.right.right, 40); 
     L.head.right.right.right = L.push(L.head.right.right.right, 35); 
     L.head.right.right.right = L.push(L.head.right.right.right, 20); 

     // flatten the list 
     L.head = L.flatten(L.head); 
     System.out.println("Pring the flatter list node are :: ");
     L.printList(); 
 } 
} /* This code is contributed by Rajat Mishra */