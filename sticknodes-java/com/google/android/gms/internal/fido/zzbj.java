package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public final class zzbj extends com.google.android.gms.internal.fido.zzbk {
    private final java.lang.String zza;

    zzbj(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.fido.zzbk r4 = (com.google.android.gms.internal.fido.zzbk) r4
            r4.zza()
            com.google.android.gms.internal.fido.zzbj r4 = (com.google.android.gms.internal.fido.zzbj) r4
            java.lang.String r0 = r3.zza
            int r1 = r0.length()
            java.lang.String r4 = r4.zza
            int r2 = r4.length()
            if (r1 == r2) goto L1f
            int r0 = r0.length()
            int r4 = r4.length()
            int r0 = r0 - r4
            goto L23
        L1f:
            int r0 = r0.compareTo(r4)
        L23:
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class<com.google.android.gms.internal.fido.zzbj> r1 = com.google.android.gms.internal.fido.zzbj.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L11
            return r0
        L11:
            com.google.android.gms.internal.fido.zzbj r4 = (com.google.android.gms.internal.fido.zzbj) r4
            java.lang.String r0 = r3.zza
            java.lang.String r4 = r4.zza
            boolean r4 = r0.equals(r4)
            return r4
    }

    public final int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zza
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.zza
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\""
            r1.append(r2)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzbk
    protected final int zza() {
            r1 = this;
            r0 = 3
            return r0
    }
}
