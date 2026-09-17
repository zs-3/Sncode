package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzgg extends com.google.android.gms.internal.auth.zzdr implements java.util.RandomAccess {
    private static final com.google.android.gms.internal.auth.zzgg zza = null;
    private java.lang.Object[] zzb;
    private int zzc;

    static {
            com.google.android.gms.internal.auth.zzgg r0 = new com.google.android.gms.internal.auth.zzgg
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1, r1)
            com.google.android.gms.internal.auth.zzgg.zza = r0
            return
    }

    zzgg() {
            r3 = this;
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 1
            r3.<init>(r0, r1, r2)
            return
    }

    private zzgg(java.lang.Object[] r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    public static com.google.android.gms.internal.auth.zzgg zze() {
            com.google.android.gms.internal.auth.zzgg r0 = com.google.android.gms.internal.auth.zzgg.zza
            return r0
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
    public final void add(int r5, java.lang.Object r6) {
            r4 = this;
            r4.zza()
            if (r5 < 0) goto L3e
            int r0 = r4.zzc
            if (r5 > r0) goto L3e
            java.lang.Object[] r1 = r4.zzb
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
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            java.lang.Object[] r1 = r4.zzb
            int r2 = r5 + 1
            int r3 = r4.zzc
            int r3 = r3 - r5
            java.lang.System.arraycopy(r1, r5, r0, r2, r3)
            r4.zzb = r0
        L2d:
            java.lang.Object[] r0 = r4.zzb
            r0[r5] = r6
            int r5 = r4.zzc
            int r5 = r5 + 1
            r4.zzc = r5
            int r5 = r4.modCount
            int r5 = r5 + 1
            r4.modCount = r5
            return
        L3e:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = r4.zzf(r5)
            r6.<init>(r5)
            throw r6
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r5) {
            r4 = this;
            r4.zza()
            int r0 = r4.zzc
            java.lang.Object[] r1 = r4.zzb
            int r2 = r1.length
            r3 = 1
            if (r0 != r2) goto L16
            int r0 = r0 * 3
            int r0 = r0 / 2
            int r0 = r0 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r4.zzb = r0
        L16:
            java.lang.Object[] r0 = r4.zzb
            int r1 = r4.zzc
            int r2 = r1 + 1
            r4.zzc = r2
            r0[r1] = r5
            int r5 = r4.modCount
            int r5 = r5 + r3
            r4.modCount = r5
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            r1.zzg(r2)
            java.lang.Object[] r0 = r1.zzb
            r2 = r0[r2]
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int r5) {
            r4 = this;
            r4.zza()
            r4.zzg(r5)
            java.lang.Object[] r0 = r4.zzb
            r1 = r0[r5]
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
            return r1
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.zza()
            r2.zzg(r3)
            java.lang.Object[] r0 = r2.zzb
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
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.auth.zzez zzd(int r4) {
            r3 = this;
            int r0 = r3.zzc
            if (r4 < r0) goto L13
            java.lang.Object[] r0 = r3.zzb
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            com.google.android.gms.internal.auth.zzgg r0 = new com.google.android.gms.internal.auth.zzgg
            int r1 = r3.zzc
            r2 = 1
            r0.<init>(r4, r1, r2)
            return r0
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }
}
