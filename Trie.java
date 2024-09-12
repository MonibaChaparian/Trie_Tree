import java.util.Scanner;

public class Trie {

	static final int Alphabet_size = 26;
	
	static class TrieNode{
		
		TrieNode[] children= new TrieNode[Alphabet_size];
		boolean EndOfWord;
		TrieNode() {
			EndOfWord=false;
			for(int i=0;i<Alphabet_size;i++) 
				children[i]=null;
		}
	}
	public static TrieNode root= new TrieNode();
	
	static void Insert(String key) 
	{
		int index;
		int i;
		TrieNode Froot=root;
		
		for(i=0;i<key.length();i++) {
			index = key.charAt(i) - 'a';
			if(Froot.children[index]==null)
				Froot.children[index]=new TrieNode();
			
			Froot=Froot.children[index];
		}
		Froot.EndOfWord=true;
	}
	
	static boolean Search(String key) {
		int index;
		int i;
		TrieNode Froot=root;
		
		for(i=0;i<key.length();i++) {
			index= key.charAt(i)-'a';
			if(Froot.children[index]==null)
				return false;
			
			Froot=Froot.children[index];
		}
		return ( Froot.EndOfWord && Froot != null);
		
	}
	
	static String Delete(String key) {
		int index;
		int i;
		TrieNode Froot = root;
		boolean is=Search(key);
		String n="Not Founded";
		String y="deleting successful";
		if(is==false) 
			return n;
		else {
			for(i=0;i<key.length();i++) {
				index=key.charAt(i)-'a';
				Froot.children[index]=null;
			}
			return y;
		}
}
	public static ArrayList<String> out = new ArrayList <String>();
	
	static ArrayList<String> output(String key) {
		
		out.add(key);
		if(Search(key)==false) {
			out.remove(key);
		}
		String is;
		
		for(int i=0;i<out.size();i++) {
			is=out.get(i);
			if(Search(is)==false) {
				if(out.contains(is))
					out.remove(is);
			}
			
		}
		
		return out;
		
	}
	
	
	
	
}
