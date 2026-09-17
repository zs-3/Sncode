package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhig implements com.google.android.gms.internal.ads.zzhii {
    private com.google.android.gms.internal.ads.zzhir zza;

    public zzhig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zza(com.google.android.gms.internal.ads.zzhir r1, com.google.android.gms.internal.ads.zzhir r2) {
            com.google.android.gms.internal.ads.zzhig r1 = (com.google.android.gms.internal.ads.zzhig) r1
            com.google.android.gms.internal.ads.zzhir r0 = r1.zza
            if (r0 != 0) goto L9
            r1.zza = r2
            return
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final java.lang.Object zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhir r0 = r1.zza
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.zzb()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }
}
