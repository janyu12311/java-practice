package Search;

public class blockSearch {
    class Block{
        private int max;
        private int startIndex;
        private int endIndex;

        public Block() {
        }

        public Block(int max, int startIndex, int endIndex) {
            this.max = max;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getStartIndex() {
            return startIndex;
        }

        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }

        public int getEndIndex() {
            return endIndex;
        }

        public void setEndIndex(int endIndex) {
            this.endIndex = endIndex;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,
                5,6,7,8,
                9,10,11,12,
                13,14,15,16};
        blockSearch.Block b1=new blockSearch().new Block();






    }
}

