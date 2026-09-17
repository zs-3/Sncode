package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzju extends com.google.android.gms.internal.drive.zziw<java.lang.Double> implements com.google.android.gms.internal.drive.zzmc, java.util.RandomAccess {
    private static final com.google.android.gms.internal.drive.zzju zzoi = null;
    private int size;
    private double[] zzoj;

    static {
            com.google.android.gms.internal.drive.zzju r0 = new com.google.android.gms.internal.drive.zzju
            r1 = 0
            double[] r2 = new double[r1]
            r0.<init>(r2, r1)
            com.google.android.gms.internal.drive.zzju.zzoi = r0
            r0.zzbp()
            return
    }

    zzju() {
            r2 = this;
            r0 = 10
            double[] r0 = new double[r0]
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    private zzju(double[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zzoj = r1
            r0.size = r2
            return
    }

    private final void zzc(int r5, double r6) {
            r4 = this;
            r4.zzbq()
            if (r5 < 0) goto L3e
            int r0 = r4.size
            if (r5 > r0) goto L3e
            double[] r1 = r4.zzoj
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r5 + 1
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r5, r1, r2, r0)
            goto L2d
        L15:
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + 1
            double[] r0 = new double[r0]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            double[] r1 = r4.zzoj
            int r2 = r5 + 1
            int r3 = r4.size
            int r3 = r3 - r5
            java.lang.System.arraycopy(r1, r5, r0, r2, r3)
            r4.zzoj = r0
        L2d:
            double[] r0 = r4.zzoj
            r0[r5] = r6
            int r5 = r4.size
            int r5 = r5 + 1
            r4.size = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return
        L3e:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = r4.zzq(r5)
            r6.<init>(r5)
            throw r6
    }

    private final void zzp(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            int r0 = r1.size
            if (r2 >= r0) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r1.zzq(r2)
            r0.<init>(r2)
            throw r0
    }

    private final java.lang.String zzq(int r4) {
            r3 = this;
            int r0 = r3.size
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 35
            r1.<init>(r2)
            java.lang.String r2 = "Index:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", Size:"
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            return r4
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            r2.zzc(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Double> r6) {
            r5 = this;
            r5.zzbq()
            com.google.android.gms.internal.drive.zzkm.checkNotNull(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.drive.zzju
            if (r0 != 0) goto Lf
            boolean r6 = super.addAll(r6)
            return r6
        Lf:
            com.google.android.gms.internal.drive.zzju r6 = (com.google.android.gms.internal.drive.zzju) r6
            int r0 = r6.size
            r1 = 0
            if (r0 != 0) goto L17
            return r1
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r5.size
            int r2 = r2 - r3
            if (r2 < r0) goto L3f
            int r3 = r3 + r0
            double[] r0 = r5.zzoj
            int r2 = r0.length
            if (r3 <= r2) goto L2b
            double[] r0 = java.util.Arrays.copyOf(r0, r3)
            r5.zzoj = r0
        L2b:
            double[] r0 = r6.zzoj
            double[] r2 = r5.zzoj
            int r4 = r5.size
            int r6 = r6.size
            java.lang.System.arraycopy(r0, r1, r2, r4, r6)
            r5.size = r3
            int r6 = r5.modCount
            r0 = 1
            int r6 = r6 + r0
            r5.modCount = r6
            return r0
        L3f:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.drive.zzju
            if (r1 != 0) goto Ld
            boolean r9 = super.equals(r9)
            return r9
        Ld:
            com.google.android.gms.internal.drive.zzju r9 = (com.google.android.gms.internal.drive.zzju) r9
            int r1 = r8.size
            int r2 = r9.size
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            double[] r9 = r9.zzoj
            r1 = 0
        L1a:
            int r2 = r8.size
            if (r1 >= r2) goto L34
            double[] r2 = r8.zzoj
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
            r3.zzp(r4)
            double[] r0 = r3.zzoj
            r1 = r0[r4]
            java.lang.Double r4 = java.lang.Double.valueOf(r1)
            return r4
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r5 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r5.size
            if (r1 >= r2) goto L18
            double[] r2 = r5.zzoj
            r3 = r2[r1]
            long r2 = java.lang.Double.doubleToLongBits(r3)
            int r0 = r0 * 31
            int r2 = com.google.android.gms.internal.drive.zzkm.zzu(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L18:
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int r6) {
            r5 = this;
            r5.zzbq()
            r5.zzp(r6)
            double[] r0 = r5.zzoj
            r1 = r0[r6]
            int r3 = r5.size
            int r4 = r3 + (-1)
            if (r6 >= r4) goto L18
            int r4 = r6 + 1
            int r3 = r3 - r6
            int r3 = r3 + (-1)
            java.lang.System.arraycopy(r0, r4, r0, r6, r3)
        L18:
            int r6 = r5.size
            int r6 = r6 + (-1)
            r5.size = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            java.lang.Double r6 = java.lang.Double.valueOf(r1)
            return r6
    }

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r6) {
            r5 = this;
            r5.zzbq()
            r0 = 0
            r1 = 0
        L5:
            int r2 = r5.size
            if (r1 >= r2) goto L31
            double[] r2 = r5.zzoj
            r3 = r2[r1]
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L2e
            double[] r6 = r5.zzoj
            int r0 = r1 + 1
            int r2 = r5.size
            int r2 = r2 - r1
            r3 = 1
            int r2 = r2 - r3
            java.lang.System.arraycopy(r6, r0, r6, r1, r2)
            int r6 = r5.size
            int r6 = r6 - r3
            r5.size = r6
            int r6 = r5.modCount
            int r6 = r6 + r3
            r5.modCount = r6
            return r3
        L2e:
            int r1 = r1 + 1
            goto L5
        L31:
            return r0
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
            r2 = this;
            r2.zzbq()
            if (r4 < r3) goto L1a
            double[] r0 = r2.zzoj
            int r1 = r2.size
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r3, r1)
            int r0 = r2.size
            int r4 = r4 - r3
            int r0 = r0 - r4
            r2.size = r0
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

    @Override // com.google.android.gms.internal.drive.zziw, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Double r6 = (java.lang.Double) r6
            double r0 = r6.doubleValue()
            r4.zzbq()
            r4.zzp(r5)
            double[] r6 = r4.zzoj
            r2 = r6[r5]
            r6[r5] = r0
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public final void zzc(double r2) {
            r1 = this;
            int r0 = r1.size
            r1.zzc(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzkp
    public final /* synthetic */ com.google.android.gms.internal.drive.zzkp zzr(int r3) {
            r2 = this;
            int r0 = r2.size
            if (r3 < r0) goto L12
            com.google.android.gms.internal.drive.zzju r0 = new com.google.android.gms.internal.drive.zzju
            double[] r1 = r2.zzoj
            double[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r2.size
            r0.<init>(r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
    }
}
