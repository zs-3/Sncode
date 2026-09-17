package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@org.jspecify.annotations.NullMarked
/* loaded from: classes.dex */
public abstract class zzak extends com.google.android.gms.internal.common.zzag implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.common.zzao zza = null;

    static {
            com.google.android.gms.internal.common.zzai r0 = new com.google.android.gms.internal.common.zzai
            com.google.android.gms.internal.common.zzak r1 = com.google.android.gms.internal.common.zzam.zza
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.internal.common.zzak.zza = r0
            return
    }

    zzak() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.gms.internal.common.zzak zzi(java.lang.Object[] r1, int r2) {
            if (r2 != 0) goto L5
            com.google.android.gms.internal.common.zzak r1 = com.google.android.gms.internal.common.zzam.zza
            return r1
        L5:
            com.google.android.gms.internal.common.zzam r0 = new com.google.android.gms.internal.common.zzam
            r0.<init>(r1, r2)
            return r0
    }

    public static com.google.android.gms.internal.common.zzak zzj(java.lang.Iterable r3) {
            java.util.Objects.requireNonNull(r3)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.Collection r3 = (java.util.Collection) r3
            com.google.android.gms.internal.common.zzak r3 = zzk(r3)
            goto L41
        Le:
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1b
            com.google.android.gms.internal.common.zzak r3 = com.google.android.gms.internal.common.zzam.zza
            goto L41
        L1b:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L2a
            com.google.android.gms.internal.common.zzak r3 = zzm(r0)
            goto L41
        L2a:
            com.google.android.gms.internal.common.zzah r1 = new com.google.android.gms.internal.common.zzah
            r2 = 4
            r1.<init>(r2)
            r1.zzb(r0)
            r1.zzc(r3)
            r3 = 1
            r1.zzc = r3
            java.lang.Object[] r3 = r1.zza
            int r0 = r1.zzb
            com.google.android.gms.internal.common.zzak r3 = zzi(r3, r0)
        L41:
            return r3
    }

    public static com.google.android.gms.internal.common.zzak zzk(java.util.Collection r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.common.zzag
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.common.zzag r1 = (com.google.android.gms.internal.common.zzag) r1
            com.google.android.gms.internal.common.zzak r1 = r1.zzd()
            boolean r0 = r1.zzf()
            if (r0 == 0) goto L19
            java.lang.Object[] r1 = r1.toArray()
            int r0 = r1.length
            com.google.android.gms.internal.common.zzak r1 = zzi(r1, r0)
        L19:
            return r1
        L1a:
            java.lang.Object[] r1 = r1.toArray()
            int r0 = r1.length
            com.google.android.gms.internal.common.zzal.zza(r1, r0)
            com.google.android.gms.internal.common.zzak r1 = zzi(r1, r0)
            return r1
    }

    public static com.google.android.gms.internal.common.zzak zzl() {
            com.google.android.gms.internal.common.zzak r0 = com.google.android.gms.internal.common.zzam.zza
            return r0
    }

    public static com.google.android.gms.internal.common.zzak zzm(java.lang.Object r3) {
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            com.google.android.gms.internal.common.zzal.zza(r1, r0)
            com.google.android.gms.internal.common.zzak r3 = zzi(r1, r0)
            return r3
    }

    public static com.google.android.gms.internal.common.zzak zzn(java.lang.Object r3, java.lang.Object r4) {
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            com.google.android.gms.internal.common.zzal.zza(r1, r0)
            com.google.android.gms.internal.common.zzak r3 = zzi(r1, r0)
            return r3
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 != r6) goto L5
            goto L5b
        L5:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto Lb
        L9:
            r0 = 0
            goto L5b
        Lb:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
            goto L9
        L18:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = 0
        L1d:
            if (r3 >= r2) goto L5b
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.google.android.gms.internal.common.zzu.zza(r4, r5)
            if (r4 != 0) goto L2e
            goto L9
        L2e:
            int r3 = r3 + 1
            goto L1d
        L31:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            goto L9
        L46:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = com.google.android.gms.internal.common.zzu.zza(r3, r4)
            if (r3 != 0) goto L39
            goto L9
        L55:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L9
        L5b:
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            r2 = 0
        L6:
            if (r2 >= r0) goto L16
            int r1 = r1 * 31
            java.lang.Object r3 = r4.get(r2)
            int r3 = r3.hashCode()
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L6
        L16:
            return r1
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1a
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L17
            r0 = r2
            goto L1a
        L17:
            int r2 = r2 + 1
            goto L9
        L1a:
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.common.zzao r0 = r1.zzo(r0)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.size()
            int r1 = r1 + r0
        L9:
            if (r1 < 0) goto L1a
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L17
            r0 = r1
            goto L1a
        L17:
            int r1 = r1 + (-1)
            goto L9
        L1a:
            return r0
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.common.zzao r0 = r1.zzo(r0)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.google.android.gms.internal.common.zzao r1 = r0.zzo(r1)
            return r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.common.zzak r1 = r0.zzh(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.common.zzag
    int zza(java.lang.Object[] r3, int r4) {
            r2 = this;
            int r4 = r2.size()
            r0 = 0
        L5:
            if (r0 >= r4) goto L10
            java.lang.Object r1 = r2.get(r0)
            r3[r0] = r1
            int r0 = r0 + 1
            goto L5
        L10:
            return r4
    }

    @Override // com.google.android.gms.internal.common.zzag
    @java.lang.Deprecated
    public final com.google.android.gms.internal.common.zzak zzd() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzag
    public final com.google.android.gms.internal.common.zzan zze() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.common.zzao r0 = r1.zzo(r0)
            return r0
    }

    public com.google.android.gms.internal.common.zzak zzh(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            com.google.android.gms.internal.common.zzv.zzc(r2, r3, r0)
            int r3 = r3 - r2
            int r0 = r1.size()
            if (r3 != r0) goto Lf
            return r1
        Lf:
            if (r3 != 0) goto L14
            com.google.android.gms.internal.common.zzak r2 = com.google.android.gms.internal.common.zzam.zza
            return r2
        L14:
            com.google.android.gms.internal.common.zzaj r0 = new com.google.android.gms.internal.common.zzaj
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final com.google.android.gms.internal.common.zzao zzo(int r3) {
            r2 = this;
            int r0 = r2.size()
            java.lang.String r1 = "index"
            com.google.android.gms.internal.common.zzv.zzb(r3, r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L12
            com.google.android.gms.internal.common.zzao r3 = com.google.android.gms.internal.common.zzak.zza
            return r3
        L12:
            com.google.android.gms.internal.common.zzai r0 = new com.google.android.gms.internal.common.zzai
            r0.<init>(r2, r3)
            return r0
    }
}
