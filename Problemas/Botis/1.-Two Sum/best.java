import java.util.HashMap;
import java.util.Map;

public class best {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); 
        // Se crea objeto HashMap: Es una estructura de datos que en promedio tiene complejidad O(1)
        //Al agregar un valor tenemos una llave y el valor relacionado a esa llave 
        int n = nums.length;
        

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i]; //Target es la suma de dos numeros al restarle uno quedara el que falta
            if (numMap.containsKey(complement)) { //Ve rifica que exista el elemento dentro del HashMap
                return new int[]{numMap.get(complement), i};//Si si regresa los subindices
            }
            numMap.put(nums[i], i); // si no lo encuentra agregara el numero como Clave y el id como valor 
            // se agrega el id como valor por que es lo que nos interesa regresar 
        }
        return new int[]{}; // En caso de no encontrar un valor regersa un arreglo vacio.
    }
}
