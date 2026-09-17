package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfzo extends com.google.android.gms.internal.ads.zzfzm implements java.util.ListIterator {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzp zzd;

    zzfzo(com.google.android.gms.internal.ads.zzfzp r1) {
            r0 = this;
            r0.zzd = r1
            r0.<init>(r1)
            return
    }

    public zzfzo(com.google.android.gms.internal.ads.zzfzp r2, int r3) {
            r1 = this;
            r1.zzd = r2
            java.util.Collection r0 = r2.zzb
            java.util.List r0 = (java.util.List) r0
            java.util.ListIterator r3 = r0.listIterator(r3)
            r1.<init>(r2, r3)
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfzp r0 = r2.zzd
            boolean r0 = r0.isEmpty()
            r2.zza()
            java.util.Iterator r1 = r2.zza
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            r1.add(r3)
            com.google.android.gms.internal.ads.zzfzp r3 = r2.zzd
            com.google.android.gms.internal.ads.zzfzq r3 = r3.zzf
            int r1 = com.google.android.gms.internal.ads.zzfzq.zzd(r3)
            int r1 = r1 + 1
            com.google.android.gms.internal.ads.zzfzq.zzn(r3, r1)
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzfzp r3 = r2.zzd
            r3.zza()
        L24:
            return
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            r1.zza()
            java.util.Iterator r0 = r1.zza
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            r1.zza()
            java.util.Iterator r0 = r1.zza
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            r1.zza()
            java.util.Iterator r0 = r1.zza
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            java.lang.Object r0 = r0.previous()
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            r1.zza()
            java.util.Iterator r0 = r1.zza
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            int r0 = r0.previousIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r2) {
            r1 = this;
            r1.zza()
            java.util.Iterator r0 = r1.zza
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            r0.set(r2)
            return
    }
}
