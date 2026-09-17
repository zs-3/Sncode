package com.google.android.gms.common.images;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    public static com.google.android.gms.common.images.Size parseSize(java.lang.String r3) throws java.lang.NumberFormatException {
            if (r3 == 0) goto L35
            r0 = 42
            int r0 = r3.indexOf(r0)
            if (r0 >= 0) goto L10
            r0 = 120(0x78, float:1.68E-43)
            int r0 = r3.indexOf(r0)
        L10:
            if (r0 < 0) goto L30
            com.google.android.gms.common.images.Size r1 = new com.google.android.gms.common.images.Size     // Catch: java.lang.NumberFormatException -> L2b
            r2 = 0
            java.lang.String r2 = r3.substring(r2, r0)     // Catch: java.lang.NumberFormatException -> L2b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L2b
            int r0 = r0 + 1
            java.lang.String r0 = r3.substring(r0)     // Catch: java.lang.NumberFormatException -> L2b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2b
            r1.<init>(r2, r0)     // Catch: java.lang.NumberFormatException -> L2b
            return r1
        L2b:
            java.lang.NumberFormatException r3 = zaa(r3)
            throw r3
        L30:
            java.lang.NumberFormatException r3 = zaa(r3)
            throw r3
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "string must not be null"
            r3.<init>(r0)
            throw r3
    }

    private static java.lang.NumberFormatException zaa(java.lang.String r3) {
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid Size: \""
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "\""
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.common.images.Size
            if (r2 == 0) goto L1b
            com.google.android.gms.common.images.Size r5 = (com.google.android.gms.common.images.Size) r5
            int r2 = r4.zaa
            int r3 = r5.zaa
            if (r2 != r3) goto L1b
            int r2 = r4.zab
            int r5 = r5.zab
            if (r2 != r5) goto L1b
            return r1
        L1b:
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.zab
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.zaa
            int r1 = r0 << 16
            int r0 = r0 >>> 16
            int r2 = r3.zab
            r0 = r0 | r1
            r0 = r0 ^ r2
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.zaa
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r1 = r2.zab
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
