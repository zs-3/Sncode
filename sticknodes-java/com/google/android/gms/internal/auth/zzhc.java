package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzhc implements java.util.ListIterator {
    final java.util.ListIterator zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ com.google.android.gms.internal.auth.zzhe zzc;

    zzhc(com.google.android.gms.internal.auth.zzhe r1, int r2) {
            r0 = this;
            r0.zzc = r1
            r0.zzb = r2
            r0.<init>()
            com.google.android.gms.internal.auth.zzff r1 = com.google.android.gms.internal.auth.zzhe.zza(r1)
            java.util.ListIterator r1 = r1.listIterator(r2)
            r0.zza = r1
            return
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ java.lang.Object previous() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            java.lang.Object r0 = r0.previous()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            java.util.ListIterator r0 = r1.zza
            int r0 = r0.previousIndex()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
