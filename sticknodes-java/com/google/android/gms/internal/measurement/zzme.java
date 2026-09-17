package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zzme extends com.google.android.gms.internal.measurement.zzkq implements java.util.RandomAccess, com.google.android.gms.internal.measurement.zzmh, com.google.android.gms.internal.measurement.zzno {
    private static final int[] zza = null;
    private static final com.google.android.gms.internal.measurement.zzme zzb = null;
    private int[] zzc;
    private int zzd;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            com.google.android.gms.internal.measurement.zzme.zza = r1
            com.google.android.gms.internal.measurement.zzme r2 = new com.google.android.gms.internal.measurement.zzme
            r2.<init>(r1, r0, r0)
            com.google.android.gms.internal.measurement.zzme.zzb = r2
            return
    }

    zzme() {
            r3 = this;
            int[] r0 = com.google.android.gms.internal.measurement.zzme.zza
            r1 = 0
            r2 = 1
            r3.<init>(r0, r1, r2)
            return
    }

    private zzme(int[] r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            r0.zzc = r1
            r0.zzd = r2
            return
    }

    public static com.google.android.gms.internal.measurement.zzme zzf() {
            com.google.android.gms.internal.measurement.zzme r0 = com.google.android.gms.internal.measurement.zzme.zzb
            return r0
    }

    private static int zzj(int r1) {
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r1 = r1 + 1
            r0 = 10
            int r1 = java.lang.Math.max(r1, r0)
            return r1
    }

    private final java.lang.String zzk(int r4) {
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

    private final void zzl(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.zzd
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.zzk(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zzcE()
            if (r5 < 0) goto L42
            int r0 = r4.zzd
            if (r5 > r0) goto L42
            int r1 = r5 + 1
            int[] r2 = r4.zzc
            int r3 = r2.length
            if (r0 >= r3) goto L1b
            int r0 = r0 - r5
            java.lang.System.arraycopy(r2, r5, r2, r1, r0)
            goto L31
        L1b:
            int r0 = zzj(r3)
            int[] r0 = new int[r0]
            int[] r2 = r4.zzc
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r5)
            int[] r2 = r4.zzc
            int r3 = r4.zzd
            int r3 = r3 - r5
            java.lang.System.arraycopy(r2, r5, r0, r1, r3)
            r4.zzc = r0
        L31:
            int[] r0 = r4.zzc
            r0[r5] = r6
            int r5 = r4.zzd
            int r5 = r5 + 1
            r4.zzd = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return
        L42:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = r4.zzk(r5)
            r6.<init>(r5)
            throw r6
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.zzh(r1)
            r1 = 1
            return r1
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r6) {
            r5 = this;
            r5.zzcE()
            byte[] r0 = com.google.android.gms.internal.measurement.zzmk.zzb
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzme
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            com.google.android.gms.internal.measurement.zzme r6 = (com.google.android.gms.internal.measurement.zzme) r6
            int r0 = r6.zzd
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.zzd
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            int[] r0 = r5.zzc
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            int[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.zzc = r0
        L2d:
            int[] r0 = r6.zzc
            int[] r3 = r5.zzc
            int r4 = r5.zzd
            int r6 = r6.zzd
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.zzd = r2
            int r6 = r5.modCount
            r0 = 1
            int r6 = r6 + r0
            r5.modCount = r6
            return r0
        L41:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.measurement.zzme
            if (r1 != 0) goto Ld
            boolean r6 = super.equals(r6)
            return r6
        Ld:
            com.google.android.gms.internal.measurement.zzme r6 = (com.google.android.gms.internal.measurement.zzme) r6
            int r1 = r5.zzd
            int r2 = r6.zzd
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            int[] r6 = r6.zzc
            r1 = 0
        L1a:
            int r2 = r5.zzd
            if (r1 >= r2) goto L2a
            int[] r2 = r5.zzc
            r2 = r2[r1]
            r4 = r6[r1]
            if (r2 == r4) goto L27
            return r3
        L27:
            int r1 = r1 + 1
            goto L1a
        L2a:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            r1.zzl(r2)
            int[] r0 = r1.zzc
            r2 = r0[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r3 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r3.zzd
            if (r1 >= r2) goto L10
            int r0 = r0 * 31
            int[] r2 = r3.zzc
            r2 = r2[r1]
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L10:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Integer
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r0 = r4.zzd
            r2 = 0
        Lf:
            if (r2 >= r0) goto L1b
            int[] r3 = r4.zzc
            r3 = r3[r2]
            if (r3 != r5) goto L18
            return r2
        L18:
            int r2 = r2 + 1
            goto Lf
        L1b:
            return r1
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r5) {
            r4 = this;
            r4.zzcE()
            r4.zzl(r5)
            int[] r0 = r4.zzc
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
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            return r5
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
            r2 = this;
            r2.zzcE()
            if (r4 < r3) goto L1a
            int[] r0 = r2.zzc
            int r1 = r2.zzd
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.zzd
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.zzd = r0
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
            return
        L1a:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "toIndex < fromIndex"
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.zzcE()
            r2.zzl(r3)
            int[] r0 = r2.zzc
            r1 = r0[r3]
            r0[r3] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzmj zzd(int r1) {
            r0 = this;
            com.google.android.gms.internal.measurement.zzmh r1 = r0.zzg(r1)
            return r1
    }

    public final int zze(int r2) {
            r1 = this;
            r1.zzl(r2)
            int[] r0 = r1.zzc
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    public final com.google.android.gms.internal.measurement.zzmh zzg(int r4) {
            r3 = this;
            int r0 = r3.zzd
            if (r4 < r0) goto L18
            if (r4 != 0) goto L9
            int[] r4 = com.google.android.gms.internal.measurement.zzme.zza
            goto Lf
        L9:
            int[] r0 = r3.zzc
            int[] r4 = java.util.Arrays.copyOf(r0, r4)
        Lf:
            com.google.android.gms.internal.measurement.zzme r0 = new com.google.android.gms.internal.measurement.zzme
            int r1 = r3.zzd
            r2 = 1
            r0.<init>(r4, r1, r2)
            return r0
        L18:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    public final void zzh(int r5) {
            r4 = this;
            r4.zzcE()
            int r0 = r4.zzd
            int[] r1 = r4.zzc
            int r1 = r1.length
            if (r0 != r1) goto L1a
            int r0 = zzj(r1)
            int[] r0 = new int[r0]
            int[] r1 = r4.zzc
            int r2 = r4.zzd
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            r4.zzc = r0
        L1a:
            int[] r0 = r4.zzc
            int r1 = r4.zzd
            int r2 = r1 + 1
            r4.zzd = r2
            r0[r1] = r5
            return
    }

    final void zzi(int r2) {
            r1 = this;
            int[] r0 = r1.zzc
            int r0 = r0.length
            if (r2 > r0) goto L6
            return
        L6:
            if (r0 == 0) goto L18
        L8:
            if (r0 >= r2) goto Lf
            int r0 = zzj(r0)
            goto L8
        Lf:
            int[] r2 = r1.zzc
            int[] r2 = java.util.Arrays.copyOf(r2, r0)
            r1.zzc = r2
            return
        L18:
            r0 = 10
            int r2 = java.lang.Math.max(r2, r0)
            int[] r2 = new int[r2]
            r1.zzc = r2
            return
    }
}
