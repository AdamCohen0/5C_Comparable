/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }
    
    public int compareTo( Object obj) {
        Date comparer = (Date) obj;
        if (y == comparer.y) {
            if (m == comparer.m) {
                if (d == comparer.d) {
                    return 0;
                    } else { if (d < comparer.d)
                        return -1;
                        return 1;
                    }
                } else { if (m < comparer.m)
                    return -1;
                    return 1;
                }
            } else { if (y < comparer.y)
                return -1;
                return 1;
            }
    }
}