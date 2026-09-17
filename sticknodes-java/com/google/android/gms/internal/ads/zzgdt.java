package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgdt extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    zzgdt(int[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L19
            int[] r0 = r3.zza
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r1 = r3.zzb
            int r2 = r3.zzc
            int r4 = com.google.android.gms.internal.ads.zzgdu.zza(r0, r4, r1, r2)
            r0 = -1
            if (r4 == r0) goto L19
            r4 = 1
            return r4
        L19:
            r4 = 0
            return r4
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.gms.internal.ads.zzgdt
            if (r1 == 0) goto L30
            com.google.android.gms.internal.ads.zzgdt r8 = (com.google.android.gms.internal.ads.zzgdt) r8
            int r1 = r7.zzc
            int r2 = r7.zzb
            int r3 = r8.zzc
            int r4 = r8.zzb
            int r3 = r3 - r4
            int r1 = r1 - r2
            r2 = 0
            if (r3 != r1) goto L2f
            r3 = 0
        L18:
            if (r3 >= r1) goto L2e
            int[] r4 = r7.zza
            int r5 = r7.zzb
            int r5 = r5 + r3
            r4 = r4[r5]
            int[] r5 = r8.zza
            int r6 = r8.zzb
            int r6 = r6 + r3
            r5 = r5[r6]
            if (r4 == r5) goto L2b
            return r2
        L2b:
            int r3 = r3 + 1
            goto L18
        L2e:
            return r0
        L2f:
            return r2
        L30:
            boolean r8 = super.equals(r8)
            return r8
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zzc
            int r1 = r2.zzb
            int r0 = r0 - r1
            java.lang.String r1 = "index"
            com.google.android.gms.internal.ads.zzfxz.zza(r3, r0, r1)
            int[] r0 = r2.zza
            int r1 = r2.zzb
            int r1 = r1 + r3
            r3 = r0[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r3 = this;
            int r0 = r3.zzb
            r1 = 1
        L3:
            int r2 = r3.zzc
            if (r0 >= r2) goto L11
            int r1 = r1 * 31
            int[] r2 = r3.zza
            r2 = r2[r0]
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L3
        L11:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L1a
            int[] r0 = r3.zza
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r1 = r3.zzb
            int r2 = r3.zzc
            int r4 = com.google.android.gms.internal.ads.zzgdu.zza(r0, r4, r1, r2)
            if (r4 < 0) goto L1a
            int r0 = r3.zzb
            int r4 = r4 - r0
            return r4
        L1a:
            r4 = -1
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof java.lang.Integer
            r1 = -1
            if (r0 == 0) goto L23
            int[] r0 = r5.zza
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r2 = r5.zzb
            int r3 = r5.zzc
            int r3 = r3 + r1
        L12:
            if (r3 < r2) goto L1c
            r4 = r0[r3]
            if (r4 != r6) goto L19
            goto L1d
        L19:
            int r3 = r3 + (-1)
            goto L12
        L1c:
            r3 = -1
        L1d:
            if (r3 < 0) goto L23
            int r6 = r5.zzb
            int r3 = r3 - r6
            return r3
        L23:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.zzc
            int r1 = r2.zzb
            int r0 = r0 - r1
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r1 = "index"
            com.google.android.gms.internal.ads.zzfxz.zza(r3, r0, r1)
            int[] r0 = r2.zza
            int r1 = r2.zzb
            int r1 = r1 + r3
            r3 = r0[r1]
            java.util.Objects.requireNonNull(r4)
            int r4 = r4.intValue()
            r0[r1] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r2 = this;
            int r0 = r2.zzc
            int r1 = r2.zzb
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.zzc
            int r1 = r2.zzb
            int r0 = r0 - r1
            com.google.android.gms.internal.ads.zzfxz.zzi(r3, r4, r0)
            if (r3 != r4) goto Lf
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
        Lf:
            int[] r0 = r2.zza
            int r1 = r2.zzb
            int r4 = r4 + r1
            int r1 = r1 + r3
            com.google.android.gms.internal.ads.zzgdt r3 = new com.google.android.gms.internal.ads.zzgdt
            r3.<init>(r0, r1, r4)
            return r3
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.zzc
            int r1 = r3.zzb
            int r0 = r0 - r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 * 5
            r1.<init>(r0)
            r0 = 91
            r1.append(r0)
            int[] r0 = r3.zza
            int r2 = r3.zzb
            r0 = r0[r2]
            r1.append(r0)
            int r0 = r3.zzb
        L1c:
            int r0 = r0 + 1
            int r2 = r3.zzc
            if (r0 >= r2) goto L2f
            java.lang.String r2 = ", "
            r1.append(r2)
            int[] r2 = r3.zza
            r2 = r2[r0]
            r1.append(r2)
            goto L1c
        L2f:
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
