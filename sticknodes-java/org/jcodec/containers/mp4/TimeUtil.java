package org.jcodec.containers.mp4;

/* loaded from: classes2.dex */
public class TimeUtil {
    public static final long MOV_TIME_OFFSET = 0;

    static {
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            r2 = 1904(0x770, float:2.668E-42)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r0
            r1.set(r2, r3, r4, r5, r6, r7)
            r1 = 14
            r2 = 0
            r0.set(r1, r2)
            long r0 = r0.getTimeInMillis()
            org.jcodec.containers.mp4.TimeUtil.MOV_TIME_OFFSET = r0
            return
    }

    public static long fromMovTime(int r4) {
            long r0 = (long) r4
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r2 = org.jcodec.containers.mp4.TimeUtil.MOV_TIME_OFFSET
            long r0 = r0 + r2
            return r0
    }

    public static int toMovTime(long r2) {
            long r0 = org.jcodec.containers.mp4.TimeUtil.MOV_TIME_OFFSET
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            int r3 = (int) r2
            return r3
    }
}
