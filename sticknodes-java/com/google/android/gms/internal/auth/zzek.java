package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzek extends com.google.android.gms.internal.auth.zzdr implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzge {
    private static final com.google.android.gms.internal.auth.zzek zza = null;
    private double[] zzb;
    private int zzc;

    static {
            com.google.android.gms.internal.auth.zzek r0 = new com.google.android.gms.internal.auth.zzek
            r1 = 0
            double[] r2 = new double[r1]
            r0.<init>(r2, r1, r1)
            com.google.android.gms.internal.auth.zzek.zza = r0
            return
    }

    zzek() {
            r3 = this;
            r0 = 10
            double[] r0 = new double[r0]
            r1 = 0
            r2 = 1
            r3.<init>(r0, r1, r2)
            return
    }

    private zzek(double[] r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    private final java.lang.String zzf(int r4) {
            r3 = this;
            int r0 = r3.zzc
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

    private final void zzg(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.zzc
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.zzf(r2)
            r0.<init>(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Double r7 = (java.lang.Double) r7
            double r0 = r7.doubleValue()
            r5.zza()
            if (r6 < 0) goto L44
            int r7 = r5.zzc
            if (r6 > r7) goto L44
            double[] r2 = r5.zzb
            int r3 = r2.length
            if (r7 >= r3) goto L1b
            int r3 = r6 + 1
            int r7 = r7 - r6
            java.lang.System.arraycopy(r2, r6, r2, r3, r7)
            goto L33
        L1b:
            int r7 = r7 * 3
            int r7 = r7 / 2
            int r7 = r7 + 1
            double[] r7 = new double[r7]
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r7, r3, r6)
            double[] r2 = r5.zzb
            int r3 = r6 + 1
            int r4 = r5.zzc
            int r4 = r4 - r6
            java.lang.System.arraycopy(r2, r6, r7, r3, r4)
            r5.zzb = r7
        L33:
            double[] r7 = r5.zzb
            r7[r6] = r0
            int r6 = r5.zzc
            int r6 = r6 + 1
            r5.zzc = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
        L44:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = r5.zzf(r6)
            r7.<init>(r6)
            throw r7
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r3) {
            r2 = this;
            java.lang.Double r3 = (java.lang.Double) r3
            double r0 = r3.doubleValue()
            r2.zze(r0)
            r3 = 1
            return r3
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r6) {
            r5 = this;
            r5.zza()
            byte[] r0 = com.google.android.gms.internal.auth.zzfa.zzd
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.auth.zzek
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            com.google.android.gms.internal.auth.zzek r6 = (com.google.android.gms.internal.auth.zzek) r6
            int r0 = r6.zzc
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r5.zzc
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r3 - r2
            if (r3 < r0) goto L41
            int r2 = r2 + r0
            double[] r0 = r5.zzb
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            double[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.zzb = r0
        L2d:
            double[] r0 = r6.zzb
            double[] r3 = r5.zzb
            int r4 = r5.zzc
            int r6 = r6.zzc
            java.lang.System.arraycopy(r0, r1, r3, r4, r6)
            r5.zzc = r2
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

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.auth.zzek
            if (r1 != 0) goto Ld
            boolean r9 = super.equals(r9)
            return r9
        Ld:
            com.google.android.gms.internal.auth.zzek r9 = (com.google.android.gms.internal.auth.zzek) r9
            int r1 = r8.zzc
            int r2 = r9.zzc
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            double[] r9 = r9.zzb
            r1 = 0
        L1a:
            int r2 = r8.zzc
            if (r1 >= r2) goto L34
            double[] r2 = r8.zzb
            r4 = r2[r1]
            long r4 = java.lang.Double.doubleToLongBits(r4)
            r6 = r9[r1]
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L31
            return r3
        L31:
            int r1 = r1 + 1
            goto L1a
        L34:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int r4) {
            r3 = this;
            r3.zzg(r4)
            double[] r0 = r3.zzb
            r1 = r0[r4]
            java.lang.Double r4 = java.lang.Double.valueOf(r1)
            return r4
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r6 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r6.zzc
            if (r1 >= r2) goto L1c
            double[] r2 = r6.zzb
            r3 = r2[r1]
            long r2 = java.lang.Double.doubleToLongBits(r3)
            int r0 = r0 * 31
            byte[] r4 = com.google.android.gms.internal.auth.zzfa.zzd
            r4 = 32
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r3 = (int) r2
            int r0 = r0 + r3
            int r1 = r1 + 1
            goto L2
        L1c:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof java.lang.Double
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Double r8 = (java.lang.Double) r8
            double r2 = r8.doubleValue()
            int r8 = r7.zzc
            r0 = 0
        Lf:
            if (r0 >= r8) goto L1d
            double[] r4 = r7.zzb
            r5 = r4[r0]
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            return r0
        L1a:
            int r0 = r0 + 1
            goto Lf
        L1d:
            return r1
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r6) {
            r5 = this;
            r5.zza()
            r5.zzg(r6)
            double[] r0 = r5.zzb
            r1 = r0[r6]
            int r3 = r5.zzc
            int r4 = r3 + (-1)
            if (r6 >= r4) goto L18
            int r4 = r6 + 1
            int r3 = r3 - r6
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r4, r0, r6, r3)
        L18:
            int r6 = r5.zzc
            int r6 = r6 + (-1)
            r5.zzc = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            java.lang.Double r6 = java.lang.Double.valueOf(r1)
            return r6
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
            r2 = this;
            r2.zza()
            if (r4 < r3) goto L1a
            double[] r0 = r2.zzb
            int r1 = r2.zzc
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.zzc
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.zzc = r0
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

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Double r6 = (java.lang.Double) r6
            double r0 = r6.doubleValue()
            r4.zza()
            r4.zzg(r5)
            double[] r6 = r4.zzb
            r2 = r6[r5]
            r6[r5] = r0
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzez zzd(int r4) {
            r3 = this;
            int r0 = r3.zzc
            if (r4 < r0) goto L13
            com.google.android.gms.internal.auth.zzek r0 = new com.google.android.gms.internal.auth.zzek
            double[] r1 = r3.zzb
            double[] r4 = java.util.Arrays.copyOf(r1, r4)
            int r1 = r3.zzc
            r2 = 1
            r0.<init>(r4, r1, r2)
            return r0
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    public final void zze(double r5) {
            r4 = this;
            r4.zza()
            int r0 = r4.zzc
            double[] r1 = r4.zzb
            int r2 = r1.length
            if (r0 != r2) goto L18
            int r2 = r0 * 3
            int r2 = r2 / 2
            int r2 = r2 + 1
            double[] r2 = new double[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r4.zzb = r2
        L18:
            double[] r0 = r4.zzb
            int r1 = r4.zzc
            int r2 = r1 + 1
            r4.zzc = r2
            r0[r1] = r5
            return
    }
}
