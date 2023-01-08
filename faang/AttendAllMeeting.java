import java.util.*;

public class AttendAllMeeting {
    // Mukesh is a wealthy businessman. He has several meetings to attend.
    // Given an array of meeting time intervals consisting of start and end times
    // [[s1,e1],[s2,e2],…] (si < ei),
    // determine if mukesh could attend all meetings.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Pair[] intervals = new Pair[n];
        for (int i = 0; i < n; i++) {
            intervals[i] = new Pair(s.nextInt(), s.nextInt());
        }
        System.out.println(canAttend(intervals));
        // 3
        // 0 30
        // 5 10
        // 15 20
        // false
        s.close();
    }

    public static boolean canAttend(Pair[] intervals) {
        // !if there is no meeting
        if (intervals == null || intervals.length == 0)
            return true;
        Arrays.sort(intervals);
        Pair first = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].si < first.ei) {
                return false;
            }
            first = intervals[i];
        }
        return true;
    }
}

class Pair implements Comparable<Pair> {
    int si, ei;

    Pair(int si, int ei) {
        this.si = si;
        this.ei = ei;
    }

    @Override
    public int compareTo(Pair arg0) {
        return this.si - arg0.si;
    }
}
