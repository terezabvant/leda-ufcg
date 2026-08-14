package problems;

import adt.bst.BSTNode;

public class BSTHorizontalDistanceImpl extends BSTInteger implements BSTHorizontalDistance<Integer> {
    
    @Override
    public int horizontalDistance(Integer elem){
        int r = Integer.MAX_VALUE;
        if( elem != null && getRoot() != null){
            r = horizontalDistanceRec((BSTNode<Integer>) getRoot(), elem);
        }
        return r;
    }

    private int horizontalDistanceRec(BSTNode<Integer> node, Integer elem){
        int result = Integer.MAX_VALUE;
        if(!node.isEmpty()){
            if(elem.compareTo(node.getData()) == 0){
                result = 0;
            }
            else if(elem.compareTo(node.getData()) < 0){
                int aux = horizontalDistanceRec((BSTNode<Integer>) node.getLeft(), elem);
                if( aux != Integer.MAX_VALUE){
                    result = aux - 1;
                }
            }
            else{
                 int aux = horizontalDistanceRec((BSTNode<Integer>) node.getRight(), elem);
                if( aux != Integer.MAX_VALUE){
                    result = aux + 1;
                }

            }
            
        }
        return result;
    }
    
}
