package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
abstract class zzdr extends java.util.AbstractList implements com.google.android.gms.internal.auth.zzez {
    private boolean zza;

    zzdr(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r1, java.lang.Object r2) {
            r0 = this;
            r0.zza()
            super.add(r1, r2)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object r1) {
            r0 = this;
            r0.zza()
            boolean r1 = super.add(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            r0.zza()
            boolean r1 = super.addAll(r1, r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection r1) {
            r0 = this;
            r0.zza()
            boolean r1 = super.addAll(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r0 = this;
            r0.zza()
            super.clear()
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = r7 instanceof java.util.RandomAccess
            if (r1 != 0) goto L13
            boolean r7 = super.equals(r7)
            return r7
        L13:
            java.util.List r7 = (java.util.List) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 != r3) goto L35
            r3 = 0
        L20:
            if (r3 >= r1) goto L34
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L31
            return r2
        L31:
            int r3 = r3 + 1
            goto L20
        L34:
            return r0
        L35:
            return r2
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
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

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int r1) {
            r0 = this;
            r0.zza()
            java.lang.Object r1 = super.remove(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            r1.zza()
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto Lc
            r2 = 0
            return r2
        Lc:
            r1.remove(r2)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            r0.zza()
            boolean r1 = super.removeAll(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            r0.zza()
            boolean r1 = super.retainAll(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            r0.zza()
            java.lang.Object r1 = super.set(r1, r2)
            return r1
    }

    protected final void zza() {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final void zzb() {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 == 0) goto L7
            r0 = 0
            r1.zza = r0
        L7:
            return
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final boolean zzc() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }
}
