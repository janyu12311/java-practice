package Class6;


public class Code1_TrieTree {
    public static class TrieNode{
        public int pass;
        public int end;

        public TrieNode[] nexts;
        public TrieNode(){
            pass=0;
            end=0;
            nexts=new TrieNode[26];
        }

    }
   public static class Trie{
        private TrieNode root;
        public Trie(){
            root=new TrieNode();
        }
        //往前缀树里面插入一个字符串
        public  void insert(String word){
            if(word==null){
                return;
            }
            TrieNode node=root;
            char[] arr=word.toCharArray();
            node.pass++;
            int index=0;
            for(int i=0;i<arr.length;i++){
                index=arr[i]-'a';
                if(node.nexts[index]==null){
                    node.nexts[index]=new TrieNode();
                }
                node=node.nexts[index];
                node.pass++;
            }
            node.end++;
        }

        //找这个字符串是否在前缀树里面出现过
        public int search(String word){
            if (word == null){
                return 0;
            }
            TrieNode node=root;
            char[] arr=word.toCharArray();
            int index=0;
            for(int i=0;i<arr.length;i++){
                index=arr[i]-'a';
                if(node.nexts[index]==null){
                    return 0;
                }
                node=node.nexts[index];
            }
            return node.end;
        }
//找到前缀为pre的字符串有多少个
       public int preSearch(String pre){
            if(pre==null){
                return 0;
            }
            TrieNode node=root;
            char[] arr=pre.toCharArray();
            int index=0;
            for(int i=0;i<arr.length;i++){
                index=arr[i]-'a';
                if(node.nexts[index]==null){
                    return 0;
                }
                node=node.nexts[index];
            }
            return node.pass;
       }
       //在前缀树里面删除一个字符串
       public void delete(String word){
            if(search(word)!=0){
                TrieNode node= root;
                char[] arr=word.toCharArray();
                int index=0;
                for (int i = 0; i < arr.length; i++) {
                    index=arr[i]-'a';
                    if(--node.nexts[index].pass==0){
                        node.nexts[index]=null;
                        return;
                    }
                    node=node.nexts[index];
                }
                node.end--;
            }
       }


   }

}
