class Solution {
    public boolean isPalindrome(int x) {
      if (x < 0 || (x % 10 == 0 && x != 0)) { // Si el numero es negativo o el modulo es 0 no es palindromo
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) { // se dejara de ejecutar cuadno x sea menor o igual 
            // x % 10 -> va agregando el ultimo numero por ejemplo 101%10 = 1 
            revertedNumber = revertedNumber * 10 + x % 10; // al multiplicarlo por *10 da espacio para ir agregando el numero siguiente
            x /= 10; // Elimina el numero que fue agregado
        }

        return x == revertedNumber || x == revertedNumber / 10; //En caso de que sea igual 
    }
}