package org.apache.commons.lang3.math;

/* loaded from: classes2.dex */
public class IEEE754rUtils {
    public IEEE754rUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double max(double r1, double r3) {
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 == 0) goto Le
            return r1
        Le:
            double r1 = java.lang.Math.max(r1, r3)
            return r1
    }

    public static double max(double r0, double r2, double r4) {
            double r0 = max(r0, r2)
            double r0 = max(r0, r4)
            return r0
    }

    public static double max(double... r5) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The Array must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            int r2 = r5.length
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Array cannot be empty."
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            r1 = r5[r1]
        L1d:
            int r3 = r5.length
            if (r0 >= r3) goto L29
            r3 = r5[r0]
            double r1 = max(r3, r1)
            int r0 = r0 + 1
            goto L1d
        L29:
            return r1
    }

    public static float max(float r1, float r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto Le
            return r1
        Le:
            float r1 = java.lang.Math.max(r1, r2)
            return r1
    }

    public static float max(float r0, float r1, float r2) {
            float r0 = max(r0, r1)
            float r0 = max(r0, r2)
            return r0
    }

    public static float max(float... r5) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The Array must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            int r2 = r5.length
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Array cannot be empty."
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            r1 = r5[r1]
        L1d:
            int r2 = r5.length
            if (r0 >= r2) goto L29
            r2 = r5[r0]
            float r1 = max(r2, r1)
            int r0 = r0 + 1
            goto L1d
        L29:
            return r1
    }

    public static double min(double r1, double r3) {
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 == 0) goto Le
            return r1
        Le:
            double r1 = java.lang.Math.min(r1, r3)
            return r1
    }

    public static double min(double r0, double r2, double r4) {
            double r0 = min(r0, r2)
            double r0 = min(r0, r4)
            return r0
    }

    public static double min(double... r5) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The Array must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            int r2 = r5.length
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Array cannot be empty."
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            r1 = r5[r1]
        L1d:
            int r3 = r5.length
            if (r0 >= r3) goto L29
            r3 = r5[r0]
            double r1 = min(r3, r1)
            int r0 = r0 + 1
            goto L1d
        L29:
            return r1
    }

    public static float min(float r1, float r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto Le
            return r1
        Le:
            float r1 = java.lang.Math.min(r1, r2)
            return r1
    }

    public static float min(float r0, float r1, float r2) {
            float r0 = min(r0, r1)
            float r0 = min(r0, r2)
            return r0
    }

    public static float min(float... r5) {
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "The Array must not be null"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            int r2 = r5.length
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Array cannot be empty."
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            r1 = r5[r1]
        L1d:
            int r2 = r5.length
            if (r0 >= r2) goto L29
            r2 = r5[r0]
            float r1 = min(r2, r1)
            int r0 = r0 + 1
            goto L1d
        L29:
            return r1
    }
}
