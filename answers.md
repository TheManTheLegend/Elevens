1. public static String flip{
	int r = Math.random();
	if(r < 0.66){
	return "heads";
	}
	return "tails";
	}	
2. public static boolean arePermutations(int[] first, int[] second){
Boolean thing = true;
 for(int i = 0; i < first.length; i++){
 	for(int j = 0; j < second.length; j++){
 		if(first[i] == second[j]){
 		thing = false;
 		}
 	}
 }
 return thing;
}

3. the random integers in order are 3,2,1,0. This would flip the entire array since the original order of placements in 0,1,2,3.