Build a trie(Prefix tree) from a list of words

```java
public Trie buildTrie(String[] words) {
    Trie root = new Trie();
    for (String w : words) {
        Trie p = root;
        for (char c : w.toCharArray()) {
            if (p.next[c - 'a'] == null) {
                p.next[c - 'a'] = new Trie();
            }
            p = p.next[c - 'a'];  // will point to curr char
        }
        p.word = w;
    }
    return root;
}

private class Trie {
    Trie[] next = new Trie[26];
    String word = null;
}
```
