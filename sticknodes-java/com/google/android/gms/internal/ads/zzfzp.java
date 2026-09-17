package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzfzp extends com.google.android.gms.internal.ads.zzfzn implements java.util.List {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzq zzf;

    zzfzp(com.google.android.gms.internal.ads.zzfzq r1, java.lang.Object r2, java.util.List r3, com.google.android.gms.internal.ads.zzfzn r4) {
            r0 = this;
            r0.zzf = r1
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // java.util.List
    public final void add(int r3, java.lang.Object r4) {
            r2 = this;
            r2.zzb()
            java.util.Collection r0 = r2.zzb
            boolean r0 = r0.isEmpty()
            java.util.Collection r1 = r2.zzb
            java.util.List r1 = (java.util.List) r1
            r1.add(r3, r4)
            com.google.android.gms.internal.ads.zzfzq r3 = r2.zzf
            int r4 = com.google.android.gms.internal.ads.zzfzq.zzd(r3)
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.zzfzq.zzn(r3, r4)
            if (r0 == 0) goto L20
            r2.zza()
        L20:
            return
    }

    @Override // java.util.List
    public final boolean addAll(int r4, java.util.Collection r5) {
            r3 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L8
            r4 = 0
            return r4
        L8:
            int r0 = r3.size()
            java.util.Collection r1 = r3.zzb
            java.util.List r1 = (java.util.List) r1
            boolean r4 = r1.addAll(r4, r5)
            if (r4 == 0) goto L2d
            java.util.Collection r5 = r3.zzb
            int r5 = r5.size()
            com.google.android.gms.internal.ads.zzfzq r1 = r3.zzf
            int r5 = r5 - r0
            int r2 = com.google.android.gms.internal.ads.zzfzq.zzd(r1)
            int r2 = r2 + r5
            com.google.android.gms.internal.ads.zzfzq.zzn(r1, r2)
            if (r0 != 0) goto L2d
            r3.zza()
            r4 = 1
        L2d:
            return r4
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            r1.zzb()
            java.util.Collection r0 = r1.zzb
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r2) {
            r1 = this;
            r1.zzb()
            java.util.Collection r0 = r1.zzb
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            r1.zzb()
            java.util.Collection r0 = r1.zzb
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r1.zzb()
            com.google.android.gms.internal.ads.zzfzo r0 = new com.google.android.gms.internal.ads.zzfzo
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            r1.zzb()
            com.google.android.gms.internal.ads.zzfzo r0 = new com.google.android.gms.internal.ads.zzfzo
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r3) {
            r2 = this;
            r2.zzb()
            java.util.Collection r0 = r2.zzb
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r0.remove(r3)
            com.google.android.gms.internal.ads.zzfzq r0 = r2.zzf
            int r1 = com.google.android.gms.internal.ads.zzfzq.zzd(r0)
            int r1 = r1 + (-1)
            com.google.android.gms.internal.ads.zzfzq.zzn(r0, r1)
            r2.zzc()
            return r3
    }

    @Override // java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            r1.zzb()
            java.util.Collection r0 = r1.zzb
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }

    @Override // java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            r2.zzb()
            java.util.Collection r0 = r2.zzb
            java.util.List r0 = (java.util.List) r0
            java.util.List r3 = r0.subList(r3, r4)
            com.google.android.gms.internal.ads.zzfzn r4 = r2.zzc
            if (r4 != 0) goto L10
            r4 = r2
        L10:
            java.lang.Object r0 = r2.zza
            com.google.android.gms.internal.ads.zzfzq r1 = r2.zzf
            java.util.List r3 = r1.zzh(r0, r3, r4)
            return r3
    }
}
