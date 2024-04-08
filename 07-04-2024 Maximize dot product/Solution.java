class Solution
{
	public int maxDotProduct(int n, int m, int a[], int b[]) 
	{ 
		int prev[]=new int[m];
	     prev[0]=a[0]*b[0];
	    
	     for(int i=1;i<m;i++){
	         prev[i]=Math.max(prev[i-1],a[0]*b[i]);
	     }
	     
	     for(int i=1;i<n;i++){
	         int curr[]=new int[m];
	         curr[0]=Math.max(a[i]*b[0],prev[0]);
	         for(int j=1;j<m;j++){
	             if(i==j){
	                 curr[j]=a[i]*b[j]+prev[j-1];
	             }
	             else if(i>j){
	                 curr[j]=Math.max( prev[j-1]+a[i]*b[j] , prev[j] );
	             }
	         }
	         prev=curr;
	     }
	     
	     return prev[m-1];
	} 
}