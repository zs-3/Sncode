package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzfyj implements java.lang.Iterable {
    final /* synthetic */ java.lang.CharSequence zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfym zzb;

    zzfyj(com.google.android.gms.internal.ads.zzfym r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfym r0 = r2.zzb
            java.lang.CharSequence r1 = r2.zza
            java.util.Iterator r0 = com.google.android.gms.internal.ads.zzfym.zzd(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = ", "
            com.google.android.gms.internal.ads.zzfxr.zzb(r0, r2, r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
