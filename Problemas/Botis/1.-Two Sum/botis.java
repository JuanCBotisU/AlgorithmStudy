// https://leetcode.com/problems/two-sum/description/ 


//Nos piden encontrar dos nuemros que del una 
// suma especifica y regresar sus indices dentro del array
class botis {
    public int[] twoSum(int[] nums, int target) {
        // La primer manera en la que se me ocurrio es probando cada suma posible 
        // atravez de los for 
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(target == (nums[i] + nums[j])){
                    
                    return new int[]{i, j};
                    // regresa los indices en caso de encontrar una solucion
                }
            }
        }
        return new int[]{}; 
        // regresa un arreglo vacio en caso de no entrar una solucion 
    }
}