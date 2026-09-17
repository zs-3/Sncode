package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzmp implements java.lang.Comparable, java.util.Map.Entry {
    private java.lang.Object value;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzmi zzvk;
    private final java.lang.Comparable zzvn;

    zzmp(com.google.android.gms.internal.drive.zzmi r1, java.lang.Comparable r2, java.lang.Object r3) {
            r0 = this;
            r0.zzvk = r1
            r0.<init>()
            r0.zzvn = r2
            r0.value = r3
            return
    }

    zzmp(com.google.android.gms.internal.drive.zzmi r2, java.util.Map.Entry r3) {
            r1 = this;
            java.lang.Object r0 = r3.getKey()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            java.lang.Object r3 = r3.getValue()
            r1.<init>(r2, r0, r3)
            return
    }

    private static boolean equals(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzmp r2 = (com.google.android.gms.internal.drive.zzmp) r2
            java.lang.Object r0 = r1.getKey()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Comparable r1 = r4.zzvn
            java.lang.Object r3 = r5.getKey()
            boolean r1 = equals(r1, r3)
            if (r1 == 0) goto L25
            java.lang.Object r1 = r4.value
            java.lang.Object r5 = r5.getValue()
            boolean r5 = equals(r1, r5)
            if (r5 == 0) goto L25
            return r0
        L25:
            return r2
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
            r1 = this;
            java.lang.Comparable r0 = r1.zzvn
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            java.lang.Comparable r0 = r3.zzvn
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            java.lang.Object r2 = r3.value
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzmi r0 = r1.zzvk
            com.google.android.gms.internal.drive.zzmi.zza(r0)
            java.lang.Object r0 = r1.value
            r1.value = r2
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.Comparable r0 = r4.zzvn
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r4.value
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r0.length()
            int r2 = r2 + 1
            int r3 = r1.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = "="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
