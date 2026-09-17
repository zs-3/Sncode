package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgmn {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.ThreadLocal zzb = null;

    static {
            com.google.android.gms.internal.ads.zzgmm r0 = new com.google.android.gms.internal.ads.zzgmm
            r0.<init>()
            com.google.android.gms.internal.ads.zzgmn.zzb = r0
            return
    }

    public static javax.crypto.Cipher zza() {
            java.lang.ThreadLocal r0 = com.google.android.gms.internal.ads.zzgmn.zzb
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            return r0
    }
}
