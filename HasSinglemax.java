static int hasSingleMaximum(int[ ] a) {
	
		int max=Integer.MIN_VALUE;
		boolean x=true;
		
	 	 if (a.length<=0) {
	 		 return 0;
	 	 }
	  
	    
		for (int i=0 ;i<a.length;i++) {
			if (a[i]==max) {
				x=false;
			}
			
			if(a[i]>max) {
				max=a[i];
				x=true;
			}
		}
		
		
		
		return x ? 1:0;
	}