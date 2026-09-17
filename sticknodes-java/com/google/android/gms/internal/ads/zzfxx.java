package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzfxx implements java.io.Serializable {
    zzfxx() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzfxx zzc() {
            com.google.android.gms.internal.ads.zzfxg r0 = com.google.android.gms.internal.ads.zzfxg.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzfxx zzd(java.lang.Object r1) {
            if (r1 != 0) goto L5
            com.google.android.gms.internal.ads.zzfxg r1 = com.google.android.gms.internal.ads.zzfxg.zza
            goto Lb
        L5:
            com.google.android.gms.internal.ads.zzfye r0 = new com.google.android.gms.internal.ads.zzfye
            r0.<init>(r1)
            r1 = r0
        Lb:
            return r1
    }

    public abstract com.google.android.gms.internal.ads.zzfxx zza(com.google.android.gms.internal.ads.zzfxq r1);

    public abstract java.lang.Object zzb(java.lang.Object r1);
}
