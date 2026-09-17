package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzdv extends com.google.android.gms.internal.auth.zzdr implements java.util.RandomAccess, com.google.android.gms.internal.auth.zzge {
    private static final com.google.android.gms.internal.auth.zzdv zza = null;
    private boolean[] zzb;
    private int zzc;

    static {
            com.google.android.gms.internal.auth.zzdv r0 = new com.google.android.gms.internal.auth.zzdv
            r1 = 0
            boolean[] r2 = new boolean[r1]
            r0.<init>(r2, r1, r1)
            com.google.android.gms.internal.auth.zzdv.zza = r0
            return
    }

    zzdv() {
            r3 = this;
            r0 = 10
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r2 = 1
            r3.<init>(r0, r1, r2)
            return
    }

    private zzdv(boolean[] r1, int r2, boolean r3) {
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
    public final /* synthetic */ void add(int r5, java.lang.Object r6) {
            r4 = this;
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4.zza()
            if (r5 < 0) goto L44
            int r0 = r4.zzc
            if (r5 > r0) goto L44
            boolean[] r1 = r4.zzb
            int r2 = r1.length
            if (r0 >= r2) goto L1b
            int r2 = r5 + 1
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r5, r1, r2, r0)
            goto L33
        L1b:
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + 1
            boolean[] r0 = new boolean[r0]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            boolean[] r1 = r4.zzb
            int r2 = r5 + 1
            int r3 = r4.zzc
            int r3 = r3 - r5
            java.lang.System.arraycopy(r1, r5, r0, r2, r3)
            r4.zzb = r0
        L33:
            boolean[] r0 = r4.zzb
            r0[r5] = r6
            int r5 = r4.zzc
            int r5 = r5 + 1
            r4.zzc = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return
        L44:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = r4.zzf(r5)
            r6.<init>(r5)
            throw r6
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zze(r1)
            r1 = 1
            return r1
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r6) {
            r5 = this;
            r5.zza()
            byte[] r0 = com.google.android.gms.internal.auth.zzfa.zzd
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.auth.zzdv
            if (r0 != 0) goto L11
            boolean r6 = super.addAll(r6)
            return r6
        L11:
            com.google.android.gms.internal.auth.zzdv r6 = (com.google.android.gms.internal.auth.zzdv) r6
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
            boolean[] r0 = r5.zzb
            int r3 = r0.length
            if (r2 <= r3) goto L2d
            boolean[] r0 = java.util.Arrays.copyOf(r0, r2)
            r5.zzb = r0
        L2d:
            boolean[] r0 = r6.zzb
            boolean[] r3 = r5.zzb
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
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.auth.zzdv
            if (r1 != 0) goto Ld
            boolean r6 = super.equals(r6)
            return r6
        Ld:
            com.google.android.gms.internal.auth.zzdv r6 = (com.google.android.gms.internal.auth.zzdv) r6
            int r1 = r5.zzc
            int r2 = r6.zzc
            r3 = 0
            if (r1 == r2) goto L17
            return r3
        L17:
            boolean[] r6 = r6.zzb
            r1 = 0
        L1a:
            int r2 = r5.zzc
            if (r1 >= r2) goto L2a
            boolean[] r2 = r5.zzb
            boolean r2 = r2[r1]
            boolean r4 = r6[r1]
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
            r1.zzg(r2)
            boolean[] r0 = r1.zzb
            boolean r2 = r0[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r3 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r3.zzc
            if (r1 >= r2) goto L14
            int r0 = r0 * 31
            boolean[] r2 = r3.zzb
            boolean r2 = r2[r1]
            int r2 = com.google.android.gms.internal.auth.zzfa.zza(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Boolean
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            int r0 = r4.zzc
            r2 = 0
        Lf:
            if (r2 >= r0) goto L1b
            boolean[] r3 = r4.zzb
            boolean r3 = r3[r2]
            if (r3 != r5) goto L18
            return r2
        L18:
            int r2 = r2 + 1
            goto Lf
        L1b:
            return r1
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r5) {
            r4 = this;
            r4.zza()
            r4.zzg(r5)
            boolean[] r0 = r4.zzb
            boolean r1 = r0[r5]
            int r2 = r4.zzc
            int r3 = r2 + (-1)
            if (r5 >= r3) goto L18
            int r3 = r5 + 1
            int r2 = r2 - r5
            int r2 = r2 + (-1)
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L18:
            int r5 = r4.zzc
            int r5 = r5 + (-1)
            r4.zzc = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r3, int r4) {
            r2 = this;
            r2.zza()
            if (r4 < r3) goto L1a
            boolean[] r0 = r2.zzb
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
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.zza()
            r2.zzg(r3)
            boolean[] r0 = r2.zzb
            boolean r1 = r0[r3]
            r0[r3] = r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
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
            com.google.android.gms.internal.auth.zzdv r0 = new com.google.android.gms.internal.auth.zzdv
            boolean[] r1 = r3.zzb
            boolean[] r4 = java.util.Arrays.copyOf(r1, r4)
            int r1 = r3.zzc
            r2 = 1
            r0.<init>(r4, r1, r2)
            return r0
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    public final void zze(boolean r5) {
            r4 = this;
            r4.zza()
            int r0 = r4.zzc
            boolean[] r1 = r4.zzb
            int r2 = r1.length
            if (r0 != r2) goto L18
            int r2 = r0 * 3
            int r2 = r2 / 2
            int r2 = r2 + 1
            boolean[] r2 = new boolean[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r4.zzb = r2
        L18:
            boolean[] r0 = r4.zzb
            int r1 = r4.zzc
            int r2 = r1 + 1
            r4.zzc = r2
            r0[r1] = r5
            return
    }
}
