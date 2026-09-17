package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zznq extends com.google.android.gms.internal.measurement.zzkq implements java.util.RandomAccess {
    private static final java.lang.Object[] zza = null;
    private static final com.google.android.gms.internal.measurement.zznq zzb = null;
    private java.lang.Object[] zzc;
    private int zzd;

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.google.android.gms.internal.measurement.zznq.zza = r1
            com.google.android.gms.internal.measurement.zznq r2 = new com.google.android.gms.internal.measurement.zznq
            r2.<init>(r1, r0, r0)
            com.google.android.gms.internal.measurement.zznq.zzb = r2
            return
    }

    zznq() {
            r3 = this;
            java.lang.Object[] r0 = com.google.android.gms.internal.measurement.zznq.zza
            r1 = 0
            r2 = 1
            r3.<init>(r0, r1, r2)
            return
    }

    private zznq(java.lang.Object[] r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            r0.zzc = r1
            r0.zzd = r2
            return
    }

    public static com.google.android.gms.internal.measurement.zznq zze() {
            com.google.android.gms.internal.measurement.zznq r0 = com.google.android.gms.internal.measurement.zznq.zzb
            return r0
    }

    private static int zzg(int r1) {
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r1 = r1 + 1
            r0 = 10
            int r1 = java.lang.Math.max(r1, r0)
            return r1
    }

    private final java.lang.String zzh(int r4) {
            r3 = this;
            int r0 = r3.zzd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", Size:"
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            return r4
    }

    private final void zzi(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.zzd
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.zzh(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final void add(int r5, java.lang.Object r6) {
            r4 = this;
            r4.zzcE()
            if (r5 < 0) goto L3c
            int r0 = r4.zzd
            if (r5 > r0) goto L3c
            int r1 = r5 + 1
            java.lang.Object[] r2 = r4.zzc
            int r3 = r2.length
            if (r0 >= r3) goto L15
            int r0 = r0 - r5
            java.lang.System.arraycopy(r2, r5, r2, r1, r0)
            goto L2b
        L15:
            int r0 = zzg(r3)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r4.zzc
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r5)
            java.lang.Object[] r2 = r4.zzc
            int r3 = r4.zzd
            int r3 = r3 - r5
            java.lang.System.arraycopy(r2, r5, r0, r1, r3)
            r4.zzc = r0
        L2b:
            java.lang.Object[] r0 = r4.zzc
            r0[r5] = r6
            int r5 = r4.zzd
            int r5 = r5 + 1
            r4.zzd = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return
        L3c:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = r4.zzh(r5)
            r6.<init>(r5)
            throw r6
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r4) {
            r3 = this;
            r3.zzcE()
            int r0 = r3.zzd
            java.lang.Object[] r1 = r3.zzc
            int r1 = r1.length
            if (r0 != r1) goto L16
            int r0 = zzg(r1)
            java.lang.Object[] r1 = r3.zzc
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.zzc = r0
        L16:
            java.lang.Object[] r0 = r3.zzc
            int r1 = r3.zzd
            int r2 = r1 + 1
            r3.zzd = r2
            r0[r1] = r4
            int r4 = r3.modCount
            r0 = 1
            int r4 = r4 + r0
            r3.modCount = r4
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            r1.zzi(r2)
            java.lang.Object[] r0 = r1.zzc
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int r5) {
            r4 = this;
            r4.zzcE()
            r4.zzi(r5)
            java.lang.Object[] r0 = r4.zzc
            r1 = r0[r5]
            int r2 = r4.zzd
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.zzd
            int r5 = r5 + (-1)
            r4.zzd = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return r1
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.zzcE()
            r2.zzi(r3)
            java.lang.Object[] r0 = r2.zzc
            r1 = r0[r3]
            r0[r3] = r4
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzmj zzd(int r4) {
            r3 = this;
            int r0 = r3.zzd
            if (r4 < r0) goto L18
            if (r4 != 0) goto L9
            java.lang.Object[] r4 = com.google.android.gms.internal.measurement.zznq.zza
            goto Lf
        L9:
            java.lang.Object[] r0 = r3.zzc
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
        Lf:
            com.google.android.gms.internal.measurement.zznq r0 = new com.google.android.gms.internal.measurement.zznq
            int r1 = r3.zzd
            r2 = 1
            r0.<init>(r4, r1, r2)
            return r0
        L18:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    final void zzf(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.zzc
            int r0 = r0.length
            if (r2 > r0) goto L6
            return
        L6:
            if (r0 == 0) goto L18
        L8:
            if (r0 >= r2) goto Lf
            int r0 = zzg(r0)
            goto L8
        Lf:
            java.lang.Object[] r2 = r1.zzc
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            r1.zzc = r2
            return
        L18:
            r0 = 10
            int r2 = java.lang.Math.max(r2, r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.zzc = r2
            return
    }
}
