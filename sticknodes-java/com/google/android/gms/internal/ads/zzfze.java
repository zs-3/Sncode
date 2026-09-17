package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
class zzfze implements java.util.Iterator {
    final java.util.Iterator zza;
    java.util.Collection zzb;
    java.util.Iterator zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfzq zzd;

    zzfze(com.google.android.gms.internal.ads.zzfzq r1) {
            r0 = this;
            r0.zzd = r1
            r0.<init>()
            java.util.Map r1 = com.google.android.gms.internal.ads.zzfzq.zzi(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            com.google.android.gms.internal.ads.zzgbf r1 = com.google.android.gms.internal.ads.zzgbf.zza
            r0.zzc = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.zza
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L13
            java.util.Iterator r0 = r1.zzc
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            java.util.Iterator r0 = r1.zzc
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L21
            java.util.Iterator r0 = r1.zza
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r1.zzb = r0
            java.util.Iterator r0 = r0.iterator()
            r1.zzc = r0
        L21:
            java.util.Iterator r0 = r1.zzc
            java.lang.Object r0 = r0.next()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.util.Iterator r0 = r2.zzc
            r0.remove()
            java.util.Collection r0 = r2.zzb
            java.util.Objects.requireNonNull(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            java.util.Iterator r0 = r2.zza
            r0.remove()
        L17:
            com.google.android.gms.internal.ads.zzfzq r0 = r2.zzd
            int r1 = com.google.android.gms.internal.ads.zzfzq.zzd(r0)
            int r1 = r1 + (-1)
            com.google.android.gms.internal.ads.zzfzq.zzn(r0, r1)
            return
    }
}
