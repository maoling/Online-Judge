package com.leetcode;

public class LRUCache {
	private java.util.Map<Integer, Node> map = new java.util.HashMap<Integer,Node>();
	int capacity;
	Node head;//seldom
	Node tail;//frequent
	
	class Node{
		Node pre;
		Node next;
		Integer k;
		Integer v;
		public Node(Integer k, Integer v) {			
			this.k = k;
			this.v = v;
		}		
	} 	
	
	public LRUCache(int capacity){
		this.capacity = capacity;
		head = new Node(null, null);
		tail = new Node(null, null);
		head.next = tail;
		tail.pre = head;
		/*head.pre = tail;
		tail.next = head; why 这样写就是错的？？*/
	}
	public int get(int key){
		Node cache = map.get(key);
		if(cache != null){
			cache.pre.next = cache.next;
			cache.next.pre = cache.pre;
			appendTail(cache);
			return cache.v;
		}		
		return -1;
		
	}
	public void set(int key,int value){
		Node cache = map.get(key);
		if(cache != null){
			cache.v = value;
			cache.pre.next = cache.next;
			cache.next.pre = cache.pre;
			map.put(key, cache);//千万不要忘记把修改的Node放入map中
			appendTail(cache);
			return ;			
		}
		
		if(map.size() == capacity){
			Node tmp = head.next;
			head.next = head.next.next;
			head.next.pre = head;
			//tmp.next.pre = head; 都是正确的
			map.remove(tmp.k);
		}
		cache = new Node(key,value);						
		map.put(key, cache);
		appendTail(cache);
				
	}
	
	private void appendTail(Node n){
		n.next = tail;
		n.pre = tail.pre;
		tail.pre.next = n;
		tail.pre = n;
	}
}

