package org.fortheloss.framework;

/* loaded from: classes2.dex */
public class CustomMathUtils {

    private static class CustomSin {
        static final float[] table = null;

        static {
                r0 = 1048576(0x100000, float:1.469368E-39)
                float[] r1 = new float[r0]
                org.fortheloss.framework.CustomMathUtils.CustomSin.table = r1
                r1 = 0
                r2 = 0
            L8:
                if (r2 >= r0) goto L23
                float[] r3 = org.fortheloss.framework.CustomMathUtils.CustomSin.table
                float r4 = (float) r2
                r5 = 1056964608(0x3f000000, float:0.5)
                float r4 = r4 + r5
                r5 = 1233125376(0x49800000, float:1048576.0)
                float r4 = r4 / r5
                r5 = 1086918619(0x40c90fdb, float:6.2831855)
                float r4 = r4 * r5
                double r4 = (double) r4
                double r4 = java.lang.Math.sin(r4)
                float r4 = (float) r4
                r3[r2] = r4
                int r2 = r2 + 1
                goto L8
            L23:
                r0 = 360(0x168, float:5.04E-43)
                if (r1 >= r0) goto L44
                float[] r0 = org.fortheloss.framework.CustomMathUtils.CustomSin.table
                float r2 = (float) r1
                r3 = 1161169761(0x45360b61, float:2912.7112)
                float r3 = r3 * r2
                int r3 = (int) r3
                r4 = 1048575(0xfffff, float:1.469367E-39)
                r3 = r3 & r4
                r4 = 1016003125(0x3c8efa35, float:0.017453292)
                float r2 = r2 * r4
                double r4 = (double) r2
                double r4 = java.lang.Math.sin(r4)
                float r2 = (float) r4
                r0[r3] = r2
                int r1 = r1 + 90
                goto L23
            L44:
                return
        }
    }

    public static float cos(float r2) {
            float[] r0 = org.fortheloss.framework.CustomMathUtils.CustomSin.table
            r1 = 1070141403(0x3fc90fdb, float:1.5707964)
            float r2 = r2 + r1
            r1 = 1210251651(0x4822f983, float:166886.05)
            float r2 = r2 * r1
            int r2 = (int) r2
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            r2 = r0[r2]
            return r2
    }

    public static float cosDeg(float r2) {
            float[] r0 = org.fortheloss.framework.CustomMathUtils.CustomSin.table
            r1 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 + r1
            r1 = 1161169761(0x45360b61, float:2912.7112)
            float r2 = r2 * r1
            int r2 = (int) r2
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            r2 = r0[r2]
            return r2
    }

    public static float sin(float r2) {
            float[] r0 = org.fortheloss.framework.CustomMathUtils.CustomSin.table
            r1 = 1210251651(0x4822f983, float:166886.05)
            float r2 = r2 * r1
            int r2 = (int) r2
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            r2 = r0[r2]
            return r2
    }

    public static float sinDeg(float r2) {
            float[] r0 = org.fortheloss.framework.CustomMathUtils.CustomSin.table
            r1 = 1161169761(0x45360b61, float:2912.7112)
            float r2 = r2 * r1
            int r2 = (int) r2
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            r2 = r0[r2]
            return r2
    }
}
