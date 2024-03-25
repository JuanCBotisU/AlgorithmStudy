class Solution {
    //Se pide confirmar que un numero es un palindromo
    public boolean isPalindrome(int x) {
        // lo convierto en un String para irlo recorriendo 
        String num = Integer.toString(x);
        int n = num.length();
        for(int i = 0; i < n; i++){
            n--;
            // se compara el primer y ultimo caracter hasta terminar 
            if(num.charAt(i) != num.charAt(n)){ 
                return false; 
            }
        }
        return true;
    }
}