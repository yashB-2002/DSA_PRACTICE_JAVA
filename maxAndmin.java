
class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 
class Compute {
    static pair getMinMax(long a[], long n) {
        // Write your code here
        long max = a[0], min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        pair result = new pair(min, max);
        return result;

    }
}