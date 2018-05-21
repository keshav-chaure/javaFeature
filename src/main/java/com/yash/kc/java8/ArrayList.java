package com.yash.kc.java8;

import java.util.ArrayList;

class Node {
	Object data = null;
	Node link = null;
}

class SingleLinkList {

	Node linkList = null;

	SingleLinkList() {
		linkList = new Node();
	}

	public boolean insertAtStart(Integer a) {
		if (linkList != null) {
			Node temp = new Node();
			temp.data = a;
			temp.link = null;
			linkList = temp;
		}

		return true;
	}

}
