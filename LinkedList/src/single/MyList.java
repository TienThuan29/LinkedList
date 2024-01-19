 package single;

public class MyList {

      protected Node head;
      protected Node tail;

      public MyList() {
            tail = head = null;
      }

      public void traverse() {
            Node node = head;
            while (node != null) {
                  System.out.format("%d  ", node.info);
                  node = node.next;
            }
            System.out.println();
      }

      public void addLast(int x) {
            Node p = new Node(x, null);
            if (isEmpty()) {
                  head = p;
                  tail = p;
            } else {
                  tail.next = p;
                  tail = p;
            }
      }

      public boolean isEmpty() {
            return head == null;
      }

      public void deleteMany(int x) {
            Node prev = null, p = head;
            while (p != null) {
                  if (p.info == x) {
                        if (prev == null) {
                              head = p.next;
                              p = head;
                        } else {
                              prev.next = p.next;
                              p = prev.next;
                              if (p == null) {
                                    tail = prev;
                              }
                        }
                  } else {
                        prev = p;
                        p = p.next;
                  }
            }
      }

      public int size() {
            Node node = head;
            int count = 0;
            while (node != null) {
                  count++;
                  node = node.next;
            }
            return count;
      }

      public void remove(int index) {
            Node node = head, prev = null;
            int count = 0;
            while (node != null) {
                  if (count != index) {
                        count++;
                        prev = node;
                        node = node.next;
                  } else {
                        if (prev == null) {
                              head = node.next;
                        } else {
                              prev.next = node.next;
                        }
                        if (node.next == null) {
                              tail = prev;
                        }
                        node.next = null;
                        break;
                  }
            }
      }

      // xóa theo vị trí: mà vị trí thỏa: Bội chung lớn nhất của 1 số bất kì mà số đó phải trong list
      public void removeIndex_BCLN(int x) {
            // Cannot input <= 0;
            if (x <= 0 || x >= size()) {
                  return;
            }
            int index = (size() - 1) - ((size() - 1) % x);
            remove(index);
      }

      public void removeIndex_BCLN_2(int x) {
//            Node p = head, prevDel = null;  int count = 0;
//            while (head.next != null){
//                  count += 1;
//                  
//            }
      }

      // xắp xếp các phần tử tăng dần 
      public void sortAsc() {
            boolean isSwap = true;
            while (isSwap) {
                  isSwap = false;
                  for (Node r = head; r.next != null; r = r.next) {
                        if (r.info > r.next.info) {
                              isSwap = true;
                              int temp = r.info;
                              r.info = r.next.info;
                              r.next.info = temp;
                        }
                  }
            }
      }

      public void sortByNode() {
            int count = 0 ;
            boolean isSwap = true;
            //endNode : giữ điểm chạy kết thúc khi chạy hết 1 vòng for
            Node prev = null, endNode = null;
            if (head.next == null) {
                  return;
            }
            // Trường hợp 2 phần tử
            Node curr = head;
            if (curr.info > curr.next.info && curr == head && curr.next == tail) {
                  head = curr.next;
                  tail = curr;
                  head.next = tail;
                  tail.next = null;
                  return;
            }
            while (isSwap) {
                  isSwap = false;
                  for (curr = head; curr.next != endNode; curr = curr.next) {
                        Node temp = curr.next;
                        if (curr.info > temp.info && temp.next != null) {
                              isSwap = true;
                              if (curr == head) {
                                    curr.next = temp.next;
                                    temp.next = curr;
                                    head = temp;
                              } else {
                                    curr.next = temp.next;
                                    prev.next = temp;
                                    temp.next = curr;
                                    
                              }
                              curr = temp;
                        } else if (curr.info > curr.next.info && curr.next.next == null) {
                              isSwap = true;
                              prev.next = temp;
                              curr.next = null;
                              temp.next = curr;
                              tail = curr;
                              curr = prev.next;
                        }
                        prev = curr;
                        // đếm số lần chạy for (để test độ tối ưu độ tối ưu)
                        count++;
                  }
                  // vì phần tử lớn nhất luôn ở cuối khi chạy hết 1 for, nên chỉ cần chạy đến phần tử kế phần tử lớn nhất
                  // nếu không có enNode thì số lần chạy for sẽ nhiều hơn => không tối ưu
                 endNode = curr;
            }
            
            System.out.println("Số lần chạy for "+count);
      }

}
