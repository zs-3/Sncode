package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbui {
    private android.view.View zza;
    private final java.util.Map zzb;

    public zzbui() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            return
    }

    static /* bridge */ /* synthetic */ android.view.View zza(com.google.android.gms.internal.ads.zzbui r0) {
            android.view.View r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zzd(com.google.android.gms.internal.ads.zzbui r0) {
            java.util.Map r0 = r0.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbui zzb(android.view.View r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbui zzc(java.util.Map r5) {
            r4 = this;
            java.util.Map r0 = r4.zzb
            r0.clear()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto Ld
            java.util.Map r2 = r4.zzb
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r2.put(r0, r3)
            goto Ld
        L32:
            return r4
    }
}
